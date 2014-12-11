
package com.mailjet.api.client.model;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "apikey" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Mon Nov 18 11:23:50 EET 2013.
 * 
 */
public final class TApiKeyProperty<DataType >
    extends MailJetResourceProperty<TApiKey, DataType>
{

    /**
     * The unique key for this API Key
     * 
     */
    public final static TApiKeyProperty.Key<String> APIKEY = new TApiKeyProperty.Key<String>("APIKey", String.class);
    /**
     * Timestamp when object was created in database
     * 
     */
    public final static TApiKeyProperty<Date> CREATEDAT = new TApiKeyProperty<Date>("CreatedAt", Date.class);
    /**
     * Status of this API Key
     * 
     */
    public final static TApiKeyProperty<TCustomStatus> CUSTOMSTATUS = new TApiKeyProperty<TCustomStatus>("CustomStatus", TCustomStatus.class);
    /**
     * Timestamp of API Key expiration. Zero if not expired.
     * 
     */
    public final static TApiKeyProperty<Date> EXPIREDAT = new TApiKeyProperty<Date>("ExpiredAt", Date.class);
    /**
     * Unique numerical ID for this object
     * 
     */
    public final static TApiKeyProperty.Key<Long> ID = new TApiKeyProperty.Key<Long>("ID", Long.class);
    /**
     * Is this API Key active ?
     * 
     */
    public final static TApiKeyProperty<Boolean> ISACTIVE = new TApiKeyProperty<Boolean>("IsActive", Boolean.class);
    /**
     * Is this API Key the master key for the user
     * 
     */
    public final static TApiKeyProperty<Boolean> ISMASTER = new TApiKeyProperty<Boolean>("IsMaster", Boolean.class);
    /**
     * Allow to set sender in mails.
     * 
     */
    public final static TApiKeyProperty<Boolean> ISSENDERALLOWED = new TApiKeyProperty<Boolean>("IsSenderAllowed", Boolean.class);
    /**
     * Timestamp when the API key was last modified.
     * 
     */
    public final static TApiKeyProperty<Date> LASTUPDATEAT = new TApiKeyProperty<Date>("LastUpdateAt", Date.class);
    /**
     * User readable name for this API Key
     * 
     */
    public final static TApiKeyProperty<String> NAME = new TApiKeyProperty<String>("Name", String.class);
    /**
     * Runlevel, used to indicate data is migrated and reduced performance is expected.
     * 
     */
    public final static TApiKeyProperty<TRunLevel> RUNLEVEL = new TApiKeyProperty<TRunLevel>("Runlevel", TRunLevel.class);

    private TApiKeyProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static TApiKeyProperty<Object> ref(String name) {
        return new TApiKeyProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<TApiKey, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
