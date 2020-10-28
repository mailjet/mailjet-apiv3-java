package com.mailjet.client.errors;

/**
 * MailjetClientRequestException indicates that the given request is invalid
 * And MailJet API server returned error like
 * 400 Bad Request
 * 403 Forbidden
 * 404 Not Found
 * 405 Method Not Allowed
 *
 * Please, verify your request
 */
public class MailjetClientRequestException extends MailjetException {
    public MailjetClientRequestException(String message, int statusCode) {
        super(message);

        this.statusCode = statusCode;
    }

    private int statusCode;

    public int getStatusCode(){ return statusCode; }
}

