package com.mailjet.api.model.v3.apitoken;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResultSet;
import com.mailjet.api.model.v3.apikey.ApiKey;
import com.mailjet.api.model.v3.apikey.ApiKeyCustomTest;
import com.mailjet.api.model.v3.apitoken.ApiToken.AllowedAccess;
import com.mailjet.api.model.v3.apitoken.ApiToken.TokenType;

public final class ApiTokenCustomTest {

	//@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		ApiKey newApiKey = ApiKeyCustomTest.create(client, "name");
		try {

			testApiToken(client, newApiKey);

		} finally {
			ApiKeyCustomTest.delete(client, newApiKey);
		}
	}

	@Test
	public void testUpdate() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		ResultSet<ApiToken> listResult = client.createCall(ApiToken.List).limitBy(2)
				.execute();
		if (listResult.isEmpty()) {
			try {
				client.createCall(ApiToken.Get)
						.identifiedBy(ApiTokenProperty.ID, 2147483647L)
						.execute();
				Assert.fail();
			} catch (MailJetApiCallException e) {
				Assert.assertEquals(MailJetApiCallException.Error.NotFound,
						e.getError());
			}
		} else {
			ApiToken token = client
					.createCall(ApiToken.Get)
					.identifiedBy(ApiTokenProperty.ID,
							listResult.iterator().next().getID()).execute();

			String lang = token.getLang();
			String updatedLang = "BG";

			ApiToken updateToken = updateLang(client, token, updatedLang);
			
			try {
				Assert.assertEquals(updatedLang, updateToken.getLang());
			} finally {
				updateLang(client, token, lang);
			}
		}
	}

	/**
	 * @param client
	 * @param listResult
	 * @param lang
	 * @return 
	 * @throws MailJetApiCallException
	 */
	public ApiToken updateLang(MailJetApiClient client, ApiToken token,
			String lang) throws MailJetApiCallException {
		return client.createCall(ApiToken.Update)
				.identifiedBy(ApiTokenProperty.ID,
						token.getID())
				.property(ApiTokenProperty.LANG, lang).execute();
	}

	private void testApiToken(MailJetApiClient client, ApiKey newApiKey)
			throws MailJetApiCallException {
		String initialValue = "EN";
		ApiToken newObject = create(client, newApiKey, initialValue);

		try {
			// check value is set
			Assert.assertEquals(initialValue, newObject.getLang());

			String updateValue = "FR";
			ApiToken updatedObject = client.createCall(ApiToken.Update)
					.identifiedBy(ApiTokenProperty.ID, newObject.getID())
					.property(ApiTokenProperty.LANG, updateValue).execute();

			// check value is updated
			Assert.assertEquals(updateValue, updatedObject.getLang());

			// check object could be retrieved and value is correct
			ApiToken retrievedObject = client.createCall(ApiToken.Get)
					.identifiedBy(ApiTokenProperty.ID, newObject.getID())
					.execute();

			Assert.assertEquals(updateValue, retrievedObject.getLang());

		} finally {
			delete(client, newObject);
		}
	}

	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, ApiToken key)
			throws MailJetApiCallException {
		// delete the created object
		client.createCall(ApiToken.Delete)
				.identifiedBy(ApiTokenProperty.ID, key.getID()).execute();
	}

	public static ApiToken create(MailJetApiClient client, ApiKey key,
			String initalValue) throws MailJetApiCallException {
		// create new object
		return client.createCall(ApiToken.Create)
				.property(ApiTokenProperty.APIKEYID, key.getID())
				.property(ApiTokenProperty.ALLOWEDACCESS, AllowedAccess.STATS)
				.property(ApiTokenProperty.TOKENTYPE, TokenType.URL)
				.property(ApiTokenProperty.LANG, initalValue).execute();
	}

}
