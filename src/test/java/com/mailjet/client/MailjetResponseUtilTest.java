package com.mailjet.client;

import com.mailjet.client.errors.*;
import com.mailjet.client.resource.Contact;
import com.mailjet.client.resource.Emailv31;
import org.junit.Test;

import static org.junit.Assert.*;

public class MailjetResponseUtilTest {

    // -- validateMailjetResponse tests --

    @Test(expected = MailjetRateLimitException.class)
    public void validateRateLimit_429ThrowsRateLimit() throws Exception {
        MailjetResponseUtil.validateMailjetResponse(
                new MailjetRequest(Contact.resource),
                429,
                "{}"
        );
    }

    @Test(expected = MailjetUnauthorizedException.class)
    public void validateUnauthorized_401ThrowsUnauthorized() throws Exception {
        MailjetResponseUtil.validateMailjetResponse(
                new MailjetRequest(Contact.resource),
                401,
                "{\"foo\":1}"
        );
    }

    @Test
    public void validateServerError_500WithBodyThrowsServerException() {
        try {
            MailjetResponseUtil.validateMailjetResponse(
                    new MailjetRequest(Contact.resource),
                    500,
                    "server went boom"
            );
            fail("Expected MailjetServerException");
        } catch (MailjetException e) {
            assertEquals("server went boom", e.getMessage());
        }
    }

    @Test
    public void validateServerError_500NullBodyThrowsGeneralServerException() {
        try {
            MailjetResponseUtil.validateMailjetResponse(
                    new MailjetRequest(Contact.resource),
                    500,
                    null
            );
            fail("Expected MailjetServerException");
        } catch (MailjetException e) {
            assertTrue(e.getMessage().startsWith("Internal Server Error: "));
        }
    }

    @Test(expected = MailjetClientRequestException.class)
    public void validateBadRequest_400NonPartialThrowsClientRequest() throws Exception {
        // Contact.resource is not Emailv31.resource, so partial-success doesn't apply
        MailjetResponseUtil.validateMailjetResponse(
                new MailjetRequest(Contact.resource),
                400,
                "{\"anything\":true}"
        );
    }

    @Test
    public void validateBadRequest_400Emailv31PartialSuccessDoesNotThrow() throws Exception {
        // Emailv31.resource with code 400 and valid JSON → partial success branch
        MailjetResponseUtil.validateMailjetResponse(
                new MailjetRequest(Emailv31.resource),
                400,
                "{\"foo\":42}"
        );
        // no exception means success
    }

    @Test(expected = MailjetClientRequestException.class)
    public void validateBadRequest_400Emailv31InvalidJsonThrowsClientRequest() throws Exception {
        // invalid JSON → fallback to throwing client request
        MailjetResponseUtil.validateMailjetResponse(
                new MailjetRequest(Emailv31.resource),
                400,
                "not-json"
        );
    }

    // -- isValidJSON tests --

    @Test
    public void isValidJson_nullAndEmptyAndWhitespace() {
        assertFalse(MailjetResponseUtil.isValidJSON(null));
        assertFalse(MailjetResponseUtil.isValidJSON(""));
        assertFalse(MailjetResponseUtil.isValidJSON("   "));
    }

    @Test
    public void isValidJson_nonBracedStrings() {
        assertFalse(MailjetResponseUtil.isValidJSON("[]"));
        assertFalse(MailjetResponseUtil.isValidJSON("\"foo\""));
    }

    @Test
    public void isValidJson_validObjects() {
        assertTrue(MailjetResponseUtil.isValidJSON("{}"));
        assertTrue(MailjetResponseUtil.isValidJSON(" { \"a\":1 } "));
    }
}
