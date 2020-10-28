package com.mailjet.client;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Email;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class SendIT {

    @Test
    public void sendEmailV3() throws MailjetException {
        // arrange
        MailjetClient mailjetClient = TestHelper.getClientV3();
        String senderEmail = TestHelper.getValidSenderEmail(mailjetClient);

        MailjetRequest mailjetRequest = new MailjetRequest(Email.resource)
                .property(Email.FROMEMAIL, senderEmail)
                .property(Email.FROMNAME, "Your Mailjet Pilot")
                .property(Email.RECIPIENTS, new JSONArray()
                        .put(new JSONObject()
                                .put("Email", senderEmail)
                                .put("Name", "Passenger 1")
                        )
                )
                .property(Email.SUBJECT, "Your email flight plan!")
                .property(Email.TEXTPART, "Dear passenger, welcome to Mailjet! May the delivery force be with you!")
                .property(Email.HTMLPART, "<h3>Dear passenger, welcome to Mailjet!</h3><br />May the delivery force be with you!");

        // act
        MailjetResponse mailjetResponse = mailjetClient.post(mailjetRequest);

        // assert
        Assert.assertEquals(200, mailjetResponse.getStatus());
        Assert.assertEquals(senderEmail, mailjetResponse.getData().getJSONObject(0).getString("Email"));
    }
}
