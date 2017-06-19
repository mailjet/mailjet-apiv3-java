/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mailjet.client;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Contact;
import com.mailjet.client.resource.ContactGetcontactslists;
import com.mailjet.client.resource.Email;
import com.mailjet.client.resource.Emailv31;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.json.JSONArray;
import org.json.JSONObject;

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
    public void testSimpleGet() throws MailjetException, MailjetSocketTimeoutException {
        MailjetClient client;

        client = new MailjetClient("", "");
        client.setDebug(MailjetClient.NOCALL_DEBUG);

        System.out.println("TESTING: Simple GET");


        // Simple contact GET request
        MailjetRequest contacts;
        MailjetResponse response;

        contacts = new MailjetRequest(Contact.resource);
        response = client.get(contacts);


        assertEquals(response.getString("url"), "https://api.mailjet.com/v3/REST/contact");

    }

//    @Test
//    public void testSimplePut() throws MailjetException {
//        MailjetClient client;
//
//        client = new MailjetClient("", "");
//        client.setDebug(MailjetClient.NOCALL_DEBUG);
//
//        System.out.println("TESTING: Simple Put");
//
//
//        MailjetRequest request;
//        MailjetResponse response;
//
//        request = new MailjetRequest(Sender.resource)
//                      .property(Sender.NAME, "Guillaume");
//
//        response = client.put(request);
//    }

    @Test
    public void testFilteringGet() throws MailjetException, MailjetSocketTimeoutException {
        MailjetClient client;

        client = new MailjetClient("", "");
        client.setDebug(MailjetClient.NOCALL_DEBUG);

        System.out.println("TESTING: Simple Filtering with GET");


        // Simple contact GET request
        MailjetRequest contacts;
        MailjetResponse response;

        contacts = new MailjetRequest(Contact.resource)
                        .filter(Contact.LIMIT, 10)
                        .filter(Contact.OFFSET, 2);

        response = client.get(contacts);
        System.out.println(response);
        String url = response.getString("url");
        Boolean test = url.equals("https://api.mailjet.com/v3/REST/contact?Offset=2&Limit=10") ||
                url.equals("https://api.mailjet.com/v3/REST/contact?Limit=10&Offset=2");

        assertTrue(test);
    }

    @Test
    public void testActionGet() throws MailjetException, MalformedURLException, UnsupportedEncodingException, MailjetSocketTimeoutException {
        MailjetClient client;

        client = new MailjetClient("", "");
        client.setDebug(MailjetClient.NOCALL_DEBUG);

        System.out.println("TESTING: Simple Action with GET");


        // Simple contact GET request
        MailjetRequest contacts;
        MailjetResponse response;

        contacts = new MailjetRequest(ContactGetcontactslists.resource, existingContactID);

        response = client.get(contacts);


        assertEquals(response.getString("url"), "https://api.mailjet.com/v3/REST/contact/" + existingContactID + "/getcontactslists");
    }

    @Test
    public void testSendv3() throws MailjetException, MalformedURLException, UnsupportedEncodingException, MailjetSocketTimeoutException {
        MailjetClient client;

        client = new MailjetClient("", "");
        client.setDebug(MailjetClient.NOCALL_DEBUG);

        System.out.println("TESTING: Send email with Send API v3.0");

        MailjetRequest request;
        MailjetResponse response;

        // Simple contact GET request
        request = new MailjetRequest(Email.resource)
                        .property(Email.FROMEMAIL, "pilot@mailjet.com")
                        .property(Email.FROMNAME, "Mailjet Pilot")
                        .property(Email.SUBJECT, "Your email flight plan!")
                        .property(Email.TEXTPART, "Dear passenger, welcome to Mailjet! May the delivery force be with you!")
                        .property(Email.HTMLPART, "&lt;h3&gt;Dear passenger, welcome to Mailjet!&lt;/h3&gt;&lt;br /&gt;May the delivery force be with you!")
                        .property(Email.RECIPIENTS, new JSONArray()
                        .put(new JSONObject()
                        .put("Email", "passenger@mailjet.com")));
        response = client.post(request);

        assertEquals(request.getBody(), "{\"FromName\":\"Mailjet Pilot\",\"Recipients\":[{\"Email\":\"passenger@mailjet.com\"}],\"Text-Part\":\"Dear passenger, welcome to Mailjet! May the delivery force be with you!\",\"FromEmail\":\"pilot@mailjet.com\",\"Subject\":\"Your email flight plan!\",\"Html-Part\":\"&lt;h3&gt;Dear passenger, welcome to Mailjet!&lt;/h3&gt;&lt;br /&gt;May the delivery force be with you!\"}");
        assertEquals(response.getString("url"), "https://api.mailjet.com/v3/send");
    }

    @Test
    public void testSendv31() throws MailjetException, MalformedURLException, UnsupportedEncodingException, MailjetSocketTimeoutException {
        MailjetClient client;

        client = new MailjetClient("", "");
        client.setDebug(MailjetClient.NOCALL_DEBUG);

        System.out.println("TESTING: Send email with Send API v3.1");

        MailjetRequest request;
        MailjetResponse response;

        // Simple contact GET request
        request = new MailjetRequest(Emailv31.resource)
                        .property(Emailv31.FROM, new JSONObject()
                        .put("Email", "passenger@mailjet.com")
                        .put("Name", "Mailjet Pilot"))
                        .property(Emailv31.SUBJECT, "Your email flight plan!")
                        .property(Emailv31.TEXT_PART, "Dear passenger, welcome to Mailjet! May the delivery force be with you!")
                        .property(Emailv31.HTML_PART, "&lt;h3&gt;Dear passenger, welcome to Mailjet!&lt;/h3&gt;&lt;br /&gt;May the delivery force be with you!")
                        .property(Emailv31.TO, new JSONArray()
                        .put(new JSONObject()
                        .put("Email", "passenger@mailjet.com")));
        response = client.post(request);

        assertEquals(request.getBody(), "{\"HTMLPart\":\"&lt;h3&gt;Dear passenger, welcome to Mailjet!&lt;/h3&gt;&lt;br /&gt;May the delivery force be with you!\",\"TextPart\":\"Dear passenger, welcome to Mailjet! May the delivery force be with you!\",\"From\":{\"Email\":\"passenger@mailjet.com\",\"Name\":\"Mailjet Pilot\"},\"To\":[{\"Email\":\"passenger@mailjet.com\"}],\"Subject\":\"Your email flight plan!\"}");
        assertEquals(response.getString("url"), "https://api.mailjet.com/v3/send");
    }
}
