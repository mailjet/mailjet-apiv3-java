
package com.mailjet.api.model.v3.messagestatistics;

import java.math.BigDecimal;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "API key Campaign/Message statistics.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "messagestatistics", description = "API key Campaign/Message statistics.", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class MessageStatistics {

    @Component(name = "AverageClickDelay", type = "Double", defaultValue = "", required = false, description = "Average delay (in seconds) between the open and click.")
    private BigDecimal AverageClickDelay;
    @Component(name = "AverageClickedCount", type = "Double", defaultValue = "", required = false, description = "Average number of times a click was registered for a message.")
    private BigDecimal AverageClickedCount;
    @Component(name = "AverageOpenDelay", type = "Double", defaultValue = "", required = false, description = "Average delay between message delivery and first message open.")
    private BigDecimal AverageOpenDelay;
    @Component(name = "AverageOpenedCount", type = "Double", defaultValue = "", required = false, description = "Average number of times a recipient opens the message.")
    private BigDecimal AverageOpenedCount;
    @Component(name = "BlockedCount", type = "Int64", defaultValue = "", required = false, description = "Number of blocked messages.")
    private Long BlockedCount;
    @Component(name = "BouncedCount", type = "Int64", defaultValue = "", required = false, description = "Number of bounced messages.")
    private Long BouncedCount;
    @Component(name = "CampaignCount", type = "Int64", defaultValue = "", required = false, description = "Number of distinct campaigns.")
    private Long CampaignCount;
    @Component(name = "ClickedCount", type = "Int64", defaultValue = "", required = false, description = "Number of registered clicks.")
    private Long ClickedCount;
    @Component(name = "DeliveredCount", type = "Int64", defaultValue = "", required = false, description = "Number of messages delivered to their destination.")
    private Long DeliveredCount;
    @Component(name = "OpenedCount", type = "Int64", defaultValue = "", required = false, description = "Number of message open registrations.")
    private Long OpenedCount;
    @Component(name = "ProcessedCount", type = "Int64", defaultValue = "", required = false, description = "Total number of messages processed by Mailjet.")
    private Long ProcessedCount;
    @Component(name = "QueuedCount", type = "Int64", defaultValue = "", required = false, description = "Number of messages waiting in send queue.")
    private Long QueuedCount;
    @Component(name = "SpamComplaintCount", type = "Int64", defaultValue = "", required = false, description = "Number of spam complaints.")
    private Long SpamComplaintCount;
    @Component(name = "TransactionalCount", type = "Int64", defaultValue = "", required = false, description = "Number of transactional mails.")
    private Long TransactionalCount;
    @Component(name = "UnsubscribedCount", type = "Int64", defaultValue = "", required = false, description = "Number of registered unsubscribe requests.")
    private Long UnsubscribedCount;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<MessageStatistics>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<MessageStatistics>>(MessageStatistics.class, ResourceOperationTypes.Get);

    /**
     * Gets "Average delay (in seconds) between the open and click." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getAverageClickDelay() {
        return AverageClickDelay;
    }

    /**
     * Sets the specified value to "Average delay (in seconds) between the open and click." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageStatistics setAverageClickDelay(BigDecimal value) {
        AverageClickDelay = value;
        return this;
    }

    /**
     * Gets "Average number of times a click was registered for a message." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getAverageClickedCount() {
        return AverageClickedCount;
    }

    /**
     * Sets the specified value to "Average number of times a click was registered for a message." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageStatistics setAverageClickedCount(BigDecimal value) {
        AverageClickedCount = value;
        return this;
    }

    /**
     * Gets "Average delay between message delivery and first message open." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getAverageOpenDelay() {
        return AverageOpenDelay;
    }

    /**
     * Sets the specified value to "Average delay between message delivery and first message open." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageStatistics setAverageOpenDelay(BigDecimal value) {
        AverageOpenDelay = value;
        return this;
    }

    /**
     * Gets "Average number of times a recipient opens the message." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getAverageOpenedCount() {
        return AverageOpenedCount;
    }

    /**
     * Sets the specified value to "Average number of times a recipient opens the message." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageStatistics setAverageOpenedCount(BigDecimal value) {
        AverageOpenedCount = value;
        return this;
    }

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
    public MessageStatistics setBlockedCount(Long value) {
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
    public MessageStatistics setBouncedCount(Long value) {
        BouncedCount = value;
        return this;
    }

    /**
     * Gets "Number of distinct campaigns." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getCampaignCount() {
        return CampaignCount;
    }

    /**
     * Sets the specified value to "Number of distinct campaigns." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageStatistics setCampaignCount(Long value) {
        CampaignCount = value;
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
    public MessageStatistics setClickedCount(Long value) {
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
    public MessageStatistics setDeliveredCount(Long value) {
        DeliveredCount = value;
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
    public MessageStatistics setOpenedCount(Long value) {
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
    public MessageStatistics setProcessedCount(Long value) {
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
    public MessageStatistics setQueuedCount(Long value) {
        QueuedCount = value;
        return this;
    }

    /**
     * Gets "Number of spam complaints." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getSpamComplaintCount() {
        return SpamComplaintCount;
    }

    /**
     * Sets the specified value to "Number of spam complaints." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageStatistics setSpamComplaintCount(Long value) {
        SpamComplaintCount = value;
        return this;
    }

    /**
     * Gets "Number of transactional mails." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getTransactionalCount() {
        return TransactionalCount;
    }

    /**
     * Sets the specified value to "Number of transactional mails." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageStatistics setTransactionalCount(Long value) {
        TransactionalCount = value;
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
    public MessageStatistics setUnsubscribedCount(Long value) {
        UnsubscribedCount = value;
        return this;
    }

}
