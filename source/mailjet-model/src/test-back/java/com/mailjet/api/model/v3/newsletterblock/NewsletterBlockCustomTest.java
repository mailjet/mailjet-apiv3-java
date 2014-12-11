package com.mailjet.api.model.v3.newsletterblock;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.model.v3.newsletter.Newsletter;
import com.mailjet.api.model.v3.newsletter.NewsletterCustomTest;

public final class NewsletterBlockCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		Newsletter newNewsletter = NewsletterCustomTest.create(client, "name");
		try {
			
			testNewsletterBlock(client, newNewsletter);
			
			
		} finally {
			NewsletterCustomTest.delete(client, newNewsletter);
		}
	}

	private void testNewsletterBlock(MailJetApiClient client, Newsletter newNewsletter) throws MailJetApiCallException {
		String initialValue = "http://test1";
		NewsletterBlock newObject = create(client, newNewsletter, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getUrl());
			
			String updateValue = "http://test2";
			NewsletterBlock updatedObject = client.createCall(NewsletterBlock.Update)
					.identifiedBy(NewsletterBlockProperty.ID, newObject.getID())
					.property(NewsletterBlockProperty.URL, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getUrl());

			//check object could be retrieved and value is correct
			NewsletterBlock retrievedObject = client.createCall(NewsletterBlock.Get)
					.identifiedBy(NewsletterBlockProperty.ID, newObject.getID())
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
	public static void delete(MailJetApiClient client, NewsletterBlock key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(NewsletterBlock.Delete)
		.identifiedBy(NewsletterBlockProperty.ID, key.getID())
		.execute();
	}

	public static NewsletterBlock create(MailJetApiClient client, Newsletter key, String initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(NewsletterBlock.Create)
				.property(NewsletterBlockProperty.NEWSLETTERID, key.getID())
				.property(NewsletterBlockProperty.URL, initalValue)
				.execute();
	}
	
}
