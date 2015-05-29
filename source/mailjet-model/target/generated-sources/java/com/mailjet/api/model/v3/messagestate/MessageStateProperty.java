
package com.mailjet.api.model.v3.messagestate;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "messagestate" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class MessageStateProperty<DataType >
    extends MailJetResourceProperty<MessageState, DataType>
{

    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static MessageStateProperty.Key<Long> ID = new MessageStateProperty.Key<Long>("ID", Long.class);
    /**
     * Reason for this state.
     * 
     */
    public final static MessageStateProperty<MessageState.RelatedTo> RELATEDTO = new MessageStateProperty<MessageState.RelatedTo>("RelatedTo", MessageState.RelatedTo.class);
    /**
     * Description of the message state.
     * 
     */
    public final static MessageStateProperty<String> STATE = new MessageStateProperty<String>("State", String.class);

    private MessageStateProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static MessageStateProperty<Object> ref(String name) {
        return new MessageStateProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<MessageState, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
