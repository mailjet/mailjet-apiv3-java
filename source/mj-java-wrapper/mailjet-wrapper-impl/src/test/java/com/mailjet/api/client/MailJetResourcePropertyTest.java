package com.mailjet.api.client;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.model.MailJetResourceProperty;

@SuppressWarnings("javadoc")
public class MailJetResourcePropertyTest {
	
	@Test
	public final void testCreation(){
		MailJetResourceProperty<Object, String> prop = new MailJetResourceProperty<Object, String>("name", String.class);
		Assert.assertEquals("name", prop.getName());
		Assert.assertEquals(String.class, prop.getType());
	}
}
