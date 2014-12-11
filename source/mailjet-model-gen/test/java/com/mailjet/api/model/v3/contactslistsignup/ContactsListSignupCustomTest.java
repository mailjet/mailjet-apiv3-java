package com.mailjet.api.model.v3.contactslistsignup;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.model.v3.contactslist.ContactsList;
import com.mailjet.api.model.v3.contactslist.ContactsListCustomTest;

public final class ContactsListSignupCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		ContactsList newContactsList = ContactsListCustomTest.create(client, "name");
		try {
			
			testContactsListSignup(client, newContactsList);
			
			
		} finally {
			ContactsListCustomTest.delete(client, newContactsList);
		}
	}

	private void testContactsListSignup(MailJetApiClient client, ContactsList newContactsList) throws MailJetApiCallException {
		String initialValue = "test1";
		ContactsListSignup newObject = create(client, newContactsList, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getSource());
			
			String updateValue = "test2";
			ContactsListSignup updatedObject = client.createCall(Update)
					.identifiedBy(ContactsListSignupProperty.ID, newObject.getID())
					.property(ContactsListSignupProperty.SOURCE, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getSource());

			//check object could be retrieved and value is correct
			ContactsListSignup retrievedObject = client.createCall(ContactsListSignup.Get)
					.identifiedBy(ContactsListSignupProperty.ID, newObject.getID())
					.execute();
			
			Assert.assertEquals(updateValue, retrievedObject.getSource());
			
		} finally {
			delete(client, newObject);
		}
	}
	
	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, ContactsListSignup key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(Delete)
		.identifiedBy(ContactsListSignupProperty.ID, key.getID())
		.execute();
	}

	public static ContactsListSignup create(MailJetApiClient client, ContactsList key, String initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(Create)
				.property(ContactsListSignupProperty.EMAIL, "test@example.com")
				.property(ContactsListSignupProperty.LISTID, key.getID())
				.property(ContactsListSignupProperty.SOURCE, initalValue)
				.execute();
	}
	
	public final static MailJetApiService<MailJetApiCall.Create<ContactsListSignup>> Create = new MailJetApiService<MailJetApiCall.Create<ContactsListSignup>>(ContactsListSignup.class, ResourceOperationTypes.Post);
	public final static MailJetApiService<MailJetApiCall.Update<ContactsListSignup>> Update = new MailJetApiService<MailJetApiCall.Update<ContactsListSignup>>(ContactsListSignup.class, ResourceOperationTypes.Put);
	public final static MailJetApiService<MailJetApiCall.Delete<ContactsListSignup>> Delete = new MailJetApiService<MailJetApiCall.Delete<ContactsListSignup>>(ContactsListSignup.class, ResourceOperationTypes.Delete);

}
