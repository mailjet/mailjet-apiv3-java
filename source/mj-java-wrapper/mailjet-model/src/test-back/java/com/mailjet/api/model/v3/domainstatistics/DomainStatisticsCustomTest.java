
package com.mailjet.api.model.v3.domainstatistics;

import java.util.Calendar;

import org.junit.Test;

import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;

public final class DomainStatisticsCustomTest {


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
        to.set(2011, 01, 10, 1, 1, 1);
        client.createCall(DomainStatistics.List)
        		.filterBy(DomainStatisticsFilter.FROMTS, from.getTime())
        		.filterBy(DomainStatisticsFilter.TOTS, to.getTime())
        		.limitBy(2).execute();
    }

}
