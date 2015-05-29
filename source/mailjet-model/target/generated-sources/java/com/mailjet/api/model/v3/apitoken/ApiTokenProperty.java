
package com.mailjet.api.model.v3.apitoken;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "apitoken" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class ApiTokenProperty<DataType >
    extends MailJetResourceProperty<ApiToken, DataType>
{

    /**
     * 
     * 
     */
    public final static ApiTokenProperty<String> ACL = new ApiTokenProperty<String>("ACL", String.class);
    /**
     * Access rights of this token. Options are one or all the following: 'campaigns', 'contacts','reports', 'stats', 'preferences'.
     * 
     */
    public final static ApiTokenProperty<ApiToken.AllowedAccess> ALLOWEDACCESS = new ApiTokenProperty<ApiToken.AllowedAccess>("AllowedAccess", ApiToken.AllowedAccess.class);
    /**
     * Reference to API Key to which this token belongs.
     * 
     */
    public final static ApiTokenProperty<Long> APIKEYID = new ApiTokenProperty<Long>("APIKeyID", Long.class);
    /**
     * Last registered IP address for this token.
     * 
     */
    public final static ApiTokenProperty<String> CATCHEDIP = new ApiTokenProperty<String>("CatchedIp", String.class);
    /**
     * Timestamp when object was created in database.
     * 
     */
    public final static ApiTokenProperty<Date> CREATEDAT = new ApiTokenProperty<Date>("CreatedAt", Date.class);
    /**
     * Timestamp of first use of this token.
     * 
     */
    public final static ApiTokenProperty<Date> FIRSTUSEDAT = new ApiTokenProperty<Date>("FirstUsedAt", Date.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static ApiTokenProperty.Key<Long> ID = new ApiTokenProperty.Key<Long>("ID", Long.class);
    /**
     * Is this token still active.
     * 
     */
    public final static ApiTokenProperty<Boolean> ISACTIVE = new ApiTokenProperty<Boolean>("IsActive", Boolean.class);
    /**
     * Language (locale) for this token.
     * 
     */
    public final static ApiTokenProperty<String> LANG = new ApiTokenProperty<String>("Lang", String.class);
    /**
     * Timestamp of last use of this token.
     * 
     */
    public final static ApiTokenProperty<Date> LASTUSEDAT = new ApiTokenProperty<Date>("LastUsedAt", Date.class);
    /**
     * Payload for this token.
     * 
     */
    public final static ApiTokenProperty<String> SENTDATA = new ApiTokenProperty<String>("SentData", String.class);
    /**
     * Timezone to use for this token.
     * 
     */
    public final static ApiTokenProperty<String> TIMEZONE = new ApiTokenProperty<String>("Timezone", String.class);
    /**
     * Unique identifier for this token, to be used by user.
     * 
     */
    public final static ApiTokenProperty.Key<String> TOKEN = new ApiTokenProperty.Key<String>("Token", String.class);
    /**
     * Type of token: options are 'url','iframe','page'
     * 
     */
    public final static ApiTokenProperty<ApiToken.TokenType> TOKENTYPE = new ApiTokenProperty<ApiToken.TokenType>("TokenType", ApiToken.TokenType.class);
    /**
     * Period during which token is considered valid.
     * 
     */
    public final static ApiTokenProperty<Integer> VALIDFOR = new ApiTokenProperty<Integer>("ValidFor", Integer.class);

    private ApiTokenProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ApiTokenProperty<Object> ref(String name) {
        return new ApiTokenProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<ApiToken, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
