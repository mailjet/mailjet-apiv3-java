
package com.mailjet.api.model.v3.graphstatistics;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "graphstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class GraphStatisticsProperty<DataType >
    extends MailJetResourceProperty<GraphStatistics, DataType>
{

    /**
     * Number of blocked messages.
     * 
     */
    public final static GraphStatisticsProperty<Long> BLOCKEDCOUNT = new GraphStatisticsProperty<Long>("BlockedCount", Long.class);
    /**
     * Number of bounced messages.
     * 
     */
    public final static GraphStatisticsProperty<Long> BOUNCEDCOUNT = new GraphStatisticsProperty<Long>("BouncedCount", Long.class);
    /**
     * Number of registered clicks.
     * 
     */
    public final static GraphStatisticsProperty<Long> CLICKEDCOUNT = new GraphStatisticsProperty<Long>("ClickedCount", Long.class);
    /**
     * Number of messages delivered to their destination.
     * 
     */
    public final static GraphStatisticsProperty<Long> DELIVEREDCOUNT = new GraphStatisticsProperty<Long>("DeliveredCount", Long.class);
    /**
     * Number of message open registrations.
     * 
     */
    public final static GraphStatisticsProperty<Long> OPENEDCOUNT = new GraphStatisticsProperty<Long>("OpenedCount", Long.class);
    /**
     * Total number of messages processed by Mailjet.
     * 
     */
    public final static GraphStatisticsProperty<Long> PROCESSEDCOUNT = new GraphStatisticsProperty<Long>("ProcessedCount", Long.class);
    /**
     * Number of messages waiting in send queue.
     * 
     */
    public final static GraphStatisticsProperty<Long> QUEUEDCOUNT = new GraphStatisticsProperty<Long>("QueuedCount", Long.class);
    /**
     * Reference time in textual form.
     * 
     */
    public final static GraphStatisticsProperty<String> REFTIMESTAMP = new GraphStatisticsProperty<String>("RefTimestamp", String.class);
    /**
     * Minimum timestamp in the requested period.
     * 
     */
    public final static GraphStatisticsProperty<Long> SENDTIMESTART = new GraphStatisticsProperty<Long>("SendtimeStart", Long.class);
    /**
     * Number of spam complaints.
     * 
     */
    public final static GraphStatisticsProperty<Long> SPAMCOMPLAINTCOUNT = new GraphStatisticsProperty<Long>("SpamcomplaintCount", Long.class);
    /**
     * Number of registered unsubscribe requests.
     * 
     */
    public final static GraphStatisticsProperty<Long> UNSUBSCRIBEDCOUNT = new GraphStatisticsProperty<Long>("UnsubscribedCount", Long.class);

    private GraphStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static GraphStatisticsProperty<Object> ref(String name) {
        return new GraphStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<GraphStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
