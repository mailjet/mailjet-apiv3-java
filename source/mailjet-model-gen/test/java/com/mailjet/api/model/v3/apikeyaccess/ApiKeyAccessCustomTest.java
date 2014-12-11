package com.mailjet.api.model.v3.apikeyaccess;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.model.v3.apikey.ApiKey;
import com.mailjet.api.model.v3.apikey.ApiKeyCustomTest;
import com.mailjet.api.model.v3.user.UserCustomTest;

public final class ApiKeyAccessCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		ApiKey newApiKey = ApiKeyCustomTest.create(client, "name");
		try {
			
			testApiKeyAccess(client, newApiKey);
			
			
		} finally {
			ApiKeyCustomTest.delete(client, newApiKey);
		}
	}

	private void testApiKeyAccess(MailJetApiClient client, ApiKey newApiKey) throws MailJetApiCallException {
		String initialValue = "test1";
		ApiKeyAccess newObject = create(client, newApiKey, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getCustomName());
			
			String updateValue = "test2";
			ApiKeyAccess updatedObject = client.createCall(ApiKeyAccess.Update)
					.identifiedBy(ApiKeyAccessProperty.ID, newObject.getID())
					.property(ApiKeyAccessProperty.CUSTOMNAME, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getCustomName());

			//check object could be retrieved and value is correct
			ApiKeyAccess retrievedObject = client.createCall(ApiKeyAccess.Get)
					.identifiedBy(ApiKeyAccessProperty.ID, newObject.getID())
					.execute();
			
			Assert.assertEquals(updateValue, retrievedObject.getCustomName());
			
		} finally {
			delete(client, newObject);
		}
	}
	
	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, ApiKeyAccess key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(ApiKeyAccess.Delete)
		.identifiedBy(ApiKeyAccessProperty.ID, key.getID())
		.execute();
	}

	public static ApiKeyAccess create(MailJetApiClient client, ApiKey key, String initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(ApiKeyAccess.Create)
				.property(ApiKeyAccessProperty.APIKEYID, key.getID())
				.property(ApiKeyAccessProperty.USERID, UserCustomTest.getFirstUser(client).getID())
				.property(ApiKeyAccessProperty.CUSTOMNAME, initalValue)
				.execute();
	}

}
