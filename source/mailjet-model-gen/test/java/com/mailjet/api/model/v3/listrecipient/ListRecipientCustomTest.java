package com.mailjet.api.model.v3.listrecipient;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.model.v3.contact.Contact;
import com.mailjet.api.model.v3.contact.ContactCustomTest;
import com.mailjet.api.model.v3.contactslist.ContactsList;
import com.mailjet.api.model.v3.contactslist.ContactsListCustomTest;

public final class ListRecipientCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		Contact newContact = ContactCustomTest.create(client, "name");
		try {
			testSetupList(client, newContact);
		} finally {
			ContactCustomTest.delete(client, newContact);
		}
	}

	/**
	 * @param client
	 * @param newContact 
	 * @throws MailJetApiCallException
	 */
	public void testSetupList(MailJetApiClient client, Contact newContact)
			throws MailJetApiCallException {
		ContactsList newContactsList = ContactsListCustomTest.create(client, "name");
		try {
			
			testListRecipient(client, newContactsList, newContact);
			
			
		} finally {
			ContactsListCustomTest.delete(client, newContactsList);
		}
	}

	private void testListRecipient(MailJetApiClient client, ContactsList newContactsList, Contact newContact) throws MailJetApiCallException {
		boolean initialValue = true;
		ListRecipient newObject = create(client, newContactsList, newContact, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getIsActive());
			
			boolean updateValue = false;
			ListRecipient updatedObject = client.createCall(ListRecipient.Update)
					.identifiedBy(ListRecipientProperty.ID, newObject.getID())
					.property(ListRecipientProperty.ISACTIVE, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getIsActive());

			//check object could be retrieved and value is correct
			ListRecipient retrievedObject = client.createCall(ListRecipient.Get)
					.identifiedBy(ListRecipientProperty.ID, newObject.getID())
					.execute();
			
			Assert.assertEquals(updateValue, retrievedObject.getIsActive());
			
		} finally {
			delete(client, newObject);
		}
	}
	
	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, ListRecipient key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(ListRecipient.Delete)
		.identifiedBy(ListRecipientProperty.ID, key.getID())
		.execute();
	}

	public static ListRecipient create(MailJetApiClient client, ContactsList list, Contact newContact, boolean isActive)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(ListRecipient.Create)
				.property(ListRecipientProperty.ISACTIVE, isActive)
				.property(ListRecipientProperty.LISTID, list.getID())
				.property(ListRecipientProperty.CONTACTID, newContact.getID())
				.execute();
	}
	
}
