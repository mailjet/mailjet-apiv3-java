package com.mailjet.api.model.v3.sender;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResourceOperationTypes;

public final class SenderCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		String initialValue = "test1";
		
		Sender executeCreate = create(client, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, executeCreate.getName());
			
			String updateValue = "test2";
			Sender executeUpdate = client.createCall(Sender.Update)
					.identifiedBy(SenderProperty.ID, executeCreate.getID())
					.property(SenderProperty.NAME, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, executeUpdate.getName());

			//check object could be retrieved and value is correct
			Sender executeGet = get(client, executeCreate.getID());
			
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
	public static Sender get(MailJetApiClient client, Long  id)
			throws MailJetApiCallException {
		Sender executeGet = client.createCall(Sender.Get)
				.identifiedBy(SenderProperty.ID, id)
				.execute();
		return executeGet;
	}

	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, Sender key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(Delete)
		.identifiedBy(SenderProperty.ID, key.getID())
		.execute();
	}

	public static Sender create(MailJetApiClient client, String initialValue)
			throws MailJetApiCallException {
		//create new object
		Sender executeCreate = client.createCall(Sender.Create)
				.property(SenderProperty.EMAIL, "test_" + new Date().getTime() + "@example.com")
				.property(SenderProperty.NAME, initialValue).execute();
		return executeCreate;
	}
	
	
	public final static MailJetApiService<MailJetApiCall.Delete<Sender>> Delete = new MailJetApiService<MailJetApiCall.Delete<Sender>>(Sender.class, ResourceOperationTypes.Delete);

}
