package com.mailjet.client.easy;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.sms.SmsSend;

/**
 * Mailjet easy sms sending object.
 *
 * It's a MailjetRequest object wrapper
 */
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class MJEasySms {
    private final MJEasyClient client;
    private final MailjetRequest request;

    /**
     * Set the sender
     * @param number sender name
     * @return Current instance
     */
    public MJEasySms from(String number) {
    	request.property(SmsSend.FROM, number);
    	return this;
    }

    /**
     * Set the recipient
     * @param number Number of the recipient
     * @return Current instance
     */
    public MJEasySms to(String number) {
        request.property(SmsSend.TO, number);
        return this;
    }

    /**
     * Set the text content of the message
     * @param text Text content
     * @return Current instance
     */
    public MJEasySms text(String text) {
        request.property(SmsSend.TEXT, text);
        return this;
    }
    
    /**
     * Send the sms
     * @return a MailjetResponse instance
     * @throws MailjetException
     */
    public MailjetResponse send() throws MailjetException {
        return client.getClient().post(request);
    }

}
