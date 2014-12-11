package com.mailjet.api.model.v3.campaign;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResourceOperationTypes;

public final class CampaignCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		String initialValue = "test1";
		
		Campaign executeCreate = create(client, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, executeCreate.getSubject());
			
			String updateValue = "test2";
			Campaign executeUpdate = client.createCall(Update)
					.identifiedBy(CampaignProperty.ID, executeCreate.getID())
					.property(CampaignProperty.SUBJECT, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, executeUpdate.getSubject());

			//check object could be retrieved and value is correct
			Campaign executeGet = get(client, executeCreate.getID());
			
			Assert.assertEquals(updateValue, executeGet.getSubject());
			
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
	public static Campaign get(MailJetApiClient client, Long  id)
			throws MailJetApiCallException {
		Campaign executeGet = client.createCall(Campaign.Get)
				.identifiedBy(CampaignProperty.ID, id)
				.execute();
		return executeGet;
	}

	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, Campaign key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(Delete)
		.identifiedBy(CampaignProperty.ID, key.getID())
		.execute();
	}

	public static Campaign create(MailJetApiClient client, String initialValue)
			throws MailJetApiCallException {
		//create new object
		Campaign executeCreate = client.createCall(Create)
				.property(CampaignProperty.FROMEMAIL, "test_" + new Date().getTime() + "@example.com")
				.property(CampaignProperty.SUBJECT, initialValue).execute();
		return executeCreate;
	}
	
	
	public final static MailJetApiService<MailJetApiCall.Create<Campaign>> Create = new MailJetApiService<MailJetApiCall.Create<Campaign>>(Campaign.class, ResourceOperationTypes.Post);
	public final static MailJetApiService<MailJetApiCall.Update<Campaign>> Update = new MailJetApiService<MailJetApiCall.Update<Campaign>>(Campaign.class, ResourceOperationTypes.Put);
	public final static MailJetApiService<MailJetApiCall.Delete<Campaign>> Delete = new MailJetApiService<MailJetApiCall.Delete<Campaign>>(Campaign.class, ResourceOperationTypes.Delete);

}
