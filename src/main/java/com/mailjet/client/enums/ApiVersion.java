package com.mailjet.client.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Declares constants with supported MailJet API versions
 */
@RequiredArgsConstructor
public enum ApiVersion {

    V3_1("v3.1"),
    V3("v3"),
    V4("v4");

    @Getter
    private final String urlSegment;

}
