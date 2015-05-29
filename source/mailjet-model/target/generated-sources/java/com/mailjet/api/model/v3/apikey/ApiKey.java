
package com.mailjet.api.model.v3.apikey;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;
import com.mailjet.api.model.v3.customtypes.RunLevel;


/**
 * Class representing "Manage your Mailjet API Keys. API keys are used as credentials to access the API and SMTP server.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "apikey", description = "Manage your Mailjet API Keys. API keys are used as credentials to access the API and SMTP server.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post
}, uniquekey = "APIKey")
public final class ApiKey {

    @Component(name = "ACL", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String ACL;
    @Component(name = "APIKey", type = "AnsiString", defaultValue = "Automatically generated value", required = true, description = "The unique key for this API Key.")
    private String APIKey;
    @Component(name = "CreatedAt", type = "TRFC3339DateTime", defaultValue = "Current time", required = false, description = "Timestamp when object was created in database.")
    private Date CreatedAt;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "IsActive", type = "Boolean", defaultValue = "false", required = false, description = "Is this API Key active ?.")
    private Boolean IsActive;
    @Component(name = "IsMaster", type = "Boolean", defaultValue = "false", required = false, description = "Is this API Key the master key for the user.")
    private Boolean IsMaster;
    @Component(name = "Name", type = "AnsiString", defaultValue = "", required = true, description = "User readable name for this API Key.")
    private String Name;
    @Component(name = "QuarantineValue", type = "LongInt", defaultValue = "", required = false, description = "")
    private Integer QuarantineValue;
    @Component(name = "Runlevel", type = "TRunLevel", defaultValue = "Normal", required = false, description = "Runlevel, used to indicate data is migrated and reduced performance is expected.")
    private RunLevel Runlevel;
    @Component(name = "SecretKey", type = "AnsiString", defaultValue = "Automatically generated value", required = false, description = "Secret key for this API Key (equivalent to password).")
    private String SecretKey;
    @Component(name = "TrackHost", type = "AnsiString", defaultValue = "r.mailjet.com", required = false, description = "Host to be used when tracking clicks, opens, unsub requests for this API Key.")
    private String TrackHost;
    @Component(name = "UserID", type = "Int64", defaultValue = "", required = false, description = "User ID for this API key")
    private Long UserID;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ApiKey>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ApiKey>>(ApiKey.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ApiKey>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ApiKey>>(ApiKey.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<ApiKey>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<ApiKey>>(ApiKey.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ApiKey>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ApiKey>>(ApiKey.class, ResourceOperationTypes.Post);

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getACL() {
        return ACL;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKey setACL(String value) {
        ACL = value;
        return this;
    }

    /**
     * Gets "The unique key for this API Key." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getAPIKey() {
        return APIKey;
    }

    /**
     * Sets the specified value to "The unique key for this API Key." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKey setAPIKey(String value) {
        APIKey = value;
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
    public ApiKey setCreatedAt(Date value) {
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
    public ApiKey setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Is this API Key active ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsActive() {
        return IsActive;
    }

    /**
     * Sets the specified value to "Is this API Key active ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKey setIsActive(Boolean value) {
        IsActive = value;
        return this;
    }

    /**
     * Gets "Is this API Key the master key for the user." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsMaster() {
        return IsMaster;
    }

    /**
     * Sets the specified value to "Is this API Key the master key for the user." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKey setIsMaster(Boolean value) {
        IsMaster = value;
        return this;
    }

    /**
     * Gets "User readable name for this API Key." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the specified value to "User readable name for this API Key." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKey setName(String value) {
        Name = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getQuarantineValue() {
        return QuarantineValue;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKey setQuarantineValue(Integer value) {
        QuarantineValue = value;
        return this;
    }

    /**
     * Gets "Runlevel, used to indicate data is migrated and reduced performance is expected." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public RunLevel getRunlevel() {
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
    public ApiKey setRunlevel(RunLevel value) {
        Runlevel = value;
        return this;
    }

    /**
     * Gets "Secret key for this API Key (equivalent to password)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getSecretKey() {
        return SecretKey;
    }

    /**
     * Sets the specified value to "Secret key for this API Key (equivalent to password)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKey setSecretKey(String value) {
        SecretKey = value;
        return this;
    }

    /**
     * Gets "Host to be used when tracking clicks, opens, unsub requests for this API Key." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getTrackHost() {
        return TrackHost;
    }

    /**
     * Sets the specified value to "Host to be used when tracking clicks, opens, unsub requests for this API Key." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKey setTrackHost(String value) {
        TrackHost = value;
        return this;
    }

    /**
     * Gets "User ID for this API key" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getUserID() {
        return UserID;
    }

    /**
     * Sets the specified value to "User ID for this API key" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKey setUserID(Long value) {
        UserID = value;
        return this;
    }

    public String toString() {
        return ((ApiKey.class.getSimpleName()+"#")+ this.getID());
    }

}
