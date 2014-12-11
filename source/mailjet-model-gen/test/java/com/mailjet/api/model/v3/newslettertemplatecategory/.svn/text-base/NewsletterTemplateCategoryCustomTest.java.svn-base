package com.mailjet.api.model.v3.newslettertemplatecategory;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResourceOperationTypes;

public final class NewsletterTemplateCategoryCustomTest {

	@Test
	public void testNewsletterTemplateCategory() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		String initialValue = "subject1";
		NewsletterTemplateCategory newObject = create(client, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getValue());
			
			String updateValue = "subject2";
			NewsletterTemplateCategory updatedObject = client.createCall(Update)
					.identifiedBy(NewsletterTemplateCategoryProperty.ID, newObject.getID())
					.property(NewsletterTemplateCategoryProperty.VALUE, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getValue());

			//check object could be retrieved and value is correct
			NewsletterTemplateCategory retrievedObject = client.createCall(NewsletterTemplateCategory.Get)
					.identifiedBy(NewsletterTemplateCategoryProperty.ID, newObject.getID())
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
	public static void delete(MailJetApiClient client, NewsletterTemplateCategory key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(Delete)
		.identifiedBy(NewsletterTemplateCategoryProperty.ID, key.getID())
		.execute();
	}

	public static NewsletterTemplateCategory create(MailJetApiClient client, String initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(Create)
				.property(NewsletterTemplateCategoryProperty.LOCALE, "FR")
				.property(NewsletterTemplateCategoryProperty.PARENTCATEGORYID, 1L)
				.property(NewsletterTemplateCategoryProperty.DESCRIPTION, "desc")
				.property(NewsletterTemplateCategoryProperty.VALUE, initalValue)
				.execute();
	}
	
	public final static MailJetApiService<MailJetApiCall.Create<NewsletterTemplateCategory>> Create = new MailJetApiService<MailJetApiCall.Create<NewsletterTemplateCategory>>(NewsletterTemplateCategory.class, ResourceOperationTypes.Post);
	public final static MailJetApiService<MailJetApiCall.Update<NewsletterTemplateCategory>> Update = new MailJetApiService<MailJetApiCall.Update<NewsletterTemplateCategory>>(NewsletterTemplateCategory.class, ResourceOperationTypes.Put);
	public final static MailJetApiService<MailJetApiCall.Delete<NewsletterTemplateCategory>> Delete = new MailJetApiService<MailJetApiCall.Delete<NewsletterTemplateCategory>>(NewsletterTemplateCategory.class, ResourceOperationTypes.Delete);


}
