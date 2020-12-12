package com.mailjet.client.transactional;

import com.google.gson.annotations.SerializedName;

/**
 * Enable or disable clicks tracking on this message.
 * This property will overwrite the preferences selected in the Mailjet account.
 * Equivalent of using X-Mailjet-TrackClick header through SMTP.
 */
public enum TrackClicks {
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
