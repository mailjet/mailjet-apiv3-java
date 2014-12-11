package com.mailjet.api.model.v3.trigger;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.model.v3.apikey.ApiKeyCustomTest;

public final class TriggerCustomTest {

	@Test
	public void testTrigger() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		String initialValue = "test1";
		Trigger newObject = create(client, initialValue, config);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getDetails());
			
			String updateValue = "test2";
			Trigger updatedObject = client.createCall(Trigger.Update)
					.identifiedBy(TriggerProperty.ID, newObject.getID())
					.property(TriggerProperty.DETAILS, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getDetails());

			//check object could be retrieved and value is correct
			Trigger retrievedObject = client.createCall(Trigger.Get)
					.identifiedBy(TriggerProperty.ID, newObject.getID())
					.execute();
			
			Assert.assertEquals(updateValue, retrievedObject.getDetails());
			
		} finally {
			delete(client, newObject);
		}
	}
	
	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, Trigger key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(Trigger.Delete)
		.identifiedBy(TriggerProperty.ID, key.getID())
		.execute();
	}

	public static Trigger create(MailJetApiClient client, String initalValue, MailJetClientConfiguration config)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(Trigger.Create)
				.property(TriggerProperty.APIKEY, ApiKeyCustomTest.getCurrentApiKey(client, config).getID().intValue())
				.property(TriggerProperty.DETAILS, initalValue)
				.execute();
	}
	

}
