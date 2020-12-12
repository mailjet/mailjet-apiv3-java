package com.mailjet.client.transactional.response;

import lombok.Data;

@Data
public class SendEmailsResponse {
    /**
     * Array with information regarding each sent message
     */
    private MessageResult[] messages;
}
