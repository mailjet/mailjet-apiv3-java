package com.mailjet.client.errors;

/**
 * MailjetServerException handles http status code is greater than or equal to
 * 500 (Internal Server Error)
 * 
 * @author y.vanov
 *
 */
public class MailjetServerException extends MailjetException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6534953525088397824L;
	
	public MailjetServerException(String error) {
		super(error);
	}


}
