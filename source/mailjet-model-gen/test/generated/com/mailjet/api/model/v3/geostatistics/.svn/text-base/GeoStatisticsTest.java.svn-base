
package com.mailjet.api.model.v3.geostatistics;

import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResultSet;
import org.junit.Test;

public final class GeoStatisticsTest {


    @Test
    public void testList()
        throws Exception
    {
        MailJetClientConfiguration config = new MailJetClientConfiguration();
        config.loadFromClassPath("test_mailjet.properties");
        MailJetApiClient client = config.buildClient();
        ResultSet<GeoStatistics> listResult = client.createCall(GeoStatistics.List).limitBy(2).execute();
    }

}
