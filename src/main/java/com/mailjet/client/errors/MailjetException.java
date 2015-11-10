/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mailjet.client.errors;

/**
 *
 * @author guillaume
 */
public class MailjetException extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MailjetException(String error) {
        super(error);
    }
}