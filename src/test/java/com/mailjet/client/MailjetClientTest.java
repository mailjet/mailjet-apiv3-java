package com.mailjet.client;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.*;
import com.mailjet.client.resource.sms.SmsSend;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.*;

import static org.junit.Assert.*;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

/**
 *
 * @author guillaume
 */
public class MailjetClientTest {

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
    public void testRequestHeadersV3() throws MailjetException, InterruptedException {

        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody("{}"));

        MailjetRequest contactsRequest = new MailjetRequest(Contact.resource);

        // act
        MailjetResponse response = client.get(contactsRequest);

        // assert
        RecordedRequest recordedRequest = mockWebServer.takeRequest();

        // base64 api-key:secret-key
        assertEquals("Basic YXBpLWtleTpzZWNyZXQta2V5", recordedRequest.getHeader("Authorization"));
        assertEquals("application/json", recordedRequest.getHeader("Accept"));
        assertTrue(recordedRequest.getHeader("User-Agent").startsWith("mailjet-apiv3-java/v"));
    }

    @Test
    public void testContactsGet() throws MailjetException, InterruptedException {

        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody("{\n" +
                "\t\"Count\": 1,\n" +
                "\t\"Data\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"IsExcludedFromCampaigns\": true,\n" +
                "\t\t\t\"Name\": \"New Contact\",\n" +
                "\t\t\t\"CreatedAt\": \"2018-01-01T00:00:00\",\n" +
                "\t\t\t\"DeliveredCount\": 10,\n" +
                "\t\t\t\"Email\": \"passenger@mailjet.com\",\n" +
                "\t\t\t\"ExclusionFromCampaignsUpdatedAt\": \"2018-01-01T00:00:00\",\n" +
                "\t\t\t\"ID\": 123456789,\n" +
                "\t\t\t\"IsOptInPending\": false,\n" +
                "\t\t\t\"IsSpamComplaining\": false,\n" +
                "\t\t\t\"LastActivityAt\": \"2018-01-01T00:00:00\",\n" +
                "\t\t\t\"LastUpdateAt\": \"2018-01-01T00:00:00\",\n" +
                "\t\t\t\"UnsubscribedAt\": \"2018-01-01T00:00:00\",\n" +
                "\t\t\t\"UnsubscribedBy\": \"2018-01-01T00:00:00\"\n" +
                "\t\t}\n" +
                "\t],\n" +
                "\t\"Total\": 1\n" +
                "}"));

        MailjetRequest contactsRequest = new MailjetRequest(Contact.resource);

        // act
        MailjetResponse response = client.get(contactsRequest);

        // assert
        RecordedRequest recordedRequest = mockWebServer.takeRequest();

        assertEquals("/v3/REST/contact", recordedRequest.getPath());
        assertEquals("GET", recordedRequest.getMethod());
        assertEquals(200, response.getStatus());
        assertEquals(1, response.getCount());
        assertEquals(1, response.getTotal());
        assertEquals(true, response.getData().getJSONObject(0).getBoolean("IsExcludedFromCampaigns"));
        assertEquals("New Contact", response.getData().getJSONObject(0).getString("Name"));
    }

    @Test
    public void testSenderPut() throws MailjetException, InterruptedException {

        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody("{}"));

        MailjetRequest request = new MailjetRequest(Sender.resource, 121)
                      .property(Sender.NAME, "Guillaume");

        // act
        MailjetResponse response = client.put(request);

        // assert
        RecordedRequest recordedRequest = mockWebServer.takeRequest();

        assertEquals("/v3/REST/sender/121", recordedRequest.getPath());
        assertEquals("PUT", recordedRequest.getMethod());
        assertEquals("{\"Name\":\"Guillaume\"}", recordedRequest.getBody().readUtf8());
    }

    @Test
    public void testFilteringGet() throws MailjetException, InterruptedException {

        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody("{}"));

        MailjetRequest contactsRequest = new MailjetRequest(Contact.resource)
                        .filter(Contact.LIMIT, 10)
                        .filter(Contact.OFFSET, 2);

        // act
        MailjetResponse response = client.get(contactsRequest);

        // assert
        RecordedRequest recordedRequest = mockWebServer.takeRequest();

        assertEquals("/v3/REST/contact?Limit=10&Offset=2", recordedRequest.getPath());
    }

    @Test
    public void testGetСontactslists() throws MailjetException, InterruptedException {

        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody("{}"));
        MailjetRequest request = new MailjetRequest(ContactGetcontactslists.resource, 2);

        // act
        MailjetResponse response = client.get(request);

        // assert
        RecordedRequest recordedRequest = mockWebServer.takeRequest();

        assertEquals("/v3/REST/contact/2/getcontactslists", recordedRequest.getPath());
        assertEquals("GET", recordedRequest.getMethod());
        assertEquals(200, response.getStatus());
    }

    @Test
    public void testSendv3() throws MailjetException, InterruptedException {

        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody("{}"));

        String fromEmail =  "pilot@mailjet.com",
               fromName = "Mailjet Pilot",
               subject = "Your email flight plan!",
               textPart = "Dear passenger, welcome to Mailjet! May the delivery force be with you!",
               htmlPart = "<h3>Dear passenger, welcome to Mailjet</h3><br/>May the delivery force be with you!",
               recipient = "passenger@mailjet.com";

        MailjetRequest request = new MailjetRequest(Email.resource)
                        .property(Email.FROMEMAIL, fromEmail)
                        .property(Email.FROMNAME, fromName)
                        .property(Email.SUBJECT, subject)
                        .property(Email.TEXTPART, textPart)
                        .property(Email.HTMLPART, htmlPart)
                        .property(Email.RECIPIENTS, new JSONArray()
                        .put(new JSONObject()
                        .put(Email.EMAIL, recipient)));

        // act
        MailjetResponse response = client.post(request);

        // assert
        RecordedRequest recordedRequest = mockWebServer.takeRequest();

        assertEquals("/v3/send", recordedRequest.getPath());
        assertEquals("POST", recordedRequest.getMethod());
        assertEquals(200, response.getStatus());
        assertEquals("{\"FromName\":\"Mailjet Pilot\",\"Recipients\":[{\"Email\":\"passenger@mailjet.com\"}],\"Text-Part\":\"Dear passenger, welcome to Mailjet! May the delivery force be with you!\",\"FromEmail\":\"pilot@mailjet.com\",\"Subject\":\"Your email flight plan!\",\"Html-Part\":\"<h3>Dear passenger, welcome to Mailjet<\\/h3><br/>May the delivery force be with you!\"}",
                recordedRequest.getBody().readUtf8());
    }

    @Test
    public void testSendv31() throws MailjetException, InterruptedException {

        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody("{}"));

        JSONObject message = new JSONObject();
        message.put(Emailv31.Message.FROM, new JSONObject()
            .put(Emailv31.Message.EMAIL, "pilot@mailjet.com")
            .put(Emailv31.Message.NAME, "Mailjet Pilot"))
            .put(Emailv31.Message.SUBJECT, "Your email flight plan!")
            .put(Emailv31.Message.TEXTPART, "Dear passenger, welcome to Mailjet! May the delivery force be with you!")
            .put(Emailv31.Message.HTMLPART, "<h3>Dear passenger, welcome to Mailjet</h3><br/>May the delivery force be with you!")
            .put(Emailv31.Message.TO, new JSONArray()
            .put(new JSONObject()
            .put(Emailv31.Message.EMAIL, "passenger@mailjet.com")));

        MailjetRequest request = new MailjetRequest(Emailv31.resource).property(Emailv31.MESSAGES, (new JSONArray()).put(message));

        // act
        MailjetResponse response = client.post(request);

        // assert
        RecordedRequest recordedRequest = mockWebServer.takeRequest();

        assertEquals("/v3.1/send", recordedRequest.getPath());
        assertEquals("POST", recordedRequest.getMethod());
        assertEquals(200, response.getStatus());
        assertEquals("{\"Messages\":[{\"HTMLPart\":\"<h3>Dear passenger, welcome to Mailjet<\\/h3><br/>May the delivery force be with you!\",\"TextPart\":\"Dear passenger, welcome to Mailjet! May the delivery force be with you!\",\"From\":{\"Email\":\"pilot@mailjet.com\",\"Name\":\"Mailjet Pilot\"},\"To\":[{\"Email\":\"passenger@mailjet.com\"}],\"Subject\":\"Your email flight plan!\"}]}",
                recordedRequest.getBody().readUtf8());
    }

    @Test
    public void testSendSMS() throws MailjetException, InterruptedException {

        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody("{}"));

        MailjetRequest request = new MailjetRequest(SmsSend.resource)
			.property(SmsSend.FROM, "MJPilot")
        	.property(SmsSend.TO, "+336000000")
			.property(SmsSend.TEXT, "Have a nice SMS flight with Mailjet!");

        // act
        MailjetResponse response = client.post(request);

        // assert
        RecordedRequest recordedRequest = mockWebServer.takeRequest();

        assertEquals("Bearer bearer-token", recordedRequest.getHeader("Authorization"));
        assertEquals("/v4/sms-send", recordedRequest.getPath());
        assertEquals("POST", recordedRequest.getMethod());
        assertEquals("{\"Text\":\"Have a nice SMS flight with Mailjet!\",\"From\":\"MJPilot\",\"To\":\"+336000000\"}",
                recordedRequest.getBody().readUtf8());

        assertEquals(200, response.getStatus());
    }

    @AfterClass
    public static void tearDown() throws IOException {
        mockWebServer.shutdown();
    }
}
