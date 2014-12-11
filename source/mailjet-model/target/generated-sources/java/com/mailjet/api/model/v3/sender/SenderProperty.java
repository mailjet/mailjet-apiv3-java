
package com.mailjet.api.model.v3.sender;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;
import com.mailjet.api.model.v3.customtypes.SenderStatus;


/**
 * Class defining property constants for "sender" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class SenderProperty<DataType >
    extends MailJetResourceProperty<Sender, DataType>
{

    /**
     * Timestamp when object was created in database.
     * 
     */
    public final static SenderProperty<Date> CREATEDAT = new SenderProperty<Date>("CreatedAt", Date.class);
    /**
     * DNS domain to which sender belongs.
     * 
     */
    public final static SenderProperty<Long> DNSID = new SenderProperty<Long>("DNSID", Long.class);
    /**
     * Email Address of this sender.
     * 
     */
    public final static SenderProperty.Key<String> EMAIL = new SenderProperty.Key<String>("Email", String.class);
    /**
     * Type of emails that can be sent from this address.
     * 
     */
    public final static SenderProperty<Sender.EmailType> EMAILTYPE = new SenderProperty<Sender.EmailType>("EmailType", Sender.EmailType.class);
    /**
     * Filename expected on the domain name webserver, used for verifying the domain in case of a catch-all address.
     * 
     */
    public final static SenderProperty<String> FILENAME = new SenderProperty<String>("Filename", String.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static SenderProperty.Key<Long> ID = new SenderProperty.Key<Long>("ID", Long.class);
    /**
     * Is this the default sender for this API key ?.
     * 
     */
    public final static SenderProperty<Boolean> ISDEFAULTSENDER = new SenderProperty<Boolean>("IsDefaultSender", Boolean.class);
    /**
     * User-provided name for this sender.
     * 
     */
    public final static SenderProperty<String> NAME = new SenderProperty<String>("Name", String.class);
    /**
     * Status of the sender.
     * 
     */
    public final static SenderProperty<SenderStatus> STATUS = new SenderProperty<SenderStatus>("Status", SenderStatus.class);

    private SenderProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static SenderProperty<Object> ref(String name) {
        return new SenderProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<Sender, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
