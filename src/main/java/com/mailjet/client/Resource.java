package com.mailjet.client;

import com.mailjet.client.enums.ApiAuthenticationType;
import com.mailjet.client.enums.ApiVersion;
import lombok.Getter;

/**
 *
 * @author guillaume
 */
public class Resource {

    @Getter
    private final String resource;

    @Getter
    private final String action;

    @Getter
	private final Boolean withoutNamespace;

    @Getter
	private final ApiVersion apiVersion;

    @Getter
    private final ApiAuthenticationType authenticationType;

	public Resource(String resource, String action, ApiVersion apiVersion, ApiAuthenticationType authenticationType, Boolean withoutNamespace) {
        this.resource = resource;
        this.action = action;
        this.withoutNamespace = withoutNamespace;
        this.apiVersion = apiVersion;
        this.authenticationType = authenticationType;
	}
    
    public Resource(String resource, String action, ApiVersion apiVersion, ApiAuthenticationType authenticationType) {

	    this(resource, action, apiVersion, authenticationType, false);
    }
}
