package com.mailjet.client.resource.sms;

import com.mailjet.client.Resource;
import com.mailjet.client.enums.ApiAuthenticationType;
import com.mailjet.client.enums.ApiVersion;

/**
 *
 * @author Ivaylo Ivanov
 */
public class SmsCount {

    public static final Resource resource = new Resource("sms/count", "", ApiVersion.V4, ApiAuthenticationType.Bearer, true);

    public static final String COUNT = "Count";

}