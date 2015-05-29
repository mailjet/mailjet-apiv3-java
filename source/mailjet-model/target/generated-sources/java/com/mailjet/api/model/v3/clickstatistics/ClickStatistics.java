
package com.mailjet.api.model.v3.clickstatistics;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Click statistics for messages.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "clickstatistics", description = "Click statistics for messages.", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class ClickStatistics {

    @Component(name = "ClickedAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp of registration of click.")
    private Date ClickedAt;
    @Component(name = "ClickedDelay", type = "Int64", defaultValue = "", required = false, description = "Delay between registration of the click and sending of message.")
    private Long ClickedDelay;
    @Component(name = "ContactID", type = "TContact", defaultValue = "", required = true, description = "Contact for which click was registered.")
    private Long ContactID;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for the click event.")
    private Long ID;
    @Component(name = "MessageID", type = "TMessage", defaultValue = "", required = true, description = "Reference to Message for which click was registered.")
    private Long MessageID;
    @Component(name = "Url", type = "AnsiString", defaultValue = "", required = true, description = "URL that was clicked.")
    private String Url;
    @Component(name = "UserAgentID", type = "TUserAgent", defaultValue = "", required = true, description = "User agent that was used to open the URL.")
    private Long UserAgentID;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ClickStatistics>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ClickStatistics>>(ClickStatistics.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ClickStatistics>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ClickStatistics>>(ClickStatistics.class, ResourceOperationTypes.GetById);

    /**
     * Gets "Timestamp of registration of click." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getClickedAt() {
        return ClickedAt;
    }

    /**
     * Sets the specified value to "Timestamp of registration of click." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ClickStatistics setClickedAt(Date value) {
        ClickedAt = value;
        return this;
    }

    /**
     * Gets "Delay between registration of the click and sending of message." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getClickedDelay() {
        return ClickedDelay;
    }

    /**
     * Sets the specified value to "Delay between registration of the click and sending of message." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ClickStatistics setClickedDelay(Long value) {
        ClickedDelay = value;
        return this;
    }

    /**
     * Gets "Contact for which click was registered." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getContactID() {
        return ContactID;
    }

    /**
     * Sets the specified value to "Contact for which click was registered." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ClickStatistics setContactID(Long value) {
        ContactID = value;
        return this;
    }

    /**
     * Gets "Unique numerical ID for the click event." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getID() {
        return ID;
    }

    /**
     * Sets the specified value to "Unique numerical ID for the click event." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ClickStatistics setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Reference to Message for which click was registered." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getMessageID() {
        return MessageID;
    }

    /**
     * Sets the specified value to "Reference to Message for which click was registered." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ClickStatistics setMessageID(Long value) {
        MessageID = value;
        return this;
    }

    /**
     * Gets "URL that was clicked." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getUrl() {
        return Url;
    }

    /**
     * Sets the specified value to "URL that was clicked." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ClickStatistics setUrl(String value) {
        Url = value;
        return this;
    }

    /**
     * Gets "User agent that was used to open the URL." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getUserAgentID() {
        return UserAgentID;
    }

    /**
     * Sets the specified value to "User agent that was used to open the URL." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ClickStatistics setUserAgentID(Long value) {
        UserAgentID = value;
        return this;
    }

    public String toString() {
        return ((ClickStatistics.class.getSimpleName()+"#")+ this.getID());
    }

}
