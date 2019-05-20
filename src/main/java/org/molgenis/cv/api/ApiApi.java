/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.molgenis.cv.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.molgenis.cv.model.QueryRequest;
import org.molgenis.cv.model.QueryResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-17T22:41:29.980+02:00[Europe/Amsterdam]")
@Api(value = "api", description = "the api API")
public interface ApiApi {

    Logger log = LoggerFactory.getLogger(ApiApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "retrieve source metadata", nickname = "getMeta", notes = "", response = Map.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Metadata", response = Map.class) })
    @RequestMapping(value = "/api/cv/meta",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<Map> getMeta() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ApiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Make a search query with any combination of the components listed.", nickname = "postQuery", notes = "Make a complex query by combining the available components and defining the correct query structure with a simple query string expresses in the form of boolean logic.", response = QueryResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = QueryResponse.class),
        @ApiResponse(code = 400, message = "Unsuccessful response", response = Object.class) })
    @RequestMapping(value = "/api/cv/query",
        produces = { APPLICATION_JSON_VALUE },
        consumes = { APPLICATION_JSON_VALUE },
        method = RequestMethod.POST)
    default ResponseEntity<QueryResponse> postQuery(@ApiParam @Valid @RequestBody QueryRequest body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ApiApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
