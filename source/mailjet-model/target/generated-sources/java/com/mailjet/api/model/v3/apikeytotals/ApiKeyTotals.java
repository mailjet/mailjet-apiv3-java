
package com.mailjet.api.model.v3.apikeytotals;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Global counts for an API Key, since its creation.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
@Resource(name = "apikeytotals", description = "Global counts for an API Key, since its creation.", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class ApiKeyTotals {

    @Component(name = "BlockedCount", type = "Int64", defaultValue = "", required = false, description = "Number of blocked messages.")
    private Long BlockedCount;
    @Component(name = "BouncedCount", type = "Int64", defaultValue = "", required = false, description = "Number of bounced messages.")
    private Long BouncedCount;
    @Component(name = "ClickedCount", type = "Int64", defaultValue = "", required = false, description = "Number of registered clicks.")
    private Long ClickedCount;
    @Component(name = "DeliveredCount", type = "Int64", defaultValue = "", required = false, description = "Number of messages delivered to their destination.")
    private Long DeliveredCount;
    @Component(name = "LastActivity", type = "Int64", defaultValue = "", required = false, description = "Timestamp of last registered activity for this API key.")
    private Long LastActivity;
    @Component(name = "OpenedCount", type = "Int64", defaultValue = "", required = false, description = "Number of message open registrations.")
    private Long OpenedCount;
    @Component(name = "ProcessedCount", type = "Int64", defaultValue = "", required = false, description = "Total number of messages processed by Mailjet.")
    private Long ProcessedCount;
    @Component(name = "QueuedCount", type = "Int64", defaultValue = "", required = false, description = "Number of messages waiting in send queue.")
    private Long QueuedCount;
    @Component(name = "SpamcomplaintCount", type = "Int64", defaultValue = "", required = false, description = "Number of spam complaints.")
    private Long SpamcomplaintCount;
    @Component(name = "UnsubscribedCount", type = "Int64", defaultValue = "", required = false, description = "Number of registered unsubscribe requests.")
    private Long UnsubscribedCount;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ApiKeyTotals>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ApiKeyTotals>>(ApiKeyTotals.class, ResourceOperationTypes.Get);

    /**
     * Gets "Number of blocked messages." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getBlockedCount() {
        return BlockedCount;
    }

    /**
     * Sets the specified value to "Number of blocked messages." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyTotals setBlockedCount(Long value) {
        BlockedCount = value;
        return this;
    }

    /**
     * Gets "Number of bounced messages." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getBouncedCount() {
        return BouncedCount;
    }

    /**
     * Sets the specified value to "Number of bounced messages." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyTotals setBouncedCount(Long value) {
        BouncedCount = value;
        return this;
    }

    /**
     * Gets "Number of registered clicks." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getClickedCount() {
        return ClickedCount;
    }

    /**
     * Sets the specified value to "Number of registered clicks." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyTotals setClickedCount(Long value) {
        ClickedCount = value;
        return this;
    }

    /**
     * Gets "Number of messages delivered to their destination." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getDeliveredCount() {
        return DeliveredCount;
    }

    /**
     * Sets the specified value to "Number of messages delivered to their destination." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyTotals setDeliveredCount(Long value) {
        DeliveredCount = value;
        return this;
    }

    /**
     * Gets "Timestamp of last registered activity for this API key." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getLastActivity() {
        return LastActivity;
    }

    /**
     * Sets the specified value to "Timestamp of last registered activity for this API key." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyTotals setLastActivity(Long value) {
        LastActivity = value;
        return this;
    }

    /**
     * Gets "Number of message open registrations." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getOpenedCount() {
        return OpenedCount;
    }

    /**
     * Sets the specified value to "Number of message open registrations." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyTotals setOpenedCount(Long value) {
        OpenedCount = value;
        return this;
    }

    /**
     * Gets "Total number of messages processed by Mailjet." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getProcessedCount() {
        return ProcessedCount;
    }

    /**
     * Sets the specified value to "Total number of messages processed by Mailjet." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyTotals setProcessedCount(Long value) {
        ProcessedCount = value;
        return this;
    }

    /**
     * Gets "Number of messages waiting in send queue." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getQueuedCount() {
        return QueuedCount;
    }

    /**
     * Sets the specified value to "Number of messages waiting in send queue." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyTotals setQueuedCount(Long value) {
        QueuedCount = value;
        return this;
    }

    /**
     * Gets "Number of spam complaints." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getSpamcomplaintCount() {
        return SpamcomplaintCount;
    }

    /**
     * Sets the specified value to "Number of spam complaints." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyTotals setSpamcomplaintCount(Long value) {
        SpamcomplaintCount = value;
        return this;
    }

    /**
     * Gets "Number of registered unsubscribe requests." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getUnsubscribedCount() {
        return UnsubscribedCount;
    }

    /**
     * Sets the specified value to "Number of registered unsubscribe requests." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyTotals setUnsubscribedCount(Long value) {
        UnsubscribedCount = value;
        return this;
    }

}
