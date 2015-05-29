
package com.mailjet.api.model.v3.user;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "User account definition for Mailjet.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "user", description = "User account definition for Mailjet.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put
}, uniquekey = "Email")
public final class User {

    @Component(name = "ACL", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String ACL;
    @Component(name = "CreatedAt", type = "TRFC3339DateTime", defaultValue = "Current time", required = false, description = "Timestamp when object was created in database.")
    private Date CreatedAt;
    @Component(name = "Email", type = "TEmail", defaultValue = "", required = false, description = "Email address of user.")
    private String Email;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "LastIp", type = "AnsiString", defaultValue = "The same as FirstIP", required = true, description = "IP address of last contact from user.")
    private String LastIp;
    @Component(name = "LastLoginAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp when user last logged in.")
    private Date LastLoginAt;
    @Component(name = "Locale", type = "AnsiString", defaultValue = "en_US", required = false, description = "Locale in which the information in this record is recorded.")
    private String Locale;
    @Component(name = "MaxAllowedAPIKeys", type = "LongInt", defaultValue = "5", required = false, description = "Maximum number of API keys the user is allowed to have.")
    private Integer MaxAllowedAPIKeys;
    @Component(name = "Timezone", type = "AnsiString", defaultValue = "etc/UTC", required = false, description = "Timezone for this user.")
    private String Timezone;
    @Component(name = "Username", type = "AnsiString", defaultValue = "Undefined", required = true, description = "User name.")
    private String Username;
    @Component(name = "WarnedRatelimitAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp when user was last warned about hitting his rate limit.")
    private Date WarnedRatelimitAt;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<User>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<User>>(User.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<User>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<User>>(User.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<User>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<User>>(User.class, ResourceOperationTypes.Put);

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
    public User setACL(String value) {
        ACL = value;
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
    public User setCreatedAt(Date value) {
        CreatedAt = value;
        return this;
    }

    /**
     * Gets "Email address of user." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Sets the specified value to "Email address of user." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public User setEmail(String value) {
        Email = value;
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
    public User setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "IP address of last contact from user." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getLastIp() {
        return LastIp;
    }

    /**
     * Sets the specified value to "IP address of last contact from user." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public User setLastIp(String value) {
        LastIp = value;
        return this;
    }

    /**
     * Gets "Timestamp when user last logged in." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getLastLoginAt() {
        return LastLoginAt;
    }

    /**
     * Sets the specified value to "Timestamp when user last logged in." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public User setLastLoginAt(Date value) {
        LastLoginAt = value;
        return this;
    }

    /**
     * Gets "Locale in which the information in this record is recorded." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getLocale() {
        return Locale;
    }

    /**
     * Sets the specified value to "Locale in which the information in this record is recorded." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public User setLocale(String value) {
        Locale = value;
        return this;
    }

    /**
     * Gets "Maximum number of API keys the user is allowed to have." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getMaxAllowedAPIKeys() {
        return MaxAllowedAPIKeys;
    }

    /**
     * Sets the specified value to "Maximum number of API keys the user is allowed to have." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public User setMaxAllowedAPIKeys(Integer value) {
        MaxAllowedAPIKeys = value;
        return this;
    }

    /**
     * Gets "Timezone for this user." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getTimezone() {
        return Timezone;
    }

    /**
     * Sets the specified value to "Timezone for this user." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public User setTimezone(String value) {
        Timezone = value;
        return this;
    }

    /**
     * Gets "User name." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getUsername() {
        return Username;
    }

    /**
     * Sets the specified value to "User name." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public User setUsername(String value) {
        Username = value;
        return this;
    }

    /**
     * Gets "Timestamp when user was last warned about hitting his rate limit." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getWarnedRatelimitAt() {
        return WarnedRatelimitAt;
    }

    /**
     * Sets the specified value to "Timestamp when user was last warned about hitting his rate limit." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public User setWarnedRatelimitAt(Date value) {
        WarnedRatelimitAt = value;
        return this;
    }

    public String toString() {
        return ((User.class.getSimpleName()+"#")+ this.getID());
    }

}
