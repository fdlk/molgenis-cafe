package org.molgenis.cv.model;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = JsonDeserializer.None.class)
public class PredicateReference implements Logic {

  private final String reference;

  public PredicateReference(String reference) {
    this.reference = reference;
  }

  public String getReference() {
    return reference;
  }
}
