
package com.mailjet.api.model.v3.customtypes;

import com.mailjet.api.client.model.metadata.EnumValue;


/**
 * Enumeration defining allowed values for "WinnerMethod"() MailJet API property.
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public enum WinnerMethod {


    /**
     * Value "OpenRate".
     * 
     */
    @EnumValue("OpenRate")
    OPENRATE,

    /**
     * Value "ClickRate".
     * 
     */
    @EnumValue("ClickRate")
    CLICKRATE,

    /**
     * Value "SpamRate".
     * 
     */
    @EnumValue("SpamRate")
    SPAMRATE,

    /**
     * Value "UnsubRate".
     * 
     */
    @EnumValue("UnsubRate")
    UNSUBRATE,

    /**
     * Value "MJScore".
     * 
     */
    @EnumValue("MJScore")
    MJSCORE;

}
