
package com.mailjet.api.model.v3.contactdata;

import java.util.List;
import java.util.Map;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "contactdata" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class ContactdataProperty<DataType >
    extends MailJetResourceProperty<Contactdata, DataType>
{

    /**
     * 
     * 
     */
    public final static ContactdataProperty<Long> CONTACTID = new ContactdataProperty<Long>("ContactID", Long.class);
    /**
     * Static data in an array with Name, Value pairs.
     * 
     */
    public final static ContactdataProperty<List<Map>> DATA = new ContactdataProperty<List<Map>>("Data", List.class);
    /**
     * ID of this resource. It equals the Contact ID.
     * 
     */
    public final static ContactdataProperty.Key<Long> ID = new ContactdataProperty.Key<Long>("ID", Long.class);

    private ContactdataProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ContactdataProperty<Object> ref(String name) {
        return new ContactdataProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<Contactdata, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
