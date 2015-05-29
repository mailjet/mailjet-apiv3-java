
package com.mailjet.api.model.v3.message;

import java.math.BigDecimal;
import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "message" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class MessageProperty<DataType >
    extends MailJetResourceProperty<Message, DataType>
{

    /**
     * Timestamp indicated when the message arrived at Mailjet.
     * 
     */
    public final static MessageProperty<Date> ARRIVEDAT = new MessageProperty<Date>("ArrivedAt", Date.class);
    /**
     * Number of attachments detected in the message.
     * 
     */
    public final static MessageProperty<Integer> ATTACHMENTCOUNT = new MessageProperty<Integer>("AttachmentCount", Integer.class);
    /**
     * Number of attempts made to deliver the message.
     * 
     */
    public final static MessageProperty<Integer> ATTEMPTCOUNT = new MessageProperty<Integer>("AttemptCount", Integer.class);
    /**
     * Reference to campaign in which this message is delivered.
     * 
     */
    public final static MessageProperty<Long> CAMPAIGNID = new MessageProperty<Long>("CampaignID", Long.class);
    /**
     * Reference to contact to which message was sent.
     * 
     */
    public final static MessageProperty<Long> CONTACTID = new MessageProperty<Long>("ContactID", Long.class);
    /**
     * Delay between arrival and delivery [?].
     * 
     */
    public final static MessageProperty<BigDecimal> DELAY = new MessageProperty<BigDecimal>("Delay", BigDecimal.class);
    /**
     * Reference to destination domain.
     * 
     */
    public final static MessageProperty<Long> DESTINATIONID = new MessageProperty<Long>("DestinationID", Long.class);
    /**
     * Time spent processing the text of the message (milliseconds).
     * 
     */
    public final static MessageProperty<Integer> FILTERTIME = new MessageProperty<Integer>("FilterTime", Integer.class);
    /**
     * Reference to the sender of the message.
     * 
     */
    public final static MessageProperty<Long> FROMID = new MessageProperty<Long>("FromID", Long.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static MessageProperty.Key<Long> ID = new MessageProperty.Key<Long>("ID", Long.class);
    /**
     * Was click tracking requested for this message ?.
     * 
     */
    public final static MessageProperty<Boolean> ISCLICKTRACKED = new MessageProperty<Boolean>("IsClickTracked", Boolean.class);
    /**
     * Did the message contain a HTML part ?.
     * 
     */
    public final static MessageProperty<Boolean> ISHTMLPARTINCLUDED = new MessageProperty<Boolean>("IsHTMLPartIncluded", Boolean.class);
    /**
     * Was open tracking requested for this message ?.
     * 
     */
    public final static MessageProperty<Boolean> ISOPENTRACKED = new MessageProperty<Boolean>("IsOpenTracked", Boolean.class);
    /**
     * Did the message contain a text part ?.
     * 
     */
    public final static MessageProperty<Boolean> ISTEXTPARTINCLUDED = new MessageProperty<Boolean>("IsTextPartIncluded", Boolean.class);
    /**
     * Was unsubscription tracking requested for this message ?.
     * 
     */
    public final static MessageProperty<Boolean> ISUNSUBTRACKED = new MessageProperty<Boolean>("IsUnsubTracked", Boolean.class);
    /**
     * Size of the message (in bytes).
     * 
     */
    public final static MessageProperty<Long> MESSAGESIZE = new MessageProperty<Long>("MessageSize", Long.class);
    /**
     * Spam assassin score for this message.
     * 
     */
    public final static MessageProperty<BigDecimal> SPAMASSASSINSCORE = new MessageProperty<BigDecimal>("SpamassassinScore", BigDecimal.class);
    /**
     * Matched spam assassin rules.
     * 
     */
    public final static MessageProperty<String> SPAMASSRULES = new MessageProperty<String>("SpamassRules", String.class);
    /**
     * Current state of the message.
     * 
     */
    public final static MessageProperty<Long> STATEID = new MessageProperty<Long>("StateID", Long.class);
    /**
     * Is the state of the message permanent (i.e. will no longer change).
     * 
     */
    public final static MessageProperty<Boolean> STATEPERMANENT = new MessageProperty<Boolean>("StatePermanent", Boolean.class);
    /**
     * Status of the message.
     * 
     */
    public final static MessageProperty<Message.Status> STATUS = new MessageProperty<Message.Status>("Status", Message.Status.class);

    private MessageProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static MessageProperty<Object> ref(String name) {
        return new MessageProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<Message, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
