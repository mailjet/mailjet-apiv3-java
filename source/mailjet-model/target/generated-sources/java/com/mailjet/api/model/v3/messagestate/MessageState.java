
package com.mailjet.api.model.v3.messagestate;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.EnumValue;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Message state reference.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "messagestate", description = "Message state reference.", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class MessageState {

    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "RelatedTo", type = "AnsiString", defaultValue = "", required = false, description = "Reason for this state.")
    private MessageState.RelatedTo RelatedTo;
    @Component(name = "State", type = "AnsiString", defaultValue = "", required = true, description = "Description of the message state.")
    private String State;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<MessageState>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<MessageState>>(MessageState.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<MessageState>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<MessageState>>(MessageState.class, ResourceOperationTypes.GetById);

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
    public MessageState setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Reason for this state." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public MessageState.RelatedTo getRelatedTo() {
        return RelatedTo;
    }

    /**
     * Sets the specified value to "Reason for this state." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageState setRelatedTo(MessageState.RelatedTo value) {
        RelatedTo = value;
        return this;
    }

    /**
     * Gets "Description of the message state." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getState() {
        return State;
    }

    /**
     * Sets the specified value to "Description of the message state." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageState setState(String value) {
        State = value;
        return this;
    }

    public String toString() {
        return ((MessageState.class.getSimpleName()+"#")+ this.getID());
    }


    /**
     * Enumeration defining allowed values for "RelatedTo"(Reason for this state.) MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
     * 
     */
    public static enum RelatedTo {


        /**
         * Value "recipient".
         * 
         */
        @EnumValue("recipient")
        RECIPIENT,

        /**
         * Value "domain".
         * 
         */
        @EnumValue("domain")
        DOMAIN,

        /**
         * Value "spam".
         * 
         */
        @EnumValue("spam")
        SPAM,

        /**
         * Value "system".
         * 
         */
        @EnumValue("system")
        SYSTEM,

        /**
         * Value "mailjet".
         * 
         */
        @EnumValue("mailjet")
        MAILJET;

    }

}
