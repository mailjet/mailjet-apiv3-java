package com.mailjet.client;

import org.json.JSONArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.StatisticsLinkclick;

import static org.junit.Assert.assertNotNull;

@Ignore
public class StatisticsIT {
    private MailjetClient client;

    @Before
    public void setUp() {
        client = TestHelper.getClient();
    }

    @Test
    public void statisticsLinkClickTest() throws MailjetException {
        MailjetRequest request = new MailjetRequest(StatisticsLinkclick.resource)
            .filter(StatisticsLinkclick.CAMPAIGNID, "$Campaign_ID");

        MailjetResponse response = client.get(request);

        Assert.assertEquals(200, response.getStatus());
        Integer count = response.getInt("Count");
        assertNotNull(count);
        Integer total = response.getInt("Total");
        assertNotNull(total);
        JSONArray data = response.getJSONArray("Data");
        assertNotNull(data);
    }

}