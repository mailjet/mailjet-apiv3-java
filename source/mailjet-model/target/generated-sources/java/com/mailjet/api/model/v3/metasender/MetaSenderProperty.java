
package com.mailjet.api.model.v3.metasender;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "metasender" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class MetaSenderProperty<DataType >
    extends MailJetResourceProperty<MetaSender, DataType>
{

    /**
     * Timestamp when object was created in database.
     * 
     */
    public final static MetaSenderProperty<Date> CREATEDAT = new MetaSenderProperty<Date>("CreatedAt", Date.class);
    /**
     * User provided readable description of the domain.
     * 
     */
    public final static MetaSenderProperty<String> DESCRIPTION = new MetaSenderProperty<String>("Description", String.class);
    /**
     * The email address (lowercase), which may consist of a wildcard (*) in the local part.
     * 
     */
    public final static MetaSenderProperty.Key<String> EMAIL = new MetaSenderProperty.Key<String>("Email", String.class);
    /**
     * Filename expected on the domain name webserver, used for verifying the domain, in case of a catch-all address.
     * 
     */
    public final static MetaSenderProperty<String> FILENAME = new MetaSenderProperty<String>("Filename", String.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static MetaSenderProperty.Key<Long> ID = new MetaSenderProperty.Key<Long>("ID", Long.class);
    /**
     * Is the domain authorized to send mails through Mailjet.
     * 
     */
    public final static MetaSenderProperty<Boolean> ISENABLED = new MetaSenderProperty<Boolean>("IsEnabled", Boolean.class);

    private MetaSenderProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static MetaSenderProperty<Object> ref(String name) {
        return new MetaSenderProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<MetaSender, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
