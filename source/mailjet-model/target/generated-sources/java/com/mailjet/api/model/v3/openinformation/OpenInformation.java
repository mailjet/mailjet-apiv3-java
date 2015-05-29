
package com.mailjet.api.model.v3.openinformation;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Retrieve informations about messages opened at least once by their recipients.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "openinformation", description = "Retrieve informations about messages opened at least once by their recipients.", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class OpenInformation {

    @Component(name = "ArrivedAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp indicating when the message arrived.")
    private Date ArrivedAt;
    @Component(name = "CampaignID", type = "TCampaign", defaultValue = "", required = true, description = "Reference to Campaign in which message is sent.")
    private Long CampaignID;
    @Component(name = "ContactID", type = "TContact", defaultValue = "", required = true, description = "Reference to contact to which message was sent.")
    private Long ContactID;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "MessageID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long MessageID;
    @Component(name = "OpenedAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp of when then message was opened by the reader for the first time.")
    private Date OpenedAt;
    @Component(name = "UserAgentID", type = "TUserAgent", defaultValue = "", required = false, description = "Reference to canonicalized User Agent based on UserAgentFull")
    private Long UserAgentID;
    @Component(name = "UserAgentFull", type = "AnsiString", defaultValue = "", required = false, description = "Original User Agent string used to view this message.")
    private String UserAgentFull;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<OpenInformation>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<OpenInformation>>(OpenInformation.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<OpenInformation>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<OpenInformation>>(OpenInformation.class, ResourceOperationTypes.GetById);

    /**
     * Gets "Timestamp indicating when the message arrived." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getArrivedAt() {
        return ArrivedAt;
    }

    /**
     * Sets the specified value to "Timestamp indicating when the message arrived." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public OpenInformation setArrivedAt(Date value) {
        ArrivedAt = value;
        return this;
    }

    /**
     * Gets "Reference to Campaign in which message is sent." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getCampaignID() {
        return CampaignID;
    }

    /**
     * Sets the specified value to "Reference to Campaign in which message is sent." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public OpenInformation setCampaignID(Long value) {
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
    public OpenInformation setContactID(Long value) {
        ContactID = value;
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
    public OpenInformation setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Unique numerical ID for this object." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getMessageID() {
        return MessageID;
    }

    /**
     * Sets the specified value to "Unique numerical ID for this object." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public OpenInformation setMessageID(Long value) {
        MessageID = value;
        return this;
    }

    /**
     * Gets "Timestamp of when then message was opened by the reader for the first time." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getOpenedAt() {
        return OpenedAt;
    }

    /**
     * Sets the specified value to "Timestamp of when then message was opened by the reader for the first time." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public OpenInformation setOpenedAt(Date value) {
        OpenedAt = value;
        return this;
    }

    /**
     * Gets "Reference to canonicalized User Agent based on UserAgentFull" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getUserAgentID() {
        return UserAgentID;
    }

    /**
     * Sets the specified value to "Reference to canonicalized User Agent based on UserAgentFull" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public OpenInformation setUserAgentID(Long value) {
        UserAgentID = value;
        return this;
    }

    /**
     * Gets "Original User Agent string used to view this message." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getUserAgentFull() {
        return UserAgentFull;
    }

    /**
     * Sets the specified value to "Original User Agent string used to view this message." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public OpenInformation setUserAgentFull(String value) {
        UserAgentFull = value;
        return this;
    }

    public String toString() {
        return ((OpenInformation.class.getSimpleName()+"#")+ this.getID());
    }

}
