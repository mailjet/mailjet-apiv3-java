
package com.mailjet.api.model.v3.messagehistory;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "messagehistory" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class MessageHistoryFilter<DataType >
    extends MailJetResourceFilter<MessageHistory, DataType>
{

    /**
     * ID of message for which to show the history.
     * 
     */
    public final static MessageHistoryFilter<Long> MESSAGE = new MessageHistoryFilter<Long>("Message", Long.class);

    private MessageHistoryFilter(String name, Class<?> type) {
        super(name, type);
    }

}
