package com.mailjet.client;

import com.mailjet.client.errors.MailjetClientRequestException;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetUnauthorizedException;
import com.mailjet.client.resource.Contact;
import com.mailjet.client.resource.ContactGetcontactslists;
import com.mailjet.client.resource.Email;
import com.mailjet.client.resource.Emailv31;
import com.mailjet.client.resource.Sender;
import com.mailjet.client.resource.sms.SmsSend;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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

    @Test
    public void testPutAsync() throws Exception {
        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody("{}"));

        MailjetRequest request = new MailjetRequest(Sender.resource, 121)
                .property(Sender.NAME, "Guillaume");

        // act
        CompletableFuture<MailjetResponse> futureResponse = client.putAsync(request);
        MailjetResponse response = futureResponse.get();

        // assert
        RecordedRequest recordedRequest = mockWebServer.takeRequest();

        assertEquals("/v3/REST/sender/121", recordedRequest.getPath());
        assertEquals("PUT", recordedRequest.getMethod());
        assertEquals("{\"Name\":\"Guillaume\"}", recordedRequest.getBody().readUtf8());
        assertEquals(200, response.getStatus());
    }

    @Test
    public void testDelete() throws Exception {
        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody("{}"));

        MailjetRequest request = new MailjetRequest(Contact.resource, 123);

        // act
        MailjetResponse response = client.delete(request);

        // assert
        RecordedRequest recordedRequest = mockWebServer.takeRequest();

        assertEquals("/v3/REST/contact/123", recordedRequest.getPath());
        assertEquals("DELETE", recordedRequest.getMethod());
        assertEquals(200, response.getStatus());
    }

    @Test
    public void testDeleteAsync() throws Exception {
        // arrange
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody("{}"));

        MailjetRequest request = new MailjetRequest(Contact.resource, 123);

        // act
        CompletableFuture<MailjetResponse> futureResponse = client.deleteAsync(request);
        MailjetResponse response = futureResponse.get();

        // assert
        RecordedRequest recordedRequest = mockWebServer.takeRequest();

        assertEquals("/v3/REST/contact/123", recordedRequest.getPath());
        assertEquals("DELETE", recordedRequest.getMethod());
        assertEquals(200, response.getStatus());
    }

    @Test(expected = MailjetClientRequestException.class)
    public void testGet_withBodyThrowsRequestException() throws Exception {
        MailjetRequest bad = new MailjetRequest(Contact.resource)
                .property("foo","bar");
        client.get(bad);
    }

    /**
     * The async GET should immediately complete exceptionally in the same case.
     */
    @Test
    public void testGetAsync_withBodyCompletesExceptionally() throws Exception {
        MailjetRequest bad = new MailjetRequest(Contact.resource)
                .property("foo","bar");
        CompletableFuture<MailjetResponse> f = client.getAsync(bad);
        assertTrue(f.isCompletedExceptionally());
        try {
            f.get();
            fail("Expected MailjetClientRequestException");
        } catch (ExecutionException e) {
            assertTrue(e.getCause() instanceof MailjetClientRequestException);
        }
    }

    /**
     * POST with an attachment should use the File‐branch in getPostCall and stream the file contents.
     */
    @Test
    public void testPost_withAttachmentStreamsFile() throws Exception {
        // 1) create a temp file with known bytes
        Path tmp = Files.createTempFile("mj-", ".txt");
        Files.write(tmp, "xyz123".getBytes(StandardCharsets.UTF_8));

        // 2) enqueue a dummy response so client.post(...) returns without error
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody("{}"));

        // 3) build request with attachFile(...)
        MailjetRequest r = new MailjetRequest(Email.resource)
                .attachFile(tmp.toFile());
        client.post(r);

        // 4) verify that the server saw exactly the file’s bytes
        RecordedRequest rec = mockWebServer.takeRequest();
        assertEquals("xyz123", rec.getBody().readUtf8());

        Files.delete(tmp);
    }

    @Test(expected = MailjetUnauthorizedException.class)
    public void testMissingBasicCredentials_throwsUnauthorized() throws Exception {
        // build a client with no apiKey/apiSecret
        ClientOptions opts = ClientOptions.builder()
                .baseUrl(mockWebServer.url("/").toString())
                .build();
        MailjetClient naked = new MailjetClient(opts);

        // even a plain GET will now throw
        naked.get(new MailjetRequest(Contact.resource));
    }

    @AfterClass
    public static void tearDown() throws IOException {
        mockWebServer.shutdown();
    }
}
