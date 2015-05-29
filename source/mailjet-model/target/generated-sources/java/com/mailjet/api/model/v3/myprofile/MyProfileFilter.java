
package com.mailjet.api.model.v3.myprofile;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "myprofile" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class MyProfileFilter<DataType >
    extends MailJetResourceFilter<MyProfile, DataType>
{

    /**
     * Only retrieve myprofile resources for which User equals the specified value.
     * 
     */
    public final static MyProfileFilter<Long> USER = new MyProfileFilter<Long>("User", Long.class);

    private MyProfileFilter(String name, Class<?> type) {
        super(name, type);
    }

}
