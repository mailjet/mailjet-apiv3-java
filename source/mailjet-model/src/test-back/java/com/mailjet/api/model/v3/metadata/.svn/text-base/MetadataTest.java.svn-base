
package com.mailjet.api.model.v3.metadata;

import org.junit.Test;

import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;

public final class MetadataTest {


    @Test
    public void testList()
        throws Exception
    {
        MailJetClientConfiguration config = new MailJetClientConfiguration();
        config.loadFromClassPath("test_mailjet.properties");
        MailJetApiClient client = config.buildClient();
        client.createCall(Metadata.List).limitBy(2).execute();
    }

}
