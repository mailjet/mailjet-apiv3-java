package com.mailjet.api;

import org.jmock.Mockery;
import org.junit.After;
import org.junit.Before;

@SuppressWarnings("javadoc")
public class MailJetBaseT {
	protected Mockery context;

	@Before
	public final void setUp() {
		context = new Mockery();
	}

	@After
	public final void tearDown() {
		context.assertIsSatisfied();
	}
}
