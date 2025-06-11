package com.mailjet.client.easy;

import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Contact;
import com.mailjet.client.resource.Email;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MJEasyEmailTest {

    private MJEasyClient mockEasyClient;
    private MailjetClient mockMjClient;
    private MailjetResponse mockResponse;
    private MailjetRequest request;
    private MJEasyEmail email;

    @Before
    public void setUp() {
        mockEasyClient = mock(MJEasyClient.class);
        mockMjClient = mock(MailjetClient.class);
        mockResponse = mock(MailjetResponse.class);

        when(mockEasyClient.getClient()).thenReturn(mockMjClient);

        request = new MailjetRequest(Email.resource);
        email = new MJEasyEmail(mockEasyClient, request);
    }

    @Test
    public void testFromWithNameSetsBothEmailAndName() {
        MJEasyEmail returned = email.from("me@example.com", "Me Myself");
        assertSame(email, returned);

        JSONObject body = request.getBodyJSON();
        assertEquals("me@example.com", body.getString(Email.FROMEMAIL));
        assertEquals("Me Myself", body.getString(Email.FROMNAME));
    }

    @Test
    public void testFromWithoutNameOnlySetsEmail() {
        MJEasyEmail returned = email.from("noreply@domain.com");
        assertSame(email, returned);

        JSONObject body = request.getBodyJSON();
        assertEquals("noreply@domain.com", body.getString(Email.FROMEMAIL));
        assertFalse(body.has(Email.FROMNAME));
    }

    @Test
    public void testToAddsOneRecipientAndUpdatesRequest() {
        MJEasyEmail returned = email.to("user@host.com");
        assertSame(email, returned);

        JSONObject body = request.getBodyJSON();
        JSONArray recipients = body.getJSONArray(Email.RECIPIENTS);
        assertNotNull(recipients);
        assertEquals(1, recipients.length());

        JSONObject first = recipients.getJSONObject(0);
        assertEquals("user@host.com", first.getString(Contact.EMAIL));
    }

    @Test
    public void testChainingAllSetters() {
        MJEasyEmail chain = email
                .from("a@b.c", "Name")
                .to("x@y.z")
                .subject("Hi")
                .text("body text")
                .html("<p>html</p>")
                .customId("cid-123");

        assertSame(email, chain);

        JSONObject body = request.getBodyJSON();
        assertEquals("a@b.c", body.getString(Email.FROMEMAIL));
        assertEquals("Name", body.getString(Email.FROMNAME));

        JSONArray recipients = body.getJSONArray(Email.RECIPIENTS);
        assertEquals(1, recipients.length());
        assertEquals("x@y.z", recipients.getJSONObject(0).getString(Contact.EMAIL));

        assertEquals("Hi", body.getString(Email.SUBJECT));
        assertEquals("body text", body.getString(Email.TEXTPART));
        assertEquals("<p>html</p>", body.getString(Email.HTMLPART));
        assertEquals("cid-123", body.getString(Email.MJCUSTOMID));
    }

    @Test
    public void testGetRequestReturnsUnderlyingRequest() {
        assertSame(request, email.getRequest());
    }

    @Test
    public void testSendInvokesMailjetClientAndReturnsResponse() throws Exception {
        when(mockMjClient.post(request)).thenReturn(mockResponse);

        MailjetResponse result = email.send();
        assertSame(mockResponse, result);

        verify(mockMjClient).post(request);
    }

    @Test(expected = MailjetException.class)
    public void testSendPropagatesMailjetException() throws Exception {
        when(mockMjClient.post(request)).thenThrow(new MailjetException("boom"));

        email.send();
    }
}