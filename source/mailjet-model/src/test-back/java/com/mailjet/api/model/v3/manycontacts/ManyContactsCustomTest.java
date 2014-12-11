package com.mailjet.api.model.v3.manycontacts;

import java.util.Collections;

import org.junit.Test;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.model.v3.contactslist.ContactsList;
import com.mailjet.api.model.v3.contactslist.ContactsListCustomTest;

public final class ManyContactsCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		ContactsList newContactsList = ContactsListCustomTest.create(client, "name");
		try {
			
			testManyContacts(client, newContactsList);
			
			
		} finally {
			ContactsListCustomTest.delete(client, newContactsList);
		}
	}

	private void testManyContacts(MailJetApiClient client, ContactsList newContactsList) throws MailJetApiCallException {
		boolean initialValue = true;
		//ManyContacts newObject = 
				create(client, newContactsList, initialValue);

//		try {
//			//check value is set
//			Assert.assertEquals(initialValue, newObject.getForce());
//			
//			String updateValue = "test2";
//			ManyContacts updatedObject = client.createCall(Update)
//					.identifiedBy(ManyContactsProperty.ID, newObject.getID())
//					.property(ManyContactsProperty.SOURCE, updateValue).execute();
//			
//			//check value is updated
//			Assert.assertEquals(updateValue, updatedObject.getSource());
//
//			//check object could be retrieved and value is correct
//			ManyContacts retrievedObject = client.createCall(ManyContacts.Get)
//					.identifiedBy(ManyContactsProperty.ID, newObject.getID())
//					.execute();
//			
//			Assert.assertEquals(updateValue, retrievedObject.getSource());
//			
//		} finally {
//			delete(client, newObject);
//		}
	}
	
//	/**
//	 * @param client
//	 * @param key
//	 * @throws MailJetApiCallException
//	 */
//	public static void delete(MailJetApiClient client, ManyContacts key)
//			throws MailJetApiCallException {
//		//delete the created object
//		client.createCall(Delete)
//		.identifiedBy(ManyContactsProperty.ID, key.getID())
//		.execute();
//	}

	public static ManyContacts create(MailJetApiClient client, ContactsList key, boolean initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(ManyContacts.Create)
				.property(ManyContactsProperty.ADDRESSES, Collections.singletonList("test@example.com"))
				.property(ManyContactsProperty.LISTID, key.getID())
				.property(ManyContactsProperty.FORCE, initalValue)
				.execute();
	}
	
	public final static MailJetApiService<MailJetApiCall.Update<ManyContacts>> Update = new MailJetApiService<MailJetApiCall.Update<ManyContacts>>(ManyContacts.class, ResourceOperationTypes.Put);
	public final static MailJetApiService<MailJetApiCall.Delete<ManyContacts>> Delete = new MailJetApiService<MailJetApiCall.Delete<ManyContacts>>(ManyContacts.class, ResourceOperationTypes.Delete);

}
