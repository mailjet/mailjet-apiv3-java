package com.mailjet.api.model.v3.newslettertemplate;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResourceOperationTypes;

public final class NewsletterTemplateCustomTest {

	@Test
	public void testNewsletterTemplate() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		String initialValue = "name1";
		NewsletterTemplate newObject = create(client, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getName());
			
			String updateValue = "name2";
			NewsletterTemplate updatedObject = client.createCall(Update)
					.identifiedBy(NewsletterTemplateProperty.ID, newObject.getID())
					.property(NewsletterTemplateProperty.NAME, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getName());

			//check object could be retrieved and value is correct
			NewsletterTemplate retrievedObject = client.createCall(NewsletterTemplate.Get)
					.identifiedBy(NewsletterTemplateProperty.ID, newObject.getID())
					.execute();
			
			Assert.assertEquals(updateValue, retrievedObject.getName());
			
		} finally {
			delete(client, newObject);
		}
	}
	
	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, NewsletterTemplate key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(Delete)
		.identifiedBy(NewsletterTemplateProperty.ID, key.getID())
		.execute();
	}

	public static NewsletterTemplate create(MailJetApiClient client, String initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(NewsletterTemplate.Create)
				.property(NewsletterTemplateProperty.LOCALE, "FR")
				.property(NewsletterTemplateProperty.NAME, initalValue)
				.execute();
	}
	
	public final static MailJetApiService<MailJetApiCall.Update<NewsletterTemplate>> Update = new MailJetApiService<MailJetApiCall.Update<NewsletterTemplate>>(NewsletterTemplate.class, ResourceOperationTypes.Put);
	public final static MailJetApiService<MailJetApiCall.Delete<NewsletterTemplate>> Delete = new MailJetApiService<MailJetApiCall.Delete<NewsletterTemplate>>(NewsletterTemplate.class, ResourceOperationTypes.Delete);

}
