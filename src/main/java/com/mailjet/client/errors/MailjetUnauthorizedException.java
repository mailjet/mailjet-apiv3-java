package com.mailjet.client.errors;

/**
 * You have specified an incorrect API Key / API Secret Key pair or Bearer token in case of invoking SMS API
 * You may be unauthorized to access the API or your API key may be inactive.
 * Please, visit API keys Management section to check your keys.
 */
public class MailjetUnauthorizedException extends MailjetClientRequestException {
    public MailjetUnauthorizedException(String message, int statusCode) {
        super(message, statusCode);
    }
}
