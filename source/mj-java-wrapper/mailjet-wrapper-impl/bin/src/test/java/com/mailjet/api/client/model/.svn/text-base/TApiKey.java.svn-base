
package com.mailjet.api.client.model;

import java.util.Date;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Mailjet API Keys".
 * 
 * Automatically generated using the MailJet API metadata on Wed Nov 13 10:27:01 EET 2013.
 * 
 */
@Resource(name = "apikey", description = "Mailjet API Keys", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
}, uniquekey = "APIKey")
public final class TApiKey {

    @Component(name = "APIKey", type = "AnsiString", defaultValue = "", required = true, description = "The unique key for this API Key")
    private String APIKey;
    @Component(name = "CreatedAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp when object was created in database")
    private Date CreatedAt;
    @Component(name = "CustomStatus", type = "TCustomStatus", defaultValue = "undefined", required = false, description = "Status of this API Key")
    private TCustomStatus CustomStatus;
    @Component(name = "ExpiredAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp of API Key expiration. Zero if not expired.")
    private Date ExpiredAt;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object")
    private Long ID;
    @Component(name = "IsActive", type = "Boolean", defaultValue = "false", required = false, description = "Is this API Key active ?")
    private Boolean IsActive;
    @Component(name = "IsMaster", type = "Boolean", defaultValue = "false", required = false, description = "Is this API Key the master key for the user")
    private Boolean IsMaster;
    @Component(name = "IsSenderAllowed", type = "Boolean", defaultValue = "false", required = false, description = "Allow to set sender in mails.")
    private Boolean IsSenderAllowed;
    @Component(name = "LastUpdateAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp when object was last modified in database")
    private Date LastUpdateAt;
    @Component(name = "Name", type = "AnsiString", defaultValue = "", required = true, description = "User readable name for this API Key")
    private String Name;
    @Component(name = "Runlevel", type = "TRunLevel", defaultValue = "Normal", required = false, description = "Runlevel, used to indicate data is migrated and reduced performance is expected.")
    private TRunLevel Runlevel;
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<TApiKey>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<TApiKey>>(TApiKey.class, ResourceOperationTypes.Get);
    /**
     * API Operation "GetById".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<TApiKey>> GetById = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<TApiKey>>(TApiKey.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<TApiKey>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<TApiKey>>(TApiKey.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<TApiKey>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<TApiKey>>(TApiKey.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<TApiKey>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<TApiKey>>(TApiKey.class, ResourceOperationTypes.Delete);

    /**
     * Gets "The unique key for this API Key" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getAPIKey() {
        return APIKey;
    }

    /**
     * Sets the specified value to "The unique key for this API Key" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public TApiKey setAPIKey(final String value) {
        this.APIKey = value;
        return this;
    }

    /**
     * Gets "Timestamp when object was created in database" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getCreatedAt() {
        return CreatedAt;
    }

    /**
     * Sets the specified value to "Timestamp when object was created in database" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public TApiKey setCreatedAt(final Date value) {
        this.CreatedAt = value;
        return this;
    }

    /**
     * Gets "Status of this API Key" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public TCustomStatus getCustomStatus() {
        return CustomStatus;
    }

    /**
     * Sets the specified value to "Status of this API Key" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public TApiKey setCustomStatus(final TCustomStatus value) {
        this.CustomStatus = value;
        return this;
    }

    /**
     * Gets "Timestamp of API Key expiration. Zero if not expired." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getExpiredAt() {
        return ExpiredAt;
    }

    /**
     * Sets the specified value to "Timestamp of API Key expiration. Zero if not expired." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public TApiKey setExpiredAt(final Date value) {
        this.ExpiredAt = value;
        return this;
    }

    /**
     * Gets "Unique numerical ID for this object" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getID() {
        return ID;
    }

    /**
     * Sets the specified value to "Unique numerical ID for this object" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public TApiKey setID(final Long value) {
        this.ID = value;
        return this;
    }

    /**
     * Gets "Is this API Key active ?" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsActive() {
        return IsActive;
    }

    /**
     * Sets the specified value to "Is this API Key active ?" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public TApiKey setIsActive(final Boolean value) {
        this.IsActive = value;
        return this;
    }

    /**
     * Gets "Is this API Key the master key for the user" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsMaster() {
        return IsMaster;
    }

    /**
     * Sets the specified value to "Is this API Key the master key for the user" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public TApiKey setIsMaster(final Boolean value) {
        this.IsMaster = value;
        return this;
    }

    /**
     * Gets "Allow to set sender in mails." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsSenderAllowed() {
        return IsSenderAllowed;
    }

    /**
     * Sets the specified value to "Allow to set sender in mails." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public TApiKey setIsSenderAllowed(final Boolean value) {
        this.IsSenderAllowed = value;
        return this;
    }

    /**
     * Gets "Timestamp when object was last modified in database" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getLastUpdateAt() {
        return LastUpdateAt;
    }

    /**
     * Sets the specified value to "Timestamp when object was last modified in database" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public TApiKey setLastUpdateAt(final Date value) {
        this.LastUpdateAt = value;
        return this;
    }

    /**
     * Gets "User readable name for this API Key" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the specified value to "User readable name for this API Key" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public TApiKey setName(final String value) {
        this.Name = value;
        return this;
    }

    /**
     * Gets "Runlevel, used to indicate data is migrated and reduced performance is expected." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public TRunLevel getRunlevel() {
        return Runlevel;
    }

    /**
     * Sets the specified value to "Runlevel, used to indicate data is migrated and reduced performance is expected." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public TApiKey setRunlevel(final TRunLevel value) {
        this.Runlevel = value;
        return this;
    }

    public String toString() {
        return ((TApiKey.class.getSimpleName()+"#")+ this.getID());
    }

}
