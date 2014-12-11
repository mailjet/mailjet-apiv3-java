
package com.mailjet.api.model.v3.customtypes;

import com.mailjet.api.client.model.metadata.EnumValue;


/**
 * Enumeration defining allowed values for "EventType"(Type of event.) MailJet API property.
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public enum MessageEventType {


    /**
     * Value "sent".
     * 
     */
    @EnumValue("sent")
    SENT,

    /**
     * Value "opened".
     * 
     */
    @EnumValue("opened")
    OPENED,

    /**
     * Value "clicked".
     * 
     */
    @EnumValue("clicked")
    CLICKED,

    /**
     * Value "bounced".
     * 
     */
    @EnumValue("bounced")
    BOUNCED,

    /**
     * Value "blocked".
     * 
     */
    @EnumValue("blocked")
    BLOCKED;

}
