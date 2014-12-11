package com.mailjet.api.model.v3.widget;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.model.v3.contactslist.ContactsList;
import com.mailjet.api.model.v3.contactslist.ContactsListCustomTest;
import com.mailjet.api.model.v3.sender.Sender;
import com.mailjet.api.model.v3.sender.SenderCustomTest;

public final class WidgetCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		Sender newSender = SenderCustomTest.create(client, "name");
		try {
			testSetupList(client, newSender);
		} finally {
			SenderCustomTest.delete(client, newSender);
		}
	}

	/**
	 * @param client
	 * @param newContact 
	 * @throws MailJetApiCallException
	 */
	public void testSetupList(MailJetApiClient client, Sender newSender)
			throws MailJetApiCallException {
		ContactsList newContactsList = ContactsListCustomTest.create(client, "name");
		try {
			
			testWidget(client, newContactsList, newSender);
			
			
		} finally {
			ContactsListCustomTest.delete(client, newContactsList);
		}
	}

	private void testWidget(MailJetApiClient client, ContactsList newContactsList, Sender newSender) throws MailJetApiCallException {
		boolean initialValue = true;
		Widget newObject = create(client, newContactsList, newSender, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getIsActive());
			
			boolean updateValue = false;
			Widget updatedObject = client.createCall(Widget.Update)
					.identifiedBy(WidgetProperty.ID, newObject.getID())
					.property(WidgetProperty.ISACTIVE, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getIsActive());

			//check object could be retrieved and value is correct
			Widget retrievedObject = client.createCall(Widget.Get)
					.identifiedBy(WidgetProperty.ID, newObject.getID())
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
	public static void delete(MailJetApiClient client, Widget key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(Widget.Delete)
		.identifiedBy(WidgetProperty.ID, key.getID())
		.execute();
	}

	public static Widget create(MailJetApiClient client, ContactsList list, Sender sender, boolean isActive)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(Widget.Create)
				.property(WidgetProperty.ISACTIVE, isActive)
				.property(WidgetProperty.LOCALE, "FR")
				.property(WidgetProperty.LISTID, list.getID())
				.property(WidgetProperty.FROMID, sender.getID())
				.execute();
	}
	
	public static Widget create(MailJetApiClient client)
			throws MailJetApiCallException {
		
		Sender newSender = SenderCustomTest.create(client, "name");
		try {
			ContactsList newContactsList = ContactsListCustomTest.create(client, "name");
			
			try {
				
				return create(client, newContactsList, newSender, true);
				
				
			} finally {
				ContactsListCustomTest.delete(client, newContactsList);
			}
		} finally {
			SenderCustomTest.delete(client, newSender);
		}
		
	}
	
}
