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
import com.mailjet.client.resource.sms.Send;
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

        String fromEmail =  "pilot@mailjet.com",
               fromName = "Mailjet Pilot",
               subject = "Your email flight plan!",
               textPart = "Dear passenger, welcome to Mailjet! May the delivery force be with you!",
               htmlPart = "<h3>Dear passenger, welcome to Mailjet</h3><br/>May the delivery force be with you!",
               recipient = "passenger@mailjet.com";

        // Simple contact GET request
        request = new MailjetRequest(Email.resource)
                        .property(Email.FROMEMAIL, fromEmail)
                        .property(Email.FROMNAME, fromName)
                        .property(Email.SUBJECT, subject)
                        .property(Email.TEXTPART, textPart)
                        .property(Email.HTMLPART, htmlPart)
                        .property(Email.RECIPIENTS, new JSONArray()
                        .put(new JSONObject()
                        .put(Email.EMAIL, recipient)));
        response = client.post(request);
        assertEquals(response.getString("url"), "https://api.mailjet.com/v3/send");
    }

    @Test
    public void testSendv31() throws MailjetException, MalformedURLException, UnsupportedEncodingException, MailjetSocketTimeoutException {
        MailjetClient client;

        client = new MailjetClient("", "", new ClientOptions("v3.1"));
        client.setDebug(MailjetClient.NOCALL_DEBUG);

        System.out.println("TESTING: Send email with Send API v3.1");

        MailjetRequest request;
        MailjetResponse response;

        JSONObject message = new JSONObject();
        message.put(Emailv31.Message.FROM, new JSONObject()
        .put(Emailv31.Message.EMAIL, "pilot@mailjet.com")
        .put(Emailv31.Message.NAME, "Mailjet Pilot"))
        .put(Emailv31.Message.SUBJECT, "Your email flight plan!")
        .put(Emailv31.Message.TEXTPART, "Dear passenger, welcome to Mailjet! May the delivery force be with you!")
        .put(Emailv31.Message.HTMLPART, "<h3>Dear passenger, welcome to Mailjet</h3><br/>May the delivery force be with you!")
        .put(Emailv31.Message.TO, new JSONArray()
        .put(new JSONObject()
        .put(Emailv31.Message.EMAIL, "passenger@mailjet.com")));

        // Simple contact GET request
        request = new MailjetRequest(Emailv31.resource).property(Emailv31.MESSAGES, (new JSONArray()).put(message));
        response = client.post(request);

        assertEquals(response.getString("url"), "https://api.mailjet.com/v3.1/send");
    }

    @Test
    public void testSendSMS() throws MailjetException, MalformedURLException, UnsupportedEncodingException, MailjetSocketTimeoutException {
        MailjetClient client;

        client = new MailjetClient("", "", new ClientOptions("v4"));
        client.setDebug(MailjetClient.NOCALL_DEBUG);

        System.out.println("TESTING: Send SMS with Send SMS API v4.");

        MailjetRequest request;
        MailjetResponse response;

        // Simple post request
        request = new MailjetRequest(Send.resource)
			.property(Send.From, "MJPilot")
        	.property(Send.To, "+33600000000")
			.property(Send.Text, "Have a nice SMS flight with Mailjet!");
		response = client.post(request);

        assertEquals(response.getString("url"), "https://api.mailjet.com/v4/sms-send");
    }
}
