
package com.mailjet.api.model.v3.trigger;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.EnumValue;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Triggers for outgoing events.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "trigger", description = "Triggers for outgoing events.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
})
public final class Trigger {

    @Component(name = "AddedTs", type = "Int64", defaultValue = "Current time", required = false, description = "Timestamp when object was written to the database.")
    private Long AddedTs;
    @Component(name = "APIKey", type = "LongInt", defaultValue = "", required = false, description = "Reference to API key to whom this trigger belongs.")
    private Integer APIKey;
    @Component(name = "Details", type = "AnsiString", defaultValue = "", required = false, description = "JSON with event details.")
    private String Details;
    @Component(name = "Event", type = "AnsiString", defaultValue = "", required = false, description = "Type of event.")
    private Trigger.Event Event;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "User", type = "LongInt", defaultValue = "", required = false, description = "Reference to user to whom this trigger belongs.")
    private Integer User;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Trigger>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Trigger>>(Trigger.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Trigger>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Trigger>>(Trigger.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Trigger>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Trigger>>(Trigger.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Trigger>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Trigger>>(Trigger.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<Trigger>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<Trigger>>(Trigger.class, ResourceOperationTypes.Delete);

    /**
     * Gets "Timestamp when object was written to the database." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getAddedTs() {
        return AddedTs;
    }

    /**
     * Sets the specified value to "Timestamp when object was written to the database." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Trigger setAddedTs(Long value) {
        AddedTs = value;
        return this;
    }

    /**
     * Gets "Reference to API key to whom this trigger belongs." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getAPIKey() {
        return APIKey;
    }

    /**
     * Sets the specified value to "Reference to API key to whom this trigger belongs." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Trigger setAPIKey(Integer value) {
        APIKey = value;
        return this;
    }

    /**
     * Gets "JSON with event details." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getDetails() {
        return Details;
    }

    /**
     * Sets the specified value to "JSON with event details." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Trigger setDetails(String value) {
        Details = value;
        return this;
    }

    /**
     * Gets "Type of event." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Trigger.Event getEvent() {
        return Event;
    }

    /**
     * Sets the specified value to "Type of event." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Trigger setEvent(Trigger.Event value) {
        Event = value;
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
    public Trigger setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Reference to user to whom this trigger belongs." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getUser() {
        return User;
    }

    /**
     * Sets the specified value to "Reference to user to whom this trigger belongs." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Trigger setUser(Integer value) {
        User = value;
        return this;
    }

    public String toString() {
        return ((Trigger.class.getSimpleName()+"#")+ this.getID());
    }


    /**
     * Enumeration defining allowed values for "Event"(Type of event.) MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
     * 
     */
    public static enum Event {


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

}
