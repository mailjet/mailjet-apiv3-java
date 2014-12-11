
package com.mailjet.api.model.v3.messagesentstatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "messagesentstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class MessageSentStatisticsProperty<DataType >
    extends MailJetResourceProperty<MessageSentStatistics, DataType>
{

    /**
     * When did the message arrive at Mailjet.
     * 
     */
    public final static MessageSentStatisticsProperty<Date> ARRIVALTS = new MessageSentStatisticsProperty<Date>("ArrivalTs", Date.class);
    /**
     * Was the message blocked ?.
     * 
     */
    public final static MessageSentStatisticsProperty<Boolean> BLOCKED = new MessageSentStatisticsProperty<Boolean>("Blocked", Boolean.class);
    /**
     * Has the message bounced ?.
     * 
     */
    public final static MessageSentStatisticsProperty<Boolean> BOUNCE = new MessageSentStatisticsProperty<Boolean>("Bounce", Boolean.class);
    /**
     * 
     * 
     */
    public final static MessageSentStatisticsProperty<Date> BOUNCEDATE = new MessageSentStatisticsProperty<Date>("BounceDate", Date.class);
    /**
     * 
     * 
     */
    public final static MessageSentStatisticsProperty<String> BOUNCEREASON = new MessageSentStatisticsProperty<String>("BounceReason", String.class);
    /**
     * reference to the Campaign to which message belongs.
     * 
     */
    public final static MessageSentStatisticsProperty<Long> CAMPAIGNID = new MessageSentStatisticsProperty<Long>("CampaignID", Long.class);
    /**
     * Was a click registered for this message ?.
     * 
     */
    public final static MessageSentStatisticsProperty<Boolean> CLICK = new MessageSentStatisticsProperty<Boolean>("Click", Boolean.class);
    /**
     * Number of recipients for this campaign.
     * 
     */
    public final static MessageSentStatisticsProperty<Long> CNTRECIPIENTS = new MessageSentStatisticsProperty<Long>("CntRecipients", Long.class);
    /**
     * Reference to contact to which message was sent.
     * 
     */
    public final static MessageSentStatisticsProperty<Long> CONTACTID = new MessageSentStatisticsProperty<Long>("ContactID", Long.class);
    /**
     * Only retrieve statistics for the selected message
     * 
     */
    public final static MessageSentStatisticsProperty<Long> MESSAGEID = new MessageSentStatisticsProperty<Long>("MessageID", Long.class);
    /**
     * Was the message opened ?.
     * 
     */
    public final static MessageSentStatisticsProperty<Boolean> OPEN = new MessageSentStatisticsProperty<Boolean>("Open", Boolean.class);
    /**
     * Is the message still in the queue ?.
     * 
     */
    public final static MessageSentStatisticsProperty<Boolean> QUEUED = new MessageSentStatisticsProperty<Boolean>("Queued", Boolean.class);
    /**
     * Was the message sent ?.
     * 
     */
    public final static MessageSentStatisticsProperty<Boolean> SENT = new MessageSentStatisticsProperty<Boolean>("Sent", Boolean.class);
    /**
     * Was a spam complaint registered for this message ?.
     * 
     */
    public final static MessageSentStatisticsProperty<Boolean> SPAM = new MessageSentStatisticsProperty<Boolean>("Spam", Boolean.class);
    /**
     * Current state of the message.
     * 
     */
    public final static MessageSentStatisticsProperty<Long> STATEID = new MessageSentStatisticsProperty<Long>("StateID", Long.class);
    /**
     * Is the current state of the message permanent ?.
     * 
     */
    public final static MessageSentStatisticsProperty<Boolean> STATEPERMANENT = new MessageSentStatisticsProperty<Boolean>("StatePermanent", Boolean.class);
    /**
     * Current status of the message.
     * 
     */
    public final static MessageSentStatisticsProperty<String> STATUS = new MessageSentStatisticsProperty<String>("Status", String.class);

    private MessageSentStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static MessageSentStatisticsProperty<Object> ref(String name) {
        return new MessageSentStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<MessageSentStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
