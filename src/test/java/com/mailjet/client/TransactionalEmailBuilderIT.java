package com.mailjet.client;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.transactional.*;
import com.mailjet.client.transactional.response.MessageResult;
import com.mailjet.client.transactional.response.SendEmailsResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Paths;


public class TransactionalEmailBuilderIT {
    private MailjetClient client;
    private String attachmentPath;
    private String senderEmail;

    @Before
    public void setUp() throws MailjetException {
        client = TestHelper.getClient();
        attachmentPath = Paths.get("src","test", "resources")
                .resolve("Test-attachment.txt")
                .toAbsolutePath()
                .toString();

        senderEmail = TestHelper.getValidSenderEmail(client);
    }

    @Test
    public void SendEmailsRequest_SendsMessage() throws MailjetException, IOException {
        // arrange
        TransactionalEmail message1 = TransactionalEmail
                .builder()
                .to(new SendContact(senderEmail, "stanislav"))
                .from(new SendContact(senderEmail, "Mailjet integration test"))
                .htmlPart("<h1>This is the HTML content of the mail</h1>")
                .subject("This is the subject")
                .trackOpens(TrackOpens.ENABLED)
                .attachment(Attachment.fromFile(attachmentPath))
                .header("test-header-key", "test-value")
                .customID("custom-id-value")
                .build();

        SendEmailsRequest request = SendEmailsRequest
                .builder()
                .message(message1) // you can add up to 50 messages per request
                .build();

        // act
        SendEmailsResponse response = request.sendWith(client);

        // assert
        Assert.assertEquals(1, response.getMessages().length);

        MessageResult messageResult = response.getMessages()[0];

        Assert.assertEquals("success", messageResult.getStatus());
        Assert.assertEquals("custom-id-value", messageResult.getCustomID());
    }

    @Test
    public void SendEmailsRequest_InvalidToField_ReturnsAnError() throws MailjetException, IOException {
        // arrange
        TransactionalEmail message1 = TransactionalEmail
                .builder()
                .to(new SendContact("invalid-email"))
                .from(new SendContact(senderEmail, "Mailjet integration test"))
                .htmlPart("<h1>This is the HTML content of the mail</h1>")
                .subject("This is the subject")
                .build();

        SendEmailsRequest request = SendEmailsRequest
                .builder()
                .message(message1)
                .build();

        // act
        SendEmailsResponse response = request.sendWith(client);

        // assert
        Assert.assertEquals(1, response.getMessages().length);

        MessageResult messageResult = response.getMessages()[0];

        Assert.assertEquals("error", messageResult.getStatus());
        Assert.assertEquals("mj-0013", messageResult.getErrors()[0].getErrorCode());
        Assert.assertEquals(400, messageResult.getErrors()[0].getStatusCode());
        Assert.assertEquals("\"invalid-email\" is an invalid email address.", messageResult.getErrors()[0].getErrorMessage());
        Assert.assertEquals("To[0].Email", messageResult.getErrors()[0].getErrorRelatedTo()[0]);
    }
}
