package com.mailjet.client;

import com.mailjet.client.errors.MailjetClientRequestException;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.transactional.*;
import com.mailjet.client.transactional.response.MessageResult;
import com.mailjet.client.transactional.response.SendEmailError;
import com.mailjet.client.transactional.response.SendEmailsResponse;
import com.mailjet.client.transactional.response.SentMessageStatus;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.LinkedList;


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
                .variable("test-vars-array", new String[] {"a", "b", "c"})
                .variable("test-vars-string", "abc")
                .variable("test-vars-primitive", 123)
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

        Assert.assertEquals(SentMessageStatus.SUCCESS, messageResult.getStatus());
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

        Assert.assertEquals(SentMessageStatus.ERROR, messageResult.getStatus());
        SendEmailError error = messageResult.getErrors()[0];

        Assert.assertEquals("mj-0013", error.getErrorCode());
        Assert.assertEquals(400, error.getStatusCode());
        Assert.assertEquals("\"invalid-email\" is an invalid email address.", error.getErrorMessage());
        Assert.assertEquals("To[0].Email", error.getErrorRelatedTo()[0]);
    }

    @Test
    public void SendEmailsRequest_MoreThan50MessagesPassed_ReturnsAnError() throws MailjetException, IOException {
        // arrange
        LinkedList<TransactionalEmail> messages = new LinkedList<>();

        for (int i = 0; i < 51; i++) {
            TransactionalEmail message = TransactionalEmail
                    .builder()
                    .to(new SendContact("test@mailjet.com"))
                    .from(new SendContact(senderEmail, "Mailjet integration test"))
                    .htmlPart("<h1>This is the HTML content of the mail</h1>")
                    .subject("This is the subject")
                    .build();

            messages.add(message);
        }

        SendEmailsRequest request = SendEmailsRequest
                .builder()
                .messages(messages)
                .build();

        // act
        MailjetClientRequestException exception = Assert.assertThrows(MailjetClientRequestException.class, () -> request.sendWith(client));

        // assert
        Assert.assertTrue(exception.getMessage().contains("Total number of recipients exceeded. Max allowed - 50"));
    }
}
