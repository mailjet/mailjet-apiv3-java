
package com.mailjet.api.model.v3.parseroute;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "parseroute" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class parserouteProperty<DataType >
    extends MailJetResourceProperty<parseroute, DataType>
{

    /**
     * Reference to an API key to whom this object belongs
     * 
     */
    public final static parserouteProperty<Long> APIKEYID = new parserouteProperty<Long>("APIKeyID", Long.class);
    /**
     * Email address
     * 
     */
    public final static parserouteProperty.Key<String> EMAIL = new parserouteProperty.Key<String>("Email", String.class);
    /**
     * 
     * 
     */
    public final static parserouteProperty.Key<Long> ID = new parserouteProperty.Key<Long>("ID", Long.class);
    /**
     * URL address
     * 
     */
    public final static parserouteProperty<String> URL = new parserouteProperty<String>("Url", String.class);

    private parserouteProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static parserouteProperty<Object> ref(String name) {
        return new parserouteProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<parseroute, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
