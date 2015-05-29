
package com.mailjet.api.model.v3.user;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "user" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class UserFilter<DataType >
    extends MailJetResourceFilter<User, DataType>
{

    /**
     * Only retrieve user resources for which IsActivated equals the specified value.
     * 
     */
    public final static UserFilter<Boolean> ISACTIVATED = new UserFilter<Boolean>("IsActivated", Boolean.class);
    /**
     * Only retrieve user resources for which NewEmail equals the specified value.
     * 
     */
    public final static UserFilter<String> NEWEMAIL = new UserFilter<String>("NewEmail", String.class);
    /**
     * Only retrieve users where Username matches the specified value.
     * 
     */
    public final static UserFilter<String> USERNAME = new UserFilter<String>("UserName", String.class);

    private UserFilter(String name, Class<?> type) {
        super(name, type);
    }

}
