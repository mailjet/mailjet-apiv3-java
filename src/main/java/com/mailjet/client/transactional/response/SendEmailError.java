package com.mailjet.client.transactional.response;

import lombok.Data;

@Data
public class SendEmailError {
    /**
     * A 128-bit universally unique identifier (UUID) for this error.
     */
    private String errorIdentifier;

    /**
     * An internal Mailjet error code for this error. See Send API Errors for more information.
     * https://dev.mailjet.com/email/guides/send-api-v31/#send-api-errors
     */
    private String errorCode;

    /**
     * The error status code. See Send API Errors for more information.
     * https://dev.mailjet.com/email/guides/send-api-v31/#send-api-errors
     */
    private int statusCode;

    /**
     * Indicates which part of the payload this error is related to.
     */
    private String errorMessage;

    /**
     * Indicates which part of the payload this error is related to.
     */
    private String[] errorRelatedTo;
}
