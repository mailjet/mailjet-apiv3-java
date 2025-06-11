package com.mailjet.client.transactional;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.MailjetResponseUtil;
import com.mailjet.client.errors.MailjetClientRequestException;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.transactional.response.MessageResult;
import com.mailjet.client.transactional.response.SendEmailsResponse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class SendEmailsRequestTest {
    private MailjetClient mockClient;
    private MailjetResponse mockResponse;

    private static final Gson GSON = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .create();

    @Before
    public void setUp() {
        mockClient   = mock(MailjetClient.class);
        mockResponse = mock(MailjetResponse.class);
    }

    @Test
    public void testSendWith_successfulResponse() throws Exception {
        // Prepare a SendEmailsResponse with null messages but CREATED status
        SendEmailsResponse expected = new SendEmailsResponse();
        expected.setMessages(null);
        String json = GSON.toJson(expected);

        when(mockResponse.getRawResponseContent()).thenReturn(json);
        when(mockResponse.getStatus()).thenReturn(MailjetResponseUtil.CREATED_STATUS);
        when(mockClient.post(any(MailjetRequest.class))).thenReturn(mockResponse);

        // Build and invoke
        SendEmailsRequest req = SendEmailsRequest.builder()
                .sandboxMode(true)
                .advanceErrorHandling(false)
                .build();
        SendEmailsResponse actual = req.sendWith(mockClient);

        // Assert the parsed response is non-null and messages stay null
        assertNotNull(actual);
        assertNull(actual.getMessages());

        // Verify the outgoing JSON used UpperCamelCase keys
        ArgumentCaptor<MailjetRequest> cap = ArgumentCaptor.forClass(MailjetRequest.class);
        verify(mockClient).post(cap.capture());
        String body = cap.getValue().getBody();
        assertTrue(body.contains("\"SandboxMode\":true"));
        assertTrue(body.contains("\"AdvanceErrorHandling\":false"));
    }

    @Test(expected = MailjetClientRequestException.class)
    public void testSendWith_errorResponse_throws() throws Exception {
        // Simulate a generic error payload + non-201 status
        when(mockResponse.getRawResponseContent()).thenReturn("{}");
        when(mockResponse.getStatus()).thenReturn(500);
        when(mockClient.post(any(MailjetRequest.class))).thenReturn(mockResponse);

        // This should throw
        SendEmailsRequest.builder().build().sendWith(mockClient);
    }

    @Test
    public void testSendAsyncWith_successfulResponse() throws Exception {
        // Prepare the same null-messages/CREATED payload
        SendEmailsResponse expected = new SendEmailsResponse();
        expected.setMessages(null);
        String json = GSON.toJson(expected);

        when(mockResponse.getRawResponseContent()).thenReturn(json);
        when(mockResponse.getStatus()).thenReturn(MailjetResponseUtil.CREATED_STATUS);

        CompletableFuture<MailjetResponse> ok = CompletableFuture.completedFuture(mockResponse);
        when(mockClient.postAsync(any(MailjetRequest.class))).thenReturn(ok);

        SendEmailsRequest req = SendEmailsRequest.builder().build();
        SendEmailsResponse actual = req
                .sendAsyncWith(mockClient)
                .get();   // wait for completion

        assertNotNull(actual);
        assertNull(actual.getMessages());
    }

    @Test
    public void testSendAsyncWith_exceptionalResponse() throws InterruptedException {
        // Force postAsync to fail with a MailjetException
        CompletableFuture<MailjetResponse> failed = new CompletableFuture<>();
        failed.completeExceptionally(new MailjetException("Network error"));
        when(mockClient.postAsync(any(MailjetRequest.class))).thenReturn(failed);

        SendEmailsRequest req = SendEmailsRequest.builder().build();
        CompletableFuture<SendEmailsResponse> future = req.sendAsyncWith(mockClient);

        assertTrue(future.isCompletedExceptionally());

        try {
            future.get();
            fail("Expected a nested ExecutionException");
        } catch (ExecutionException outer) {
            // outer.getCause() is the ExecutionException from future.get()
            Throwable innerExec = outer.getCause();
            assertTrue(innerExec instanceof ExecutionException);

            // innerExec.getCause() is the original MailjetException
            Throwable mj = ((ExecutionException) innerExec).getCause();
            assertTrue(mj instanceof MailjetException);
            assertEquals("Network error", mj.getMessage());
        }
    }

    @Test
    public void testSendWith_partialSuccessMessagesNonNullAndNonCreatedStatus() throws Exception {
        // prepare a SendEmailsResponse with two empty MessageResult objects
        SendEmailsResponse expected = new SendEmailsResponse();
        MessageResult[] two = new MessageResult[] { new MessageResult(), new MessageResult() };
        expected.setMessages(two);
        String json = GSON.toJson(expected);

        when(mockResponse.getRawResponseContent()).thenReturn(json);
        when(mockResponse.getStatus()).thenReturn(400);                // non‐CREATED
        when(mockClient.post(any(MailjetRequest.class))).thenReturn(mockResponse);

        // build request with one dummy TransactionalEmail
        TransactionalEmail dummy = TransactionalEmail.builder().build(); // needs a no-arg ctor
        SendEmailsRequest req = SendEmailsRequest.builder()
                .message(dummy)
                .build();

        // act
        SendEmailsResponse actual = req.sendWith(mockClient);

        // assert
        assertNotNull(actual);
        assertNotNull(actual.getMessages());
        assertEquals(2, actual.getMessages().length);
    }

    @Test
    public void testGetMailjetRequest_includesMessagesAndFlagsInBody() throws Exception {
        // prepare the mock response so sendWith(...) doesn’t complain
        when(mockResponse.getRawResponseContent()).thenReturn("{}");
        when(mockResponse.getStatus()).thenReturn(MailjetResponseUtil.CREATED_STATUS);
        when(mockClient.post(any(MailjetRequest.class))).thenReturn(mockResponse);

        // build a request with two messages and both flags true
        TransactionalEmail m1 = TransactionalEmail.builder().build();
        TransactionalEmail m2 = TransactionalEmail.builder().build();
        SendEmailsRequest req = SendEmailsRequest.builder()
                .message(m1)
                .message(m2)
                .sandboxMode(true)
                .advanceErrorHandling(true)
                .build();

        // invoke
        req.sendWith(mockClient);

        // capture the outgoing MailjetRequest
        ArgumentCaptor<MailjetRequest> cap = ArgumentCaptor.forClass(MailjetRequest.class);
        verify(mockClient).post(cap.capture());
        String body = cap.getValue().getBody();

        // parse and assert
        JsonObject json = JsonParser.parseString(body).getAsJsonObject();
        assertTrue(json.has("Messages"));
        JsonArray arr = json.getAsJsonArray("Messages");
        assertEquals(2, arr.size());

        assertTrue(json.get("SandboxMode").getAsBoolean());
        assertTrue(json.get("AdvanceErrorHandling").getAsBoolean());
    }
}
