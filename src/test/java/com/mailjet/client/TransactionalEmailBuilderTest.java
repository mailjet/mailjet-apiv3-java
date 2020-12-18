package com.mailjet.client;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.*;
import com.mailjet.client.resource.sms.SmsSend;
import com.mailjet.client.transactional.*;
import com.mailjet.client.transactional.response.SendEmailsResponse;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TransactionalEmailBuilderTest {

    private static MailjetClient client;
    private static MockWebServer mockWebServer;

    @BeforeClass
    public static void initialize() throws IOException {
        mockWebServer = new MockWebServer();
        mockWebServer.start();

        final ClientOptions clientOptions = ClientOptions
                .builder()
                .baseUrl(mockWebServer.url("/").toString())
                .apiSecretKey("secret-key")
                .apiKey("api-key")
                .bearerAccessToken("bearer-token")
                .build();

        client = new MailjetClient(clientOptions);
    }

    @Test
    public void transactionalEmail_WithVariables_ShouldCorrectlyPassVariables() throws MailjetException, InterruptedException {

        // arrange
        String expectedBody = "{\"Messages\":[{\"Cc\":[],\"TrackClicks\":\"enabled\",\"Bcc\":[],\"Priority\":3,\"Headers\":{},\"From\":{\"Email\":\"xxxxxxxx@xxxxxxx.com\",\"Name\":\"xxxxxxxx xxxxxxxxxx\"},\"Attachments\":[],\"TemplateLanguage\":true,\"TrackOpens\":\"enabled\",\"Variables\":{\"E_DATE\":\"a string text\",\"E_YEAR\":\"another text\",\"E_MAIL_ID\":\"a last text example\"},\"CustomID\":\"8c0725fa-403c-496e-ac7e-xxxxxxxxx\",\"InlinedAttachments\":[],\"To\":[{\"Email\":\"xxxxxxxx@xxxxxxx.com\",\"Name\":\"xxxxxxxx xxxxxxxxxx\"}],\"TemplateID\":1234567}]}";

        mockWebServer.enqueue(new MockResponse().setResponseCode(201).setBody("{}"));

        Map<String, String> variables = new HashMap<>();
        variables.put("E_DATE", "a string text");
        variables.put("E_YEAR", "another text");
        variables.put("E_MAIL_ID", "a last text example");

        TransactionalEmail message = TransactionalEmail
                .builder()
                .to(new SendContact("xxxxxxxx@xxxxxxx.com", "xxxxxxxx xxxxxxxxxx"))
                .from(new SendContact("xxxxxxxx@xxxxxxx.com", "xxxxxxxx xxxxxxxxxx"))
                .templateID(1234567L)
                .templateLanguage(true)
                .priority(3)
                .customID("8c0725fa-403c-496e-ac7e-xxxxxxxxx")
                .variables(variables)
                .trackOpens(TrackOpens.ENABLED)
                .trackClicks(TrackClicks.ENABLED)
                .build();

        SendEmailsRequest request = SendEmailsRequest.builder()
                .message(message)
                .build();

        // act
        SendEmailsResponse response = request.sendWith(client);

        // assert
        RecordedRequest recordedRequest = mockWebServer.takeRequest();

        assertEquals(expectedBody, recordedRequest.getBody().readUtf8());
    }

    @AfterClass
    public static void tearDown() throws IOException {
        mockWebServer.shutdown();
    }
}
