package com.mailjet.client.easy;

import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Contact;
import com.mailjet.client.resource.Email;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Mailjet easy email sending object.
 *
 * It's a MailjetRequest object wrapper
 */
public class MJEasyEmail {
    private final MJEasyClient client;
    private final MailjetRequest request;
    private final JSONArray recipients = new JSONArray();

    protected MJEasyEmail(MJEasyClient client, MailjetRequest request) {
        this.client = client;
        this.request = request;
    }

    /**
     * Set the sender
     * @param email Email address of the sender
     * @param name Name of the sender
     * @return Current instance
     */
    public MJEasyEmail from(String email, String name) {
        request.property(Email.FROMEMAIL, email);
        if (name != null) {
            request.property(Email.FROMNAME, name);
        }
        return this;
    }

    /**
     * Set the sender
     * @param email Email address of the sender
     * @return Current instance
     */
    public MJEasyEmail from(String email) {
        return from(email, null);
    }

    /**
     * Add a recipient
     * @param email Email of the recipient
     * @return Current instance
     */
    public MJEasyEmail to(String email) {
        recipients.put(new JSONObject().put(Contact.EMAIL, email));
        request.property(Email.RECIPIENTS, recipients);
        return this;
    }

    /**
     * Set the subject
     * @param subject Subject of the email
     * @return Current instance
     */
    public MJEasyEmail subject(String subject) {
        request.property(Email.SUBJECT, subject);
        return this;
    }

    /**
     * Set the text content of the message
     * @param text Text content
     * @return Current instance
     */
    public MJEasyEmail text(String text) {
        request.property(Email.TEXTPART, text);
        return this;
    }

    /**
     * Set the HTML content of the message
     * @param html HTML content
     * @return Current instance
     */
    public MJEasyEmail html(String html) {
        request.property(Email.HTMLPART, html);
        return this;
    }

    /**
     * Set the customID
     * @param customId CustomID
     * @return Current instance
     */
    public MJEasyEmail customId(String customId) {
        request.property(Email.MJCUSTOMID, customId);
        return this;
    }

    /**
     * Send the email
     * @return a MailjetResponse instance
     * @throws MailjetException
     */
    public MailjetResponse send() throws MailjetException, MailjetSocketTimeoutException {
        return client.getClient().post(request);
    }

    /**
     * Get the internal MailjetRequest wrapped by the MJEasyEmail object
     * @return MailjetRequest instance
     */
    public MailjetRequest getRequest() {
        return request;
    }
}
