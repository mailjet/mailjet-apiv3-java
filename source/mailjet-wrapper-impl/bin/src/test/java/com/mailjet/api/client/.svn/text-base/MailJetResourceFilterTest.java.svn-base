package com.mailjet.api.client;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.model.MailJetResourceFilter;

@SuppressWarnings("javadoc")
public class MailJetResourceFilterTest {
	
	@Test
	public final void testCreation(){
		MailJetResourceFilter<Object, String> filter = new MailJetResourceFilter<Object, String>("name", String.class);
		Assert.assertEquals("name", filter.getName());
		Assert.assertEquals(String.class, filter.getType());
	}
}
