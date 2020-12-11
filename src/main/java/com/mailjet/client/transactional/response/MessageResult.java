package com.mailjet.client.transactional.response;

import lombok.Data;

import java.util.List;

@Data
public class MessageResult {

    /**
     * Indicates the sending status of the message.
     * Possible values:
     * success
     * error
     */
    private String status;

    /**
     * List containing information about any errors with the processing of this message.
     * Will be displayed only if processing errors occur.
     * Each error will generate a separate error object with the below properties.
     */
    private SendEmailError[] errors;

    /**
     * A user-defined custom ID.
     */
    private String customID;

    /**
     * List containing information about the messages sent to recipients in To.
     */
    private List<EmailResult> to;

    /**
     * List containing information about the messages sent to recipients in Cc.
     */
    private List<EmailResult> cc;

    /**
     * List containing information about the messages sent to recipients in Bcc.
     */
    private List<EmailResult> bcc;
}
