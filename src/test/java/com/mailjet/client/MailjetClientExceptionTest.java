package com.mailjet.client;

import com.mailjet.client.errors.*;
import com.mailjet.client.resource.Email;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.*;

import java.io.IOException;

/**
 * @author Nikola-Andreev
 */
public class MailjetClientExceptionTest {

    private static final String FROM_EMAIL =  "pilot@mailjet.com";
    private static final String FROM_NAME = "Mailjet Pilot";
    private static final String SUBJECT = "Your email flight plan!";
    private static final String TEXT_PART = "Dear passenger, welcome to Mailjet! May the delivery force be with you!";
    private static final String HTML_PART = "<h3>Dear passenger, welcome to Mailjet</h3><br/>May the delivery force be with you!";
    private static final String RECIPIENT = "passenger@mailjet.com";

    private static MailjetClient client;
    private static MailjetRequest request;
    private static MockWebServer mockWebServer;

    @BeforeClass
    public static void initialize() throws IOException {
        request = new MailjetRequest(Email.resource)
                .property(Email.FROMEMAIL, FROM_EMAIL)
                .property(Email.FROMNAME, FROM_NAME)
                .property(Email.SUBJECT, SUBJECT)
                .property(Email.TEXTPART, TEXT_PART)
                .property(Email.HTMLPART, HTML_PART)
                .property(Email.RECIPIENTS, new JSONArray()
                        .put(new JSONObject()
                                .put(Email.EMAIL, RECIPIENT)));

        mockWebServer = new MockWebServer();
        mockWebServer.start();

        ClientOptions clientOptions = ClientOptions
                .builder()
                .baseUrl(mockWebServer.url("/").toString())
                .apiSecretKey("secret-key")
                .apiKey("api-key")
                .build();

        client = new MailjetClient(clientOptions);
    }

    @Test
    public void testTooManyRequestsResponse() {

        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(429));

        // act
        MailjetRateLimitException exception = Assert.assertThrows(MailjetRateLimitException.class, () ->{
            client.post(request);
        });

        // assert
        Assert.assertEquals("Too Many Requests", exception.getMessage());
    }

    @Test
    public void testInternalServerErrorResponse() {
        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(500).setBody("Error Description"));

        // act
        MailjetServerException exception = Assert.assertThrows(MailjetServerException.class, () ->{
            client.post(request);
        });

        // assert
        Assert.assertEquals("Error Description", exception.getMessage());
    }

    @Test
    public void testBadRequestResponse() {
        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(400).setBody("Error Description"));

        // act
        MailjetClientRequestException exception = Assert.assertThrows(MailjetClientRequestException.class, () ->{
            client.post(request);
        });

        // assert
        Assert.assertEquals("Error Description", exception.getMessage());
    }

    @Test
    public void testUnauthorizedResponse() {
        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(401));

        // act
        MailjetUnauthorizedException exception = Assert.assertThrows(MailjetUnauthorizedException.class, () ->{
            client.post(request);
        });

        // assert
        Assert.assertEquals("Unauthorized. Please,verify your access key and access secret key or token for the given account", exception.getMessage());
    }

    @Test
    public void testForbiddenResponse() {
        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(403).setBody("Error Description"));

        // act
        MailjetClientRequestException exception = Assert.assertThrows(MailjetClientRequestException.class, () ->{
            client.post(request);
        });

        // assert
        Assert.assertEquals("Error Description", exception.getMessage());
    }

    @AfterClass
    public static void tearDown() throws IOException {
        mockWebServer.shutdown();
    }
}
