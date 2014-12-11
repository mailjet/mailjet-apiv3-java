
package com.mailjet.api.model.v3.graphstatistics;

import java.util.Calendar;

import org.junit.Test;

import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;

public final class GraphStatisticsCustomTest {


    @Test
    public void testList()
        throws Exception
    {
        MailJetClientConfiguration config = new MailJetClientConfiguration();
        config.loadFromClassPath("test_mailjet.properties");
        MailJetApiClient client = config.buildClient();
        
        Calendar from = Calendar.getInstance();
        from.set(2011, 01, 01, 1, 1, 1);
        Calendar to = Calendar.getInstance();
        to.set(2011, 02, 10, 1, 1, 1);
        client.createCall(GraphStatistics.List)
        		.filterBy(GraphStatisticsFilter.FROMTS, from.getTime())
        		.filterBy(GraphStatisticsFilter.TOTS, to.getTime())
        		.filterBy(GraphStatisticsFilter.SCALE, "week")
        		.limitBy(2).execute();
        
    }

}
