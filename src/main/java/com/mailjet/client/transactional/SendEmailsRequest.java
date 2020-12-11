package com.mailjet.client.transactional;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Emailv31;
import com.mailjet.client.transactional.response.SendEmailsResponse;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Singular;

import java.util.List;

@Builder
public class SendEmailsRequest {

    /**
     * Adds message to sent to the request
     * You can send up to 50 messages per batch
     */
    @Singular
    private List<TransactionalEmail> messages;

    /**
     * If set to true, messages will be send to the Mailjet API for verification
     * But the actual emails will not be send
     */
    private boolean sandboxMode;

    @Default
    public boolean AdvanceErrorHandling = true;

    /**
     * Represents a method to send multiple transactional emails
     * @param mailjetClient the Mailjet client that will be used to send messages
     * @return A response with sent messages information, or error information
     * @throws MailjetException in case of communication error
     * @apiNote Mailjet send API v3.1 will be used
     * @apiNote Max 50 emails per batch
     */
    public SendEmailsResponse send(MailjetClient mailjetClient) throws MailjetException {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        MailjetRequest request = new MailjetRequest(Emailv31.resource);
        request.setBody(gson.toJson(this));

        MailjetResponse response = mailjetClient.post(request);

        String responseContent = response.getRawResponseContent();

        SendEmailsResponse typedResponse = gson.fromJson(responseContent, SendEmailsResponse.class);

        return typedResponse;
    }
}
