
package com.mailjet.api.model.v3.sender;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.EnumValue;
import com.mailjet.api.client.model.metadata.Resource;
import com.mailjet.api.model.v3.customtypes.SenderStatus;


/**
 * Class representing "Manage details related to Sender e-mail adresses. An e-mail address has to be registered and Confirmed before being used to send e-mails. See the related MetaSender object if you wish to register a complete Domain.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "sender", description = "Manage details related to Sender e-mail adresses. An e-mail address has to be registered and Confirmed before being used to send e-mails. See the related MetaSender object if you wish to register a complete Domain.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
}, uniquekey = "Email")
public final class Sender {

    @Component(name = "CreatedAt", type = "TRFC3339DateTime", defaultValue = "Current time", required = false, description = "Timestamp when object was created in database.")
    private Date CreatedAt;
    @Component(name = "DNSID", type = "TDNS", defaultValue = "Calculated from the Email", required = false, description = "DNS domain to which sender belongs.")
    private Long DNSID;
    @Component(name = "Email", type = "TSenderEmail", defaultValue = "", required = true, description = "Email Address of this sender.")
    private String Email;
    @Component(name = "EmailType", type = "AnsiString", defaultValue = "", required = false, description = "Type of emails that can be sent from this address.")
    private Sender.EmailType EmailType;
    @Component(name = "Filename", type = "AnsiString", defaultValue = "", required = false, description = "Filename expected on the domain name webserver, used for verifying the domain in case of a catch-all address.")
    private String Filename;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "IsDefaultSender", type = "Boolean", defaultValue = "false", required = false, description = "Is this the default sender for this API key ?.")
    private Boolean IsDefaultSender;
    @Component(name = "Name", type = "AnsiString", defaultValue = "", required = false, description = "User-provided name for this sender.")
    private String Name;
    @Component(name = "Status", type = "TSenderStatus", defaultValue = "Calculated from the Email", required = false, description = "Status of the sender.")
    private SenderStatus Status;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Sender>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Sender>>(Sender.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Sender>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Sender>>(Sender.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Sender>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Sender>>(Sender.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Sender>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Sender>>(Sender.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<Sender>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<Sender>>(Sender.class, ResourceOperationTypes.Delete);

    /**
     * Gets "Timestamp when object was created in database." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getCreatedAt() {
        return CreatedAt;
    }

    /**
     * Sets the specified value to "Timestamp when object was created in database." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Sender setCreatedAt(Date value) {
        CreatedAt = value;
        return this;
    }

    /**
     * Gets "DNS domain to which sender belongs." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getDNSID() {
        return DNSID;
    }

    /**
     * Sets the specified value to "DNS domain to which sender belongs." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Sender setDNSID(Long value) {
        DNSID = value;
        return this;
    }

    /**
     * Gets "Email Address of this sender." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Sets the specified value to "Email Address of this sender." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Sender setEmail(String value) {
        Email = value;
        return this;
    }

    /**
     * Gets "Type of emails that can be sent from this address." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Sender.EmailType getEmailType() {
        return EmailType;
    }

    /**
     * Sets the specified value to "Type of emails that can be sent from this address." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Sender setEmailType(Sender.EmailType value) {
        EmailType = value;
        return this;
    }

    /**
     * Gets "Filename expected on the domain name webserver, used for verifying the domain in case of a catch-all address." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getFilename() {
        return Filename;
    }

    /**
     * Sets the specified value to "Filename expected on the domain name webserver, used for verifying the domain in case of a catch-all address." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Sender setFilename(String value) {
        Filename = value;
        return this;
    }

    /**
     * Gets "Unique numerical ID for this object." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getID() {
        return ID;
    }

    /**
     * Sets the specified value to "Unique numerical ID for this object." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Sender setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Is this the default sender for this API key ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsDefaultSender() {
        return IsDefaultSender;
    }

    /**
     * Sets the specified value to "Is this the default sender for this API key ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Sender setIsDefaultSender(Boolean value) {
        IsDefaultSender = value;
        return this;
    }

    /**
     * Gets "User-provided name for this sender." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the specified value to "User-provided name for this sender." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Sender setName(String value) {
        Name = value;
        return this;
    }

    /**
     * Gets "Status of the sender." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public SenderStatus getStatus() {
        return Status;
    }

    /**
     * Sets the specified value to "Status of the sender." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Sender setStatus(SenderStatus value) {
        Status = value;
        return this;
    }

    public String toString() {
        return ((Sender.class.getSimpleName()+"#")+ this.getID());
    }


    /**
     * Enumeration defining allowed values for "EmailType"(Type of emails that can be sent from this address.) MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
     * 
     */
    public static enum EmailType {


        /**
         * Value "transactional".
         * 
         */
        @EnumValue("transactional")
        TRANSACTIONAL,

        /**
         * Value "bulk".
         * 
         */
        @EnumValue("bulk")
        BULK;

    }

}
