package com.mailjet.api.model.v3.toplinkclicked;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResourceOperationTypes;

public final class TopLinkClickedCustomTest {

	@Test
	public void testTopLinkClicked() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		String initialValue = "http://link1";
		TopLinkClicked newObject = create(client, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getUrl());
			
			String updateValue = "http://link2";
			TopLinkClicked updatedObject = client.createCall(Update)
					.identifiedBy(TopLinkClickedProperty.ID, newObject.getID())
					.property(TopLinkClickedProperty.URL, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getUrl());

			//check object could be retrieved and value is correct
			TopLinkClicked retrievedObject = client.createCall(TopLinkClicked.Get)
					.identifiedBy(TopLinkClickedProperty.ID, newObject.getID())
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
	public static void delete(MailJetApiClient client, TopLinkClicked key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(Delete)
		.identifiedBy(TopLinkClickedProperty.ID, key.getID())
		.execute();
	}

	public static TopLinkClicked create(MailJetApiClient client, String initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(Create)
				.property(TopLinkClickedProperty.URL, initalValue)
				.execute();
	}
	
	public final static MailJetApiService<MailJetApiCall.Create<TopLinkClicked>> Create = new MailJetApiService<MailJetApiCall.Create<TopLinkClicked>>(TopLinkClicked.class, ResourceOperationTypes.Post);
	public final static MailJetApiService<MailJetApiCall.Update<TopLinkClicked>> Update = new MailJetApiService<MailJetApiCall.Update<TopLinkClicked>>(TopLinkClicked.class, ResourceOperationTypes.Put);
	public final static MailJetApiService<MailJetApiCall.Delete<TopLinkClicked>> Delete = new MailJetApiService<MailJetApiCall.Delete<TopLinkClicked>>(TopLinkClicked.class, ResourceOperationTypes.Delete);


}
