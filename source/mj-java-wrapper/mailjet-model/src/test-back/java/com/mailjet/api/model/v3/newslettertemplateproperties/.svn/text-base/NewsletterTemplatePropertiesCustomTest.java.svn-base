package com.mailjet.api.model.v3.newslettertemplateproperties;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.model.v3.newslettertemplate.NewsletterTemplate;
import com.mailjet.api.model.v3.newslettertemplate.NewsletterTemplateCustomTest;

public final class NewsletterTemplatePropertiesCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		NewsletterTemplate newNewsletter = NewsletterTemplateCustomTest.create(client, "name");
		try {
			
			testNewsletterTemplateProperties(client, newNewsletter);
			
			
		} finally {
			NewsletterTemplateCustomTest.delete(client, newNewsletter);
		}
	}

	private void testNewsletterTemplateProperties(MailJetApiClient client, NewsletterTemplate newNewsletter) throws MailJetApiCallException {
		String initialValue = "v1";
		NewsletterTemplateProperties newObject = create(client, newNewsletter, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getValue());
			
			String updateValue = "v2";
			NewsletterTemplateProperties updatedObject = client.createCall(NewsletterTemplateProperties.Update)
					.identifiedBy(NewsletterTemplatePropertiesProperty.ID, newObject.getID())
					.property(NewsletterTemplatePropertiesProperty.VALUE, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getValue());

			//check object could be retrieved and value is correct
			NewsletterTemplateProperties retrievedObject = client.createCall(NewsletterTemplateProperties.Get)
					.identifiedBy(NewsletterTemplatePropertiesProperty.ID, newObject.getID())
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
	public static void delete(MailJetApiClient client, NewsletterTemplateProperties key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(NewsletterTemplateProperties.Delete)
		.identifiedBy(NewsletterTemplatePropertiesProperty.ID, key.getID())
		.execute();
	}

	public static NewsletterTemplateProperties create(MailJetApiClient client, NewsletterTemplate key, String initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(NewsletterTemplateProperties.Create)
				.property(NewsletterTemplatePropertiesProperty.TEMPLATEID, key.getID())
				.property(NewsletterTemplatePropertiesProperty.NAME , "display")
				.property(NewsletterTemplatePropertiesProperty.PROPERTYNAME, "display")
				.property(NewsletterTemplatePropertiesProperty.SELECTOR, "p")
				.property(NewsletterTemplatePropertiesProperty.VALUE, initalValue)
				.execute();
	}
	
}
