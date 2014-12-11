
package com.mailjet.api.model.v3.contactfilter;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "contactfilter" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class ContactfilterFilter<DataType >
    extends MailJetResourceFilter<Contactfilter, DataType>
{

    /**
     * 
     * 
     */
    public final static ContactfilterFilter<Boolean> SHOWDELETED = new ContactfilterFilter<Boolean>("ShowDeleted", Boolean.class);
    /**
     * 
     * 
     */
    public final static ContactfilterFilter<String> STATUS = new ContactfilterFilter<String>("Status", String.class);

    private ContactfilterFilter(String name, Class<?> type) {
        super(name, type);
    }

}
