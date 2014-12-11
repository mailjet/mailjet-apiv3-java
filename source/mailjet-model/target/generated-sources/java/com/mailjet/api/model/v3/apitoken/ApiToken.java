
package com.mailjet.api.model.v3.apitoken;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.EnumValue;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Access token for API, used to give access to an API Key in conjunction with our IFrame API.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
@Resource(name = "apitoken", description = "Access token for API, used to give access to an API Key in conjunction with our IFrame API.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
}, uniquekey = "Token")
public final class ApiToken {

    @Component(name = "AllowedAccess", type = "AnsiString", defaultValue = "Full access", required = true, description = "Access rights of this token. Options are one or all the following: 'campaigns', 'contacts','reports', 'stats', 'preferences'.")
    private ApiToken.AllowedAccess AllowedAccess;
    @Component(name = "APIKey", type = "TAPIKey", defaultValue = "", required = true, description = "Reference to API Key to which this token belongs.")
    private Long APIKeyID;
    @Component(name = "CatchedIp", type = "AnsiString", defaultValue = "Caller's IP address", required = false, description = "Last registered IP address for this token.")
    private String CatchedIp;
    @Component(name = "CreatedAt", type = "TRFC3339DateTime", defaultValue = "Current time", required = false, description = "Timestamp when object was created in database.")
    private Date CreatedAt;
    @Component(name = "FirstUsedAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp of first use of this token.")
    private Date FirstUsedAt;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "IsActive", type = "Boolean", defaultValue = "false", required = false, description = "Is this token still active.")
    private Boolean IsActive;
    @Component(name = "Lang", type = "AnsiString", defaultValue = "", required = false, description = "Language (locale) for this token.")
    private String Lang;
    @Component(name = "LastUsedAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp of last use of this token.")
    private Date LastUsedAt;
    @Component(name = "SentData", type = "AnsiString", defaultValue = "", required = false, description = "Payload for this token.")
    private String SentData;
    @Component(name = "Timezone", type = "AnsiString", defaultValue = "", required = false, description = "Timezone to use for this token.")
    private String Timezone;
    @Component(name = "Token", type = "AnsiString", defaultValue = "Automatically generated value", required = false, description = "Unique identifier for this token, to be used by user.")
    private String Token;
    @Component(name = "TokenType", type = "AnsiString", defaultValue = "url", required = true, description = "Type of token: options are 'url','iframe','page'")
    private ApiToken.TokenType TokenType;
    @Component(name = "ValidFor", type = "LongInt", defaultValue = "", required = false, description = "Period during which token is considered valid.")
    private Integer ValidFor;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ApiToken>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ApiToken>>(ApiToken.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ApiToken>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ApiToken>>(ApiToken.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<ApiToken>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<ApiToken>>(ApiToken.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ApiToken>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ApiToken>>(ApiToken.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<ApiToken>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<ApiToken>>(ApiToken.class, ResourceOperationTypes.Delete);

    /**
     * Gets "Access rights of this token. Options are one or all the following: 'campaigns', 'contacts','reports', 'stats', 'preferences'." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public ApiToken.AllowedAccess getAllowedAccess() {
        return AllowedAccess;
    }

    /**
     * Sets the specified value to "Access rights of this token. Options are one or all the following: 'campaigns', 'contacts','reports', 'stats', 'preferences'." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiToken setAllowedAccess(ApiToken.AllowedAccess value) {
        AllowedAccess = value;
        return this;
    }

    /**
     * Gets "Reference to API Key to which this token belongs." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getAPIKeyID() {
        return APIKeyID;
    }

    /**
     * Sets the specified value to "Reference to API Key to which this token belongs." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiToken setAPIKeyID(Long value) {
        APIKeyID = value;
        return this;
    }

    /**
     * Gets "Last registered IP address for this token." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getCatchedIp() {
        return CatchedIp;
    }

    /**
     * Sets the specified value to "Last registered IP address for this token." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiToken setCatchedIp(String value) {
        CatchedIp = value;
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
    public ApiToken setCreatedAt(Date value) {
        CreatedAt = value;
        return this;
    }

    /**
     * Gets "Timestamp of first use of this token." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getFirstUsedAt() {
        return FirstUsedAt;
    }

    /**
     * Sets the specified value to "Timestamp of first use of this token." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiToken setFirstUsedAt(Date value) {
        FirstUsedAt = value;
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
    public ApiToken setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Is this token still active." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsActive() {
        return IsActive;
    }

    /**
     * Sets the specified value to "Is this token still active." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiToken setIsActive(Boolean value) {
        IsActive = value;
        return this;
    }

    /**
     * Gets "Language (locale) for this token." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getLang() {
        return Lang;
    }

    /**
     * Sets the specified value to "Language (locale) for this token." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiToken setLang(String value) {
        Lang = value;
        return this;
    }

    /**
     * Gets "Timestamp of last use of this token." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getLastUsedAt() {
        return LastUsedAt;
    }

    /**
     * Sets the specified value to "Timestamp of last use of this token." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiToken setLastUsedAt(Date value) {
        LastUsedAt = value;
        return this;
    }

    /**
     * Gets "Payload for this token." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getSentData() {
        return SentData;
    }

    /**
     * Sets the specified value to "Payload for this token." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiToken setSentData(String value) {
        SentData = value;
        return this;
    }

    /**
     * Gets "Timezone to use for this token." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getTimezone() {
        return Timezone;
    }

    /**
     * Sets the specified value to "Timezone to use for this token." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiToken setTimezone(String value) {
        Timezone = value;
        return this;
    }

    /**
     * Gets "Unique identifier for this token, to be used by user." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getToken() {
        return Token;
    }

    /**
     * Sets the specified value to "Unique identifier for this token, to be used by user." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiToken setToken(String value) {
        Token = value;
        return this;
    }

    /**
     * Gets "Type of token: options are 'url','iframe','page'" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public ApiToken.TokenType getTokenType() {
        return TokenType;
    }

    /**
     * Sets the specified value to "Type of token: options are 'url','iframe','page'" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiToken setTokenType(ApiToken.TokenType value) {
        TokenType = value;
        return this;
    }

    /**
     * Gets "Period during which token is considered valid." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getValidFor() {
        return ValidFor;
    }

    /**
     * Sets the specified value to "Period during which token is considered valid." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ApiToken setValidFor(Integer value) {
        ValidFor = value;
        return this;
    }

    public String toString() {
        return ((ApiToken.class.getSimpleName()+"#")+ this.getID());
    }


    /**
     * Enumeration defining allowed values for "AllowedAccess"(Access rights of this token. Options are one or all the following: 'campaigns', 'contacts','reports', 'stats', 'preferences'.) MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
     * 
     */
    public static enum AllowedAccess {


        /**
         * Value "campaigns".
         * 
         */
        @EnumValue("campaigns")
        CAMPAIGNS,

        /**
         * Value "contacts".
         * 
         */
        @EnumValue("contacts")
        CONTACTS,

        /**
         * Value "reports".
         * 
         */
        @EnumValue("reports")
        REPORTS,

        /**
         * Value "stats".
         * 
         */
        @EnumValue("stats")
        STATS,

        /**
         * Value "preferences".
         * 
         */
        @EnumValue("preferences")
        PREFERENCES,

        /**
         * Value "property".
         * 
         */
        @EnumValue("property")
        PROPERTY,

        /**
         * Value "contact_filter".
         * 
         */
        @EnumValue("contact_filter")
        CONTACT_FILTER,

        /**
         * Value "account".
         * 
         */
        @EnumValue("account")
        ACCOUNT,

        /**
         * Value "pricing".
         * 
         */
        @EnumValue("pricing")
        PRICING;

    }


    /**
     * Enumeration defining allowed values for "TokenType"(Type of token: options are 'url','iframe','page') MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
     * 
     */
    public static enum TokenType {


        /**
         * Value "iframe".
         * 
         */
        @EnumValue("iframe")
        IFRAME,

        /**
         * Value "url".
         * 
         */
        @EnumValue("url")
        URL,

        /**
         * Value "page".
         * 
         */
        @EnumValue("page")
        PAGE;

    }

}
