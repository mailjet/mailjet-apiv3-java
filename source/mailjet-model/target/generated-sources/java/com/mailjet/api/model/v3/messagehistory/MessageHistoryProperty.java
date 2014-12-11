
package com.mailjet.api.model.v3.messagehistory;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;
import com.mailjet.api.model.v3.customtypes.MessageEventType;


/**
 * Class defining property constants for "messagehistory" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class MessageHistoryProperty<DataType >
    extends MailJetResourceProperty<MessageHistory, DataType>
{

    /**
     * 
     * 
     */
    public final static MessageHistoryProperty<String> COMMENT = new MessageHistoryProperty<String>("Comment", String.class);
    /**
     * Timestamp when event was registered.
     * 
     */
    public final static MessageHistoryProperty<Long> EVENTAT = new MessageHistoryProperty<Long>("EventAt", Long.class);
    /**
     * Type of event.
     * 
     */
    public final static MessageHistoryProperty<MessageEventType> EVENTTYPE = new MessageHistoryProperty<MessageEventType>("EventType", MessageEventType.class);
    /**
     * Useragent used to trigger the event (when applicable).
     * 
     */
    public final static MessageHistoryProperty<String> USERAGENT = new MessageHistoryProperty<String>("Useragent", String.class);

    private MessageHistoryProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static MessageHistoryProperty<Object> ref(String name) {
        return new MessageHistoryProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<MessageHistory, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
