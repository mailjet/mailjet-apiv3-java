package com.mailjet.client;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.ApiVersion;
import com.mailjet.client.resource.Sender;
import org.json.JSONObject;
import org.junit.Assert;

public class TestHelper {
    public static MailjetClient getClientV3() {
        MailjetClient mailjetClient = new MailjetClient(
                System.getenv("MJ_APIKEY_PUBLIC"),
                System.getenv("MJ_APIKEY_PRIVATE"));
        return mailjetClient;
    }

    public static MailjetClient getClientV4() {
        MailjetClient mailjetClient = new MailjetClient(
                System.getenv("MJ_APIKEY_PUBLIC"),
                System.getenv("MJ_APIKEY_PRIVATE"),
                new ClientOptions(ApiVersion.V4));
        return mailjetClient;
    }

    public static MailjetClient getClientV3_1() {
        MailjetClient mailjetClient = new MailjetClient(
                System.getenv("MJ_APIKEY_PUBLIC"),
                System.getenv("MJ_APIKEY_PRIVATE"),
                new ClientOptions(ApiVersion.V3_1));
        return mailjetClient;
    }

    public static String getValidSenderEmail(MailjetClient v3Client) throws MailjetException {
        MailjetRequest request = new MailjetRequest(Sender.resource);
        MailjetResponse response = v3Client.get(request);

        Assert.assertEquals(200, response.getStatus());

        for (int i = 0; i < response.getData().length(); i++) {
            JSONObject emailObject = response.getData().getJSONObject(i);

            if (emailObject.getString("Status").equals("Active"))
                return emailObject.getString("Email");
        }

        throw new AssertionError("Cannot find Active sender address under given account");
    }
}
