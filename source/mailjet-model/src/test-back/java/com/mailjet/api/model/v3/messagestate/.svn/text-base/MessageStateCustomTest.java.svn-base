package com.mailjet.api.model.v3.messagestate;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.model.v3.messagestate.MessageState.RelatedTo;

public final class MessageStateCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		String initialValue = "1";
		
		MessageState executeCreate = create(client, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, executeCreate.getState());
			
			String updateValue = "2";
			MessageState executeUpdate = client.createCall(Update)
					.identifiedBy(MessageStateProperty.ID, executeCreate.getID())
					.property(MessageStateProperty.STATE, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, executeUpdate.getState());

			//check object could be retrieved and value is correct
			MessageState executeGet = get(client, executeCreate.getID());
			
			Assert.assertEquals(updateValue, executeGet.getState());
			
		} finally {
			delete(client, executeCreate);
		}
		

		
	}

	/**
	 * @param client
	 * @param executeCreate
	 * @return
	 * @throws MailJetApiCallException
	 */
	public static MessageState get(MailJetApiClient client, Long  id)
			throws MailJetApiCallException {
		MessageState executeGet = client.createCall(MessageState.Get)
				.identifiedBy(MessageStateProperty.ID, id)
				.execute();
		return executeGet;
	}
	
	
	public static MessageState getCurrentMessageState(MailJetApiClient client, MailJetClientConfiguration config)
			throws MailJetApiCallException {
		MessageState executeGet = client.createCall(MessageState.Get)
				.identifiedBy(MessageStateProperty.ID, 9248L)
				.execute();
		return executeGet;
	}

	/**
	 * @param client
	 * @param key
	 * @throws MailJetApiCallException
	 */
	public static void delete(MailJetApiClient client, MessageState key)
			throws MailJetApiCallException {
		if(9248L == key.getID()){
			throw new RuntimeException("Cannot delete MessageState in use!"); 
		}
		//delete the created object
		client.createCall(Delete)
		.identifiedBy(MessageStateProperty.ID, key.getID())
		.execute();
	}

	public static MessageState create(MailJetApiClient client, String initialValue)
			throws MailJetApiCallException {
		//create new object
		MessageState executeCreate = client.createCall(Create)
				.property(MessageStateProperty.RELATEDTO, RelatedTo.SPAM)
				.property(MessageStateProperty.STATE, initialValue).execute();
		return executeCreate;
	}
	
	public final static MailJetApiService<MailJetApiCall.Create<MessageState>> Create = new MailJetApiService<MailJetApiCall.Create<MessageState>>(MessageState.class, ResourceOperationTypes.Post);
	public final static MailJetApiService<MailJetApiCall.Update<MessageState>> Update = new MailJetApiService<MailJetApiCall.Update<MessageState>>(MessageState.class, ResourceOperationTypes.Put);
	public final static MailJetApiService<MailJetApiCall.Delete<MessageState>> Delete = new MailJetApiService<MailJetApiCall.Delete<MessageState>>(MessageState.class, ResourceOperationTypes.Delete);


}
