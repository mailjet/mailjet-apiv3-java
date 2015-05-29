
package com.mailjet.api.model.v3.preferences;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "User preferences in key=value format.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "preferences", description = "User preferences in key=value format.", allowedOperations = {
    ResourceOperationTypes.Get
}, uniquekey = "Key")
public final class Preferences {

    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "Key", type = "AnsiString", defaultValue = "", required = true, description = "Name of preference.")
    private String Key;
    @Component(name = "UserID", type = "TUser", defaultValue = "", required = true, description = "User for which this is the preference.")
    private Long UserID;
    @Component(name = "Value", type = "AnsiString", defaultValue = "", required = false, description = "Value of preference.")
    private String Value;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Preferences>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Preferences>>(Preferences.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Preferences>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Preferences>>(Preferences.class, ResourceOperationTypes.GetById);

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
    public Preferences setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Name of preference." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getKey() {
        return Key;
    }

    /**
     * Sets the specified value to "Name of preference." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Preferences setKey(String value) {
        Key = value;
        return this;
    }

    /**
     * Gets "User for which this is the preference." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getUserID() {
        return UserID;
    }

    /**
     * Sets the specified value to "User for which this is the preference." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Preferences setUserID(Long value) {
        UserID = value;
        return this;
    }

    /**
     * Gets "Value of preference." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getValue() {
        return Value;
    }

    /**
     * Sets the specified value to "Value of preference." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Preferences setValue(String value) {
        Value = value;
        return this;
    }

    public String toString() {
        return ((Preferences.class.getSimpleName()+"#")+ this.getID());
    }

}
