
package com.mailjet.api.model.v3.apikeyaccess;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "apikeyaccess" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class ApiKeyAccessProperty<DataType >
    extends MailJetResourceProperty<ApiKeyAccess, DataType>
{

    /**
     * JSON describing access rights.
     * 
     */
    public final static ApiKeyAccessProperty<String> ALLOWEDACCESS = new ApiKeyAccessProperty<String>("AllowedAccess", String.class);
    /**
     * API key for which the rights are descibed.
     * 
     */
    public final static ApiKeyAccessProperty<Long> APIKEYID = new ApiKeyAccessProperty<Long>("APIKeyID", Long.class);
    /**
     * Timestamp when object was created in database.
     * 
     */
    public final static ApiKeyAccessProperty<Date> CREATEDAT = new ApiKeyAccessProperty<Date>("CreatedAt", Date.class);
    /**
     * Custom name for this set of rights.
     * 
     */
    public final static ApiKeyAccessProperty<String> CUSTOMNAME = new ApiKeyAccessProperty<String>("CustomName", String.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static ApiKeyAccessProperty.Key<Long> ID = new ApiKeyAccessProperty.Key<Long>("ID", Long.class);
    /**
     * Is this object active (rights enforced) or not.
     * 
     */
    public final static ApiKeyAccessProperty<Boolean> ISACTIVE = new ApiKeyAccessProperty<Boolean>("IsActive", Boolean.class);
    /**
     * Timestamp of last registered activity for this API Key.
     * 
     */
    public final static ApiKeyAccessProperty<Date> LASTACTIVITYAT = new ApiKeyAccessProperty<Date>("LastActivityAt", Date.class);
    /**
     * Reference to Real user.
     * 
     */
    public final static ApiKeyAccessProperty<Long> REALUSERID = new ApiKeyAccessProperty<Long>("RealUserID", Long.class);
    /**
     * Reference to subaccount.
     * 
     */
    public final static ApiKeyAccessProperty<Long> SUBACCOUNTID = new ApiKeyAccessProperty<Long>("SubaccountID", Long.class);
    /**
     * Reference to user for whom access is described.
     * 
     */
    public final static ApiKeyAccessProperty<Long> USERID = new ApiKeyAccessProperty<Long>("UserID", Long.class);

    private ApiKeyAccessProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ApiKeyAccessProperty<Object> ref(String name) {
        return new ApiKeyAccessProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<ApiKeyAccess, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
