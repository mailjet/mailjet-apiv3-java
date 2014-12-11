
package com.mailjet.api.model.v3.trigger;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "trigger" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class TriggerFilter<DataType >
    extends MailJetResourceFilter<Trigger, DataType>
{

    /**
     * Only retrieve trigger resources for which Event equals the specified value.
     * 
     */
    public final static TriggerFilter<Trigger.Event> EVENT = new TriggerFilter<Trigger.Event>("Event", Trigger.Event.class);
    /**
     * Only retrieve triggers where AddedTs is larger than the specified value.
     * 
     */
    public final static TriggerFilter<Long> MINADDEDTS = new TriggerFilter<Long>("MinAddedTS", Long.class);

    private TriggerFilter(String name, Class<?> type) {
        super(name, type);
    }

}
