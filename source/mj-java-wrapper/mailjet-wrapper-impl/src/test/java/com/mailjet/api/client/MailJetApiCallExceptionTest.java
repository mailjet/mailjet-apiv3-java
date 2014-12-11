package com.mailjet.api.client;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.client.MailJetApiCallException.Error;
@SuppressWarnings("javadoc")
public class MailJetApiCallExceptionTest {
	@Test
	public final void testCreation() {
		MailJetApiCallException exception = new MailJetApiCallException(
				Error.NotFound, "message");
		Assert.assertEquals(Error.NotFound, exception.getError());
		Assert.assertTrue(exception.getMessage().contains(
				Error.NotFound.toString()));
		Assert.assertTrue(exception.getMessage().contains(
				"message"));
	}
	
	@Test
	public final void testErrorGetByCode() {
		Assert.assertEquals(Error.NotFound, Error.getByCode(404));
		Assert.assertEquals(Error.BadRequest, Error.getByCode(400));
		Assert.assertEquals(Error.ClientMisconfiguration, Error.getByCode(-3));
		Assert.assertEquals(Error.ClientMisuse, Error.getByCode(-4));
		Assert.assertEquals(Error.ContentNotModified, Error.getByCode(304));
		Assert.assertEquals(Error.MethodNotAllowed, Error.getByCode(405));
		Assert.assertEquals(Error.ServerError, Error.getByCode(500));
		Assert.assertEquals(Error.ServerUnavailable, Error.getByCode(-2));
		Assert.assertEquals(Error.Unauthorized, Error.getByCode(401));
		Assert.assertEquals(Error.Unknown, Error.getByCode(-1));
		Assert.assertEquals(Error.Unknown, Error.getByCode(0));
		
	}
	
	@Test
	public final void testErrorValues() {
		Assert.assertEquals(Error.NotFound, Error.valueOf("NotFound"));
		Assert.assertEquals(Error.BadRequest, Error.valueOf("BadRequest"));
	}

}
