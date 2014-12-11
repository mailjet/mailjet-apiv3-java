
package com.mailjet.api.model.v3.eventcallbackurl;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.EnumValue;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Manage event-driven callback URLs, also called webhooks, used by the Mailjet platform when a specific action is triggered".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "eventcallbackurl", description = "Manage event-driven callback URLs, also called webhooks, used by the Mailjet platform when a specific action is triggered", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
}, uniquekey = "EventType|Backup")
public final class EventCallbackUrl {

    @Component(name = "APIKey", type = "TAPIKey", defaultValue = "", required = true, description = "API Key for which the callback URL is registered.")
    private Long APIKeyID;
    @Component(name = "EventType", type = "AnsiString", defaultValue = "", required = false, description = "Numerical event type.")
    private EventCallbackUrl.EventType EventType;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "IsBackup", type = "Boolean", defaultValue = "false", required = false, description = "Is this a backup URL ?.")
    private Boolean IsBackup;
    @Component(name = "Status", type = "AnsiString", defaultValue = "1", required = false, description = "Status of the event.")
    private EventCallbackUrl.Status Status;
    @Component(name = "Url", type = "AnsiString", defaultValue = "", required = true, description = "URL to use.")
    private String Url;
    @Component(name = "Version", type = "SmallInt", defaultValue = "1", required = false, description = "Event API version for which this URL is valid.")
    private Short Version;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<EventCallbackUrl>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<EventCallbackUrl>>(EventCallbackUrl.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<EventCallbackUrl>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<EventCallbackUrl>>(EventCallbackUrl.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<EventCallbackUrl>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<EventCallbackUrl>>(EventCallbackUrl.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<EventCallbackUrl>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<EventCallbackUrl>>(EventCallbackUrl.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<EventCallbackUrl>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<EventCallbackUrl>>(EventCallbackUrl.class, ResourceOperationTypes.Delete);

    /**
     * Gets "API Key for which the callback URL is registered." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getAPIKeyID() {
        return APIKeyID;
    }

    /**
     * Sets the specified value to "API Key for which the callback URL is registered." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public EventCallbackUrl setAPIKeyID(Long value) {
        APIKeyID = value;
        return this;
    }

    /**
     * Gets "Numerical event type." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public EventCallbackUrl.EventType getEventType() {
        return EventType;
    }

    /**
     * Sets the specified value to "Numerical event type." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public EventCallbackUrl setEventType(EventCallbackUrl.EventType value) {
        EventType = value;
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
    public EventCallbackUrl setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Is this a backup URL ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsBackup() {
        return IsBackup;
    }

    /**
     * Sets the specified value to "Is this a backup URL ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public EventCallbackUrl setIsBackup(Boolean value) {
        IsBackup = value;
        return this;
    }

    /**
     * Gets "Status of the event." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public EventCallbackUrl.Status getStatus() {
        return Status;
    }

    /**
     * Sets the specified value to "Status of the event." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public EventCallbackUrl setStatus(EventCallbackUrl.Status value) {
        Status = value;
        return this;
    }

    /**
     * Gets "URL to use." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getUrl() {
        return Url;
    }

    /**
     * Sets the specified value to "URL to use." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public EventCallbackUrl setUrl(String value) {
        Url = value;
        return this;
    }

    /**
     * Gets "Event API version for which this URL is valid." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Short getVersion() {
        return Version;
    }

    /**
     * Sets the specified value to "Event API version for which this URL is valid." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public EventCallbackUrl setVersion(Short value) {
        Version = value;
        return this;
    }

    public String toString() {
        return ((EventCallbackUrl.class.getSimpleName()+"#")+ this.getID());
    }


    /**
     * Enumeration defining allowed values for "EventType"(Numerical event type.) MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
     * 
     */
    public static enum EventType {


        /**
         * Value "open".
         * 
         */
        @EnumValue("open")
        OPEN,

        /**
         * Value "click".
         * 
         */
        @EnumValue("click")
        CLICK,

        /**
         * Value "bounce".
         * 
         */
        @EnumValue("bounce")
        BOUNCE,

        /**
         * Value "spam".
         * 
         */
        @EnumValue("spam")
        SPAM,

        /**
         * Value "blocked".
         * 
         */
        @EnumValue("blocked")
        BLOCKED,

        /**
         * Value "unsub".
         * 
         */
        @EnumValue("unsub")
        UNSUB,

        /**
         * Value "typofix".
         * 
         */
        @EnumValue("typofix")
        TYPOFIX,

        /**
         * Value "sent".
         * 
         */
        @EnumValue("sent")
        SENT,

        /**
         * Value "parseapi".
         * 
         */
        @EnumValue("parseapi")
        PARSEAPI,

        /**
         * Value "newsender".
         * 
         */
        @EnumValue("newsender")
        NEWSENDER,

        /**
         * Value "newsenderautovalid".
         * 
         */
        @EnumValue("newsenderautovalid")
        NEWSENDERAUTOVALID;

    }


    /**
     * Enumeration defining allowed values for "Status"(Status of the event.) MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
     * 
     */
    public static enum Status {


        /**
         * Value "dead".
         * 
         */
        @EnumValue("dead")
        DEAD,

        /**
         * Value "alive".
         * 
         */
        @EnumValue("alive")
        ALIVE;

    }

}
