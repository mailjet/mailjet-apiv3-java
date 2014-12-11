package com.mailjet.api.model.v3.newsletterproperties;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.model.v3.newsletter.Newsletter;
import com.mailjet.api.model.v3.newsletter.NewsletterCustomTest;

public final class NewsletterPropertiesCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		Newsletter newNewsletter = NewsletterCustomTest.create(client, "name");
		try {
			
			testNewsletterProperties(client, newNewsletter);
			
			
		} finally {
			NewsletterCustomTest.delete(client, newNewsletter);
		}
	}

	private void testNewsletterProperties(MailJetApiClient client, Newsletter newNewsletter) throws MailJetApiCallException {
		String initialValue = "v1";
		NewsletterProperties newObject = create(client, newNewsletter, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getValue());
			
			String updateValue = "v2";
			NewsletterProperties updatedObject = client.createCall(NewsletterProperties.Update)
					.identifiedBy(NewsletterPropertiesProperty.ID, newObject.getID())
					.property(NewsletterPropertiesProperty.VALUE, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getValue());

			//check object could be retrieved and value is correct
			NewsletterProperties retrievedObject = client.createCall(NewsletterProperties.Get)
					.identifiedBy(NewsletterPropertiesProperty.ID, newObject.getID())
					.execute();
			
			Assert.assertEquals(updateValue, retrievedObject.getValue());
			
		} finally {
			delete(client, newObject);
		}
	}
	
	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, NewsletterProperties key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(NewsletterProperties.Delete)
		.identifiedBy(NewsletterPropertiesProperty.ID, key.getID())
		.execute();
	}

	public static NewsletterProperties create(MailJetApiClient client, Newsletter key, String initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(NewsletterProperties.Create)
				.property(NewsletterPropertiesProperty.NEWSLETTERID, key.getID())
				.property(NewsletterPropertiesProperty.NAME , "display")
				.property(NewsletterPropertiesProperty.PROPERTYNAME, "display")
				.property(NewsletterPropertiesProperty.SELECTOR, "p")
				.property(NewsletterPropertiesProperty.VALUE, initalValue)
				.execute();
	}
	
}
