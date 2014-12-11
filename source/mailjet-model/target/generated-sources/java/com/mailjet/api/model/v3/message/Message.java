
package com.mailjet.api.model.v3.message;

import java.math.BigDecimal;
import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.EnumValue;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Allows you to list and view the details of a Message (an e-mail) processed by Mailjet".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "message", description = "Allows you to list and view the details of a Message (an e-mail) processed by Mailjet", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class Message {

    @Component(name = "ArrivedAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp indicated when the message arrived at Mailjet.")
    private Date ArrivedAt;
    @Component(name = "AttachmentCount", type = "LongInt", defaultValue = "", required = false, description = "Number of attachments detected in the message.")
    private Integer AttachmentCount;
    @Component(name = "AttemptCount", type = "LongInt", defaultValue = "", required = false, description = "Number of attempts made to deliver the message.")
    private Integer AttemptCount;
    @Component(name = "Campaign", type = "TCampaign", defaultValue = "", required = true, description = "Reference to campaign in which this message is delivered.")
    private Long CampaignID;
    @Component(name = "Contact", type = "TContact", defaultValue = "", required = true, description = "Reference to contact to which message was sent.")
    private Long ContactID;
    @Component(name = "Delay", type = "Currency", defaultValue = "", required = false, description = "Delay between arrival and delivery [?].")
    private BigDecimal Delay;
    @Component(name = "Destination", type = "TDestination", defaultValue = "", required = true, description = "Reference to destination domain.")
    private Long DestinationID;
    @Component(name = "FilterTime", type = "LongInt", defaultValue = "", required = false, description = "Time spent processing the text of the message (milliseconds).")
    private Integer FilterTime;
    @Component(name = "From", type = "TSender", defaultValue = "", required = true, description = "Reference to the sender of the message.")
    private Long FromID;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "IsClickTracked", type = "Boolean", defaultValue = "false", required = false, description = "Was click tracking requested for this message ?.")
    private Boolean IsClickTracked;
    @Component(name = "IsHTMLPartIncluded", type = "Boolean", defaultValue = "false", required = false, description = "Did the message contain a HTML part ?.")
    private Boolean IsHTMLPartIncluded;
    @Component(name = "IsOpenTracked", type = "Boolean", defaultValue = "false", required = false, description = "Was open tracking requested for this message ?.")
    private Boolean IsOpenTracked;
    @Component(name = "IsTextPartIncluded", type = "Boolean", defaultValue = "false", required = false, description = "Did the message contain a text part ?.")
    private Boolean IsTextPartIncluded;
    @Component(name = "IsUnsubTracked", type = "Boolean", defaultValue = "false", required = false, description = "Was unsubscription tracking requested for this message ?.")
    private Boolean IsUnsubTracked;
    @Component(name = "MessageSize", type = "Int64", defaultValue = "", required = false, description = "Size of the message (in bytes).")
    private Long MessageSize;
    @Component(name = "SpamassassinScore", type = "Currency", defaultValue = "", required = false, description = "Spam assassin score for this message.")
    private BigDecimal SpamassassinScore;
    @Component(name = "SpamassRules", type = "AnsiString", defaultValue = "", required = false, description = "Matched spam assassin rules.")
    private String SpamassRules;
    @Component(name = "State", type = "TMessageState", defaultValue = "", required = false, description = "Current state of the message.")
    private Long StateID;
    @Component(name = "StatePermanent", type = "Boolean", defaultValue = "false", required = false, description = "Is the state of the message permanent (i.e. will no longer change).")
    private Boolean StatePermanent;
    @Component(name = "Status", type = "AnsiString", defaultValue = "", required = false, description = "Status of the message.")
    private Message.Status Status;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Message>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Message>>(Message.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Message>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Message>>(Message.class, ResourceOperationTypes.GetById);

    /**
     * Gets "Timestamp indicated when the message arrived at Mailjet." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getArrivedAt() {
        return ArrivedAt;
    }

    /**
     * Sets the specified value to "Timestamp indicated when the message arrived at Mailjet." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setArrivedAt(Date value) {
        ArrivedAt = value;
        return this;
    }

    /**
     * Gets "Number of attachments detected in the message." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getAttachmentCount() {
        return AttachmentCount;
    }

    /**
     * Sets the specified value to "Number of attachments detected in the message." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setAttachmentCount(Integer value) {
        AttachmentCount = value;
        return this;
    }

    /**
     * Gets "Number of attempts made to deliver the message." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getAttemptCount() {
        return AttemptCount;
    }

    /**
     * Sets the specified value to "Number of attempts made to deliver the message." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setAttemptCount(Integer value) {
        AttemptCount = value;
        return this;
    }

    /**
     * Gets "Reference to campaign in which this message is delivered." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getCampaignID() {
        return CampaignID;
    }

    /**
     * Sets the specified value to "Reference to campaign in which this message is delivered." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setCampaignID(Long value) {
        CampaignID = value;
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
    public Message setContactID(Long value) {
        ContactID = value;
        return this;
    }

    /**
     * Gets "Delay between arrival and delivery [?]." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getDelay() {
        return Delay;
    }

    /**
     * Sets the specified value to "Delay between arrival and delivery [?]." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setDelay(BigDecimal value) {
        Delay = value;
        return this;
    }

    /**
     * Gets "Reference to destination domain." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getDestinationID() {
        return DestinationID;
    }

    /**
     * Sets the specified value to "Reference to destination domain." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setDestinationID(Long value) {
        DestinationID = value;
        return this;
    }

    /**
     * Gets "Time spent processing the text of the message (milliseconds)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getFilterTime() {
        return FilterTime;
    }

    /**
     * Sets the specified value to "Time spent processing the text of the message (milliseconds)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setFilterTime(Integer value) {
        FilterTime = value;
        return this;
    }

    /**
     * Gets "Reference to the sender of the message." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getFromID() {
        return FromID;
    }

    /**
     * Sets the specified value to "Reference to the sender of the message." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setFromID(Long value) {
        FromID = value;
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
    public Message setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Was click tracking requested for this message ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsClickTracked() {
        return IsClickTracked;
    }

    /**
     * Sets the specified value to "Was click tracking requested for this message ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setIsClickTracked(Boolean value) {
        IsClickTracked = value;
        return this;
    }

    /**
     * Gets "Did the message contain a HTML part ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsHTMLPartIncluded() {
        return IsHTMLPartIncluded;
    }

    /**
     * Sets the specified value to "Did the message contain a HTML part ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setIsHTMLPartIncluded(Boolean value) {
        IsHTMLPartIncluded = value;
        return this;
    }

    /**
     * Gets "Was open tracking requested for this message ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsOpenTracked() {
        return IsOpenTracked;
    }

    /**
     * Sets the specified value to "Was open tracking requested for this message ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setIsOpenTracked(Boolean value) {
        IsOpenTracked = value;
        return this;
    }

    /**
     * Gets "Did the message contain a text part ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsTextPartIncluded() {
        return IsTextPartIncluded;
    }

    /**
     * Sets the specified value to "Did the message contain a text part ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setIsTextPartIncluded(Boolean value) {
        IsTextPartIncluded = value;
        return this;
    }

    /**
     * Gets "Was unsubscription tracking requested for this message ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsUnsubTracked() {
        return IsUnsubTracked;
    }

    /**
     * Sets the specified value to "Was unsubscription tracking requested for this message ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setIsUnsubTracked(Boolean value) {
        IsUnsubTracked = value;
        return this;
    }

    /**
     * Gets "Size of the message (in bytes)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getMessageSize() {
        return MessageSize;
    }

    /**
     * Sets the specified value to "Size of the message (in bytes)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setMessageSize(Long value) {
        MessageSize = value;
        return this;
    }

    /**
     * Gets "Spam assassin score for this message." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getSpamassassinScore() {
        return SpamassassinScore;
    }

    /**
     * Sets the specified value to "Spam assassin score for this message." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setSpamassassinScore(BigDecimal value) {
        SpamassassinScore = value;
        return this;
    }

    /**
     * Gets "Matched spam assassin rules." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getSpamassRules() {
        return SpamassRules;
    }

    /**
     * Sets the specified value to "Matched spam assassin rules." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setSpamassRules(String value) {
        SpamassRules = value;
        return this;
    }

    /**
     * Gets "Current state of the message." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getStateID() {
        return StateID;
    }

    /**
     * Sets the specified value to "Current state of the message." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setStateID(Long value) {
        StateID = value;
        return this;
    }

    /**
     * Gets "Is the state of the message permanent (i.e. will no longer change)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getStatePermanent() {
        return StatePermanent;
    }

    /**
     * Sets the specified value to "Is the state of the message permanent (i.e. will no longer change)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setStatePermanent(Boolean value) {
        StatePermanent = value;
        return this;
    }

    /**
     * Gets "Status of the message." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Message.Status getStatus() {
        return Status;
    }

    /**
     * Sets the specified value to "Status of the message." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Message setStatus(Message.Status value) {
        Status = value;
        return this;
    }

    public String toString() {
        return ((Message.class.getSimpleName()+"#")+ this.getID());
    }


    /**
     * Enumeration defining allowed values for "Status"(Status of the message.) MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
     * 
     */
    public static enum Status {


        /**
         * Value "unknown".
         * 
         */
        @EnumValue("unknown")
        UNKNOWN,

        /**
         * Value "queued".
         * 
         */
        @EnumValue("queued")
        QUEUED,

        /**
         * Value "sent".
         * 
         */
        @EnumValue("sent")
        SENT,

        /**
         * Value "opened".
         * 
         */
        @EnumValue("opened")
        OPENED,

        /**
         * Value "clicked".
         * 
         */
        @EnumValue("clicked")
        CLICKED,

        /**
         * Value "bounce".
         * 
         */
        @EnumValue("bounce")
        BOUNCE,

        /**
         * Value "spam".
         * 
         */
        @EnumValue("spam")
        SPAM,

        /**
         * Value "unsub".
         * 
         */
        @EnumValue("unsub")
        UNSUB,

        /**
         * Value "blocked".
         * 
         */
        @EnumValue("blocked")
        BLOCKED;

    }

}
