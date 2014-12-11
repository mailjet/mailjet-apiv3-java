
package com.mailjet.api.model.v3.newslettertemplateproperties;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResultSet;
import org.junit.Assert;
import org.junit.Test;

public final class NewsletterTemplatePropertiesTest {


    @Test
    public void testList()
        throws Exception
    {
        MailJetClientConfiguration config = new MailJetClientConfiguration();
        config.loadFromClassPath("test_mailjet.properties");
        MailJetApiClient client = config.buildClient();
        ResultSet<NewsletterTemplateProperties> listResult = client.createCall(NewsletterTemplateProperties.List).limitBy(2).execute();
        if (listResult.isEmpty()) {
            try {
                client.createCall(NewsletterTemplateProperties.Get).identifiedBy(NewsletterTemplatePropertiesProperty.ID, 2147483647L).execute();
                Assert.fail();
            } catch (MailJetApiCallException e) {
                Assert.assertEquals(MailJetApiCallException.Error.NotFound, e.getError());
            }
        } else {
            if (listResult.iterator().next().getID()> 0) {
                client.createCall(NewsletterTemplateProperties.Get).identifiedBy(NewsletterTemplatePropertiesProperty.ID, listResult.iterator().next().getID()).execute();
            } else {
                try {
                    client.createCall(NewsletterTemplateProperties.Get).identifiedBy(NewsletterTemplatePropertiesProperty.ID, listResult.iterator().next().getID()).execute();
                    Assert.fail();
                } catch (MailJetApiCallException e) {
                    Assert.assertEquals(MailJetApiCallException.Error.NotFound, e.getError());
                }
            }
        }
    }

}
