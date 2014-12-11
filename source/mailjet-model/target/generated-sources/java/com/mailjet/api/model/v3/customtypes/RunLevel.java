
package com.mailjet.api.model.v3.customtypes;

import com.mailjet.api.client.model.metadata.EnumValue;


/**
 * Enumeration defining allowed values for "Runlevel"(Runlevel, used to indicate data is migrated and reduced performance is expected.) MailJet API property.
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
public enum RunLevel {


    /**
     * Value "Normal".
     * 
     */
    @EnumValue("Normal")
    NORMAL,

    /**
     * Value "Softlock".
     * 
     */
    @EnumValue("Softlock")
    SOFTLOCK,

    /**
     * Value "Hardlock".
     * 
     */
    @EnumValue("Hardlock")
    HARDLOCK;

}
