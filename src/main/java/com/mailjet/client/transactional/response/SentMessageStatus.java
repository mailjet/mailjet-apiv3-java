package com.mailjet.client.transactional.response;

import com.google.gson.annotations.SerializedName;

public enum SentMessageStatus {
    @SerializedName("success")
    SUCCESS,

    @SerializedName("error")
    ERROR
}
