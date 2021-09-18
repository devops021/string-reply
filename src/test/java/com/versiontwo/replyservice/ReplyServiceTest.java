package com.versiontwo.replyservice;

import com.dto.ReplyMessage;
import com.versiontwo.replyservice.exception.ExceptionResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Mukul Anand
 */
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ReplyServiceTest {

    /**
     * randomServerPort will hold random port
     * created which will avoid conflict among
     * existing ports.
     */
    @LocalServerPort
    int randomServerPort;

    /**
     * @throws URISyntaxException
     * method testReplyServiceBasic will test basic
     * for success scenario.
     */
    @Test
    public void testReplyServiceBasic() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://localhost:" + randomServerPort + "/reply/helloworld";
        URI uri = new URI(baseUrl);

        ResponseEntity<ReplyMessage> result = restTemplate.getForEntity(uri, ReplyMessage.class);

        //Verify request succeed
        Assertions.assertEquals(200, result.getStatusCodeValue());
        Assertions.assertEquals("helloworld", result.getBody().getData());
    }

    /**
     * @throws URISyntaxException
     * method testReplyServiceRule11Success will test rule 11
     * for success scenario.
     */
    @Test
    public void testReplyServiceRule11Success() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://localhost:" + randomServerPort + "/v2/reply/11-kbzw9ru";
        URI uri = new URI(baseUrl);

        ResponseEntity<ReplyMessage> result = restTemplate.getForEntity(uri, ReplyMessage.class);

        //Verify request succeed
        Assertions.assertEquals(200, result.getStatusCodeValue());
        Assertions.assertEquals("kbzw9ru", result.getBody().getData());
    }

    /**
     * @throws URISyntaxException
     * method testReplyServiceRule11Failure will test rule 11
     * for Failure scenario.
     */
    @Test
    public void testReplyServiceRule11Failure() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://localhost:" + randomServerPort + "/v2/reply/11-kbzw9ru";
        URI uri = new URI(baseUrl);

        ResponseEntity<ReplyMessage> result = restTemplate.getForEntity(uri, ReplyMessage.class);

        //Verify request Failure
        Assertions.assertEquals("ur9wzbk", result.getBody().getData());
    }

    /**
     * @throws URISyntaxException
     * method testReplyServiceRule12Success will test rule 12
     * for success scenario.
     */
    @Test
    public void testReplyServiceRule12Success() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://localhost:" + randomServerPort + "/v2/reply/12-kbzw9ru";
        URI uri = new URI(baseUrl);

        ResponseEntity<ReplyMessage> result = restTemplate.getForEntity(uri, ReplyMessage.class);

        //Verify request succeed
        Assertions.assertEquals(200, result.getStatusCodeValue());
        Assertions.assertEquals("5a8973b3b1fafaeaadf10e195c6e1dd4", result.getBody().getData());
    }

    /**
     * @throws URISyntaxException
     * method testReplyServiceRule12Failure will test rule 12
     * for failure scenario.
     */
    @Test
    public void testReplyServiceRule12Failure() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://localhost:" + randomServerPort + "/v2/reply/12-kbzw9ru";
        URI uri = new URI(baseUrl);

        ResponseEntity<ReplyMessage> result = restTemplate.getForEntity(uri, ReplyMessage.class);

        //Verify request Failure
        Assertions.assertEquals("5a8973b3b1fafaeeeef10e195c6e1dd4", result.getBody().getData());
    }

    /**
     * @throws URISyntaxException
     * method testReplyServiceRule21Success will test rule 21
     * for success scenario.
     */
    @Test
    public void testReplyServiceRule21Success() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://localhost:" + randomServerPort + "/v2/reply/21-kbzw9ru";
        URI uri = new URI(baseUrl);

        ResponseEntity<ReplyMessage> result = restTemplate.getForEntity(uri, ReplyMessage.class);

        //Verify request succeed
        Assertions.assertEquals(200, result.getStatusCodeValue());
        Assertions.assertEquals("daf168567f92b1c464459087eaaefaf0", result.getBody().getData());
    }

    /**
     * @throws URISyntaxException
     * method testReplyServiceRule21Failure will test rule 21
     * for failure scenario.
     */
    @Test
    public void testReplyServiceRule21Failure() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://localhost:" + randomServerPort + "/v2/reply/21-kbzw9ru";
        URI uri = new URI(baseUrl);

        ResponseEntity<ReplyMessage> result = restTemplate.getForEntity(uri, ReplyMessage.class);

        //Verify request Failure
        Assertions.assertEquals("daf168567f92b1crrr459087eaaefaf0", result.getBody().getData());
    }

    /**
     * @throws URISyntaxException
     * method testReplyServiceRule22Success will test rule 22
     * for success scenario.
     */
    @Test
    public void testReplyServiceRule22Success() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://localhost:" + randomServerPort + "/v2/reply/22-kbzw9ru";
        URI uri = new URI(baseUrl);

        ResponseEntity<ReplyMessage> result = restTemplate.getForEntity(uri, ReplyMessage.class);

        //Verify request succeed
        Assertions.assertEquals(200, result.getStatusCodeValue());
        Assertions.assertEquals("e8501e64cf0a9fa45e3c25aa9e77ffd5", result.getBody().getData());
    }

    /**
     * @throws URISyntaxException
     * method testReplyServiceRule22Failure will test rule 22
     * for failure scenario.
     */
    @Test
    public void testReplyServiceRule22Failure() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://localhost:" + randomServerPort + "/v2/reply/22-kbzw9ru";
        URI uri = new URI(baseUrl);

        ResponseEntity<ReplyMessage> result = restTemplate.getForEntity(uri, ReplyMessage.class);

        //Verify request Failure
        Assertions.assertEquals("e8501e64cfsss9fa45e3c25aa9e77ffd5", result.getBody().getData());
    }

    /**
     * @throws URISyntaxException
     * method testReplyServiceInvalidRuleFailure will test invalid rule
     * for failure scenario.
     */
    @Test
    public void testReplyServiceInvalidRuleFailure() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://localhost:" + randomServerPort + "/v2/reply/23-kbzw9ru";
        URI uri = new URI(baseUrl);

        ResponseEntity<ExceptionResponse> result = restTemplate.getForEntity(uri, ExceptionResponse.class);

        //Verify request Failure
        Assertions.assertEquals(400, result.getStatusCodeValue());
        Assertions.assertEquals("Invalid Input", result.getBody().getErrorMessage());
    }
}
