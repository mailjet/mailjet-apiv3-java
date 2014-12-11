
package com.mailjet.api.model.v3.apikeyaccess;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "apikeyaccess" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
public final class ApiKeyAccessFilter<DataType >
    extends MailJetResourceFilter<ApiKeyAccess, DataType>
{

    /**
     * Only retrieve apikeyaccess resources for which APIKey ID equals the specified value.
     * 
     */
    public final static ApiKeyAccessFilter<Long> APIKEY = new ApiKeyAccessFilter<Long>("APIKey", Long.class);
    /**
     * Only show APIKeyAccess resources for which IsActive equals the specified value.
     * 
     */
    public final static ApiKeyAccessFilter<Boolean> ISACTIVE = new ApiKeyAccessFilter<Boolean>("IsActive", Boolean.class);
    /**
     * Only retrieve apikeyaccess resources for which RealUser ID equals the specified value.
     * 
     */
    public final static ApiKeyAccessFilter<Long> REALUSER = new ApiKeyAccessFilter<Long>("RealUser", Long.class);
    /**
     * Only retrieve apikeyaccess resources for which SubAccount ID equals the specified value.
     * 
     */
    public final static ApiKeyAccessFilter<Long> SUBACCOUNT = new ApiKeyAccessFilter<Long>("SubAccount", Long.class);
    /**
     * Only show APIKeyAccess resources for which Token equals the specified value.
     * 
     */
    public final static ApiKeyAccessFilter<String> TOKEN = new ApiKeyAccessFilter<String>("Token", String.class);
    /**
     * Only retrieve apikeyaccess resources for which User ID equals the specified value.
     * 
     */
    public final static ApiKeyAccessFilter<Long> USER = new ApiKeyAccessFilter<Long>("User", Long.class);

    private ApiKeyAccessFilter(String name, Class<?> type) {
        super(name, type);
    }

}
