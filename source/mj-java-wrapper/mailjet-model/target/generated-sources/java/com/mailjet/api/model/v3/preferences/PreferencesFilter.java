
package com.mailjet.api.model.v3.preferences;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "preferences" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class PreferencesFilter<DataType >
    extends MailJetResourceFilter<Preferences, DataType>
{

    /**
     * Only retrieve preferences resources for which User equals the specified value.
     * 
     */
    public final static PreferencesFilter<Long> USER = new PreferencesFilter<Long>("User", Long.class);

    private PreferencesFilter(String name, Class<?> type) {
        super(name, type);
    }

}
