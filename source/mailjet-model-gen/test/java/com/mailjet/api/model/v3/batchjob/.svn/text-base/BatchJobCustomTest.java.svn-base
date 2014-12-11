
package com.mailjet.api.model.v3.batchjob;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.model.v3.apikey.ApiKey;
import com.mailjet.api.model.v3.apikey.ApiKeyCustomTest;

public final class BatchJobCustomTest {


	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		ApiKey newApiKey = ApiKeyCustomTest.create(client, "name");
		try {
			
			testBatchJob(client, newApiKey);
			
			
		} finally {
			ApiKeyCustomTest.delete(client, newApiKey);
		}
	}

	private void testBatchJob(MailJetApiClient client, ApiKey newApiKey) throws MailJetApiCallException {
		String initialValue = "Unknown";
		BatchJob newObject = create(client, newApiKey, initialValue);
		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getMethod());
			
			String updateValue = "addforce";
			BatchJob updatedObject = update(client, newObject, updateValue);
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getMethod());
	
			//check object could be retrieved and value is correct
			BatchJob retrievedObject = client.createCall(BatchJob.Get)
					.identifiedBy(BatchJobProperty.ID, newObject.getID())
					.execute();
			
			Assert.assertEquals(updateValue, retrievedObject.getMethod());
		} finally {
			delete(client, newObject);
		}
			
	}

	/**
	 * @param client
	 * @param newObject
	 * @param updateValue
	 * @return
	 * @throws MailJetApiCallException
	 */
	public BatchJob update(MailJetApiClient client, BatchJob newObject,
			String updateValue) throws MailJetApiCallException {
		BatchJob updatedObject = client.createCall(BatchJob.Update)
				.identifiedBy(BatchJobProperty.ID, newObject.getID())
				.property(BatchJobProperty.METHOD, updateValue).execute();
		return updatedObject;
	}
	
	public static BatchJob create(MailJetApiClient client, ApiKey key, String initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(BatchJob.Create)
				.property(BatchJobProperty.APIKEYID, key.getID())
				.property(BatchJobProperty.JOBTYPE, "Contact list import csv")
				.property(BatchJobProperty.DATAID, 1L)
				.property(BatchJobProperty.METHOD, initalValue)
				.execute();
	}
	
	public static void delete(MailJetApiClient client, BatchJob key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(Delete)
		.identifiedBy(BatchJobProperty.ID, key.getID())
		.execute();
	}
	
	public final static MailJetApiService<MailJetApiCall.Delete<BatchJob>> Delete = new MailJetApiService<MailJetApiCall.Delete<BatchJob>>(BatchJob.class, ResourceOperationTypes.Delete);

}
