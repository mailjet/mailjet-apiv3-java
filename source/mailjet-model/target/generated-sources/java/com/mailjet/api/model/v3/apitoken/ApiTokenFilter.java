
package com.mailjet.api.model.v3.apitoken;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "apitoken" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class ApiTokenFilter<DataType >
    extends MailJetResourceFilter<ApiToken, DataType>
{

    /**
     * Only retrieve APIToken resources for which APIKey equals the specified value.
     * 
     */
    public final static ApiTokenFilter<Long> APIKEY = new ApiTokenFilter<Long>("APIKey", Long.class);
    /**
     * Only retrieve APIToken resources for which CatchedIP equals the specified value.
     * 
     */
    public final static ApiTokenFilter<String> CATCHEDIP = new ApiTokenFilter<String>("CatchedIp", String.class);
    /**
     * Only retrieve APIToken resources for which IsActive equals the specified value.
     * 
     */
    public final static ApiTokenFilter<Boolean> ISACTIVE = new ApiTokenFilter<Boolean>("IsActive", Boolean.class);
    /**
     * Filter on IsActive field for API Key of token.
     * 
     */
    public final static ApiTokenFilter<Boolean> ISAPIKEYACTIVE = new ApiTokenFilter<Boolean>("IsAPIKeyActive", Boolean.class);
    /**
     * Only retrieve APIToken resources for which Token equals the specified value.
     * 
     */
    public final static ApiTokenFilter<String> TOKEN = new ApiTokenFilter<String>("Token", String.class);

    private ApiTokenFilter(String name, Class<?> type) {
        super(name, type);
    }

}
