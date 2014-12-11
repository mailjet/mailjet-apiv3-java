
package com.mailjet.api.model.v3.senderstatistics;

import org.junit.Test;

import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;

public final class SenderStatisticsTest {


    @Test
    public void testList()
        throws Exception
    {
        MailJetClientConfiguration config = new MailJetClientConfiguration();
        config.loadFromClassPath("test_mailjet.properties");
        MailJetApiClient client = config.buildClient();
        client.createCall(SenderStatistics.List).limitBy(2).execute();
    }

}
