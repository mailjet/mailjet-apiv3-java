package com.mailjet.client.enums;

import lombok.Getter;

/**
 * Declares constants with supported MailJet API versions
 */
public enum ApiVersion {

    V3_1("v3.1"),
    V3("v3"),
    V4("v4");

    @Getter
    private final String urlSegment;

    ApiVersion(String urlSegment){
        this.urlSegment = urlSegment;
    }
}
