
package com.mailjet.api.model.v3.senderstatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "senderstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class SenderStatisticsProperty<DataType >
    extends MailJetResourceProperty<SenderStatistics, DataType>
{

    /**
     * Number of blocked messages.
     * 
     */
    public final static SenderStatisticsProperty<Long> BLOCKEDCOUNT = new SenderStatisticsProperty<Long>("BlockedCount", Long.class);
    /**
     * Number of bounced messages.
     * 
     */
    public final static SenderStatisticsProperty<Long> BOUNCEDCOUNT = new SenderStatisticsProperty<Long>("BouncedCount", Long.class);
    /**
     * Number of registered clicks.
     * 
     */
    public final static SenderStatisticsProperty<Long> CLICKEDCOUNT = new SenderStatisticsProperty<Long>("ClickedCount", Long.class);
    /**
     * Number of messages delivered to their destination.
     * 
     */
    public final static SenderStatisticsProperty<Long> DELIVEREDCOUNT = new SenderStatisticsProperty<Long>("DeliveredCount", Long.class);
    /**
     * Timestamp of last registered activity for this sender.
     * 
     */
    public final static SenderStatisticsProperty<Date> LASTACTIVITYAT = new SenderStatisticsProperty<Date>("LastActivityAt", Date.class);
    /**
     * Number of message open registrations.
     * 
     */
    public final static SenderStatisticsProperty<Long> OPENEDCOUNT = new SenderStatisticsProperty<Long>("OpenedCount", Long.class);
    /**
     * Total number of messages processed by Mailjet.
     * 
     */
    public final static SenderStatisticsProperty<Long> PROCESSEDCOUNT = new SenderStatisticsProperty<Long>("ProcessedCount", Long.class);
    /**
     * Number of messages waiting in send queue.
     * 
     */
    public final static SenderStatisticsProperty<Long> QUEUEDCOUNT = new SenderStatisticsProperty<Long>("QueuedCount", Long.class);
    /**
     * Reference to the sender for which the statistics are collected.
     * 
     */
    public final static SenderStatisticsProperty<Long> SENDERID = new SenderStatisticsProperty<Long>("SenderID", Long.class);
    /**
     * Number of spam complaints.
     * 
     */
    public final static SenderStatisticsProperty<Long> SPAMCOMPLAINTCOUNT = new SenderStatisticsProperty<Long>("SpamComplaintCount", Long.class);
    /**
     * Number of registered unsubscribe requests.
     * 
     */
    public final static SenderStatisticsProperty<Long> UNSUBSCRIBEDCOUNT = new SenderStatisticsProperty<Long>("UnsubscribedCount", Long.class);

    private SenderStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static SenderStatisticsProperty<Object> ref(String name) {
        return new SenderStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<SenderStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
