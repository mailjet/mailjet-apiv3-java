
package com.mailjet.api.model.v3.trigger;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "trigger" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class TriggerProperty<DataType >
    extends MailJetResourceProperty<Trigger, DataType>
{

    /**
     * Timestamp when object was written to the database.
     * 
     */
    public final static TriggerProperty<Long> ADDEDTS = new TriggerProperty<Long>("AddedTs", Long.class);
    /**
     * Reference to API key to whom this trigger belongs.
     * 
     */
    public final static TriggerProperty<Integer> APIKEY = new TriggerProperty<Integer>("APIKey", Integer.class);
    /**
     * JSON with event details.
     * 
     */
    public final static TriggerProperty<String> DETAILS = new TriggerProperty<String>("Details", String.class);
    /**
     * Type of event.
     * 
     */
    public final static TriggerProperty<Trigger.Event> EVENT = new TriggerProperty<Trigger.Event>("Event", Trigger.Event.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static TriggerProperty.Key<Long> ID = new TriggerProperty.Key<Long>("ID", Long.class);
    /**
     * Reference to user to whom this trigger belongs.
     * 
     */
    public final static TriggerProperty<Integer> USER = new TriggerProperty<Integer>("User", Integer.class);

    private TriggerProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static TriggerProperty<Object> ref(String name) {
        return new TriggerProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<Trigger, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
