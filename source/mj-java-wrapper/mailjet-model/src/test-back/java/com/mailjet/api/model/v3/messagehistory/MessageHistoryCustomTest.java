
package com.mailjet.api.model.v3.messagehistory;

import org.junit.Test;

import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.model.v3.message.Message;

public final class MessageHistoryCustomTest {


    @Test
    public void testList()
        throws Exception
    {
        MailJetClientConfiguration config = new MailJetClientConfiguration();
        config.loadFromClassPath("test_mailjet.properties");
        MailJetApiClient client = config.buildClient();
        client.createCall(MessageHistory.List)
        		.filterBy(MessageHistoryFilter.MESSAGE, client.createCall(Message.List).limitBy(1).execute().iterator().next().getID())
        		.limitBy(2).execute();
    }

}
