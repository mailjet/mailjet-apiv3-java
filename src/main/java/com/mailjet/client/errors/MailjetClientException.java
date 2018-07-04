package com.mailjet.client.errors;

/**
 * MailjetClientException handles http client error codes
 * 
 * @author y.vanov
 *
 */
public class MailjetClientException extends MailjetException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 321826902415178274L;

	public MailjetClientException(String error) {
		super(error);
	}

}
