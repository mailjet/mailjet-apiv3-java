
package com.mailjet.api.model.v3.messagehistory;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;
import com.mailjet.api.model.v3.customtypes.MessageEventType;


/**
 * Class representing "Event history of a message.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "messagehistory", description = "Event history of a message.", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class MessageHistory {

    @Component(name = "Comment", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String Comment;
    @Component(name = "EventAt", type = "Int64", defaultValue = "", required = false, description = "Timestamp when event was registered.")
    private Long EventAt;
    @Component(name = "EventType", type = "TMessageEventType", defaultValue = "sent", required = false, description = "Type of event.")
    private MessageEventType EventType;
    @Component(name = "Useragent", type = "AnsiString", defaultValue = "", required = false, description = "Useragent used to trigger the event (when applicable).")
    private String Useragent;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<MessageHistory>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<MessageHistory>>(MessageHistory.class, ResourceOperationTypes.Get);

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getComment() {
        return Comment;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageHistory setComment(String value) {
        Comment = value;
        return this;
    }

    /**
     * Gets "Timestamp when event was registered." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getEventAt() {
        return EventAt;
    }

    /**
     * Sets the specified value to "Timestamp when event was registered." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageHistory setEventAt(Long value) {
        EventAt = value;
        return this;
    }

    /**
     * Gets "Type of event." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public MessageEventType getEventType() {
        return EventType;
    }

    /**
     * Sets the specified value to "Type of event." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageHistory setEventType(MessageEventType value) {
        EventType = value;
        return this;
    }

    /**
     * Gets "Useragent used to trigger the event (when applicable)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getUseragent() {
        return Useragent;
    }

    /**
     * Sets the specified value to "Useragent used to trigger the event (when applicable)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MessageHistory setUseragent(String value) {
        Useragent = value;
        return this;
    }

}
