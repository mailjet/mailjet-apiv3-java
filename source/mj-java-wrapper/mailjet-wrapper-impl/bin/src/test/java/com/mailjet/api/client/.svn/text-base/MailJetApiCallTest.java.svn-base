package com.mailjet.api.client;

import org.junit.Test;

/**
 * Tests that {@link MailJetApiCall} implementations must pass.
 * 
 * @author MailJet
 * 
 */
public abstract class MailJetApiCallTest {
	
	@Test(expected=MailJetApiCallException.class)
	public void testSuccessfullCall() throws MailJetApiCallException{
		createThrowingCall().execute();
	}
	
	@Test
	public void testSuccessfull() throws MailJetApiCallException{
		createSuccessfullCall().execute();
	}
	
	public abstract MailJetApiCall<?> createThrowingCall();
	public abstract MailJetApiCall<?> createSuccessfullCall();
}
