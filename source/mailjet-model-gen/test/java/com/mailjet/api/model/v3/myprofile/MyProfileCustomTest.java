package com.mailjet.api.model.v3.myprofile;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResourceOperationTypes;

public final class MyProfileCustomTest {

	@Test
	public void testMyProfile() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		String initialValue = "test1";
		MyProfile newObject = create(client, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getFirstname());
			
			String updateValue = "test2";
			MyProfile updatedObject = client.createCall(MyProfile.Update)
					.identifiedBy(MyProfileProperty.ID, newObject.getID())
					.property(MyProfileProperty.FIRSTNAME, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getFirstname());

			//check object could be retrieved and value is correct
			MyProfile retrievedObject = client.createCall(MyProfile.Get)
					.identifiedBy(MyProfileProperty.ID, newObject.getID())
					.execute();
			
			Assert.assertEquals(updateValue, retrievedObject.getFirstname());
			
		} finally {
			delete(client, newObject);
		}
	}
	
	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, MyProfile key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(Delete)
		.identifiedBy(MyProfileProperty.ID, key.getID())
		.execute();
	}

	public static MyProfile create(MailJetApiClient client, String initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(Create)
				.property(MyProfileProperty.FIRSTNAME, initalValue)
				.execute();
	}
	
	public final static MailJetApiService<MailJetApiCall.Create<MyProfile>> Create = new MailJetApiService<MailJetApiCall.Create<MyProfile>>(MyProfile.class, ResourceOperationTypes.Post);
	public final static MailJetApiService<MailJetApiCall.Delete<MyProfile>> Delete = new MailJetApiService<MailJetApiCall.Delete<MyProfile>>(MyProfile.class, ResourceOperationTypes.Delete);

}
