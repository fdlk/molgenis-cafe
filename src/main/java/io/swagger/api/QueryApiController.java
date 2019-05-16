package io.swagger.api;

import org.molgenis.cv.model.Body;
import org.molgenis.cv.model.QueryQueryComponentsEav;
import org.molgenis.cv.model.SubjectVariant;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-15T19:31:09.233299+02:00[Europe/Amsterdam]")

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

    public ResponseEntity<SubjectVariant> postQuery(@ApiParam(value = ""  )  @Valid @RequestBody Body body) {
        List<QueryQueryComponentsEav> eavs = body.getQuery().getComponents().getEav();

        return new ResponseEntity<SubjectVariant>(HttpStatus.NOT_IMPLEMENTED);
    }

}
