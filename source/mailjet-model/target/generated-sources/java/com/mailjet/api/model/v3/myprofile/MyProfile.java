
package com.mailjet.api.model.v3.myprofile;

import java.math.BigDecimal;
import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Manage user profile data such as address, payment information etc.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "myprofile", description = "Manage user profile data such as address, payment information etc.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put
})
public final class MyProfile {

    @Component(name = "AddressCity", type = "AnsiString", defaultValue = "", required = false, description = "City part of address.")
    private String AddressCity;
    @Component(name = "AddressCountry", type = "AnsiString", defaultValue = "", required = false, description = "Country part of address.")
    private String AddressCountry;
    @Component(name = "AddressPostalCode", type = "AnsiString", defaultValue = "", required = false, description = "Postal code of address (ZIP).")
    private String AddressPostalCode;
    @Component(name = "AddressState", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String AddressState;
    @Component(name = "AddressStreet", type = "AnsiString", defaultValue = "", required = false, description = "Street and house number.")
    private String AddressStreet;
    @Component(name = "BillingEmail", type = "TBillingEmail", defaultValue = "", required = false, description = "Billing email address.")
    private String BillingEmail;
    @Component(name = "BirthdayAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "User's birthday.")
    private Date BirthdayAt;
    @Component(name = "CompanyName", type = "AnsiString", defaultValue = "", required = false, description = "Name of the company.")
    private String CompanyName;
    @Component(name = "CompanyNumOfEmployees", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String CompanyNumOfEmployees;
    @Component(name = "ContactPhone", type = "AnsiString", defaultValue = "", required = false, description = "Contact telephone.")
    private String ContactPhone;
    @Component(name = "EstimatedVolume", type = "LongInt", defaultValue = "", required = false, description = "Estimated volume of messages.")
    private Integer EstimatedVolume;
    @Component(name = "Features", type = "AnsiString", defaultValue = "", required = false, description = "?.")
    private String Features;
    @Component(name = "Firstname", type = "AnsiString", defaultValue = "", required = false, description = "Contact person's first name.")
    private String Firstname;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "Industry", type = "AnsiString", defaultValue = "", required = false, description = "Industry in which user works.")
    private String Industry;
    @Component(name = "JobTitle", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String JobTitle;
    @Component(name = "Lastname", type = "AnsiString", defaultValue = "", required = false, description = "Contact person's last name.")
    private String Lastname;
    @Component(name = "UserID", type = "TUser", defaultValue = "", required = false, description = "Reference to user.")
    private Long UserID;
    @Component(name = "VAT", type = "Currency", defaultValue = "Depends on AddressCountry's value", required = false, description = "VAT rate for this user.")
    private BigDecimal VAT;
    @Component(name = "VATNumber", type = "AnsiString", defaultValue = "", required = false, description = "User supplied VAT number.")
    private String VATNumber;
    @Component(name = "Website", type = "AnsiString", defaultValue = "", required = false, description = "URL of user's website.")
    private String Website;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<MyProfile>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<MyProfile>>(MyProfile.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<MyProfile>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<MyProfile>>(MyProfile.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<MyProfile>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<MyProfile>>(MyProfile.class, ResourceOperationTypes.Put);

    /**
     * Gets "City part of address." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getAddressCity() {
        return AddressCity;
    }

    /**
     * Sets the specified value to "City part of address." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setAddressCity(String value) {
        AddressCity = value;
        return this;
    }

    /**
     * Gets "Country part of address." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getAddressCountry() {
        return AddressCountry;
    }

    /**
     * Sets the specified value to "Country part of address." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setAddressCountry(String value) {
        AddressCountry = value;
        return this;
    }

    /**
     * Gets "Postal code of address (ZIP)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getAddressPostalCode() {
        return AddressPostalCode;
    }

    /**
     * Sets the specified value to "Postal code of address (ZIP)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setAddressPostalCode(String value) {
        AddressPostalCode = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getAddressState() {
        return AddressState;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setAddressState(String value) {
        AddressState = value;
        return this;
    }

    /**
     * Gets "Street and house number." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getAddressStreet() {
        return AddressStreet;
    }

    /**
     * Sets the specified value to "Street and house number." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setAddressStreet(String value) {
        AddressStreet = value;
        return this;
    }

    /**
     * Gets "Billing email address." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getBillingEmail() {
        return BillingEmail;
    }

    /**
     * Sets the specified value to "Billing email address." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setBillingEmail(String value) {
        BillingEmail = value;
        return this;
    }

    /**
     * Gets "User's birthday." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getBirthdayAt() {
        return BirthdayAt;
    }

    /**
     * Sets the specified value to "User's birthday." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setBirthdayAt(Date value) {
        BirthdayAt = value;
        return this;
    }

    /**
     * Gets "Name of the company." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getCompanyName() {
        return CompanyName;
    }

    /**
     * Sets the specified value to "Name of the company." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setCompanyName(String value) {
        CompanyName = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getCompanyNumOfEmployees() {
        return CompanyNumOfEmployees;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setCompanyNumOfEmployees(String value) {
        CompanyNumOfEmployees = value;
        return this;
    }

    /**
     * Gets "Contact telephone." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getContactPhone() {
        return ContactPhone;
    }

    /**
     * Sets the specified value to "Contact telephone." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setContactPhone(String value) {
        ContactPhone = value;
        return this;
    }

    /**
     * Gets "Estimated volume of messages." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getEstimatedVolume() {
        return EstimatedVolume;
    }

    /**
     * Sets the specified value to "Estimated volume of messages." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setEstimatedVolume(Integer value) {
        EstimatedVolume = value;
        return this;
    }

    /**
     * Gets "?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getFeatures() {
        return Features;
    }

    /**
     * Sets the specified value to "?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setFeatures(String value) {
        Features = value;
        return this;
    }

    /**
     * Gets "Contact person's first name." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getFirstname() {
        return Firstname;
    }

    /**
     * Sets the specified value to "Contact person's first name." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setFirstname(String value) {
        Firstname = value;
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
    public MyProfile setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Industry in which user works." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getIndustry() {
        return Industry;
    }

    /**
     * Sets the specified value to "Industry in which user works." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setIndustry(String value) {
        Industry = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getJobTitle() {
        return JobTitle;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setJobTitle(String value) {
        JobTitle = value;
        return this;
    }

    /**
     * Gets "Contact person's last name." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getLastname() {
        return Lastname;
    }

    /**
     * Sets the specified value to "Contact person's last name." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setLastname(String value) {
        Lastname = value;
        return this;
    }

    /**
     * Gets "Reference to user." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getUserID() {
        return UserID;
    }

    /**
     * Sets the specified value to "Reference to user." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setUserID(Long value) {
        UserID = value;
        return this;
    }

    /**
     * Gets "VAT rate for this user." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getVAT() {
        return VAT;
    }

    /**
     * Sets the specified value to "VAT rate for this user." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setVAT(BigDecimal value) {
        VAT = value;
        return this;
    }

    /**
     * Gets "User supplied VAT number." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getVATNumber() {
        return VATNumber;
    }

    /**
     * Sets the specified value to "User supplied VAT number." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setVATNumber(String value) {
        VATNumber = value;
        return this;
    }

    /**
     * Gets "URL of user's website." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getWebsite() {
        return Website;
    }

    /**
     * Sets the specified value to "URL of user's website." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public MyProfile setWebsite(String value) {
        Website = value;
        return this;
    }

    public String toString() {
        return ((MyProfile.class.getSimpleName()+"#")+ this.getID());
    }

}
