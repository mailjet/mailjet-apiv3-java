package com.mailjet.client;

import com.mailjet.client.enums.ApiAuthenticationType;
import com.mailjet.client.enums.ApiVersion;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author guillaume
 */
@Getter
@RequiredArgsConstructor
public class Resource {

    private final String resource;
    private final String action;
    private final ApiVersion apiVersion;
    private final ApiAuthenticationType authenticationType;
    private final Boolean withoutNamespace;

    public Resource(String resource, String action, ApiVersion apiVersion, ApiAuthenticationType authenticationType) {
        this(resource, action, apiVersion, authenticationType, false);
    }
}
