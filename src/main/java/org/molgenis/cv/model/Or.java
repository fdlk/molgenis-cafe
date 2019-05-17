package org.molgenis.cv.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;

@JsonDeserialize(using = JsonDeserializer.None.class)
public class Or implements Logic{
  @JsonProperty("-OR")
  List<Logic> predicates;

  public List<Logic> getPredicates() {
    return predicates;
  }
}
