package com.mailjet.api.model.v3.widgetcustomvalue;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.model.v3.widget.Widget;
import com.mailjet.api.model.v3.widget.WidgetCustomTest;

public final class WidgetCustomValueCustomTest {

	@Test
	public void testLifeCycle() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration();
		config.loadFromClassPath("test_mailjet.properties");
		MailJetApiClient client = config.buildClient();
		Widget newWidget = WidgetCustomTest.create(client);
		try {
			
			testWidgetCustomValue(client, newWidget);
			
			
		} finally {
			WidgetCustomTest.delete(client, newWidget);
		}
	}

	private void testWidgetCustomValue(MailJetApiClient client, Widget newWidget) throws MailJetApiCallException {
		String initialValue = "test1";
		WidgetCustomValue newObject = create(client, newWidget, initialValue);

		try {
			//check value is set
			Assert.assertEquals(initialValue, newObject.getValue());
			
			String updateValue = "test2";
			WidgetCustomValue updatedObject = client.createCall(WidgetCustomValue.Update)
					.identifiedBy(WidgetCustomValueProperty.ID, newObject.getID())
					.property(WidgetCustomValueProperty.VALUE, updateValue).execute();
			
			//check value is updated
			Assert.assertEquals(updateValue, updatedObject.getValue());

			//check object could be retrieved and value is correct
			WidgetCustomValue retrievedObject = client.createCall(WidgetCustomValue.Get)
					.identifiedBy(WidgetCustomValueProperty.ID, newObject.getID())
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
	public static void delete(MailJetApiClient client, WidgetCustomValue key)
			throws MailJetApiCallException {
		//delete the created object
		client.createCall(WidgetCustomValue.Delete)
		.identifiedBy(WidgetCustomValueProperty.ID, key.getID())
		.execute();
	}

	public static WidgetCustomValue create(MailJetApiClient client, Widget key, String initalValue)
			throws MailJetApiCallException {
		//create new object
		return client.createCall(WidgetCustomValue.Create)
				.property(WidgetCustomValueProperty.WIDGETID, key.getID())
				.property(WidgetCustomValueProperty.NAME, "name1")
				.property(WidgetCustomValueProperty.VALUE, initalValue)
				.execute();
	}

}
