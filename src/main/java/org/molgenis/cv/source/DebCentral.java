package org.molgenis.cv.source;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.molgenis.cv.model.QueryQueryComponentsEav;
import org.molgenis.cv.model.SubjectVariant;
import org.springframework.web.client.RestOperations;

public class DebCentral extends Source {

  public static final String URL = "https://deb-central.org/api/v2/Patients?attrs=~id&num=0";
  private final RestOperations rest;

  public DebCentral(RestOperations rest) {
    this.rest = rest;
  }

  private Map transformResponse(Map response) {
    List<Map> items = (List<Map>) response.get("items");
    int sources = (int) response.get("total");
    List records = items.stream().map(it -> it.get("Patient_ID")).collect(Collectors.toList());
    return ImmutableMap.of(
        "sources", ImmutableList.of(sources), "records", (Object) ImmutableList.of(records));
  }

  public Map getSources() {
    Map result = rest.getForObject(URL, Map.class);
    return transformResponse(result);
  }

  public Map getSources(String rsql) {
    Map result = rest.getForObject(URL + "&q={q}", Map.class, rsql);
    return transformResponse(result);
  }

  @Override
  Optional<String> toRsql(QueryQueryComponentsEav eav) {
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
}
