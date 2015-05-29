
package com.mailjet.api.model.v3.apikey;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "apikey" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class ApiKeyFilter<DataType >
    extends MailJetResourceFilter<ApiKey, DataType>
{

    /**
     * Only retrieve apikey resources for which APIKey equals the specified value.
     * 
     */
    public final static ApiKeyFilter<String> APIKEY = new ApiKeyFilter<String>("APIKey", String.class);
    /**
     * Only retrieve apikey resources for which ConfirmKey equals the specified value.
     * 
     */
    public final static ApiKeyFilter<String> CONFIRMKEY = new ApiKeyFilter<String>("ConfirmKey", String.class);
    /**
     * Only retrieve apikey resources for which CustomStatus equals the specified value.
     * 
     */
    public final static ApiKeyFilter<Long> CUSTOMSTATUSID = new ApiKeyFilter<Long>("CustomStatusID", Long.class);
    /**
     * Only retrieve apikey resources for which IsActive equals the specified value.
     * 
     */
    public final static ApiKeyFilter<Boolean> ISACTIVE = new ApiKeyFilter<Boolean>("IsActive", Boolean.class);
    /**
     * Only retrieve apikey resources for which IsMaster equals the specified value.
     * 
     */
    public final static ApiKeyFilter<Boolean> ISMASTER = new ApiKeyFilter<Boolean>("IsMaster", Boolean.class);
    /**
     * Only retrieve apikey resources for which KeyType equals the specified value.
     * 
     */
    public final static ApiKeyFilter<Long> KEYTYPEID = new ApiKeyFilter<Long>("KeyTypeID", Long.class);
    /**
     * Only retrieve apikey resources for which Name equals the specified value.
     * 
     */
    public final static ApiKeyFilter<String> NAME = new ApiKeyFilter<String>("Name", String.class);
    /**
     * User for which to show API keys.
     * 
     */
    public final static ApiKeyFilter<Long> USER = new ApiKeyFilter<Long>("User", Long.class);

    private ApiKeyFilter(String name, Class<?> type) {
        super(name, type);
    }

}
