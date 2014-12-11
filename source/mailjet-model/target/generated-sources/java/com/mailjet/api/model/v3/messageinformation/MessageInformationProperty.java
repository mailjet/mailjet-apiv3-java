
package com.mailjet.api.model.v3.messageinformation;

import java.math.BigDecimal;
import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;
import com.mailjet.api.model.v3.customtypes.SpamAssassinRuleList;


/**
 * Class defining property constants for "messageinformation" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class MessageInformationProperty<DataType >
    extends MailJetResourceProperty<MessageInformation, DataType>
{

    /**
     * reference to Campaign to which message belongs.
     * 
     */
    public final static MessageInformationProperty<Long> CAMPAIGNID = new MessageInformationProperty<Long>("CampaignID", Long.class);
    /**
     * Number of click track requests.
     * 
     */
    public final static MessageInformationProperty<Long> CLICKTRACKEDCOUNT = new MessageInformationProperty<Long>("ClickTrackedCount", Long.class);
    /**
     * Reference to contact to which message was sent.
     * 
     */
    public final static MessageInformationProperty<Long> CONTACTID = new MessageInformationProperty<Long>("ContactID", Long.class);
    /**
     * Timestamp when object was created in database.
     * 
     */
    public final static MessageInformationProperty<Date> CREATEDAT = new MessageInformationProperty<Date>("CreatedAt", Date.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static MessageInformationProperty.Key<Long> ID = new MessageInformationProperty.Key<Long>("ID", Long.class);
    /**
     * Size of the message.
     * 
     */
    public final static MessageInformationProperty<Long> MESSAGESIZE = new MessageInformationProperty<Long>("MessageSize", Long.class);
    /**
     * Number of open track requests.
     * 
     */
    public final static MessageInformationProperty<Long> OPENTRACKEDCOUNT = new MessageInformationProperty<Long>("OpenTrackedCount", Long.class);
    /**
     * Number of messages waiting in send queue.
     * 
     */
    public final static MessageInformationProperty<Long> QUEUEDCOUNT = new MessageInformationProperty<Long>("QueuedCount", Long.class);
    /**
     * Timestamp indicating when last message was sent for the campaign.
     * 
     */
    public final static MessageInformationProperty<Date> SENDENDAT = new MessageInformationProperty<Date>("SendEndAt", Date.class);
    /**
     * Number of actual sent attempts.
     * 
     */
    public final static MessageInformationProperty<Long> SENTCOUNT = new MessageInformationProperty<Long>("SentCount", Long.class);
    /**
     * Matched spam assassin rules.
     * 
     */
    public final static MessageInformationProperty<SpamAssassinRuleList> SPAMASSASSINRULES = new MessageInformationProperty<SpamAssassinRuleList>("SpamAssassinRules", SpamAssassinRuleList.class);
    /**
     * Spam assassin score for this message.
     * 
     */
    public final static MessageInformationProperty<BigDecimal> SPAMASSASSINSCORE = new MessageInformationProperty<BigDecimal>("SpamAssassinScore", BigDecimal.class);

    private MessageInformationProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static MessageInformationProperty<Object> ref(String name) {
        return new MessageInformationProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<MessageInformation, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
