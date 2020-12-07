package com.mailjet.client;

import com.mailjet.client.errors.MailjetClientRequestException;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.sms.SmsSend;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SendSmsIT {

    @Test
    public void sendSms_UnsupportedCountry_ThrowsMailjetException() {
        // arrange
        MailjetClient mailjetClient = new MailjetClient(ClientOptions
                .builder()
                .apiAccessToken(System.getenv("MJ_APITOKEN"))
                .build());

        String ukrainePhoneNumber = "+380507363100";

        MailjetRequest mailjetRequest = new MailjetRequest(SmsSend.resource)
                .property(SmsSend.FROM, "MJPilot")
                .property(SmsSend.TO, ukrainePhoneNumber)
                .property(SmsSend.TEXT, "Have a nice SMS flight with Mailjet!");

        // act
        MailjetClientRequestException requestException = Assert.assertThrows(MailjetClientRequestException.class, () -> mailjetClient.post(mailjetRequest));

        // assert
        Assert.assertEquals(400, requestException.getStatusCode());
        Assert.assertTrue(requestException.getMessage().endsWith("\"ErrorCode\":\"sms-0002\",\"StatusCode\":400,\"ErrorMessage\":\"Unsupported country code.\",\"ErrorRelatedTo\":[\"To\"]}"));
    }

    @Test
    @Ignore("This test will send the real sms")
    public void sendSms_SupportedCountry_ReturnsSuccessResponse() throws MailjetException {
        // arrange
        MailjetClient mailjetClient = new MailjetClient(ClientOptions
                .builder()
                .apiAccessToken(System.getenv("MJ_APITOKEN"))
                .build());

        // to verify other countries, free services like https://receive-smss.com/ can be used
        String germanyPhoneNumber = "+4915207831169";

        MailjetRequest mailjetRequest = new MailjetRequest(SmsSend.resource)
                .property(SmsSend.FROM, "MJPilot")
                .property(SmsSend.TO, germanyPhoneNumber)
                .property(SmsSend.TEXT, "Have a nice SMS flight with Mailjet!");

        // act
        MailjetResponse response = mailjetClient.post(mailjetRequest);

        // assert
        Assert.assertEquals(200, response.getStatus());
        Assert.assertEquals("Message is being sent", response.getData().getJSONObject(0).getJSONObject("Status").getString("Description"));
        Assert.assertEquals("Have a nice SMS flight with Mailjet!", response.getString("Text"));
    }
}
