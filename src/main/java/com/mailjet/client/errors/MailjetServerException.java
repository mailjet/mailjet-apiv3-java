package com.mailjet.client.errors;

/**
 * MailjetServerException indicates that something went wrong on our side
 *
 * When such error occurs, it will contain an error identifier in its description
 * (e.g. "ErrorIdentifier" : "D4DF574C-0C5F-45C7-BA52-7AA8E533C3DE"), which is crucial for us to track the problem and identify the root cause.
 * Please contact our support team, providing the error identifier and we will do our best to help.
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
