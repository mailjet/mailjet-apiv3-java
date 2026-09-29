
/*
 * This is a generated class.
 */

package com.mailjet.client.resource;

import com.mailjet.client.Resource;
import com.mailjet.client.enums.ApiAuthenticationType;
import com.mailjet.client.enums.ApiVersion;

/**
 *
 * @author Guillaume Badi
 * @deprecated Use {@link CampaigndraftDetailcontent} to manage campaign draft content.
 */
@Deprecated
public class NewsletterDetailcontent {

    public static Resource resource = new Resource("newsletter", "detailcontent", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static String TEXTPART = "Text-part";
	public static String HTMLPART = "Html-part";

}
