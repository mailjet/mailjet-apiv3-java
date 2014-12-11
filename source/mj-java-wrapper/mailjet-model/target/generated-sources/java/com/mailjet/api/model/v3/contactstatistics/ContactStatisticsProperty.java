
package com.mailjet.api.model.v3.contactstatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "contactstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class ContactStatisticsProperty<DataType >
    extends MailJetResourceProperty<ContactStatistics, DataType>
{

    /**
     * Number of blocked messages.
     * 
     */
    public final static ContactStatisticsProperty<Long> BLOCKEDCOUNT = new ContactStatisticsProperty<Long>("BlockedCount", Long.class);
    /**
     * Number of bounced messages.
     * 
     */
    public final static ContactStatisticsProperty<Long> BOUNCEDCOUNT = new ContactStatisticsProperty<Long>("BouncedCount", Long.class);
    /**
     * Number of registered clicks.
     * 
     */
    public final static ContactStatisticsProperty<Long> CLICKEDCOUNT = new ContactStatisticsProperty<Long>("ClickedCount", Long.class);
    /**
     * The contact for which statistics are shown.
     * 
     */
    public final static ContactStatisticsProperty<Long> CONTACTID = new ContactStatisticsProperty<Long>("ContactID", Long.class);
    /**
     * Number of messages delivered to their destination.
     * 
     */
    public final static ContactStatisticsProperty<Long> DELIVEREDCOUNT = new ContactStatisticsProperty<Long>("DeliveredCount", Long.class);
    /**
     * Timestamp of last registered activity for this contact.
     * 
     */
    public final static ContactStatisticsProperty<Date> LASTACTIVITYAT = new ContactStatisticsProperty<Date>("LastActivityAt", Date.class);
    /**
     * Number of message open registrations.
     * 
     */
    public final static ContactStatisticsProperty<Long> OPENEDCOUNT = new ContactStatisticsProperty<Long>("OpenedCount", Long.class);
    /**
     * Total number of messages processed by Mailjet.
     * 
     */
    public final static ContactStatisticsProperty<Long> PROCESSEDCOUNT = new ContactStatisticsProperty<Long>("ProcessedCount", Long.class);
    /**
     * Number of messages waiting in send queue.
     * 
     */
    public final static ContactStatisticsProperty<Long> QUEUEDCOUNT = new ContactStatisticsProperty<Long>("QueuedCount", Long.class);
    /**
     * Number of spam complaints.
     * 
     */
    public final static ContactStatisticsProperty<Long> SPAMCOMPLAINTCOUNT = new ContactStatisticsProperty<Long>("SpamComplaintCount", Long.class);
    /**
     * 
     * 
     */
    public final static ContactStatisticsProperty<Long> UNSUBSCRIBEDCOUNT = new ContactStatisticsProperty<Long>("UnsubscribedCount", Long.class);

    private ContactStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ContactStatisticsProperty<Object> ref(String name) {
        return new ContactStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<ContactStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
