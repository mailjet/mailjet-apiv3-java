package com.mailjet.client;

import com.mailjet.client.errors.MailjetClientRequestException;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetUnauthorizedException;
import com.mailjet.client.resource.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class MailjetExceptionIT {

    @Test
    public void shouldThrowExceptionInCaseOfBadRequest() {
        // arrange
        MailjetClient mailjetClient = TestHelper.getClient();
        MailjetRequest request = new MailjetRequest(Contact.resource, "Non-existent-id")
                .property(Contact.ISEXCLUDEDFROMCAMPAIGNS, "true")
                .property(Contact.NAME, "New Contact");

        // act
        MailjetClientRequestException exception = Assert.assertThrows(MailjetClientRequestException.class, () -> {
            MailjetResponse response = mailjetClient.put(request);
        });

        // assert
        Assert.assertEquals(400, exception.getStatusCode());
        Assert.assertEquals("{ \"ErrorInfo\" : \"\", \"ErrorMessage\" : \"Invalid email address \\\"Non-existent-id\\\", reason: \\\"No @ character in mail\\\"\", \"StatusCode\" : 400 }"
                , exception.getMessage());
    }

    @Test(expected = MailjetUnauthorizedException.class)
    public void shouldThrowMailjetUnauthorizedExceptionInCaseOfUnauthorizedRequest() throws MailjetException {
        // arrange
        MailjetClient mailjetClient = new MailjetClient("Not-valid-key", "not-valid-private-key");
        MailjetRequest request = new MailjetRequest(Contact.resource, "Non-existent-id")
                .property(Contact.ISEXCLUDEDFROMCAMPAIGNS, "true")
                .property(Contact.NAME, "New Contact");

        // act
        MailjetResponse response = mailjetClient.put(request);
    }

    @Test
    public void shouldThrowExceptionInCaseOfGetWithBody() {
        // arrange
        MailjetClient mailjetClient = TestHelper.getClient();
        MailjetRequest request = new MailjetRequest(Contact.resource, "Non-existent-id")
                .property(Contact.NAME, "New Contact");

        // act
        MailjetClientRequestException exception = Assert.assertThrows(MailjetClientRequestException.class, () -> {
            MailjetResponse response = mailjetClient.get(request);
        });

        // assert
        Assert.assertEquals(400, exception.getStatusCode());
        Assert.assertEquals("Seems like you are using .parameters() on the MailjetRequest object for the GET call. This parameters will not be used. Please, use .filter() instead", exception.getMessage());
    }

    @Test
    public void shouldThrowMailjetRequestExceptionForTheSendApiV3() throws MailjetException {
        // arrange
        MailjetClient mailjetClient = TestHelper.getClient();

        String senderEmail = TestHelper.getValidSenderEmail(mailjetClient);

        MailjetRequest request = new MailjetRequest(Email.resource)
                // no from email filled set
                //.property(Email.FROMEMAIL, senderEmail)
                .property(Email.FROMNAME, "Your Mailjet Pilot")
                .property(Email.RECIPIENTS, new JSONArray()
                        .put(new JSONObject()
                                .put("Email", senderEmail)
                                .put("Name", "Passenger 1")
                        )
                )
                .property(Email.SUBJECT, "Your email flight plan!")
                .property(Email.TEXTPART, "Dear passenger, welcome to Mailjet! May the delivery force be with you!")
                .property(Email.HTMLPART, "<h3>Dear passenger, welcome to Mailjet!</h3><br />May the delivery force be with you!");

        // act
        MailjetClientRequestException exception = Assert.assertThrows(MailjetClientRequestException.class, () -> {
            MailjetResponse response = mailjetClient.post(request);
        });

        // assert
        Assert.assertEquals(400, exception.getStatusCode());
        Assert.assertEquals("", exception.getMessage()); // api returns an empty body for that case
    }

    @Test
    public void shouldNotThrowExceptionForTheSendApiV31() throws MailjetException {
        // arrange
        MailjetClient mailjetClient = TestHelper.getClient();

        String senderEmail = TestHelper.getValidSenderEmail(mailjetClient);

        MailjetRequest request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", senderEmail)
                                        .put("Name", "Mailjet Pilot"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", "passenger1@mailjet.com")
                                                .put("Name", "passenger 1"))
                                        .put(new JSONObject()
                                                // invalid email - without @
                                                .put("Email", "passenger2mailjet.com")
                                                .put("Name", "passenger 2"))
                                        )
                                .put(Emailv31.Message.SUBJECT, "Your email flight plan!")
                                .put(Emailv31.Message.TEXTPART, "Dear passenger 1, welcome to Mailjet! May the delivery force be with you!")
                                .put(Emailv31.Message.HTMLPART, "<h3>Dear passenger 1, welcome to <a href=\"https://www.mailjet.com/\">Mailjet</a>!</h3><br />May the delivery force be with you!")));

        // act
        MailjetResponse response = mailjetClient.post(request);

        // assert
        Assert.assertEquals(400, response.getStatus());

        // only one message has errors
        Assert.assertEquals(1, response.getData().length());

        JSONArray errors = response.getData().getJSONObject(0).getJSONArray("Errors");

        // and the single error is about invalid sender
        Assert.assertEquals(1, errors.length());
        Assert.assertEquals("mj-0013", errors.getJSONObject(0).getString("ErrorCode"));
    }
}
