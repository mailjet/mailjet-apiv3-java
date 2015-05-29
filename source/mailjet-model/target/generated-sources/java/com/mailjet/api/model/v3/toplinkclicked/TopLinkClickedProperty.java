
package com.mailjet.api.model.v3.toplinkclicked;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "toplinkclicked" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class TopLinkClickedProperty<DataType >
    extends MailJetResourceProperty<TopLinkClicked, DataType>
{

    /**
     * Number of registered clicks.
     * 
     */
    public final static TopLinkClickedProperty<Long> CLICKEDCOUNT = new TopLinkClickedProperty<Long>("ClickedCount", Long.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static TopLinkClickedProperty.Key<Long> ID = new TopLinkClickedProperty.Key<Long>("ID", Long.class);
    /**
     * Unique ID for the link.
     * 
     */
    public final static TopLinkClickedProperty<Long> LINKID = new TopLinkClickedProperty<Long>("LinkId", Long.class);
    /**
     * Actual link clicked.
     * 
     */
    public final static TopLinkClickedProperty<String> URL = new TopLinkClickedProperty<String>("Url", String.class);

    private TopLinkClickedProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static TopLinkClickedProperty<Object> ref(String name) {
        return new TopLinkClickedProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<TopLinkClicked, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
