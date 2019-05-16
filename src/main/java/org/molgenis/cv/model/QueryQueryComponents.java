package org.molgenis.cv.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.molgenis.cv.model.QueryQueryComponentsEav;
import org.molgenis.cv.model.SubjectVariant;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QueryQueryComponents
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T19:31:09.233299+02:00[Europe/Amsterdam]")

public class QueryQueryComponents   {
  @JsonProperty("subjectVariant")
  @Valid
  private List<SubjectVariant> subjectVariant = null;

  @JsonProperty("eav")
  @Valid
  private List<QueryQueryComponentsEav> eav = null;

  public QueryQueryComponents subjectVariant(List<SubjectVariant> subjectVariant) {
    this.subjectVariant = subjectVariant;
    return this;
  }

  public QueryQueryComponents addSubjectVariantItem(SubjectVariant subjectVariantItem) {
    if (this.subjectVariant == null) {
      this.subjectVariant = new ArrayList<SubjectVariant>();
    }
    this.subjectVariant.add(subjectVariantItem);
    return this;
  }

  /**
   * Get subjectVariant
   * @return subjectVariant
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SubjectVariant> getSubjectVariant() {
    return subjectVariant;
  }

  public void setSubjectVariant(List<SubjectVariant> subjectVariant) {
    this.subjectVariant = subjectVariant;
  }

  public QueryQueryComponents eav(List<QueryQueryComponentsEav> eav) {
    this.eav = eav;
    return this;
  }

  public QueryQueryComponents addEavItem(QueryQueryComponentsEav eavItem) {
    if (this.eav == null) {
      this.eav = new ArrayList<QueryQueryComponentsEav>();
    }
    this.eav.add(eavItem);
    return this;
  }

  /**
   * Get eav
   * @return eav
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<QueryQueryComponentsEav> getEav() {
    return eav;
  }

  public void setEav(List<QueryQueryComponentsEav> eav) {
    this.eav = eav;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryQueryComponents queryQueryComponents = (QueryQueryComponents) o;
    return Objects.equals(this.subjectVariant, queryQueryComponents.subjectVariant) &&
        Objects.equals(this.eav, queryQueryComponents.eav);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectVariant, eav);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryQueryComponents {\n");
    
    sb.append("    subjectVariant: ").append(toIndentedString(subjectVariant)).append("\n");
    sb.append("    eav: ").append(toIndentedString(eav)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

