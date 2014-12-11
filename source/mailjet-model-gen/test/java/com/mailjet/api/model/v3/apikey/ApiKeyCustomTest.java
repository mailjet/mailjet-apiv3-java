package com.mailjet.api.model.v3.apikey;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;

public final class ApiKeyCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		String initialValue = "test1";
		
		ApiKey executeCreate = create(client, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, executeCreate.getName());
			
			String updateValue = "test2";
			ApiKey executeUpdate = client.createCall(ApiKey.Update)
					.identifiedBy(ApiKeyProperty.ID, executeCreate.getID())
					.property(ApiKeyProperty.NAME, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, executeUpdate.getName());

			//check object could be retrieved and value is correct
			ApiKey executeGet = get(client, executeCreate.getID());
			
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
	public static ApiKey get(MailJetApiClient client, Long  id)
			throws MailJetApiCallException {
		ApiKey executeGet = client.createCall(ApiKey.Get)
				.identifiedBy(ApiKeyProperty.ID, id)
				.execute();
		return executeGet;
	}
	
	
	public static ApiKey getCurrentApiKey(MailJetApiClient client, MailJetClientConfiguration config)
			throws MailJetApiCallException {
		ApiKey executeGet = client.createCall(ApiKey.Get)
				.identifiedBy(ApiKeyProperty.ID, 9248L)
				.execute();
		return executeGet;
	}

	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, ApiKey key)
			throws MailJetApiCallException {
		if(9248L == key.getID()){
			throw new RuntimeException("Cannot delete ApiKey in use!"); 
		}
		//delete the created object
		client.createCall(ApiKey.Delete)
		.identifiedBy(ApiKeyProperty.ID, key.getID())
		.execute();
	}

	public static ApiKey create(MailJetApiClient client, String initialValue)
			throws MailJetApiCallException {
		//create new object
		ApiKey executeCreate = client.createCall(ApiKey.Create)
				.property(ApiKeyProperty.NAME, initialValue).execute();
		return executeCreate;
	}

}
