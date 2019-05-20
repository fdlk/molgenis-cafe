package org.molgenis.cv.source;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.molgenis.cv.model.Eav;
import org.molgenis.cv.model.QueryResponse;
import org.molgenis.cv.model.SubjectVariant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

public class DebCentral extends RsqlSource {

  private static final String URL = "https://deb-central.org/api/v2/Patients?attrs=~id&num=0&q={q}";
  private final RestOperations rest;

  public DebCentral(RestOperations rest) {
    this.rest = rest;
  }

  @Override
  Optional<String> toRsql(Eav eav) {
    switch (eav.getAttribute()) {
      case "sex":
        return Optional.of("Gender==" + eav.getValue());
      case "phenotype":
        switch (eav.getValue().toLowerCase()) {
          case "hp:0008066":
            return Optional.of("Blistering==yes");
          case "hp:0001903":
            return Optional.of("Anaemia==yes");
          default:
            return Optional.empty();
        }
      default:
        return Optional.empty();
    }
  }

  @Override
  Optional<String> toRsql(SubjectVariant eav) {
    // TODO: implement
    return Optional.empty();
  }

  @Override
  QueryResponse queryRsql(String rsql) {
    Map result = rest.getForObject(URL, Map.class, rsql);
    List<Map> items = (List<Map>) result.get("items");
    int sources = (int) result.get("total");
    List records = items.stream().map(it -> it.get("Patient_ID")).collect(Collectors.toList());
    return new QueryResponse().addSourcesItem(sources).addRecordsItem(records);
  }
}
