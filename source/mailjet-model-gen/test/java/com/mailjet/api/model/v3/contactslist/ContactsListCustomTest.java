package com.mailjet.api.model.v3.contactslist;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;

public final class ContactsListCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		String initialValue = "test1";
		
		ContactsList executeCreate = create(client, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, executeCreate.getName());
			
			String updateValue = "test2";
			ContactsList executeUpdate = client.createCall(ContactsList.Update)
					.identifiedBy(ContactsListProperty.ID, executeCreate.getID())
					.property(ContactsListProperty.NAME, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, executeUpdate.getName());

			//check object could be retrieved and value is correct
			ContactsList executeGet = get(client, executeCreate.getID());
			
			Assert.assertEquals(updateValue, executeGet.getName());
			
		} finally {
			delete(client, executeCreate);
		}
		

		
	}

	/**
	 * @param client
	 * @param executeCreate
	 * @return
	 * @throws MailJetApiCallException
	 */
	public static ContactsList get(MailJetApiClient client, Long  id)
			throws MailJetApiCallException {
		ContactsList executeGet = client.createCall(ContactsList.Get)
				.identifiedBy(ContactsListProperty.ID, id)
				.execute();
		return executeGet;
	}

	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, ContactsList key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(ContactsList.Delete)
		.identifiedBy(ContactsListProperty.ID, key.getID())
		.execute();
	}

	public static ContactsList create(MailJetApiClient client, String initialValue)
			throws MailJetApiCallException {
		//create new object
		ContactsList executeCreate = client.createCall(ContactsList.Create)
				.property(ContactsListProperty.NAME, initialValue).execute();
		return executeCreate;
	}
	
	
}
