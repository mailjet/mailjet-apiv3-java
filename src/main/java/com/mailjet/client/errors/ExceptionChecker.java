/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mailjet.client.errors;

import com.mailjet.client.MailjetResponse;

/**
 *
 * @author guillaume
 */
public class ExceptionChecker {
    
    public static MailjetResponse check(MailjetResponse response)
            throws  MailjetException {
        
        int status = response.getInt("Status");

        switch(status) {
            case 400:
            case 405:
            case 403:
            case 404:
            case 401:
                throw new MailjetException(response.getString("ErrorMessage"));
        }
        
        return response;
    }
}
