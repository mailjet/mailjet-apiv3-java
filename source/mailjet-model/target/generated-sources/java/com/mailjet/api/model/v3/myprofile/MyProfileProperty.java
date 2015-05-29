
package com.mailjet.api.model.v3.myprofile;

import java.math.BigDecimal;
import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "myprofile" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class MyProfileProperty<DataType >
    extends MailJetResourceProperty<MyProfile, DataType>
{

    /**
     * City part of address.
     * 
     */
    public final static MyProfileProperty<String> ADDRESSCITY = new MyProfileProperty<String>("AddressCity", String.class);
    /**
     * Country part of address.
     * 
     */
    public final static MyProfileProperty<String> ADDRESSCOUNTRY = new MyProfileProperty<String>("AddressCountry", String.class);
    /**
     * Postal code of address (ZIP).
     * 
     */
    public final static MyProfileProperty<String> ADDRESSPOSTALCODE = new MyProfileProperty<String>("AddressPostalCode", String.class);
    /**
     * 
     * 
     */
    public final static MyProfileProperty<String> ADDRESSSTATE = new MyProfileProperty<String>("AddressState", String.class);
    /**
     * Street and house number.
     * 
     */
    public final static MyProfileProperty<String> ADDRESSSTREET = new MyProfileProperty<String>("AddressStreet", String.class);
    /**
     * Billing email address.
     * 
     */
    public final static MyProfileProperty<String> BILLINGEMAIL = new MyProfileProperty<String>("BillingEmail", String.class);
    /**
     * User's birthday.
     * 
     */
    public final static MyProfileProperty<Date> BIRTHDAYAT = new MyProfileProperty<Date>("BirthdayAt", Date.class);
    /**
     * Name of the company.
     * 
     */
    public final static MyProfileProperty<String> COMPANYNAME = new MyProfileProperty<String>("CompanyName", String.class);
    /**
     * 
     * 
     */
    public final static MyProfileProperty<String> COMPANYNUMOFEMPLOYEES = new MyProfileProperty<String>("CompanyNumOfEmployees", String.class);
    /**
     * Contact telephone.
     * 
     */
    public final static MyProfileProperty<String> CONTACTPHONE = new MyProfileProperty<String>("ContactPhone", String.class);
    /**
     * Estimated volume of messages.
     * 
     */
    public final static MyProfileProperty<Integer> ESTIMATEDVOLUME = new MyProfileProperty<Integer>("EstimatedVolume", Integer.class);
    /**
     * ?.
     * 
     */
    public final static MyProfileProperty<String> FEATURES = new MyProfileProperty<String>("Features", String.class);
    /**
     * Contact person's first name.
     * 
     */
    public final static MyProfileProperty<String> FIRSTNAME = new MyProfileProperty<String>("Firstname", String.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static MyProfileProperty.Key<Long> ID = new MyProfileProperty.Key<Long>("ID", Long.class);
    /**
     * Industry in which user works.
     * 
     */
    public final static MyProfileProperty<String> INDUSTRY = new MyProfileProperty<String>("Industry", String.class);
    /**
     * 
     * 
     */
    public final static MyProfileProperty<String> JOBTITLE = new MyProfileProperty<String>("JobTitle", String.class);
    /**
     * Contact person's last name.
     * 
     */
    public final static MyProfileProperty<String> LASTNAME = new MyProfileProperty<String>("Lastname", String.class);
    /**
     * Reference to user.
     * 
     */
    public final static MyProfileProperty<Long> USERID = new MyProfileProperty<Long>("UserID", Long.class);
    /**
     * VAT rate for this user.
     * 
     */
    public final static MyProfileProperty<BigDecimal> VAT = new MyProfileProperty<BigDecimal>("VAT", BigDecimal.class);
    /**
     * User supplied VAT number.
     * 
     */
    public final static MyProfileProperty<String> VATNUMBER = new MyProfileProperty<String>("VATNumber", String.class);
    /**
     * URL of user's website.
     * 
     */
    public final static MyProfileProperty<String> WEBSITE = new MyProfileProperty<String>("Website", String.class);

    private MyProfileProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static MyProfileProperty<Object> ref(String name) {
        return new MyProfileProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<MyProfile, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
