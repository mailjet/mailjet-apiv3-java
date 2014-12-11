package com.mailjet.api.model.v3.newsletter;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResourceOperationTypes;

public final class NewsletterCustomTest {

	@Test
	public void testNewsletter() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		String initialValue = "subject1";
		Newsletter newObject = create(client, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getSubject());
			
			String updateValue = "subject2";
			Newsletter updatedObject = client.createCall(Newsletter.Update)
					.identifiedBy(NewsletterProperty.ID, newObject.getID())
					.property(NewsletterProperty.SUBJECT, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getSubject());

			//check object could be retrieved and value is correct
			Newsletter retrievedObject = client.createCall(Newsletter.Get)
					.identifiedBy(NewsletterProperty.ID, newObject.getID())
					.execute();
			
			Assert.assertEquals(updateValue, retrievedObject.getSubject());
			
		} finally {
			delete(client, newObject);
		}
	}
	
	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, Newsletter key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(Delete)
		.identifiedBy(NewsletterProperty.ID, key.getID())
		.execute();
	}

	public static Newsletter create(MailJetApiClient client, String initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(Newsletter.Create)
				.property(NewsletterProperty.LOCALE, "FR")
				.property(NewsletterProperty.SENDER, "Test")
				.property(NewsletterProperty.SENDEREMAIL, "test@example.com")
				.property(NewsletterProperty.SUBJECT, initalValue)
				.execute();
	}
	
	public final static MailJetApiService<MailJetApiCall.Delete<Newsletter>> Delete = new MailJetApiService<MailJetApiCall.Delete<Newsletter>>(Newsletter.class, ResourceOperationTypes.Delete);

}
