package com.mailjet.api.model.v3.contact;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResourceOperationTypes;

public final class ContactCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		String initialValue = "test1";
		
		Contact executeCreate = create(client, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, executeCreate.getName());
			
			String updateValue = "test2";
			Contact executeUpdate = client.createCall(Contact.Update)
					.identifiedBy(ContactProperty.ID, executeCreate.getID())
					.property(ContactProperty.NAME, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, executeUpdate.getName());

			//check object could be retrieved and value is correct
			Contact executeGet = get(client, executeCreate.getID());
			
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
	public static Contact get(MailJetApiClient client, Long  id)
			throws MailJetApiCallException {
		Contact executeGet = client.createCall(Contact.Get)
				.identifiedBy(ContactProperty.ID, id)
				.execute();
		return executeGet;
	}

	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, Contact key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(Delete)
		.identifiedBy(ContactProperty.ID, key.getID())
		.execute();
	}

	public static Contact create(MailJetApiClient client, String initialValue)
			throws MailJetApiCallException {
		//create new object
		Contact executeCreate = client.createCall(Contact.Create)
				.property(ContactProperty.EMAIL, "test_" + new Date().getTime() + "@example.com")
				.property(ContactProperty.NAME, initialValue).execute();
		return executeCreate;
	}
	
	
	public final static MailJetApiService<MailJetApiCall.Delete<Contact>> Delete = new MailJetApiService<MailJetApiCall.Delete<Contact>>(Contact.class, ResourceOperationTypes.Delete);

}
