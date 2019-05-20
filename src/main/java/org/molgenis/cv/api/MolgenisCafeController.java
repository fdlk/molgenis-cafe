package org.molgenis.cv.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import org.molgenis.cv.model.QueryRequest;
import org.molgenis.cv.model.QueryResponse;
import org.molgenis.cv.source.Source;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MolgenisCafeController implements ApiApi {

  private final Source source;
  private final ObjectMapper objectMapper;
  private final HttpServletRequest request;

  @org.springframework.beans.factory.annotation.Autowired
  public MolgenisCafeController(
      Source source, ObjectMapper objectMapper, HttpServletRequest request) {
    this.objectMapper = objectMapper;
    this.request = request;
    this.source = source;
  }

  @Override
  public Optional<ObjectMapper> getObjectMapper() {
    return Optional.ofNullable(objectMapper);
  }

  @Override
  public Optional<HttpServletRequest> getRequest() {
    return Optional.ofNullable(request);
  }

  @Override
  public Optional<String> getAcceptHeader() {
    return Optional.empty();
  }

  @Override
  public ResponseEntity<Map> getMeta() {
    return ResponseEntity.ok(
        ImmutableMap.of(
            "sex",
            ImmutableList.of("m", "male", "f", "female", "unknown"),
            "mechanism",
            ImmutableList.of("yes", "no", "unknown")));
  }

  @Override
  public ResponseEntity<QueryResponse> postQuery(QueryRequest body) {
    return ResponseEntity.ok(source.query(body));
  }
}
