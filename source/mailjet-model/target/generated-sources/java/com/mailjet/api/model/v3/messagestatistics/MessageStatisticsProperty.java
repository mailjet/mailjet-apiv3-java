
package com.mailjet.api.model.v3.messagestatistics;

import java.math.BigDecimal;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "messagestatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class MessageStatisticsProperty<DataType >
    extends MailJetResourceProperty<MessageStatistics, DataType>
{

    /**
     * Average delay (in seconds) between the open and click.
     * 
     */
    public final static MessageStatisticsProperty<BigDecimal> AVERAGECLICKDELAY = new MessageStatisticsProperty<BigDecimal>("AverageClickDelay", BigDecimal.class);
    /**
     * Average number of times a click was registered for a message.
     * 
     */
    public final static MessageStatisticsProperty<BigDecimal> AVERAGECLICKEDCOUNT = new MessageStatisticsProperty<BigDecimal>("AverageClickedCount", BigDecimal.class);
    /**
     * Average delay between message delivery and first message open.
     * 
     */
    public final static MessageStatisticsProperty<BigDecimal> AVERAGEOPENDELAY = new MessageStatisticsProperty<BigDecimal>("AverageOpenDelay", BigDecimal.class);
    /**
     * Average number of times a recipient opens the message.
     * 
     */
    public final static MessageStatisticsProperty<BigDecimal> AVERAGEOPENEDCOUNT = new MessageStatisticsProperty<BigDecimal>("AverageOpenedCount", BigDecimal.class);
    /**
     * Number of blocked messages.
     * 
     */
    public final static MessageStatisticsProperty<Long> BLOCKEDCOUNT = new MessageStatisticsProperty<Long>("BlockedCount", Long.class);
    /**
     * Number of bounced messages.
     * 
     */
    public final static MessageStatisticsProperty<Long> BOUNCEDCOUNT = new MessageStatisticsProperty<Long>("BouncedCount", Long.class);
    /**
     * Number of distinct campaigns.
     * 
     */
    public final static MessageStatisticsProperty<Long> CAMPAIGNCOUNT = new MessageStatisticsProperty<Long>("CampaignCount", Long.class);
    /**
     * Number of registered clicks.
     * 
     */
    public final static MessageStatisticsProperty<Long> CLICKEDCOUNT = new MessageStatisticsProperty<Long>("ClickedCount", Long.class);
    /**
     * Number of messages delivered to their destination.
     * 
     */
    public final static MessageStatisticsProperty<Long> DELIVEREDCOUNT = new MessageStatisticsProperty<Long>("DeliveredCount", Long.class);
    /**
     * Number of message open registrations.
     * 
     */
    public final static MessageStatisticsProperty<Long> OPENEDCOUNT = new MessageStatisticsProperty<Long>("OpenedCount", Long.class);
    /**
     * Total number of messages processed by Mailjet.
     * 
     */
    public final static MessageStatisticsProperty<Long> PROCESSEDCOUNT = new MessageStatisticsProperty<Long>("ProcessedCount", Long.class);
    /**
     * Number of messages waiting in send queue.
     * 
     */
    public final static MessageStatisticsProperty<Long> QUEUEDCOUNT = new MessageStatisticsProperty<Long>("QueuedCount", Long.class);
    /**
     * Number of spam complaints.
     * 
     */
    public final static MessageStatisticsProperty<Long> SPAMCOMPLAINTCOUNT = new MessageStatisticsProperty<Long>("SpamComplaintCount", Long.class);
    /**
     * Number of transactional mails.
     * 
     */
    public final static MessageStatisticsProperty<Long> TRANSACTIONALCOUNT = new MessageStatisticsProperty<Long>("TransactionalCount", Long.class);
    /**
     * Number of registered unsubscribe requests.
     * 
     */
    public final static MessageStatisticsProperty<Long> UNSUBSCRIBEDCOUNT = new MessageStatisticsProperty<Long>("UnsubscribedCount", Long.class);

    private MessageStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static MessageStatisticsProperty<Object> ref(String name) {
        return new MessageStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<MessageStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
