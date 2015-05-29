
package com.mailjet.api.model.v3.eventcallbackurl;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "eventcallbackurl" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class EventCallbackUrlFilter<DataType >
    extends MailJetResourceFilter<EventCallbackUrl, DataType>
{

    /**
     * Only retrieve EventcallbackUrl resources for which APIKey ID equals the specified value.
     * 
     */
    public final static EventCallbackUrlFilter<Long> APIKEY = new EventCallbackUrlFilter<Long>("APIKey", Long.class);
    /**
     * Retrieve only backup callback URLs.
     * 
     */
    public final static EventCallbackUrlFilter<Boolean> BACKUP = new EventCallbackUrlFilter<Boolean>("Backup", Boolean.class);
    /**
     * Only retrieve eventcallbackurl resources for which EventType equals the specified value.
     * 
     */
    public final static EventCallbackUrlFilter<EventCallbackUrl.EventType> EVENTTYPE = new EventCallbackUrlFilter<EventCallbackUrl.EventType>("EventType", EventCallbackUrl.EventType.class);
    /**
     * Only retrieve eventcallbackurl resources for which Status equals the specified value.
     * 
     */
    public final static EventCallbackUrlFilter<EventCallbackUrl.Status> STATUS = new EventCallbackUrlFilter<EventCallbackUrl.Status>("Status", EventCallbackUrl.Status.class);
    /**
     * Only retrieve eventcallbackurl resources for which Version equals the specified value.
     * 
     */
    public final static EventCallbackUrlFilter<Short> VERSION = new EventCallbackUrlFilter<Short>("Version", Short.class);

    private EventCallbackUrlFilter(String name, Class<?> type) {
        super(name, type);
    }

}
