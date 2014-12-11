
package com.mailjet.api.model.v3.user;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "user" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class UserProperty<DataType >
    extends MailJetResourceProperty<User, DataType>
{

    /**
     * Timestamp when object was created in database.
     * 
     */
    public final static UserProperty<Date> CREATEDAT = new UserProperty<Date>("CreatedAt", Date.class);
    /**
     * Email address of user.
     * 
     */
    public final static UserProperty.Key<String> EMAIL = new UserProperty.Key<String>("Email", String.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static UserProperty.Key<Long> ID = new UserProperty.Key<Long>("ID", Long.class);
    /**
     * Has the user accepted the Mailjet Rules ?.
     * 
     */
    public final static UserProperty<Boolean> ISRULESACCEPTED = new UserProperty<Boolean>("IsRulesAccepted", Boolean.class);
    /**
     * IP address of last contact from user.
     * 
     */
    public final static UserProperty<String> LASTIP = new UserProperty<String>("LastIp", String.class);
    /**
     * Timestamp when user last logged in.
     * 
     */
    public final static UserProperty<Date> LASTLOGINAT = new UserProperty<Date>("LastLoginAt", Date.class);
    /**
     * Locale in which the information in this record is recorded.
     * 
     */
    public final static UserProperty<String> LOCALE = new UserProperty<String>("Locale", String.class);
    /**
     * Maximum number of API keys the user is allowed to have.
     * 
     */
    public final static UserProperty<Integer> MAXALLOWEDAPIKEYS = new UserProperty<Integer>("MaxAllowedAPIKeys", Integer.class);
    /**
     * Timezone for this user.
     * 
     */
    public final static UserProperty<String> TIMEZONE = new UserProperty<String>("Timezone", String.class);
    /**
     * User name.
     * 
     */
    public final static UserProperty<String> USERNAME = new UserProperty<String>("Username", String.class);
    /**
     * Timestamp when user was last warned about hitting his rate limit.
     * 
     */
    public final static UserProperty<Date> WARNEDRATELIMITAT = new UserProperty<Date>("WarnedRatelimitAt", Date.class);

    private UserProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static UserProperty<Object> ref(String name) {
        return new UserProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<User, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
