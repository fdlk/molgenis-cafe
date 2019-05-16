package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import io.swagger.annotations.ApiParam;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.molgenis.cv.model.Body;
import org.molgenis.cv.model.QueryQueryComponentsEav;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
    date = "2019-05-15T19:31:09.233299+02:00[Europe/Amsterdam]")
@RestController
public class QueryApiController implements QueryApi {

  private static final Logger log = LoggerFactory.getLogger(QueryApiController.class);

  private final ObjectMapper objectMapper;

  private final HttpServletRequest request;

  @org.springframework.beans.factory.annotation.Autowired
  public QueryApiController(ObjectMapper objectMapper, HttpServletRequest request) {
    this.objectMapper = objectMapper;
    this.request = request;
  }

  public ResponseEntity<Map> postQuery(@ApiParam(value = "") @Valid @RequestBody Body body) {
    List<QueryQueryComponentsEav> eavs = body.getQuery().getComponents().getEav();

    Integer count = 2;
    List<? extends Object> records = ImmutableList.of("a", "b");

    Map response =
        ImmutableMap.of(
            "sources", ImmutableList.of(count), "records", (Object) ImmutableList.of(records));

    return ResponseEntity.ok(response);
  }
}
