package com.mailjet.client.easy;

import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Email;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MJEasyClientTest {

    private MailjetClient mockMailjetClient;
    private MJEasyClient easyClient;

    @Before
    public void setUp() {
        mockMailjetClient = mock(MailjetClient.class);
        easyClient = new MJEasyClient(mockMailjetClient);
    }

    @Test
    public void testConstructorWithApiKeys() {
        MJEasyClient client = new MJEasyClient("publicKey", "privateKey");
        assertNotNull(client.getClient());
    }

    @Test
    public void testConstructorWithToken() {
        MJEasyClient client = new MJEasyClient("token");
        assertNotNull(client.getClient());
    }

    @Test
    public void testConstructorWithEnvironmentVariables() {
        System.setProperty("MJ_APIKEY_PUBLIC", "publicKey");
        System.setProperty("MJ_APIKEY_PRIVATE", "privateKey");

        MJEasyClient client = new MJEasyClient();
        assertNotNull(client.getClient());
    }

    @Test
    public void testEmailMethodCreatesMJEasyEmail() {
        MJEasyEmail email = easyClient.email();
        assertNotNull(email);
        assertTrue(email instanceof MJEasyEmail);
    }

    @Test
    public void testSmsMethodCreatesMJEasySms() {
        MJEasySms sms = easyClient.sms();
        assertNotNull(sms);
        assertTrue(sms instanceof MJEasySms);
    }

    @Test
    public void testSendDelegatesToMailjetClient() throws Exception {
        MailjetRequest request = new MailjetRequest(Email.resource);
        MailjetResponse mockResponse = mock(MailjetResponse.class);

        when(mockMailjetClient.post(request)).thenReturn(mockResponse);

        MailjetResponse response = easyClient.getClient().post(request);
        assertSame(mockResponse, response);

        verify(mockMailjetClient).post(request);
    }

    @Test(expected = MailjetException.class)
    public void testSendThrowsMailjetException() throws Exception {
        MailjetRequest request = new MailjetRequest(Email.resource);

        when(mockMailjetClient.post(request)).thenThrow(new MailjetException("Error"));

        easyClient.getClient().post(request);
    }
}