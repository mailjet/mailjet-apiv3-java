
package com.mailjet.api.model.v3.contactmetadata;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;
import com.mailjet.api.model.v3.customtypes.ContactDataType;


/**
 * Class defining property constants for "contactmetadata" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class ContactMetadataProperty<DataType >
    extends MailJetResourceProperty<ContactMetadata, DataType>
{

    /**
     * Type of data.
     * 
     */
    public final static ContactMetadataProperty<ContactDataType> DATATYPE = new ContactMetadataProperty<ContactDataType>("Datatype", ContactDataType.class);
    /**
     * ID of this definition.
     * 
     */
    public final static ContactMetadataProperty.Key<Long> ID = new ContactMetadataProperty.Key<Long>("ID", Long.class);
    /**
     * The name of the data. The name must be unique within a namespace.
     * 
     */
    public final static ContactMetadataProperty.Key<String> NAME = new ContactMetadataProperty.Key<String>("Name", String.class);
    /**
     * The namespace for this data. There are 2 possible values: static and historic.
     * 
     */
    public final static ContactMetadataProperty<String> NAMESPACE = new ContactMetadataProperty<String>("NameSpace", String.class);

    private ContactMetadataProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ContactMetadataProperty<Object> ref(String name) {
        return new ContactMetadataProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<ContactMetadata, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
