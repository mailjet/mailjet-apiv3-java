
package com.mailjet.api.model.v3.apikey;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;
import com.mailjet.api.model.v3.customtypes.CustomStatus;
import com.mailjet.api.model.v3.customtypes.RunLevel;


/**
 * Class defining property constants for "apikey" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
public final class ApiKeyProperty<DataType >
    extends MailJetResourceProperty<ApiKey, DataType>
{

    /**
     * The unique key for this API Key.
     * 
     */
    public final static ApiKeyProperty.Key<String> APIKEY = new ApiKeyProperty.Key<String>("APIKey", String.class);
    /**
     * Timestamp when object was created in database.
     * 
     */
    public final static ApiKeyProperty<Date> CREATEDAT = new ApiKeyProperty<Date>("CreatedAt", Date.class);
    /**
     * Status of this API Key.
     * 
     */
    public final static ApiKeyProperty<CustomStatus> CUSTOMSTATUS = new ApiKeyProperty<CustomStatus>("CustomStatus", CustomStatus.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static ApiKeyProperty.Key<Long> ID = new ApiKeyProperty.Key<Long>("ID", Long.class);
    /**
     * Is this API Key active ?.
     * 
     */
    public final static ApiKeyProperty<Boolean> ISACTIVE = new ApiKeyProperty<Boolean>("IsActive", Boolean.class);
    /**
     * Is this API Key the master key for the user.
     * 
     */
    public final static ApiKeyProperty<Boolean> ISMASTER = new ApiKeyProperty<Boolean>("IsMaster", Boolean.class);
    /**
     * User readable name for this API Key.
     * 
     */
    public final static ApiKeyProperty<String> NAME = new ApiKeyProperty<String>("Name", String.class);
    /**
     * Runlevel, used to indicate data is migrated and reduced performance is expected.
     * 
     */
    public final static ApiKeyProperty<RunLevel> RUNLEVEL = new ApiKeyProperty<RunLevel>("Runlevel", RunLevel.class);
    /**
     * Secret key for this API Key (equivalent to password).
     * 
     */
    public final static ApiKeyProperty<String> SECRETKEY = new ApiKeyProperty<String>("SecretKey", String.class);
    /**
     * Host to be used when tracking clicks, opens, unsub requests for this API Key.
     * 
     */
    public final static ApiKeyProperty<String> TRACKHOST = new ApiKeyProperty<String>("TrackHost", String.class);
    /**
     * User ID for this API key
     * 
     */
    public final static ApiKeyProperty<Long> USERID = new ApiKeyProperty<Long>("UserID", Long.class);

    private ApiKeyProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ApiKeyProperty<Object> ref(String name) {
        return new ApiKeyProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<ApiKey, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
