package com.mailjet.client.transactional.response;

import lombok.Data;

@Data
public class EmailResult {
    /**
     * The email address of this recipient.
     */
    private String email;

    /**
     * A 128-bit universally unique identifier (UUID) for this message.
     */
    private String messageUUID;

    /**
     * Unique numeric ID of this message.
     * With this ID, you can get the message information through /messages/ API endpoint
     */
    private long messageID;

    /**
     * URL link that can be used for an API call to retrieve more information about this message.
     */
    private String messageHref;
}
