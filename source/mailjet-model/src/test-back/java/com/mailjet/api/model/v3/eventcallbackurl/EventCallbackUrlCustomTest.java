package com.mailjet.api.model.v3.eventcallbackurl;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.model.v3.apikey.ApiKey;
import com.mailjet.api.model.v3.apikey.ApiKeyCustomTest;

public final class EventCallbackUrlCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		testEventCallbackUrl(client, ApiKeyCustomTest.getCurrentApiKey(client, config));
	}

	private void testEventCallbackUrl(MailJetApiClient client, ApiKey newApiKey) throws MailJetApiCallException {
		String initialValue = "http://test1";
		EventCallbackUrl newObject = create(client, newApiKey, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getUrl());
			
			String updateValue = "http://test2";
			EventCallbackUrl updatedObject = client.createCall(EventCallbackUrl.Update)
					.identifiedBy(EventCallbackUrlProperty.ID, newObject.getID())
					.property(EventCallbackUrlProperty.URL, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getUrl());

			//check object could be retrieved and value is correct
			EventCallbackUrl retrievedObject = client.createCall(EventCallbackUrl.Get)
					.identifiedBy(EventCallbackUrlProperty.ID, newObject.getID())
					.execute();
			
			Assert.assertEquals(updateValue, retrievedObject.getUrl());
			
		} finally {
			delete(client, newObject);
		}
	}
	
	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, EventCallbackUrl key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(EventCallbackUrl.Delete)
		.identifiedBy(EventCallbackUrlProperty.ID, key.getID())
		.execute();
	}

	public static EventCallbackUrl create(MailJetApiClient client, ApiKey key, String initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(EventCallbackUrl.Create)
				.property(EventCallbackUrlProperty.APIKEYID, key.getID())
				.property(EventCallbackUrlProperty.EVENTTYPE, (short)15)
				.property(EventCallbackUrlProperty.URL, initalValue)
				.execute();
	}

}
