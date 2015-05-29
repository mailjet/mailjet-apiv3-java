
package com.mailjet.api.model.v3.messagesentstatistics;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "API Key Statistical campaign/message data.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "messagesentstatistics", description = "API Key Statistical campaign/message data.", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class MessageSentStatistics {

    @Component(name = "ArrivalTs", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "When did the message arrive at Mailjet.")
    private Date ArrivalTs;
    @Component(name = "Blocked", type = "Boolean", defaultValue = "false", required = false, description = "Was the message blocked ?.")
    private Boolean Blocked;
    @Component(name = "Bounce", type = "Boolean", defaultValue = "false", required = false, description = "Has the message bounced ?.")
    private Boolean Bounce;
    @Component(name = "BounceDate", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "")
    private Date BounceDate;
    @Component(name = "BounceReason", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String BounceReason;
    @Component(name = "CampaignID", type = "TCampaign", defaultValue = "", required = true, description = "reference to the Campaign to which message belongs.")
    private Long CampaignID;
    @Component(name = "Click", type = "Boolean", defaultValue = "false", required = false, description = "Was a click registered for this message ?.")
    private Boolean Click;
    @Component(name = "CntRecipients", type = "Int64", defaultValue = "", required = false, description = "Number of recipients for this campaign.")
    private Long CntRecipients;
    @Component(name = "ComplaintDate", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "")
    private Date ComplaintDate;
    @Component(name = "ContactID", type = "TContact", defaultValue = "", required = true, description = "Reference to contact to which message was sent.")
    private Long ContactID;
    @Component(name = "Details", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String Details;
    @Component(name = "FBLSource", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String FBLSource;
    @Component(name = "MessageID", type = "Int64", defaultValue = "", required = false, description = "Only retrieve statistics for the selected message")
    private Long MessageID;
    @Component(name = "Open", type = "Boolean", defaultValue = "false", required = false, description = "Was the message opened ?.")
    private Boolean Open;
    @Component(name = "Queued", type = "Boolean", defaultValue = "false", required = false, description = "Is the message still in the queue ?.")
    private Boolean Queued;
    @Component(name = "Sent", type = "Boolean", defaultValue = "false", required = false, description = "Was the message sent ?.")
    private Boolean Sent;
    @Component(name = "Spam", type = "Boolean", defaultValue = "false", required = false, description = "Was a spam complaint registered for this message ?.")
    private Boolean Spam;
    @Component(name = "StateID", type = "TMessageState", defaultValue = "", required = true, description = "Current state of the message.")
    private Long StateID;
    @Component(name = "StatePermanent", type = "Boolean", defaultValue = "false", required = false, description = "Is the current state of the message permanent ?.")
    private Boolean StatePermanent;
    @Component(name = "Status", type = "AnsiString", defaultValue = "", required = false, description = "Current status of the message.")
    private String Status;
    @Component(name = "ToEmail", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String ToEmail;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<MessageSentStatistics>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<MessageSentStatistics>>(MessageSentStatistics.class, ResourceOperationTypes.Get);

    /**
     * Gets "When did the message arrive at Mailjet." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getArrivalTs() {
        return ArrivalTs;
    }

    /**
     * Sets the specified value to "When did the message arrive at Mailjet." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setArrivalTs(Date value) {
        ArrivalTs = value;
        return this;
    }

    /**
     * Gets "Was the message blocked ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getBlocked() {
        return Blocked;
    }

    /**
     * Sets the specified value to "Was the message blocked ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setBlocked(Boolean value) {
        Blocked = value;
        return this;
    }

    /**
     * Gets "Has the message bounced ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getBounce() {
        return Bounce;
    }

    /**
     * Sets the specified value to "Has the message bounced ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setBounce(Boolean value) {
        Bounce = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getBounceDate() {
        return BounceDate;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setBounceDate(Date value) {
        BounceDate = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getBounceReason() {
        return BounceReason;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setBounceReason(String value) {
        BounceReason = value;
        return this;
    }

    /**
     * Gets "reference to the Campaign to which message belongs." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getCampaignID() {
        return CampaignID;
    }

    /**
     * Sets the specified value to "reference to the Campaign to which message belongs." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setCampaignID(Long value) {
        CampaignID = value;
        return this;
    }

    /**
     * Gets "Was a click registered for this message ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getClick() {
        return Click;
    }

    /**
     * Sets the specified value to "Was a click registered for this message ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setClick(Boolean value) {
        Click = value;
        return this;
    }

    /**
     * Gets "Number of recipients for this campaign." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getCntRecipients() {
        return CntRecipients;
    }

    /**
     * Sets the specified value to "Number of recipients for this campaign." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setCntRecipients(Long value) {
        CntRecipients = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getComplaintDate() {
        return ComplaintDate;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setComplaintDate(Date value) {
        ComplaintDate = value;
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
    public MessageSentStatistics setContactID(Long value) {
        ContactID = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getDetails() {
        return Details;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setDetails(String value) {
        Details = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getFBLSource() {
        return FBLSource;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setFBLSource(String value) {
        FBLSource = value;
        return this;
    }

    /**
     * Gets "Only retrieve statistics for the selected message" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getMessageID() {
        return MessageID;
    }

    /**
     * Sets the specified value to "Only retrieve statistics for the selected message" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setMessageID(Long value) {
        MessageID = value;
        return this;
    }

    /**
     * Gets "Was the message opened ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getOpen() {
        return Open;
    }

    /**
     * Sets the specified value to "Was the message opened ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setOpen(Boolean value) {
        Open = value;
        return this;
    }

    /**
     * Gets "Is the message still in the queue ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getQueued() {
        return Queued;
    }

    /**
     * Sets the specified value to "Is the message still in the queue ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setQueued(Boolean value) {
        Queued = value;
        return this;
    }

    /**
     * Gets "Was the message sent ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getSent() {
        return Sent;
    }

    /**
     * Sets the specified value to "Was the message sent ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setSent(Boolean value) {
        Sent = value;
        return this;
    }

    /**
     * Gets "Was a spam complaint registered for this message ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getSpam() {
        return Spam;
    }

    /**
     * Sets the specified value to "Was a spam complaint registered for this message ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setSpam(Boolean value) {
        Spam = value;
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
    public MessageSentStatistics setStateID(Long value) {
        StateID = value;
        return this;
    }

    /**
     * Gets "Is the current state of the message permanent ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getStatePermanent() {
        return StatePermanent;
    }

    /**
     * Sets the specified value to "Is the current state of the message permanent ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setStatePermanent(Boolean value) {
        StatePermanent = value;
        return this;
    }

    /**
     * Gets "Current status of the message." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getStatus() {
        return Status;
    }

    /**
     * Sets the specified value to "Current status of the message." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setStatus(String value) {
        Status = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getToEmail() {
        return ToEmail;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageSentStatistics setToEmail(String value) {
        ToEmail = value;
        return this;
    }

}
