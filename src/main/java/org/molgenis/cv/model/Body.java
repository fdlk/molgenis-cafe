package org.molgenis.cv.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.molgenis.cv.model.Logic;
import org.molgenis.cv.model.QueryQuery;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * query parameter
 */
@ApiModel(description = "query parameter")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T19:31:09.233299+02:00[Europe/Amsterdam]")

public class Body   {
  @JsonProperty("query")
  private QueryQuery query = null;

  @JsonProperty("logic")
  private Logic logic = null;

  public Body query(QueryQuery query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(value = "")

  @Valid

  public QueryQuery getQuery() {
    return query;
  }

  public void setQuery(QueryQuery query) {
    this.query = query;
  }

  public Body logic(Logic logic) {
    this.logic = logic;
    return this;
  }

  /**
   * Get logic
   * @return logic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Logic getLogic() {
    return logic;
  }

  public void setLogic(Logic logic) {
    this.logic = logic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body body = (Body) o;
    return Objects.equals(this.query, body.query) &&
        Objects.equals(this.logic, body.logic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, logic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
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

