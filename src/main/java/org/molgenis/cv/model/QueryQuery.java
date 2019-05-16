package org.molgenis.cv.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.molgenis.cv.model.QueryQueryComponents;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * QueryQuery
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T19:31:09.233299+02:00[Europe/Amsterdam]")

public class QueryQuery   {
  @JsonProperty("components")
  private QueryQueryComponents components = null;

  public QueryQuery components(QueryQueryComponents components) {
    this.components = components;
    return this;
  }

  /**
   * Get components
   * @return components
  **/
  @ApiModelProperty(value = "")

  @Valid

  public QueryQueryComponents getComponents() {
    return components;
  }

  public void setComponents(QueryQueryComponents components) {
    this.components = components;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryQuery queryQuery = (QueryQuery) o;
    return Objects.equals(this.components, queryQuery.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(components);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryQuery {\n");
    
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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

