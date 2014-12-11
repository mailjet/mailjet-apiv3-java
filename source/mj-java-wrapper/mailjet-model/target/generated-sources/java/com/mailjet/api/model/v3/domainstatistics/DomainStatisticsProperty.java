
package com.mailjet.api.model.v3.domainstatistics;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "domainstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class DomainStatisticsProperty<DataType >
    extends MailJetResourceProperty<DomainStatistics, DataType>
{

    /**
     * Number of blocked messages.
     * 
     */
    public final static DomainStatisticsProperty<Long> BLOCKEDCOUNT = new DomainStatisticsProperty<Long>("BlockedCount", Long.class);
    /**
     * Number of bounced messages.
     * 
     */
    public final static DomainStatisticsProperty<Long> BOUNCEDCOUNT = new DomainStatisticsProperty<Long>("BouncedCount", Long.class);
    /**
     * Number of registered clicks.
     * 
     */
    public final static DomainStatisticsProperty<Long> CLICKEDCOUNT = new DomainStatisticsProperty<Long>("ClickedCount", Long.class);
    /**
     * Number of messages delivered to their destination.
     * 
     */
    public final static DomainStatisticsProperty<Long> DELIVEREDCOUNT = new DomainStatisticsProperty<Long>("DeliveredCount", Long.class);
    /**
     * Domain name (lowercase).
     * 
     */
    public final static DomainStatisticsProperty<String> DOMAIN = new DomainStatisticsProperty<String>("Domain", String.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static DomainStatisticsProperty.Key<Long> ID = new DomainStatisticsProperty.Key<Long>("ID", Long.class);
    /**
     * Number of message open registrations.
     * 
     */
    public final static DomainStatisticsProperty<Long> OPENEDCOUNT = new DomainStatisticsProperty<Long>("OpenedCount", Long.class);
    /**
     * Total number of messages processed by Mailjet.
     * 
     */
    public final static DomainStatisticsProperty<Long> PROCESSEDCOUNT = new DomainStatisticsProperty<Long>("ProcessedCount", Long.class);
    /**
     * Number of messages waiting in send queue.
     * 
     */
    public final static DomainStatisticsProperty<Long> QUEUEDCOUNT = new DomainStatisticsProperty<Long>("QueuedCount", Long.class);
    /**
     * Number of spam complaints.
     * 
     */
    public final static DomainStatisticsProperty<Long> SPAMCOMPLAINTCOUNT = new DomainStatisticsProperty<Long>("SpamComplaintCount", Long.class);
    /**
     * Number of registered unsubscribe requests.
     * 
     */
    public final static DomainStatisticsProperty<Long> UNSUBSCRIBEDCOUNT = new DomainStatisticsProperty<Long>("UnsubscribedCount", Long.class);

    private DomainStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static DomainStatisticsProperty<Object> ref(String name) {
        return new DomainStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<DomainStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
