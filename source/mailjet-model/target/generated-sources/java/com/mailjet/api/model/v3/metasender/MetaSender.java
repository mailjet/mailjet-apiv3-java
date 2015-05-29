
package com.mailjet.api.model.v3.metasender;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Management of domains used for sending messages. A domain or address must be registered and validated before being used. See the related Sender object if you wish to register a given e-mail address.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "metasender", description = "Management of domains used for sending messages. A domain or address must be registered and validated before being used. See the related Sender object if you wish to register a given e-mail address.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post
}, uniquekey = "Email")
public final class MetaSender {

    @Component(name = "CreatedAt", type = "TRFC3339DateTime", defaultValue = "Current time", required = false, description = "Timestamp when object was created in database.")
    private Date CreatedAt;
    @Component(name = "Description", type = "AnsiString", defaultValue = "", required = false, description = "User provided readable description of the domain.")
    private String Description;
    @Component(name = "Email", type = "TEmail", defaultValue = "", required = true, description = "The email address (lowercase), which may consist of a wildcard (*) in the local part.")
    private String Email;
    @Component(name = "Filename", type = "AnsiString", defaultValue = "Automatically generated value", required = false, description = "Filename expected on the domain name webserver, used for verifying the domain, in case of a catch-all address.")
    private String Filename;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "IsEnabled", type = "Boolean", defaultValue = "false", required = false, description = "Is the domain authorized to send mails through Mailjet.")
    private Boolean IsEnabled;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<MetaSender>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<MetaSender>>(MetaSender.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<MetaSender>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<MetaSender>>(MetaSender.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<MetaSender>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<MetaSender>>(MetaSender.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<MetaSender>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<MetaSender>>(MetaSender.class, ResourceOperationTypes.Post);

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
    public MetaSender setCreatedAt(Date value) {
        CreatedAt = value;
        return this;
    }

    /**
     * Gets "User provided readable description of the domain." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Sets the specified value to "User provided readable description of the domain." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MetaSender setDescription(String value) {
        Description = value;
        return this;
    }

    /**
     * Gets "The email address (lowercase), which may consist of a wildcard (*) in the local part." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Sets the specified value to "The email address (lowercase), which may consist of a wildcard (*) in the local part." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MetaSender setEmail(String value) {
        Email = value;
        return this;
    }

    /**
     * Gets "Filename expected on the domain name webserver, used for verifying the domain, in case of a catch-all address." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getFilename() {
        return Filename;
    }

    /**
     * Sets the specified value to "Filename expected on the domain name webserver, used for verifying the domain, in case of a catch-all address." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MetaSender setFilename(String value) {
        Filename = value;
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
    public MetaSender setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Is the domain authorized to send mails through Mailjet." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsEnabled() {
        return IsEnabled;
    }

    /**
     * Sets the specified value to "Is the domain authorized to send mails through Mailjet." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MetaSender setIsEnabled(Boolean value) {
        IsEnabled = value;
        return this;
    }

    public String toString() {
        return ((MetaSender.class.getSimpleName()+"#")+ this.getID());
    }

}
