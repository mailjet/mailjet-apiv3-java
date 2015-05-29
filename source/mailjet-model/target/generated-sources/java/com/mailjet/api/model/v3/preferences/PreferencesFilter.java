
package com.mailjet.api.model.v3.preferences;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "preferences" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class PreferencesFilter<DataType >
    extends MailJetResourceFilter<Preferences, DataType>
{

    /**
     * 
     * 
     */
    public final static PreferencesFilter<String> KEY = new PreferencesFilter<String>("Key", String.class);
    /**
     * 
     * 
     */
    public final static PreferencesFilter<Boolean> SHOWALLUSERS = new PreferencesFilter<Boolean>("ShowAllUsers", Boolean.class);
    /**
     * Only retrieve preferences resources for which User equals the specified value.
     * 
     */
    public final static PreferencesFilter<Long> USER = new PreferencesFilter<Long>("User", Long.class);

    private PreferencesFilter(String name, Class<?> type) {
        super(name, type);
    }

}
