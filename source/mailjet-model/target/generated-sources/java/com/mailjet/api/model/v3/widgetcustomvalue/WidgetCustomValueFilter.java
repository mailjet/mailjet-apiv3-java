
package com.mailjet.api.model.v3.widgetcustomvalue;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "widgetcustomvalue" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class WidgetCustomValueFilter<DataType >
    extends MailJetResourceFilter<WidgetCustomValue, DataType>
{

    /**
     * Only retrieve widgetcustomvalue resources for which Name equals the specified value.
     * 
     */
    public final static WidgetCustomValueFilter<String> NAME = new WidgetCustomValueFilter<String>("Name", String.class);
    /**
     * Only retrieve widgetcustomvalue resources for which Widget ID equals the specified value.
     * 
     */
    public final static WidgetCustomValueFilter<Long> WIDGET = new WidgetCustomValueFilter<Long>("Widget", Long.class);

    private WidgetCustomValueFilter(String name, Class<?> type) {
        super(name, type);
    }

}
