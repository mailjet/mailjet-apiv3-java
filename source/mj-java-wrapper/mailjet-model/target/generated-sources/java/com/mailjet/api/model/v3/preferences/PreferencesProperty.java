
package com.mailjet.api.model.v3.preferences;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "preferences" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class PreferencesProperty<DataType >
    extends MailJetResourceProperty<Preferences, DataType>
{

    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static PreferencesProperty.Key<Long> ID = new PreferencesProperty.Key<Long>("ID", Long.class);
    /**
     * Name of preference.
     * 
     */
    public final static PreferencesProperty.Key<String> KEY = new PreferencesProperty.Key<String>("Key", String.class);
    /**
     * User for which this is the preference.
     * 
     */
    public final static PreferencesProperty<Long> USERID = new PreferencesProperty<Long>("UserID", Long.class);
    /**
     * Value of preference.
     * 
     */
    public final static PreferencesProperty<String> VALUE = new PreferencesProperty<String>("Value", String.class);

    private PreferencesProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static PreferencesProperty<Object> ref(String name) {
        return new PreferencesProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<Preferences, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
