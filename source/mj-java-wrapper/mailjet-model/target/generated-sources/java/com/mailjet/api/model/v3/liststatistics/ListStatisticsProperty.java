
package com.mailjet.api.model.v3.liststatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "liststatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class ListStatisticsProperty<DataType >
    extends MailJetResourceProperty<ListStatistics, DataType>
{

    /**
     * Number of active list members.
     * 
     */
    public final static ListStatisticsProperty<Long> ACTIVECOUNT = new ListStatisticsProperty<Long>("ActiveCount", Long.class);
    /**
     * Number of registered unsubscribe requests. (only calculated when CalcActiveUnsub filter is active).
     * 
     */
    public final static ListStatisticsProperty<Long> ACTIVEUNSUBSCRIBEDCOUNT = new ListStatisticsProperty<Long>("ActiveUnsubscribedCount", Long.class);
    /**
     * List address.
     * 
     */
    public final static ListStatisticsProperty<String> ADDRESS = new ListStatisticsProperty<String>("Address", String.class);
    /**
     * Number of blocked messages.
     * 
     */
    public final static ListStatisticsProperty<Long> BLOCKEDCOUNT = new ListStatisticsProperty<Long>("BlockedCount", Long.class);
    /**
     * Number of bounced messages.
     * 
     */
    public final static ListStatisticsProperty<Long> BOUNCEDCOUNT = new ListStatisticsProperty<Long>("BouncedCount", Long.class);
    /**
     * Number of registered clicks.
     * 
     */
    public final static ListStatisticsProperty<Long> CLICKEDCOUNT = new ListStatisticsProperty<Long>("ClickedCount", Long.class);
    /**
     * Timestamp when object was created in database.
     * 
     */
    public final static ListStatisticsProperty<Date> CREATEDAT = new ListStatisticsProperty<Date>("CreatedAt", Date.class);
    /**
     * Number of messages delivered to their destination.
     * 
     */
    public final static ListStatisticsProperty<Long> DELIVEREDCOUNT = new ListStatisticsProperty<Long>("DeliveredCount", Long.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static ListStatisticsProperty.Key<Long> ID = new ListStatisticsProperty.Key<Long>("ID", Long.class);
    /**
     * Is the list Deleted or not ?.
     * 
     */
    public final static ListStatisticsProperty<Boolean> ISDELETED = new ListStatisticsProperty<Boolean>("IsDeleted", Boolean.class);
    /**
     * Timestamp of last registered activity for this contactlist.
     * 
     */
    public final static ListStatisticsProperty<Date> LASTACTIVITYAT = new ListStatisticsProperty<Date>("LastActivityAt", Date.class);
    /**
     * List name.
     * 
     */
    public final static ListStatisticsProperty<String> NAME = new ListStatisticsProperty<String>("Name", String.class);
    /**
     * Number of message open registrations.
     * 
     */
    public final static ListStatisticsProperty<Long> OPENEDCOUNT = new ListStatisticsProperty<Long>("OpenedCount", Long.class);
    /**
     * Number of spam complaints.
     * 
     */
    public final static ListStatisticsProperty<Long> SPAMCOMPLAINTCOUNT = new ListStatisticsProperty<Long>("SpamComplaintCount", Long.class);
    /**
     * Number of subscribers.
     * 
     */
    public final static ListStatisticsProperty<Integer> SUBSCRIBERCOUNT = new ListStatisticsProperty<Integer>("SubscriberCount", Integer.class);
    /**
     * Number of registered unsubscribe requests.
     * 
     */
    public final static ListStatisticsProperty<Long> UNSUBSCRIBEDCOUNT = new ListStatisticsProperty<Long>("UnsubscribedCount", Long.class);

    private ListStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ListStatisticsProperty<Object> ref(String name) {
        return new ListStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<ListStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
