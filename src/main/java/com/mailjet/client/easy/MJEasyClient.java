package com.mailjet.client.easy;

import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.resource.Email;

/**
 * Mailjet easy client
 */
public class MJEasyClient {
    private final MailjetClient client;

    /**
     * Constructor with api keys
     * @param apiKeyPublic Public API Key
     * @param apiKeyPrivate Private API Key
     */
    public MJEasyClient(String apiKeyPublic, String apiKeyPrivate) {
        client = new MailjetClient(apiKeyPublic, apiKeyPrivate);
    }

    /**
     * Constructor using the MJ_APIKEY_PUBLIC and MJ_APIKEY_PRIVATE environment variables.
     */
    public MJEasyClient() {
        client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"));
    }

    /**
     * Get the interal Mailjet client
     * @return MailjetClient instance
     */
    public MailjetClient getClient() {
        return client;
    }

    /**
     * Create an MJEasyEmail instance to prepare an email to send.
     * @return MJEasyEMail instance
     */
    public MJEasyEmail email() {
        return new MJEasyEmail(this, new MailjetRequest(Email.resource));
    }
}
