package com.mailjet.api.model.v3.newslettertemplateblock;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.model.v3.newslettertemplate.NewsletterTemplate;
import com.mailjet.api.model.v3.newslettertemplate.NewsletterTemplateCustomTest;

public final class NewsletterTemplateBlockCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		NewsletterTemplate newNewsletter = NewsletterTemplateCustomTest.create(client, "name");
		try {
			
			testNewsletterTemplateBlock(client, newNewsletter);
			
			
		} finally {
			NewsletterTemplateCustomTest.delete(client, newNewsletter);
		}
	}

	private void testNewsletterTemplateBlock(MailJetApiClient client, NewsletterTemplate newNewsletter) throws MailJetApiCallException {
		String initialValue = "http://test1";
		NewsletterTemplateBlock newObject = create(client, newNewsletter, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getUrl());
			
			String updateValue = "http://test2";
			NewsletterTemplateBlock updatedObject = client.createCall(NewsletterTemplateBlock.Update)
					.identifiedBy(NewsletterTemplateBlockProperty.ID, newObject.getID())
					.property(NewsletterTemplateBlockProperty.URL, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getUrl());

			//check object could be retrieved and value is correct
			NewsletterTemplateBlock retrievedObject = client.createCall(NewsletterTemplateBlock.Get)
					.identifiedBy(NewsletterTemplateBlockProperty.ID, newObject.getID())
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
	public static void delete(MailJetApiClient client, NewsletterTemplateBlock key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(NewsletterTemplateBlock.Delete)
		.identifiedBy(NewsletterTemplateBlockProperty.ID, key.getID())
		.execute();
	}

	public static NewsletterTemplateBlock create(MailJetApiClient client, NewsletterTemplate key, String initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(NewsletterTemplateBlock.Create)
				.property(NewsletterTemplateBlockProperty.TEMPLATEID, key.getID())
				.property(NewsletterTemplateBlockProperty.URL, initalValue)
				.execute();
	}
	
}
