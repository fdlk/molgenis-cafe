package org.molgenis.cv.source;

import static java.util.stream.Collectors.joining;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.molgenis.cv.model.And;
import org.molgenis.cv.model.Eav;
import org.molgenis.cv.model.Logic;
import org.molgenis.cv.model.Or;
import org.molgenis.cv.model.PredicateReference;
import org.molgenis.cv.model.Query;
import org.molgenis.cv.model.QueryRequest;
import org.molgenis.cv.model.QueryResponse;
import org.molgenis.cv.model.SubjectVariant;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelEvaluationException;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public abstract class RsqlSource implements Source {

  public static final QueryResponse NO_RESULTS = new QueryResponse().addRecordsItem(Collections.emptyList())
      .addSourcesItem(0);

  static Optional<Object> getComponent(PredicateReference predicateReference, Query query) {
    String spelExpression = toSpelExpression(predicateReference.getReference());
    ExpressionParser parser = new SpelExpressionParser();
    Expression expression = parser.parseExpression(spelExpression);
    try {
      return Optional.of(expression.getValue(query));
    } catch (SpelEvaluationException ex) {
      return Optional.empty();
    }
  }

  static String toSpelExpression(String reference) {
    if (!reference.startsWith("/query/")) {
      throw new IllegalArgumentException("component references should start with /query/");
    }
    return reference
        .substring(7) // remove /query/
        .replaceAll("/(\\d+)", "[$1]") // numerical indices should be written with array brackets
        .replace("/", ".");
  }

  Optional<String> toRsql(Object component) {
    if (component instanceof Eav) {
      return toRsql((Eav) component);
    }
    if (component instanceof SubjectVariant) {
      return toRsql((SubjectVariant) component);
    }
    return Optional.empty();
  }

  abstract Optional<String> toRsql(Eav eav);

  abstract Optional<String> toRsql(SubjectVariant eav);

  Optional<String> toRsql(
      List<Logic> predicates,
      Query query,
      String delimiter,
      boolean mustUnderstandEverything) {
    List<Optional<String>> rsqls =
        predicates.stream().map(predicate -> toRsql(predicate, query)).collect(Collectors.toList());
    if (mustUnderstandEverything && rsqls.stream().anyMatch(it -> !it.isPresent())) {
      return Optional.empty();
    }
    List<String> elements =
        rsqls.stream().filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
    if (elements.isEmpty()) {
      return Optional.empty();
    }
    if (elements.size() == 1) {
      return Optional.of(elements.get(0));
    }
    return Optional.of(elements.stream().collect(joining(delimiter, "(", ")")));
  }

  Optional<String> toRsql(Logic logic, Query query) {
    if (logic instanceof PredicateReference) {
      return getComponent((PredicateReference) logic, query).flatMap(this::toRsql);
    }
    if (logic instanceof And) {
      return toRsql(((And) logic).getPredicates(), query, ";", true);
    }
    if (logic instanceof Or) {
      return toRsql(((Or) logic).getPredicates(), query, ",", false);
    }
    return Optional.empty();
  }

  abstract QueryResponse queryRsql(String rsql);

  @Override
  public QueryResponse query(QueryRequest body) {
    Optional<String> rsql = toRsql(body.getLogic(), body.getQuery());
    return rsql.map(this::queryRsql).orElse(NO_RESULTS);
  }
}
