package com.mailjet.client.errors;

/**
 * Indicates that the error happened during communication with the server
 * And the error nature is bound to the underlying HTTP provider / java.net stack
 * Please, verify your network configuration
 * */
public class MailjetClientCommunicationException extends MailjetException {
    public MailjetClientCommunicationException(String message) {
        super(message);
    }

    public MailjetClientCommunicationException(String message, Exception cause) {
        super(message, cause);
    }
}
