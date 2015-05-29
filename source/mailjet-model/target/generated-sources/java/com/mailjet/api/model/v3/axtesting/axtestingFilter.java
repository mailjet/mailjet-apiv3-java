
package com.mailjet.api.model.v3.axtesting;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "axtesting" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class axtestingFilter<DataType >
    extends MailJetResourceFilter<axtesting, DataType>
{

    /**
     * 
     * 
     */
    public final static axtestingFilter<Long> CONTACTSLIST = new axtestingFilter<Long>("ContactsList", Long.class);
    /**
     * 
     * 
     */
    public final static axtestingFilter<Boolean> ISDELETED = new axtestingFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * 
     * 
     */
    public final static axtestingFilter<Boolean> ISSTARRED = new axtestingFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * 
     * 
     */
    public final static axtestingFilter<Long> SEGMENTATION = new axtestingFilter<Long>("Segmentation", Long.class);

    private axtestingFilter(String name, Class<?> type) {
        super(name, type);
    }

}
