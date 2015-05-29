
package com.mailjet.api.model.v3.metasender;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "metasender" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class MetaSenderFilter<DataType >
    extends MailJetResourceFilter<MetaSender, DataType>
{

    /**
     * Only retrieve metasender resources for which DNS ID equals the specified value.).
     * 
     */
    public final static MetaSenderFilter<Long> DNS = new MetaSenderFilter<Long>("DNS", Long.class);
    /**
     * Only retrieve metasender resources for which User ID equals the specified value.
     * 
     */
    public final static MetaSenderFilter<Long> USER = new MetaSenderFilter<Long>("User", Long.class);

    private MetaSenderFilter(String name, Class<?> type) {
        super(name, type);
    }

}
