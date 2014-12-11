
package com.mailjet.api.model.v3.listrecipientstatistics;

import java.util.Date;
import java.util.List;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "listrecipientstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class ListRecipientStatisticsProperty<DataType >
    extends MailJetResourceProperty<ListRecipientStatistics, DataType>
{

    /**
     * Number of blocked messages.
     * 
     */
    public final static ListRecipientStatisticsProperty<Long> BLOCKEDCOUNT = new ListRecipientStatisticsProperty<Long>("BlockedCount", Long.class);
    /**
     * Number of bounced messages.
     * 
     */
    public final static ListRecipientStatisticsProperty<Long> BOUNCEDCOUNT = new ListRecipientStatisticsProperty<Long>("BouncedCount", Long.class);
    /**
     * Number of registered clicks.
     * 
     */
    public final static ListRecipientStatisticsProperty<Long> CLICKEDCOUNT = new ListRecipientStatisticsProperty<Long>("ClickedCount", Long.class);
    /**
     * Extra data associated with contact. This is only present when ShowExtraData filter is 1.
     * 
     */
    public final static ListRecipientStatisticsProperty<List<Long>> DATA = new ListRecipientStatisticsProperty<List<Long>>("Data", List.class);
    /**
     * Number of messages delivered to their destination.
     * 
     */
    public final static ListRecipientStatisticsProperty<Long> DELIVEREDCOUNT = new ListRecipientStatisticsProperty<Long>("DeliveredCount", Long.class);
    /**
     * Timestamp of last registered activity for this contact.
     * 
     */
    public final static ListRecipientStatisticsProperty<Date> LASTACTIVITYAT = new ListRecipientStatisticsProperty<Date>("LastActivityAt", Date.class);
    /**
     * Listrecipient for which the statistics are shown.
     * 
     */
    public final static ListRecipientStatisticsProperty<Long> LISTRECIPIENTID = new ListRecipientStatisticsProperty<Long>("ListRecipientID", Long.class);
    /**
     * Number of message open registrations.
     * 
     */
    public final static ListRecipientStatisticsProperty<Long> OPENEDCOUNT = new ListRecipientStatisticsProperty<Long>("OpenedCount", Long.class);
    /**
     * Total number of messages processed by Mailjet.
     * 
     */
    public final static ListRecipientStatisticsProperty<Long> PROCESSEDCOUNT = new ListRecipientStatisticsProperty<Long>("ProcessedCount", Long.class);
    /**
     * Number of messages waiting in send queue.
     * 
     */
    public final static ListRecipientStatisticsProperty<Long> QUEUEDCOUNT = new ListRecipientStatisticsProperty<Long>("QueuedCount", Long.class);
    /**
     * Number of spam complaints.
     * 
     */
    public final static ListRecipientStatisticsProperty<Long> SPAMCOMPLAINTCOUNT = new ListRecipientStatisticsProperty<Long>("SpamComplaintCount", Long.class);
    /**
     * 
     * 
     */
    public final static ListRecipientStatisticsProperty<Long> UNSUBSCRIBEDCOUNT = new ListRecipientStatisticsProperty<Long>("UnsubscribedCount", Long.class);

    private ListRecipientStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ListRecipientStatisticsProperty<Object> ref(String name) {
        return new ListRecipientStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<ListRecipientStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
