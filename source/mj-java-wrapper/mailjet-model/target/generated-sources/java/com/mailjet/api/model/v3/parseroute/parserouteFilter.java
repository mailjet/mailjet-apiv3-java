
package com.mailjet.api.model.v3.parseroute;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "parseroute" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class parserouteFilter<DataType >
    extends MailJetResourceFilter<parseroute, DataType>
{

    /**
     * Only retrieve parseroute resources for which APIKey ID equals the specified value.
     * 
     */
    public final static parserouteFilter<Long> APIKEY = new parserouteFilter<Long>("APIKey", Long.class);

    private parserouteFilter(String name, Class<?> type) {
        super(name, type);
    }

}
