package com.mailjet.client.transactional;

import com.google.gson.annotations.SerializedName;

/**
 * Enable or disable open tracking on this message.
 * This property will overwrite the preferences selected in the Mailjet account.
 * Equivalent of using X-Mailjet-TrackOpen header through SMTP.
 */
public enum TrackOpens {
    /**
     *  use the values specified in the Mailjet account
     */
    @SerializedName("account_default")
    ACCOUNT_DEFAULT,

    /**
     *  disable tracking for this message
     */
    @SerializedName("disabled")
    DISABLED,

    /**
     *  enable tracking for this message
     */
    @SerializedName("enabled")
    ENABLED
}