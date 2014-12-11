
package com.mailjet.api.model.v3.contactstatistics;

import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResultSet;
import org.junit.Test;

public final class ContactStatisticsTest {


    @Test
    public void testList()
        throws Exception
    {
        MailJetClientConfiguration config = new MailJetClientConfiguration();
        config.loadFromClassPath("test_mailjet.properties");
        MailJetApiClient client = config.buildClient();
        ResultSet<ContactStatistics> listResult = client.createCall(ContactStatistics.List).limitBy(2).execute();
    }

}
