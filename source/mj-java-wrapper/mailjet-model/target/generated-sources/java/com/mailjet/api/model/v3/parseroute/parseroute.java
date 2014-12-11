
package com.mailjet.api.model.v3.parseroute;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "ParseRoute description".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "parseroute", description = "ParseRoute description", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
}, uniquekey = "Email")
public final class parseroute {

    @Component(name = "APIKey", type = "TAPIKey", defaultValue = "", required = true, description = "Reference to an API key to whom this object belongs")
    private Long APIKeyID;
    @Component(name = "Email", type = "TEmail", defaultValue = "", required = true, description = "Email address")
    private String Email;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "")
    private Long ID;
    @Component(name = "Url", type = "AnsiString", defaultValue = "", required = true, description = "URL address")
    private String Url;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<parseroute>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<parseroute>>(parseroute.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<parseroute>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<parseroute>>(parseroute.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<parseroute>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<parseroute>>(parseroute.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<parseroute>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<parseroute>>(parseroute.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<parseroute>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<parseroute>>(parseroute.class, ResourceOperationTypes.Delete);

    /**
     * Gets "Reference to an API key to whom this object belongs" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getAPIKeyID() {
        return APIKeyID;
    }

    /**
     * Sets the specified value to "Reference to an API key to whom this object belongs" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public parseroute setAPIKeyID(Long value) {
        APIKeyID = value;
        return this;
    }

    /**
     * Gets "Email address" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Sets the specified value to "Email address" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public parseroute setEmail(String value) {
        Email = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getID() {
        return ID;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public parseroute setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "URL address" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getUrl() {
        return Url;
    }

    /**
     * Sets the specified value to "URL address" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public parseroute setUrl(String value) {
        Url = value;
        return this;
    }

    public String toString() {
        return ((parseroute.class.getSimpleName()+"#")+ this.getID());
    }

}
