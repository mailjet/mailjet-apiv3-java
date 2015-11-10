/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mailjet.client;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Contact;
import com.mailjet.client.resource.ContactGetcontactslists;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guillaume
 */
public class MailjetClientTest {
    
    private final long existingContactID = 2;
    
    public MailjetClientTest() {
    }
    
    /**
     * Test of setDebug method, of class MailjetClient.
     * @throws com.mailjet.client.errors.MailjetException
     */
    @Test
    public void testSimpleGet() throws MailjetException, MalformedURLException, UnsupportedEncodingException {
        MailjetClient client;
        
        client = new MailjetClient("85480869a17b7d13ef8bd393283d40d9", "7ebd58e70a16291548a02d6fcfe9b4a1");
        client.setDebug(MailjetClient.NOCALL_DEBUG);

        System.out.println("TESTING: Simple GET");
        
        
        // Simple contact GET request
        MailjetRequest contacts;
        MailjetResponse response;
        
        contacts = new MailjetRequest(Contact.resource);
        response = client.get(contacts);
        
        
        assertEquals(response.getString("url"), "https://api.mailjet.com/v3/REST/contact");
        
    }
    
    @Test
    public void testFilteringGet() throws MailjetException, MalformedURLException, UnsupportedEncodingException {
        MailjetClient client;
        
        client = new MailjetClient("85480869a17b7d13ef8bd393283d40d9", "7ebd58e70a16291548a02d6fcfe9b4a1");
        client.setDebug(MailjetClient.NOCALL_DEBUG);

        System.out.println("TESTING: Simple Filtering with GET");
        
        
        // Simple contact GET request
        MailjetRequest contacts;
        MailjetResponse response;
        
        contacts = new MailjetRequest(Contact.resource)
                        .filter("limit", 10)
                        .filter("offset", 2);
        
        response = client.get(contacts);
        
        String url = response.getString("url");
        Boolean test = url.equals("https://api.mailjet.com/v3/REST/contact?offset=2&limit=10") ||
                url.equals("https://api.mailjet.com/v3/REST/contact?limit=10&offset=2");
        
        assertTrue(test);
    }
    
    @Test
    public void testActionGet() throws MailjetException, MalformedURLException, UnsupportedEncodingException {
        MailjetClient client;
        
        client = new MailjetClient("85480869a17b7d13ef8bd393283d40d9", "7ebd58e70a16291548a02d6fcfe9b4a1");
        client.setDebug(MailjetClient.NOCALL_DEBUG);

        System.out.println("TESTING: Simple Action with GET");
        
        
        // Simple contact GET request
        MailjetRequest contacts;
        MailjetResponse response;
        
        contacts = new MailjetRequest(ContactGetcontactslists.resource, existingContactID);
        
        response = client.get(contacts);
        
        
        assertEquals(response.getString("url"), "https://api.mailjet.com/v3/REST/contact/" + existingContactID + "/getcontactslists");
    }
}
