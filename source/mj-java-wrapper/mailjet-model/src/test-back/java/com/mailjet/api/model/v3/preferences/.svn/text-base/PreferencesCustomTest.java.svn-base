package com.mailjet.api.model.v3.preferences;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.model.v3.user.UserCustomTest;

public final class PreferencesCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();

		String initialValue = "test1";
		Preferences newObject = create(client, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getValue());
			
			String updateValue = "test2";
			Preferences updatedObject = client.createCall(Preferences.Update)
					.identifiedBy(PreferencesProperty.ID, newObject.getID())
					.property(PreferencesProperty.VALUE, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getValue());

			//check object could be retrieved and value is correct
			Preferences retrievedObject = client.createCall(Preferences.Get)
					.identifiedBy(PreferencesProperty.ID, newObject.getID())
					.execute();
			
			Assert.assertEquals(updateValue, retrievedObject.getValue());
			
		} finally {
			//delete(client, newObject);
		}
	}
	
	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, Preferences key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(Preferences.Delete)
		.identifiedBy(PreferencesProperty.ID, key.getID())
		.execute();
	}

	public static Preferences create(MailJetApiClient client, String initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(Preferences.Create)
				.property(PreferencesProperty.USERID, UserCustomTest.getFirstUser(client).getID())
				.property(PreferencesProperty.KEY, "test_key" + new Date().getTime())
				.property(PreferencesProperty.VALUE, initalValue)
				.execute();
	}

}
