package org.molgenis.cv.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QueryQueryComponentsEav
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T19:31:09.233299+02:00[Europe/Amsterdam]")

public class QueryQueryComponentsEav   {
  @JsonProperty("attribute")
  private String attribute = null;

  @JsonProperty("operator")
  private String operator = null;

  @JsonProperty("value")
  private String value = null;

  public QueryQueryComponentsEav attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * Get attribute
   * @return attribute
  **/
  @ApiModelProperty(value = "")


  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public QueryQueryComponentsEav operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
  **/
  @ApiModelProperty(value = "")


  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public QueryQueryComponentsEav value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryQueryComponentsEav queryQueryComponentsEav = (QueryQueryComponentsEav) o;
    return Objects.equals(this.attribute, queryQueryComponentsEav.attribute) &&
        Objects.equals(this.operator, queryQueryComponentsEav.operator) &&
        Objects.equals(this.value, queryQueryComponentsEav.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryQueryComponentsEav {\n");
    
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

