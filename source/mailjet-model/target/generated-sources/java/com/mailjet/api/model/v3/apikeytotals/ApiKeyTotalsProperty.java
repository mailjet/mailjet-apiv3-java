
package com.mailjet.api.model.v3.apikeytotals;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "apikeytotals" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
public final class ApiKeyTotalsProperty<DataType >
    extends MailJetResourceProperty<ApiKeyTotals, DataType>
{

    /**
     * Number of blocked messages.
     * 
     */
    public final static ApiKeyTotalsProperty<Long> BLOCKEDCOUNT = new ApiKeyTotalsProperty<Long>("BlockedCount", Long.class);
    /**
     * Number of bounced messages.
     * 
     */
    public final static ApiKeyTotalsProperty<Long> BOUNCEDCOUNT = new ApiKeyTotalsProperty<Long>("BouncedCount", Long.class);
    /**
     * Number of registered clicks.
     * 
     */
    public final static ApiKeyTotalsProperty<Long> CLICKEDCOUNT = new ApiKeyTotalsProperty<Long>("ClickedCount", Long.class);
    /**
     * Number of messages delivered to their destination.
     * 
     */
    public final static ApiKeyTotalsProperty<Long> DELIVEREDCOUNT = new ApiKeyTotalsProperty<Long>("DeliveredCount", Long.class);
    /**
     * Timestamp of last registered activity for this API key.
     * 
     */
    public final static ApiKeyTotalsProperty<Long> LASTACTIVITY = new ApiKeyTotalsProperty<Long>("LastActivity", Long.class);
    /**
     * Number of message open registrations.
     * 
     */
    public final static ApiKeyTotalsProperty<Long> OPENEDCOUNT = new ApiKeyTotalsProperty<Long>("OpenedCount", Long.class);
    /**
     * Total number of messages processed by Mailjet.
     * 
     */
    public final static ApiKeyTotalsProperty<Long> PROCESSEDCOUNT = new ApiKeyTotalsProperty<Long>("ProcessedCount", Long.class);
    /**
     * Number of messages waiting in send queue.
     * 
     */
    public final static ApiKeyTotalsProperty<Long> QUEUEDCOUNT = new ApiKeyTotalsProperty<Long>("QueuedCount", Long.class);
    /**
     * Number of spam complaints.
     * 
     */
    public final static ApiKeyTotalsProperty<Long> SPAMCOMPLAINTCOUNT = new ApiKeyTotalsProperty<Long>("SpamcomplaintCount", Long.class);
    /**
     * Number of registered unsubscribe requests.
     * 
     */
    public final static ApiKeyTotalsProperty<Long> UNSUBSCRIBEDCOUNT = new ApiKeyTotalsProperty<Long>("UnsubscribedCount", Long.class);

    private ApiKeyTotalsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ApiKeyTotalsProperty<Object> ref(String name) {
        return new ApiKeyTotalsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<ApiKeyTotals, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
