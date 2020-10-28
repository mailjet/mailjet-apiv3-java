/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mailjet.client.errors;

/**
 * MailjetRateLimitException handles http status code 429 (Too Many Requests)
 *
 * Oops! You have reached the maximum number of calls allowed per minute by our API.
 * Please review your integration to reduce the number of calls issued by your system
 *
 * @author y.vanov
 *
 */
public class MailjetRateLimitException extends MailjetException {

	private static final long serialVersionUID = 7854200196479735430L;

	public MailjetRateLimitException(String error) {
		super(error);
	}
}
