package com.mailjet.client;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Contact;
import com.mailjet.client.resource.Contacts;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.UUID;

// don't want to bring more complex test frameworks for now, so just workaround to have specific test order and have flow like create-read-delete
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContactFlowIT {

    private static final MailjetClient mailjetClient = TestHelper.getClient();
    private static final String contactEmail = String.format("integrationtest%s@mailjet.com", UUID.randomUUID());
    private static final String contactName = "Integration test Contact";
    private static long createdContactId;

    @Test
    public void a_createContactTest() throws MailjetException {
        // arrange
        MailjetRequest mailjetRequest = new MailjetRequest(Contact.resource)
                .property(Contact.ISEXCLUDEDFROMCAMPAIGNS, "true")
                .property(Contact.NAME, contactName)
                .property(Contact.EMAIL, contactEmail);

        // act
        MailjetResponse mailjetResponse = mailjetClient.post(mailjetRequest);

        // assert
        Assert.assertEquals(201, mailjetResponse.getStatus());
    }

    @Test
    public void b_getContactTest() throws MailjetException {

        // arrange
        MailjetRequest mailjetRequest = new MailjetRequest(Contact.resource, contactEmail);

        // act
        MailjetResponse mailjetResponse = mailjetClient.get(mailjetRequest);

        // assert
        Assert.assertEquals(200, mailjetResponse.getStatus());
        Assert.assertEquals(1, mailjetResponse.getCount());

        JSONObject contactData = mailjetResponse.getData().getJSONObject(0);
        Assert.assertEquals(contactEmail, contactData.getString("Email"));
        Assert.assertEquals(true, contactData.getBoolean("IsExcludedFromCampaigns"));
        Assert.assertEquals("Integration test Contact", contactData.getString("Name"));

        createdContactId = contactData.getLong("ID");
    }

    @Test
    public void c_deleteContactTest() throws MailjetException {
        // arrange
        Assert.assertNotEquals(0, createdContactId);
        MailjetRequest mailjetRequest = new MailjetRequest(Contacts.resource, createdContactId);

        MailjetClient mailjetClientV4 = TestHelper.getClient();

        // act
        MailjetResponse mailjetResponse = mailjetClientV4.delete(mailjetRequest);

        // assert
        Assert.assertEquals(200, mailjetResponse.getStatus());
    }
}
