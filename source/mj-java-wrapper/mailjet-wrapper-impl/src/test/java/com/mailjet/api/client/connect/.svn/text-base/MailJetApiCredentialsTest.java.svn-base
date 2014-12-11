package com.mailjet.api.client.connect;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiCredentials;
@SuppressWarnings("javadoc")
public class MailJetApiCredentialsTest {
	private static final String PASS = "pass";
	private static final String KEY = "key";

	@Test
	public final void testCreate(){
		MailJetApiCredentials credentials = new MailJetApiCredentials(KEY, PASS);
		Assert.assertEquals(KEY, credentials.getApiKey());
		Assert.assertEquals(PASS, credentials.getSecretKey());
	}
	
	@Test
	public final void testEquals(){
		MailJetApiCredentials credentials1 = new MailJetApiCredentials(KEY, PASS);
		MailJetApiCredentials credentials2 = new MailJetApiCredentials(KEY, PASS);
		
		Assert.assertTrue(credentials1.equals(credentials2));
		Assert.assertTrue(credentials2.equals(credentials1));
		Assert.assertTrue(credentials1.equals(credentials1));
		
		Assert.assertTrue(credentials1.hashCode() == credentials2.hashCode());
	}
	

	public final void testNotEquals(){
		MailJetApiCredentials credentials1 = new MailJetApiCredentials(KEY, PASS);
		MailJetApiCredentials credentials2 = new MailJetApiCredentials(KEY, KEY);
		
		Assert.assertFalse(credentials1.equals(credentials2));
		Assert.assertFalse(credentials2.equals(credentials1));
		
		Assert.assertFalse(credentials1.hashCode() == credentials2.hashCode());
	}
	
	@Test
	public final void testNotEquals2(){
		MailJetApiCredentials credentials1 = new MailJetApiCredentials(KEY, PASS);
		MailJetApiCredentials credentials2 = new MailJetApiCredentials(PASS, PASS);
		
		Assert.assertFalse(credentials1.equals(credentials2));
		Assert.assertFalse(credentials2.equals(credentials1));
		
		Assert.assertFalse(credentials1.hashCode() == credentials2.hashCode());
	}
	
	@Test
	public final void testNotEquals3(){
		MailJetApiCredentials credentials1 = new MailJetApiCredentials(null, PASS);
		MailJetApiCredentials credentials2 = new MailJetApiCredentials(KEY, PASS);
		
		Assert.assertFalse(credentials1.equals(null));
		Assert.assertFalse(credentials2.equals(credentials1));
		
		Assert.assertFalse(credentials1.hashCode() == credentials2.hashCode());
	}
	
	@Test
	public final void testNotEquals4(){
		MailJetApiCredentials credentials1 = new MailJetApiCredentials(KEY, PASS);
		MailJetApiCredentials credentials2 = new MailJetApiCredentials(null, PASS);
		
		Assert.assertFalse(credentials1.equals(null));
		Assert.assertFalse(credentials2.equals(credentials1));
		
		Assert.assertFalse(credentials1.hashCode() == credentials2.hashCode());
	}
	
	@Test
	public final void testNotEquals5(){
		MailJetApiCredentials credentials1 = new MailJetApiCredentials(null, null);
		MailJetApiCredentials credentials2 = new MailJetApiCredentials(null, null);
		
		Assert.assertTrue(credentials1.equals(credentials2));
		Assert.assertTrue(credentials2.equals(credentials1));
		
		Assert.assertTrue(credentials1.hashCode() == credentials2.hashCode());
	}
}
