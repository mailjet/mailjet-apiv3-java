package com.mailjet.api.model.v3.metasender;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResourceOperationTypes;

public final class MetaSenderCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		String initialValue = "test1";
		
		MetaSender executeCreate = create(client, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, executeCreate.getDescription());
			
			String updateValue = "test2";
			MetaSender executeUpdate = client.createCall(MetaSender.Update)
					.identifiedBy(MetaSenderProperty.ID, executeCreate.getID())
					.property(MetaSenderProperty.DESCRIPTION, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, executeUpdate.getDescription());

			//check object could be retrieved and value is correct
			MetaSender executeGet = get(client, executeCreate.getID());
			
			Assert.assertEquals(updateValue, executeGet.getDescription());
			
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
	public static MetaSender get(MailJetApiClient client, Long  id)
			throws MailJetApiCallException {
		MetaSender executeGet = client.createCall(MetaSender.Get)
				.identifiedBy(MetaSenderProperty.ID, id)
				.execute();
		return executeGet;
	}

	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, MetaSender key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(Delete)
		.identifiedBy(MetaSenderProperty.ID, key.getID())
		.execute();
	}

	public static MetaSender create(MailJetApiClient client, String initialValue)
			throws MailJetApiCallException {
		//create new object
		MetaSender executeCreate = client.createCall(MetaSender.Create)
				.property(MetaSenderProperty.EMAIL, "test_" + new Date().getTime() + "@example.com")
				.property(MetaSenderProperty.DESCRIPTION, initialValue).execute();
		return executeCreate;
	}
	
	
	public final static MailJetApiService<MailJetApiCall.Delete<MetaSender>> Delete = new MailJetApiService<MailJetApiCall.Delete<MetaSender>>(MetaSender.class, ResourceOperationTypes.Delete);

}
