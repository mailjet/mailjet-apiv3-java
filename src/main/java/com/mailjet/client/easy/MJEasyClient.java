package com.mailjet.client.easy;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.resource.Email;
import com.mailjet.client.resource.sms.SmsSend;

import lombok.Getter;

/**
 * Mailjet easy client
 */
@Getter
public class MJEasyClient {
    /**
     * -- GETTER --
     *  Get the internal Mailjet client
     *
     * @return MailjetClient instance
     */
    private final MailjetClient client;

    /**
     * Constructor with api keys
     * @param apiKeyPublic Public API Key
     * @param apiKeyPrivate Private API Key
     */
    public MJEasyClient(String apiKeyPublic, String apiKeyPrivate) {
        ClientOptions clientOptions = ClientOptions
                .builder()
                .apiKey(apiKeyPublic)
                .apiSecretKey(apiKeyPrivate)
                .build();

        client = new MailjetClient(clientOptions);
    }
    
    /**
     * Constructor with token
     * @param token V4 api token
     */
    public MJEasyClient(String token) {
        ClientOptions clientOptions = ClientOptions
                .builder()
                .bearerAccessToken(token)
                .build();

        client = new MailjetClient(clientOptions);
    }

    /**
     * Constructor using the MJ_APIKEY_PUBLIC and MJ_APIKEY_PRIVATE environment variables.
     */
    public MJEasyClient() {
        ClientOptions clientOptions = ClientOptions
                .builder()
                .apiKey(System.getenv("MJ_APIKEY_PUBLIC"))
                .apiSecretKey(System.getenv("MJ_APIKEY_PRIVATE"))
                .build();

        client = new MailjetClient(clientOptions);
    }

    /**
     * Constructor using a pre-configured MailjetClient instance.
     * @param client Pre-configured MailjetClient instance
     */
    protected MJEasyClient(MailjetClient client) {
        this.client = client;
    }

    /**
     * Create an MJEasyEmail instance to prepare an email to send.
     * @return MJEasyEMail instance
     */
    public MJEasyEmail email() {
        return new MJEasyEmail(this, new MailjetRequest(Email.resource));
    }
    
    /**
     * Create an {@link MJEasySms} instance to prepare an email to send.
     * @return {@link MJEasyClient} instance
     */
    public MJEasySms sms() {
        return new MJEasySms(this, new MailjetRequest(SmsSend.resource));
    }
}
