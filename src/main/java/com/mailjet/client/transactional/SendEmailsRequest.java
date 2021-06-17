package com.mailjet.client.transactional;

import com.google.gson.*;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.MailjetResponseUtil;
import com.mailjet.client.errors.MailjetClientRequestException;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Emailv31;
import com.mailjet.client.transactional.response.SendEmailsResponse;
import lombok.Builder;
import lombok.Singular;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Builder
public class SendEmailsRequest {

    private final static Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .create();

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
    private Boolean sandboxMode;

    /**
     * When true, enables additional error checks relating to the Send API v3.1 payload.
     * Keep in mind that For a list of all error checks enabled by this, please see the Send API errors section in the Email API Guides.
     * https://dev.mailjet.com/email/guides/send-api-v31/#send-api-errors
     */
    private Boolean advanceErrorHandling;

    /**
     * Represents a method to send multiple transactional emails
     * Note: Mailjet send API v3.1 will be used
     * Note: Max 50 emails per batch allowed
     * @param mailjetClient the Mailjet client that will be used to send messages
     * @return A response with sent messages information, or error information
     * @throws MailjetException in case of communication error in HTTP stack,
     * like, TLS connection couldn't be established to the Mailjet server
     * Or the Server returned 5xx error,
     * Or the Server returned the generic error response
     */
    public SendEmailsResponse sendWith(MailjetClient mailjetClient) throws MailjetException {

        final MailjetResponse response = mailjetClient.post(getMailjetRequest());

        return convertResponse(response);
    }

    /**
     * Represents a method to send multiple transactional emails asynchronously
     * Note: Mailjet send API v3.1 will be used
     * Note: Max 50 emails per batch allowed
     * @param mailjetClient the Mailjet client that will be used to send messages
     * @return A response future with sent messages information, or error information
     * The returned future will contain MailjetException in case of communication error in HTTP stack,
     * like, TLS connection couldn't be established to the Mailjet server
     * Or the Server returned 5xx error,
     * Or the Server returned the generic error response
     */
    public CompletableFuture<SendEmailsResponse> sendAsyncWith(MailjetClient mailjetClient)  {

        final CompletableFuture<SendEmailsResponse> responseCompletableFuture = new CompletableFuture<>();

        try {
            CompletableFuture<MailjetResponse> future = mailjetClient.postAsync(getMailjetRequest());
            responseCompletableFuture.complete(convertResponse(future.get()));
        } catch (Exception e) {
            responseCompletableFuture.completeExceptionally(e);
        }

        return responseCompletableFuture;
    }

    private SendEmailsResponse convertResponse(MailjetResponse response) throws MailjetClientRequestException {
        final String responseContent = response.getRawResponseContent();

        final SendEmailsResponse typedResponse = gson.fromJson(responseContent, SendEmailsResponse.class);

        // in some cases, Mailjet server returns generic error w/o parsing the real passed messages
        if (typedResponse.getMessages() == null && response.getStatus() != MailjetResponseUtil.CREATED_STATUS){
            throw new MailjetClientRequestException(responseContent, response.getStatus());
        }

        return typedResponse;
    }

    private MailjetRequest getMailjetRequest() {
        final MailjetRequest request = new MailjetRequest(Emailv31.resource);
        request.setBody(gson.toJson(this));
        return request;
    }
}
