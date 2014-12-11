package com.mailjet.api.client.config;

import org.junit.Assert;
import org.junit.Test;
@SuppressWarnings("javadoc")
public class MailJetClientConfigurationExceptionTest {
	@Test
	public final void testCreateFromThrowable(){
		RuntimeException cause = new RuntimeException();
		MailJetClientConfigurationException mailJetClientConfigurationException = new MailJetClientConfigurationException(cause);
		Assert.assertEquals(cause, mailJetClientConfigurationException.getCause());
	}
	
	@Test
	public final void testCreateFromMessage(){
		String message = "test";
		MailJetClientConfigurationException mailJetClientConfigurationException = new MailJetClientConfigurationException(message);
		Assert.assertEquals(message, mailJetClientConfigurationException.getMessage());
	}
}
