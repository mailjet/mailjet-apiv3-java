
package com.mailjet.api.model.v3.eventcallbackurl;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "eventcallbackurl" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class EventCallbackUrlProperty<DataType >
    extends MailJetResourceProperty<EventCallbackUrl, DataType>
{

    /**
     * API Key for which the callback URL is registered.
     * 
     */
    public final static EventCallbackUrlProperty<Long> APIKEYID = new EventCallbackUrlProperty<Long>("APIKeyID", Long.class);
    /**
     * Numerical event type.
     * 
     */
    public final static EventCallbackUrlProperty.Key<EventCallbackUrl.EventType> EVENTTYPE = new EventCallbackUrlProperty.Key<EventCallbackUrl.EventType>("EventType", EventCallbackUrl.EventType.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static EventCallbackUrlProperty.Key<Long> ID = new EventCallbackUrlProperty.Key<Long>("ID", Long.class);
    /**
     * Is this a backup URL ?.
     * 
     */
    public final static EventCallbackUrlProperty<Boolean> ISBACKUP = new EventCallbackUrlProperty<Boolean>("IsBackup", Boolean.class);
    /**
     * Status of the event.
     * 
     */
    public final static EventCallbackUrlProperty<EventCallbackUrl.Status> STATUS = new EventCallbackUrlProperty<EventCallbackUrl.Status>("Status", EventCallbackUrl.Status.class);
    /**
     * URL to use.
     * 
     */
    public final static EventCallbackUrlProperty<String> URL = new EventCallbackUrlProperty<String>("Url", String.class);
    /**
     * Event API version for which this URL is valid.
     * 
     */
    public final static EventCallbackUrlProperty<Short> VERSION = new EventCallbackUrlProperty<Short>("Version", Short.class);

    private EventCallbackUrlProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static EventCallbackUrlProperty<Object> ref(String name) {
        return new EventCallbackUrlProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<EventCallbackUrl, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
