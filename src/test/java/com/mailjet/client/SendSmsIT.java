package com.mailjet.client;

import com.mailjet.client.errors.MailjetClientRequestException;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.sms.Sms;
import com.mailjet.client.resource.sms.SmsSend;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class SendSmsIT {

//    @Test
    public void sendSms_UnsupportedCountry_ThrowsMailjetException() {
        // arrange
        MailjetClient mailjetClient = new MailjetClient(ClientOptions
                .builder()
                .bearerAccessToken(System.getenv("MJ_APITOKEN"))
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

//    @Test
    @Ignore("This test will send the real sms")
    public void sendSms_SupportedCountry_ReturnsSuccessResponse() throws MailjetException {
        // arrange
        MailjetClient mailjetClient = new MailjetClient(ClientOptions
                .builder()
                .bearerAccessToken(System.getenv("MJ_APITOKEN"))
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

//    @Test
    public void getSms_AppliesTsFilter_ReturnsSmsData() throws MailjetException {
        // arrange
        MailjetClient mailjetClient = new MailjetClient(ClientOptions
                .builder()
                .bearerAccessToken(System.getenv("MJ_APITOKEN"))
                .build());

        int startTs = 1607300300;
        int endTs = 1607300600;

        MailjetRequest request = new MailjetRequest(Sms.resource)
                .filter(Sms.FROMTS, startTs)
                .filter(Sms.TOTS, endTs);

        // act
        MailjetResponse response = mailjetClient.get(request);

        // assert
        Assert.assertEquals(200, response.getStatus());
        Assert.assertEquals(1, response.getData().length());

        JSONObject smsInfo = response.getData().getJSONObject(0);
        Assert.assertEquals("MJPilot", smsInfo.getString("From"));
        Assert.assertEquals("0eecaf20-b3d1-4a7f-9271-3f45a268b00c", smsInfo.getString("ID"));
        Assert.assertEquals(1607300397, smsInfo.getInt("CreationTS"));
    }
}
