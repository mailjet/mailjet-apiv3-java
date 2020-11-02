package com.mailjet.client;

import com.mailjet.client.errors.*;
import com.mailjet.client.resource.Email;
import com.turbomanage.httpclient.BasicHttpClient;
import com.turbomanage.httpclient.HttpResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.*;

/**
 * @author Nikola-Andreev
 */
public class MailjetClientExceptionTest {

    private static final int BAD_REQUEST_STATUS = 400;
    private static final int UNAUTHORIZED_STATUS = 401;
    private static final int FORBIDDEN_STATUS = 403;
    private static final int TOO_MANY_REQUEST_STATUS = 429;
    private static final int INTERNAL_SERVER_ERROR_STATUS = 500;

    private static final String BAD_REQUEST_MESSAGE = "Bad Request";
    private static final String UNAUTHORIZED_MESSAGE = "Unauthorized";
    private static final String FORBIDDEN_MESSAGE = "Forbidden";
    private static final String GENERAL_EXCEPTION_FIELD_NAME = "INTERNAL_SERVER_ERROR_GENERAL_EXCEPTION";
    private static final String TOO_MANY_REQUESTS_FIELD_NAME = "TOO_MANY_REQUESTS_EXCEPTION";
    private static final String CLIENT_FIELD_NAME = "_client";
    private static final String URL = "https://api.mailjet.com/v3/send";
    private static final String FROM_EMAIL =  "pilot@mailjet.com";
    private static final String FROM_NAME = "Mailjet Pilot";
    private static final String SUBJECT = "Your email flight plan!";
    private static final String TEXT_PART = "Dear passenger, welcome to Mailjet! May the delivery force be with you!";
    private static final String HTML_PART = "<h3>Dear passenger, welcome to Mailjet</h3><br/>May the delivery force be with you!";
    private static final String RECIPIENT = "passenger@mailjet.com";
    private static final String EMPTY_STRING = "";

    private MailjetClient client;
    private MailjetRequest request;
    private HttpResponse response;
    private BasicHttpClient _client;

    @Before
    public void initialize() throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        request = new MailjetRequest(Email.resource)
                .property(Email.FROMEMAIL, FROM_EMAIL)
                .property(Email.FROMNAME, FROM_NAME)
                .property(Email.SUBJECT, SUBJECT)
                .property(Email.TEXTPART, TEXT_PART)
                .property(Email.HTMLPART, HTML_PART)
                .property(Email.RECIPIENTS, new JSONArray()
                        .put(new JSONObject()
                                .put(Email.EMAIL, RECIPIENT)));
        response = mock(HttpResponse.class);
        _client = mock(BasicHttpClient.class);
        // set _client field in MailjetClient class with reflection
        client = MailjetClient.class.getConstructor(String.class, String.class).newInstance(EMPTY_STRING, EMPTY_STRING);
        Field f1 = client.getClass().getDeclaredField(CLIENT_FIELD_NAME);
        f1.setAccessible(true);
        f1.set(client, _client);
        // set _client to return mocked response on post request
        when(_client.post(URL, request.getContentType(), request.getBody().getBytes(StandardCharsets.UTF_8))).thenReturn(response);
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void testNullResponse() throws MailjetException, NoSuchFieldException, IllegalAccessException {
        // arrange, override values set in @Before
        response = null;
        when(_client.post(URL, request.getContentType(), request.getBody().getBytes(StandardCharsets.UTF_8))).thenReturn(response);

        // assert
        expectedEx.expect(MailjetClientCommunicationException.class);
        expectedEx.expectMessage("Unexpected response from the server");

        // act
        client.post(request);
    }

    @Test
    public void testTooManyRequestsResponse() throws MailjetException, NoSuchFieldException, IllegalAccessException {
        // arrange
        when(response.getStatus()).thenReturn(TOO_MANY_REQUEST_STATUS);
        // get expected error message with reflection
        Field f = MailjetResponseUtil.class.getDeclaredField(TOO_MANY_REQUESTS_FIELD_NAME);
        f.setAccessible(true);
        String expectedMessage = f.get(String.class).toString();
        // assert
        expectedEx.expect(MailjetRateLimitException.class);
        expectedEx.expectMessage(expectedMessage);
        // act
        client.post(request);
    }

    @Test
    public void testInternalServerErrorResponse() throws MailjetException, NoSuchFieldException, IllegalAccessException {
        // arrange
        when(response.getStatus()).thenReturn(INTERNAL_SERVER_ERROR_STATUS);
        // get expected error message with reflection
        Field f = MailjetResponseUtil.class.getDeclaredField(GENERAL_EXCEPTION_FIELD_NAME);
        f.setAccessible(true);
        String expectedMessage = f.get(String.class).toString();
        // assert
        expectedEx.expect(MailjetServerException.class);
        expectedEx.expectMessage(expectedMessage);
        // act
        client.post(request);
    }

    @Test
    public void testBadRequestResponse() throws MailjetException {
        // arrange
        when(response.getStatus()).thenReturn(BAD_REQUEST_STATUS);
        when(response.getBodyAsString()).thenReturn(BAD_REQUEST_MESSAGE);
        // assert
        expectedEx.expect(MailjetClientRequestException.class);
        expectedEx.expectMessage(BAD_REQUEST_MESSAGE);
        // act
        client.post(request);
    }

    @Test
    public void testUnauthorizedResponse() throws MailjetException {
        // arrange
        when(response.getStatus()).thenReturn(UNAUTHORIZED_STATUS);
        when(response.getBodyAsString()).thenReturn(UNAUTHORIZED_MESSAGE);
        // assert
        expectedEx.expect(MailjetUnauthorizedException.class);
        expectedEx.expectMessage("Unauthorized. Please,verify your access key and access secret key or token for the given account");
        // act
        client.post(request);
    }

    @Test
    public void testForbiddenResponse() throws MailjetException {
        // arrange
        when(response.getStatus()).thenReturn(FORBIDDEN_STATUS);
        when(response.getBodyAsString()).thenReturn(FORBIDDEN_MESSAGE);
        // assert
        expectedEx.expect(MailjetClientRequestException.class);
        expectedEx.expectMessage(FORBIDDEN_MESSAGE);
        // act
        client.post(request);
    }
}
