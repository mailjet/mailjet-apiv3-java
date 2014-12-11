
package com.mailjet.api.model.v3.listrecipientstatistics;

import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResultSet;
import org.junit.Test;

public final class ListRecipientStatisticsTest {


    @Test
    public void testList()
        throws Exception
    {
        MailJetClientConfiguration config = new MailJetClientConfiguration();
        config.loadFromClassPath("test_mailjet.properties");
        MailJetApiClient client = config.buildClient();
        ResultSet<ListRecipientStatistics> listResult = client.createCall(ListRecipientStatistics.List).limitBy(2).execute();
    }

}
