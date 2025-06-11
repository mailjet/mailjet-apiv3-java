package com.mailjet.client.easy;

import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.sms.SmsSend;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MJEasySmsTest {

    private MJEasyClient mockEasyClient;
    private MailjetClient mockMailjetClient;
    private MailjetRequest mockRequest;
    private MailjetResponse mockResponse;
    private MJEasySms sms;

    @Before
    public void setUp() {
        mockEasyClient = mock(MJEasyClient.class);
        mockMailjetClient = mock(MailjetClient.class);
        mockRequest = mock(MailjetRequest.class);
        mockResponse = mock(MailjetResponse.class);

        when(mockEasyClient.getClient()).thenReturn(mockMailjetClient);

        sms = new MJEasySms(mockEasyClient, mockRequest);
    }

    @Test
    public void testFromSetsSender() {
        MJEasySms returned = sms.from("SenderNumber");
        assertSame(sms, returned);

        verify(mockRequest).property(SmsSend.FROM, "SenderNumber");
    }

    @Test
    public void testToSetsRecipient() {
        MJEasySms returned = sms.to("RecipientNumber");
        assertSame(sms, returned);

        verify(mockRequest).property(SmsSend.TO, "RecipientNumber");
    }

    @Test
    public void testTextSetsMessageContent() {
        MJEasySms returned = sms.text("Hello, this is a test message.");
        assertSame(sms, returned);

        verify(mockRequest).property(SmsSend.TEXT, "Hello, this is a test message.");
    }

    @Test
    public void testSendInvokesMailjetClientAndReturnsResponse() throws Exception {
        when(mockMailjetClient.post(mockRequest)).thenReturn(mockResponse);

        MailjetResponse response = sms.send();
        assertSame(mockResponse, response);

        verify(mockMailjetClient).post(mockRequest);
    }

    @Test(expected = MailjetException.class)
    public void testSendPropagatesMailjetException() throws Exception {
        when(mockMailjetClient.post(mockRequest)).thenThrow(new MailjetException("Error"));

        sms.send();
    }
}