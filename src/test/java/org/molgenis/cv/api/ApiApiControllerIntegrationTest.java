package org.molgenis.cv.api;

import java.util.Map;
import org.molgenis.cv.gen.Swagger2SpringBoot;
import org.molgenis.cv.model.QueryRequest;
import org.molgenis.cv.model.QueryResponse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Swagger2SpringBoot.class})
public class ApiApiControllerIntegrationTest {

    @Autowired
    private MolgenisCafeController api;

    @Test
    public void getMetaTest() throws Exception {
        ResponseEntity<Map> responseEntity = api.getMeta();
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

    @Test
    public void postQueryTest() throws Exception {
        QueryRequest body = new QueryRequest();
        ResponseEntity<QueryResponse> responseEntity = api.postQuery(body);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

}
