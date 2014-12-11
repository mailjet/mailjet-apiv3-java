
package com.mailjet.api.model.v3.message;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "message" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class MessageFilter<DataType >
    extends MailJetResourceFilter<Message, DataType>
{

    /**
     * Only retrieve message resources for which Campaign ID equals the specified value.
     * 
     */
    public final static MessageFilter<Long> CAMPAIGN = new MessageFilter<Long>("Campaign", Long.class);
    /**
     * Only retrieve message resources for which Contact ID equals the specified value.
     * 
     */
    public final static MessageFilter<Long> CONTACT = new MessageFilter<Long>("Contact", Long.class);
    /**
     * Only retrieve message resources for which Destination ID equals the specified value.
     * 
     */
    public final static MessageFilter<Long> DESTINATION = new MessageFilter<Long>("Destination", Long.class);
    /**
     * Only show messages with this state.
     * 
     */
    public final static MessageFilter<Long> MESSAGESTATE = new MessageFilter<Long>("MessageState", Long.class);
    /**
     * Only retrieve message resources for which PlanSubscription ID equals the specified value.
     * 
     */
    public final static MessageFilter<Long> PLANSUBSCRIPTION = new MessageFilter<Long>("PlanSubscription", Long.class);
    /**
     * Only show messages from this sender.
     * 
     */
    public final static MessageFilter<Long> SENDER = new MessageFilter<Long>("Sender", Long.class);

    private MessageFilter(String name, Class<?> type) {
        super(name, type);
    }

}
