
package com.mailjet.api.model.v3.contactfilter;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;
import com.mailjet.api.model.v3.customtypes.ContactFilterStatus;


/**
 * Class defining property constants for "contactfilter" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class ContactfilterProperty<DataType >
    extends MailJetResourceProperty<Contactfilter, DataType>
{

    /**
     * Textual escription of the filter.
     * 
     */
    public final static ContactfilterProperty<String> DESCRIPTION = new ContactfilterProperty<String>("Description", String.class);
    /**
     * Filter Expression. Checked for syntactical correctness when writing
     * 
     */
    public final static ContactfilterProperty<String> EXPRESSION = new ContactfilterProperty<String>("Expression", String.class);
    /**
     * ID of the filter
     * 
     */
    public final static ContactfilterProperty.Key<Long> ID = new ContactfilterProperty.Key<Long>("ID", Long.class);
    /**
     * A unique name for this filter.
     * 
     */
    public final static ContactfilterProperty.Key<String> NAME = new ContactfilterProperty.Key<String>("Name", String.class);
    /**
     * 
     * 
     */
    public final static ContactfilterProperty<ContactFilterStatus> STATUS = new ContactfilterProperty<ContactFilterStatus>("Status", ContactFilterStatus.class);

    private ContactfilterProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ContactfilterProperty<Object> ref(String name) {
        return new ContactfilterProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<Contactfilter, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
