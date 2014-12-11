
package com.mailjet.api.model.v3.campaignstatistics;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Statistics related to emails processed by Mailjet, grouped in a Campaign.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
@Resource(name = "campaignstatistics", description = "Statistics related to emails processed by Mailjet, grouped in a Campaign.", allowedOperations = {
    ResourceOperationTypes.Get
}, uniquekey = "CustomValue")
public final class CampaignStatistics {

    @Component(name = "AXTesting", type = "TAXTesting", defaultValue = "", required = false, description = "")
    private Long AXTestingID;
    @Component(name = "BlockedCount", type = "Int64", defaultValue = "", required = false, description = "Number of blocked messages.")
    private Long BlockedCount;
    @Component(name = "BouncedCount", type = "Int64", defaultValue = "", required = false, description = "Number of bounced messages.")
    private Long BouncedCount;
    @Component(name = "Campaign", type = "TCampaign", defaultValue = "", required = false, description = "Reference to campaign.")
    private Long CampaignID;
    @Component(name = "CampaignIsStarred", type = "Boolean", defaultValue = "false", required = false, description = "")
    private Boolean CampaignIsStarred;
    @Component(name = "CampaignSendStartAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "")
    private Date CampaignSendStartAt;
    @Component(name = "CampaignSubject", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String CampaignSubject;
    @Component(name = "ClickedCount", type = "Int64", defaultValue = "", required = false, description = "Number of registered clicks.")
    private Long ClickedCount;
    @Component(name = "ContactListName", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String ContactListName;
    @Component(name = "DeliveredCount", type = "Int64", defaultValue = "", required = false, description = "Number of messages delivered to their destination.")
    private Long DeliveredCount;
    @Component(name = "LastActivityAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp of last registered activity for this Campaign.")
    private Date LastActivityAt;
    @Component(name = "NewsLetter", type = "TNewsLetter", defaultValue = "", required = false, description = "Only retrieve campaign statistics for the given NewsLetter ID.")
    private Long NewsLetterID;
    @Component(name = "OpenedCount", type = "Int64", defaultValue = "", required = false, description = "Number of message open registrations.")
    private Long OpenedCount;
    @Component(name = "ProcessedCount", type = "Int64", defaultValue = "", required = false, description = "Total number of messages processed by Mailjet.")
    private Long ProcessedCount;
    @Component(name = "QueuedCount", type = "Int64", defaultValue = "", required = false, description = "Number of messages waiting in send queue.")
    private Long QueuedCount;
    @Component(name = "SegmentName", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String SegmentName;
    @Component(name = "SpamComplaintCount", type = "Int64", defaultValue = "", required = false, description = "Number of spam complaints.")
    private Long SpamComplaintCount;
    @Component(name = "UnsubscribedCount", type = "Int64", defaultValue = "", required = false, description = "")
    private Long UnsubscribedCount;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<CampaignStatistics>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<CampaignStatistics>>(CampaignStatistics.class, ResourceOperationTypes.Get);

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getAXTestingID() {
        return AXTestingID;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignStatistics setAXTestingID(Long value) {
        AXTestingID = value;
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
    public CampaignStatistics setBlockedCount(Long value) {
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
    public CampaignStatistics setBouncedCount(Long value) {
        BouncedCount = value;
        return this;
    }

    /**
     * Gets "Reference to campaign." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getCampaignID() {
        return CampaignID;
    }

    /**
     * Sets the specified value to "Reference to campaign." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignStatistics setCampaignID(Long value) {
        CampaignID = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getCampaignIsStarred() {
        return CampaignIsStarred;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignStatistics setCampaignIsStarred(Boolean value) {
        CampaignIsStarred = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getCampaignSendStartAt() {
        return CampaignSendStartAt;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignStatistics setCampaignSendStartAt(Date value) {
        CampaignSendStartAt = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getCampaignSubject() {
        return CampaignSubject;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignStatistics setCampaignSubject(String value) {
        CampaignSubject = value;
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
    public CampaignStatistics setClickedCount(Long value) {
        ClickedCount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getContactListName() {
        return ContactListName;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignStatistics setContactListName(String value) {
        ContactListName = value;
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
    public CampaignStatistics setDeliveredCount(Long value) {
        DeliveredCount = value;
        return this;
    }

    /**
     * Gets "Timestamp of last registered activity for this Campaign." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getLastActivityAt() {
        return LastActivityAt;
    }

    /**
     * Sets the specified value to "Timestamp of last registered activity for this Campaign." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignStatistics setLastActivityAt(Date value) {
        LastActivityAt = value;
        return this;
    }

    /**
     * Gets "Only retrieve campaign statistics for the given NewsLetter ID." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getNewsLetterID() {
        return NewsLetterID;
    }

    /**
     * Sets the specified value to "Only retrieve campaign statistics for the given NewsLetter ID." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignStatistics setNewsLetterID(Long value) {
        NewsLetterID = value;
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
    public CampaignStatistics setOpenedCount(Long value) {
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
    public CampaignStatistics setProcessedCount(Long value) {
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
    public CampaignStatistics setQueuedCount(Long value) {
        QueuedCount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getSegmentName() {
        return SegmentName;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignStatistics setSegmentName(String value) {
        SegmentName = value;
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
    public CampaignStatistics setSpamComplaintCount(Long value) {
        SpamComplaintCount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getUnsubscribedCount() {
        return UnsubscribedCount;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignStatistics setUnsubscribedCount(Long value) {
        UnsubscribedCount = value;
        return this;
    }

}
