
package com.mailjet.api.model.v3.apikeyaccess;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Access rights description on API keys for subaccounts/users.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "apikeyaccess", description = "Access rights description on API keys for subaccounts/users.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
})
public final class ApiKeyAccess {

    @Component(name = "AllowedAccess", type = "AnsiString", defaultValue = "", required = false, description = "JSON describing access rights.")
    private String AllowedAccess;
    @Component(name = "APIKeyID", type = "TAPIKey", defaultValue = "", required = true, description = "API key for which the rights are descibed.")
    private Long APIKeyID;
    @Component(name = "CreatedAt", type = "TRFC3339DateTime", defaultValue = "Current time", required = false, description = "Timestamp when object was created in database.")
    private Date CreatedAt;
    @Component(name = "CustomName", type = "AnsiString", defaultValue = "", required = false, description = "Custom name for this set of rights.")
    private String CustomName;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "IsActive", type = "Boolean", defaultValue = "false", required = false, description = "Is this object active (rights enforced) or not.")
    private Boolean IsActive;
    @Component(name = "LastActivityAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp of last registered activity for this API Key.")
    private Date LastActivityAt;
    @Component(name = "RealUserID", type = "TUser", defaultValue = "", required = false, description = "Reference to Real user.")
    private Long RealUserID;
    @Component(name = "SubaccountID", type = "TSubAccount", defaultValue = "", required = false, description = "Reference to subaccount.")
    private Long SubaccountID;
    @Component(name = "UserID", type = "TUser", defaultValue = "", required = true, description = "Reference to user for whom access is described.")
    private Long UserID;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ApiKeyAccess>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ApiKeyAccess>>(ApiKeyAccess.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ApiKeyAccess>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ApiKeyAccess>>(ApiKeyAccess.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<ApiKeyAccess>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<ApiKeyAccess>>(ApiKeyAccess.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ApiKeyAccess>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ApiKeyAccess>>(ApiKeyAccess.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<ApiKeyAccess>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<ApiKeyAccess>>(ApiKeyAccess.class, ResourceOperationTypes.Delete);

    /**
     * Gets "JSON describing access rights." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getAllowedAccess() {
        return AllowedAccess;
    }

    /**
     * Sets the specified value to "JSON describing access rights." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyAccess setAllowedAccess(String value) {
        AllowedAccess = value;
        return this;
    }

    /**
     * Gets "API key for which the rights are descibed." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getAPIKeyID() {
        return APIKeyID;
    }

    /**
     * Sets the specified value to "API key for which the rights are descibed." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyAccess setAPIKeyID(Long value) {
        APIKeyID = value;
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
    public ApiKeyAccess setCreatedAt(Date value) {
        CreatedAt = value;
        return this;
    }

    /**
     * Gets "Custom name for this set of rights." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getCustomName() {
        return CustomName;
    }

    /**
     * Sets the specified value to "Custom name for this set of rights." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyAccess setCustomName(String value) {
        CustomName = value;
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
    public ApiKeyAccess setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Is this object active (rights enforced) or not." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsActive() {
        return IsActive;
    }

    /**
     * Sets the specified value to "Is this object active (rights enforced) or not." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyAccess setIsActive(Boolean value) {
        IsActive = value;
        return this;
    }

    /**
     * Gets "Timestamp of last registered activity for this API Key." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getLastActivityAt() {
        return LastActivityAt;
    }

    /**
     * Sets the specified value to "Timestamp of last registered activity for this API Key." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyAccess setLastActivityAt(Date value) {
        LastActivityAt = value;
        return this;
    }

    /**
     * Gets "Reference to Real user." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getRealUserID() {
        return RealUserID;
    }

    /**
     * Sets the specified value to "Reference to Real user." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyAccess setRealUserID(Long value) {
        RealUserID = value;
        return this;
    }

    /**
     * Gets "Reference to subaccount." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getSubaccountID() {
        return SubaccountID;
    }

    /**
     * Sets the specified value to "Reference to subaccount." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyAccess setSubaccountID(Long value) {
        SubaccountID = value;
        return this;
    }

    /**
     * Gets "Reference to user for whom access is described." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getUserID() {
        return UserID;
    }

    /**
     * Sets the specified value to "Reference to user for whom access is described." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiKeyAccess setUserID(Long value) {
        UserID = value;
        return this;
    }

    public String toString() {
        return ((ApiKeyAccess.class.getSimpleName()+"#")+ this.getID());
    }

}
