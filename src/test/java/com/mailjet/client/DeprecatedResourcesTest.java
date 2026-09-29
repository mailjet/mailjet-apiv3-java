package com.mailjet.client;

import com.mailjet.client.resource.Apikeytotals;
import com.mailjet.client.resource.Campaigndraft;
import com.mailjet.client.resource.CampaigndraftDetailcontent;
import com.mailjet.client.resource.CampaigndraftSchedule;
import com.mailjet.client.resource.CampaigndraftSend;
import com.mailjet.client.resource.CampaigndraftStatus;
import com.mailjet.client.resource.CampaigndraftTest;
import com.mailjet.client.resource.Campaigngraphstatistics;
import com.mailjet.client.resource.Campaignstatistics;
import com.mailjet.client.resource.Domainstatistics;
import com.mailjet.client.resource.Graphstatistics;
import com.mailjet.client.resource.Messagestatistics;
import com.mailjet.client.resource.Newsletter;
import com.mailjet.client.resource.NewsletterDetailcontent;
import com.mailjet.client.resource.NewsletterSchedule;
import com.mailjet.client.resource.NewsletterSend;
import com.mailjet.client.resource.NewsletterStatus;
import com.mailjet.client.resource.NewsletterTest;
import com.mailjet.client.resource.Openstatistics;
import com.mailjet.client.resource.Senderstatistics;
import com.mailjet.client.resource.Statcounters;
import com.mailjet.client.resource.StatisticsRecepientesp;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@SuppressWarnings("deprecation")
public class DeprecatedResourcesTest {

    private static final String API_URL = "https://api.mailjet.com";

    @Test
    public void legacyEndpointResourcesRemainDeprecated() {
        List<Class<?>> deprecatedResources = Arrays.asList(
                Newsletter.class,
                NewsletterDetailcontent.class,
                NewsletterTest.class,
                NewsletterSchedule.class,
                NewsletterSend.class,
                NewsletterStatus.class,
                Apikeytotals.class,
                Campaigngraphstatistics.class,
                Campaignstatistics.class,
                Domainstatistics.class,
                Graphstatistics.class,
                Messagestatistics.class,
                Openstatistics.class,
                Senderstatistics.class
        );

        for (Class<?> resource : deprecatedResources) {
            assertTrue(resource.getName() + " must remain deprecated",
                    resource.isAnnotationPresent(Deprecated.class));
        }
    }

    @Test
    public void campaignDraftResourcesBuildReplacementUrls() throws UnsupportedEncodingException {
        long draftId = 123L;

        assertEquals(API_URL + "/v3/REST/campaigndraft",
                new MailjetRequest(Campaigndraft.resource).buildUrl(API_URL));
        assertEquals(API_URL + "/v3/REST/campaigndraft/123/detailcontent",
                new MailjetRequest(CampaigndraftDetailcontent.resource, draftId).buildUrl(API_URL));
        assertEquals(API_URL + "/v3/REST/campaigndraft/123/test",
                new MailjetRequest(CampaigndraftTest.resource, draftId).buildUrl(API_URL));
        assertEquals(API_URL + "/v3/REST/campaigndraft/123/schedule",
                new MailjetRequest(CampaigndraftSchedule.resource, draftId).buildUrl(API_URL));
        assertEquals(API_URL + "/v3/REST/campaigndraft/123/send",
                new MailjetRequest(CampaigndraftSend.resource, draftId).buildUrl(API_URL));
        assertEquals(API_URL + "/v3/REST/campaigndraft/123/status",
                new MailjetRequest(CampaigndraftStatus.resource, draftId).buildUrl(API_URL));
    }

    @Test
    public void statCountersBuildsReplacementUrlAndQuery() throws UnsupportedEncodingException {
        MailjetRequest request = new MailjetRequest(Statcounters.resource)
                .filter(Statcounters.COUNTERSOURCE, "Campaign")
                .filter(Statcounters.SOURCEID, 123)
                .filter(Statcounters.COUNTERTIMING, "Message")
                .filter(Statcounters.COUNTERRESOLUTION, "Day")
                .filter(Statcounters.FROMTS, "2026-09-01T00:00:00Z")
                .filter(Statcounters.TOTS, "2026-09-30T00:00:00Z");

        assertTrue(request.buildUrl(API_URL).startsWith(API_URL + "/v3/REST/statcounters?"));
        String query = request.queryString();
        assertTrue(query.contains("CounterSource=Campaign"));
        assertTrue(query.contains("SourceID=123"));
        assertTrue(query.contains("CounterTiming=Message"));
        assertTrue(query.contains("CounterResolution=Day"));
        assertTrue(query.contains("FromTS=2026-09-01T00:00:00Z"));
        assertTrue(query.contains("ToTS=2026-09-30T00:00:00Z"));
    }

    @Test
    public void recipientEspBuildsReplacementUrlAndQuery() throws UnsupportedEncodingException {
        MailjetRequest request = new MailjetRequest(StatisticsRecepientesp.resource)
                .filter(StatisticsRecepientesp.CAMPAIGNID, 123)
                .filter(StatisticsRecepientesp.ESPNAMES, "gmail.com");

        assertTrue(request.buildUrl(API_URL).startsWith(
                API_URL + "/v3/REST/statistics/recipient-esp?"));
        String query = request.queryString();
        assertTrue(query.contains("CampaignID=123"));
        assertTrue(query.contains("EspNames=gmail.com"));
    }

    @Test
    public void campaignDraftExposesCurrentRequestProperties() {
        assertEquals("AXFraction", Campaigndraft.AXFRACTION);
        assertEquals("ContactsListAlt", Campaigndraft.CONTACTSLISTALT);
        assertEquals("ContactsListID", Campaigndraft.CONTACTSLISTID);
        assertEquals("SegmentationAlt", Campaigndraft.SEGMENTATIONALT);
        assertEquals("SegmentationID", Campaigndraft.SEGMENTATIONID);
        assertEquals("TemplateID", Campaigndraft.TEMPLATEID);
    }
}
