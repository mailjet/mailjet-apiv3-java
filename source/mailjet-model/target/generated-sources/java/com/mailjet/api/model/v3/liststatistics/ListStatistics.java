
package com.mailjet.api.model.v3.liststatistics;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "View Campaign/message/click statistics grouped by ContactsList.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "liststatistics", description = "View Campaign/message/click statistics grouped by ContactsList.", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class ListStatistics {

    @Component(name = "ActiveCount", type = "Int64", defaultValue = "", required = false, description = "Number of active list members.")
    private Long ActiveCount;
    @Component(name = "ActiveUnsubscribedCount", type = "Int64", defaultValue = "", required = false, description = "Number of registered unsubscribe requests. (only calculated when CalcActiveUnsub filter is active).")
    private Long ActiveUnsubscribedCount;
    @Component(name = "Address", type = "AnsiString", defaultValue = "", required = false, description = "List address.")
    private String Address;
    @Component(name = "BlockedCount", type = "Int64", defaultValue = "", required = false, description = "Number of blocked messages.")
    private Long BlockedCount;
    @Component(name = "BouncedCount", type = "Int64", defaultValue = "", required = false, description = "Number of bounced messages.")
    private Long BouncedCount;
    @Component(name = "ClickedCount", type = "Int64", defaultValue = "", required = false, description = "Number of registered clicks.")
    private Long ClickedCount;
    @Component(name = "CreatedAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp when object was created in database.")
    private Date CreatedAt;
    @Component(name = "DeliveredCount", type = "Int64", defaultValue = "", required = false, description = "Number of messages delivered to their destination.")
    private Long DeliveredCount;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "IsDeleted", type = "Boolean", defaultValue = "false", required = false, description = "Is the list Deleted or not ?.")
    private Boolean IsDeleted;
    @Component(name = "LastActivityAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp of last registered activity for this contactlist.")
    private Date LastActivityAt;
    @Component(name = "Name", type = "AnsiString", defaultValue = "", required = false, description = "List name.")
    private String Name;
    @Component(name = "OpenedCount", type = "Int64", defaultValue = "", required = false, description = "Number of message open registrations.")
    private Long OpenedCount;
    @Component(name = "SpamComplaintCount", type = "Int64", defaultValue = "", required = false, description = "Number of spam complaints.")
    private Long SpamComplaintCount;
    @Component(name = "SubscriberCount", type = "LongInt", defaultValue = "", required = false, description = "Number of subscribers.")
    private Integer SubscriberCount;
    @Component(name = "UnsubscribedCount", type = "Int64", defaultValue = "", required = false, description = "Number of registered unsubscribe requests.")
    private Long UnsubscribedCount;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ListStatistics>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ListStatistics>>(ListStatistics.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ListStatistics>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ListStatistics>>(ListStatistics.class, ResourceOperationTypes.GetById);

    /**
     * Gets "Number of active list members." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getActiveCount() {
        return ActiveCount;
    }

    /**
     * Sets the specified value to "Number of active list members." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ListStatistics setActiveCount(Long value) {
        ActiveCount = value;
        return this;
    }

    /**
     * Gets "Number of registered unsubscribe requests. (only calculated when CalcActiveUnsub filter is active)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getActiveUnsubscribedCount() {
        return ActiveUnsubscribedCount;
    }

    /**
     * Sets the specified value to "Number of registered unsubscribe requests. (only calculated when CalcActiveUnsub filter is active)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ListStatistics setActiveUnsubscribedCount(Long value) {
        ActiveUnsubscribedCount = value;
        return this;
    }

    /**
     * Gets "List address." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getAddress() {
        return Address;
    }

    /**
     * Sets the specified value to "List address." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ListStatistics setAddress(String value) {
        Address = value;
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
    public ListStatistics setBlockedCount(Long value) {
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
    public ListStatistics setBouncedCount(Long value) {
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
    public ListStatistics setClickedCount(Long value) {
        ClickedCount = value;
        return this;
    }

    /**
     * Gets "Timestamp when object was created in database." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getCreatedAt() {
        return CreatedAt;
    }

    /**
     * Sets the specified value to "Timestamp when object was created in database." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ListStatistics setCreatedAt(Date value) {
        CreatedAt = value;
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
    public ListStatistics setDeliveredCount(Long value) {
        DeliveredCount = value;
        return this;
    }

    /**
     * Gets "Unique numerical ID for this object." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getID() {
        return ID;
    }

    /**
     * Sets the specified value to "Unique numerical ID for this object." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ListStatistics setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Is the list Deleted or not ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsDeleted() {
        return IsDeleted;
    }

    /**
     * Sets the specified value to "Is the list Deleted or not ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ListStatistics setIsDeleted(Boolean value) {
        IsDeleted = value;
        return this;
    }

    /**
     * Gets "Timestamp of last registered activity for this contactlist." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getLastActivityAt() {
        return LastActivityAt;
    }

    /**
     * Sets the specified value to "Timestamp of last registered activity for this contactlist." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ListStatistics setLastActivityAt(Date value) {
        LastActivityAt = value;
        return this;
    }

    /**
     * Gets "List name." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the specified value to "List name." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ListStatistics setName(String value) {
        Name = value;
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
    public ListStatistics setOpenedCount(Long value) {
        OpenedCount = value;
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
    public ListStatistics setSpamComplaintCount(Long value) {
        SpamComplaintCount = value;
        return this;
    }

    /**
     * Gets "Number of subscribers." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getSubscriberCount() {
        return SubscriberCount;
    }

    /**
     * Sets the specified value to "Number of subscribers." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ListStatistics setSubscriberCount(Integer value) {
        SubscriberCount = value;
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
    public ListStatistics setUnsubscribedCount(Long value) {
        UnsubscribedCount = value;
        return this;
    }

    public String toString() {
        return ((ListStatistics.class.getSimpleName()+"#")+ this.getID());
    }

}
