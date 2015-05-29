
package com.mailjet.api.model.v3.widgetcustomvalue;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Specifics settings for a given Mailjet Widget. See Widget.Mailjet widget settings.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "widgetcustomvalue", description = "Specifics settings for a given Mailjet Widget. See Widget.Mailjet widget settings.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
}, uniquekey = "Widget|Name")
public final class WidgetCustomValue {

    @Component(name = "APIKeyID", type = "TAPIKey", defaultValue = "", required = false, description = "APIKey to which the widget and custom value belongs.")
    private Long APIKeyID;
    @Component(name = "Display", type = "Boolean", defaultValue = "false", required = false, description = "Should the value be displayed.")
    private Boolean Display;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "Name", type = "AnsiString", defaultValue = "", required = true, description = "Name of the custom value.")
    private String Name;
    @Component(name = "Value", type = "AnsiString", defaultValue = "", required = false, description = "Value of the custom value.")
    private String Value;
    @Component(name = "WidgetID", type = "TWidget", defaultValue = "", required = true, description = "Widget for which the value is registered.")
    private Long WidgetID;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<WidgetCustomValue>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<WidgetCustomValue>>(WidgetCustomValue.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<WidgetCustomValue>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<WidgetCustomValue>>(WidgetCustomValue.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<WidgetCustomValue>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<WidgetCustomValue>>(WidgetCustomValue.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<WidgetCustomValue>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<WidgetCustomValue>>(WidgetCustomValue.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<WidgetCustomValue>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<WidgetCustomValue>>(WidgetCustomValue.class, ResourceOperationTypes.Delete);

    /**
     * Gets "APIKey to which the widget and custom value belongs." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getAPIKeyID() {
        return APIKeyID;
    }

    /**
     * Sets the specified value to "APIKey to which the widget and custom value belongs." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public WidgetCustomValue setAPIKeyID(Long value) {
        APIKeyID = value;
        return this;
    }

    /**
     * Gets "Should the value be displayed." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getDisplay() {
        return Display;
    }

    /**
     * Sets the specified value to "Should the value be displayed." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public WidgetCustomValue setDisplay(Boolean value) {
        Display = value;
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
    public WidgetCustomValue setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Name of the custom value." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the specified value to "Name of the custom value." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public WidgetCustomValue setName(String value) {
        Name = value;
        return this;
    }

    /**
     * Gets "Value of the custom value." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getValue() {
        return Value;
    }

    /**
     * Sets the specified value to "Value of the custom value." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public WidgetCustomValue setValue(String value) {
        Value = value;
        return this;
    }

    /**
     * Gets "Widget for which the value is registered." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getWidgetID() {
        return WidgetID;
    }

    /**
     * Sets the specified value to "Widget for which the value is registered." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public WidgetCustomValue setWidgetID(Long value) {
        WidgetID = value;
        return this;
    }

    public String toString() {
        return ((WidgetCustomValue.class.getSimpleName()+"#")+ this.getID());
    }

}
