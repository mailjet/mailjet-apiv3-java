
package com.mailjet.api.model.v3.widgetcustomvalue;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "widgetcustomvalue" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class WidgetCustomValueProperty<DataType >
    extends MailJetResourceProperty<WidgetCustomValue, DataType>
{

    /**
     * APIKey to which the widget and custom value belongs.
     * 
     */
    public final static WidgetCustomValueProperty<Long> APIKEYID = new WidgetCustomValueProperty<Long>("APIKeyID", Long.class);
    /**
     * Should the value be displayed.
     * 
     */
    public final static WidgetCustomValueProperty<Boolean> DISPLAY = new WidgetCustomValueProperty<Boolean>("Display", Boolean.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static WidgetCustomValueProperty.Key<Long> ID = new WidgetCustomValueProperty.Key<Long>("ID", Long.class);
    /**
     * Name of the custom value.
     * 
     */
    public final static WidgetCustomValueProperty.Key<String> NAME = new WidgetCustomValueProperty.Key<String>("Name", String.class);
    /**
     * Value of the custom value.
     * 
     */
    public final static WidgetCustomValueProperty<String> VALUE = new WidgetCustomValueProperty<String>("Value", String.class);
    /**
     * Widget for which the value is registered.
     * 
     */
    public final static WidgetCustomValueProperty.Key<Long> WIDGETID = new WidgetCustomValueProperty.Key<Long>("WidgetID", Long.class);

    private WidgetCustomValueProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static WidgetCustomValueProperty<Object> ref(String name) {
        return new WidgetCustomValueProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<WidgetCustomValue, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
