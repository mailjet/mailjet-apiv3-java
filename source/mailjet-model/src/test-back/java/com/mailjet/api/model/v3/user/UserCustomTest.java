package com.mailjet.api.model.v3.user;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;

public final class UserCustomTest {

	@Test
	public void testUser() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();

		User existingUser = getFirstUser(client);
		//check value is set
		boolean initialValue = existingUser.getIsBeta();
		try {
			
			boolean updateValue = !initialValue;
			User updatedObject = client.createCall(User.Update)
					.identifiedBy(UserProperty.ID, existingUser.getID())
					.property(UserProperty.ISBETA, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getIsBeta());

			User retrievedObject = get(client, updatedObject.getID());
			
			Assert.assertEquals(updateValue, retrievedObject.getIsBeta());
			
		} finally {
			client.createCall(User.Update)
					.identifiedBy(UserProperty.ID, existingUser.getID())
					.property(UserProperty.ISBETA, initialValue).execute();
		}
	}

	/**
	 * @param client
	 * @return
	 * @throws MailJetApiCallException
	 */
	public User get(MailJetApiClient client, Long id)
			throws MailJetApiCallException {
		//check object could be retrieved and value is correct
		return client.createCall(User.Get)
				.identifiedBy(UserProperty.ID, id)
				.execute();
	}
	
	/**
	 * @param client
	 * @return
	 * @throws MailJetApiCallException
	 */
	public static User getFirstUser(MailJetApiClient client)
			throws MailJetApiCallException {
		//check object could be retrieved and value is correct
		return client.createCall(User.List)
				.limitBy(1)
				.execute().iterator().next();
	}
	
}
