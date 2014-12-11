
package com.mailjet.api.model.v3.messageinformation;

import java.math.BigDecimal;
import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;
import com.mailjet.api.model.v3.customtypes.SpamAssassinRuleList;


/**
 * Class representing "API Key campaign/message information.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "messageinformation", description = "API Key campaign/message information.", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class MessageInformation {

    @Component(name = "Campaign", type = "TCampaign", defaultValue = "", required = false, description = "reference to Campaign to which message belongs.")
    private Long CampaignID;
    @Component(name = "ClickTrackedCount", type = "Int64", defaultValue = "", required = false, description = "Number of click track requests.")
    private Long ClickTrackedCount;
    @Component(name = "Contact", type = "TContact", defaultValue = "", required = false, description = "Reference to contact to which message was sent.")
    private Long ContactID;
    @Component(name = "CreatedAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp when object was created in database.")
    private Date CreatedAt;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "MessageSize", type = "Int64", defaultValue = "", required = false, description = "Size of the message.")
    private Long MessageSize;
    @Component(name = "OpenTrackedCount", type = "Int64", defaultValue = "", required = false, description = "Number of open track requests.")
    private Long OpenTrackedCount;
    @Component(name = "QueuedCount", type = "Int64", defaultValue = "", required = false, description = "Number of messages waiting in send queue.")
    private Long QueuedCount;
    @Component(name = "SendEndAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp indicating when last message was sent for the campaign.")
    private Date SendEndAt;
    @Component(name = "SentCount", type = "Int64", defaultValue = "", required = false, description = "Number of actual sent attempts.")
    private Long SentCount;
    @Component(name = "SpamAssassinRules", type = "TSpamAssassinRuleList", defaultValue = "", required = false, description = "Matched spam assassin rules.")
    private SpamAssassinRuleList SpamAssassinRules;
    @Component(name = "SpamAssassinScore", type = "Currency", defaultValue = "", required = false, description = "Spam assassin score for this message.")
    private BigDecimal SpamAssassinScore;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<MessageInformation>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<MessageInformation>>(MessageInformation.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<MessageInformation>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<MessageInformation>>(MessageInformation.class, ResourceOperationTypes.GetById);

    /**
     * Gets "reference to Campaign to which message belongs." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getCampaignID() {
        return CampaignID;
    }

    /**
     * Sets the specified value to "reference to Campaign to which message belongs." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageInformation setCampaignID(Long value) {
        CampaignID = value;
        return this;
    }

    /**
     * Gets "Number of click track requests." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getClickTrackedCount() {
        return ClickTrackedCount;
    }

    /**
     * Sets the specified value to "Number of click track requests." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageInformation setClickTrackedCount(Long value) {
        ClickTrackedCount = value;
        return this;
    }

    /**
     * Gets "Reference to contact to which message was sent." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getContactID() {
        return ContactID;
    }

    /**
     * Sets the specified value to "Reference to contact to which message was sent." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageInformation setContactID(Long value) {
        ContactID = value;
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
    public MessageInformation setCreatedAt(Date value) {
        CreatedAt = value;
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
    public MessageInformation setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Size of the message." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getMessageSize() {
        return MessageSize;
    }

    /**
     * Sets the specified value to "Size of the message." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageInformation setMessageSize(Long value) {
        MessageSize = value;
        return this;
    }

    /**
     * Gets "Number of open track requests." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getOpenTrackedCount() {
        return OpenTrackedCount;
    }

    /**
     * Sets the specified value to "Number of open track requests." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageInformation setOpenTrackedCount(Long value) {
        OpenTrackedCount = value;
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
    public MessageInformation setQueuedCount(Long value) {
        QueuedCount = value;
        return this;
    }

    /**
     * Gets "Timestamp indicating when last message was sent for the campaign." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getSendEndAt() {
        return SendEndAt;
    }

    /**
     * Sets the specified value to "Timestamp indicating when last message was sent for the campaign." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageInformation setSendEndAt(Date value) {
        SendEndAt = value;
        return this;
    }

    /**
     * Gets "Number of actual sent attempts." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getSentCount() {
        return SentCount;
    }

    /**
     * Sets the specified value to "Number of actual sent attempts." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageInformation setSentCount(Long value) {
        SentCount = value;
        return this;
    }

    /**
     * Gets "Matched spam assassin rules." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public SpamAssassinRuleList getSpamAssassinRules() {
        return SpamAssassinRules;
    }

    /**
     * Sets the specified value to "Matched spam assassin rules." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageInformation setSpamAssassinRules(SpamAssassinRuleList value) {
        SpamAssassinRules = value;
        return this;
    }

    /**
     * Gets "Spam assassin score for this message." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getSpamAssassinScore() {
        return SpamAssassinScore;
    }

    /**
     * Sets the specified value to "Spam assassin score for this message." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageInformation setSpamAssassinScore(BigDecimal value) {
        SpamAssassinScore = value;
        return this;
    }

    public String toString() {
        return ((MessageInformation.class.getSimpleName()+"#")+ this.getID());
    }

}
