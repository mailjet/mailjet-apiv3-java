package com.mailjet.client.resource;

import com.mailjet.client.Resource;

/**
 * contacts resource
 * Please, care - this is used only for GDPR delete contact call in the API version v4
 * https://dev.mailjet.com/email/guides/contact-management/#gdpr-delete-contacts
 * For any other contact actions use {@link com.mailjet.client.resource.Contact} and API v3
 */
public class Contacts {

    public static Resource resource = new Resource("contacts", "", true);
}
