package com.mailjet.client;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Template;
import com.mailjet.client.resource.TemplateDetailcontent;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.UUID;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TemplateIT {

    private static long templateId;
    private static MailjetClient mailjetClient = TestHelper.getClient();
    private static String utf8String = "ID_AÇÃO©℗®™";
    private static String mjmlContent =
            "<mjml>" +
            "  <mj-body>" +
            "    <mj-section>" +
            "      <mj-column>" +
            "        <mj-image width=\"100px\" src=\"/assets/img/logo-small.png\"></mj-image>" +
            "        <mj-divider border-color=\"#F45E43\"></mj-divider>" +
            "        <mj-text font-size=\"20px\" color=\"#F45E43\" font-family=\"helvetica\">Hello World" + utf8String +"</mj-text>" +
            "      </mj-column>" +
            "    </mj-section>" +
            "  </mj-body>" +
            "</mjml>";

    private static String htmlContent = "<h3>Dear passenger, welcome to Mailjet!</h3><br />May the delivery force be with you!" + utf8String;
    private static String textContent = "Dear passenger, welcome to Mailjet! May the delivery force be with you!" + utf8String;

    @Test
    public void a_createTemplate() throws MailjetException {
        // arrange
        MailjetRequest mailjetRequest = new MailjetRequest(Template.resource)
                .property(Template.AUTHOR, "John Doe")
                .property(Template.CATEGORIES, new JSONArray("[\"welcome\"]"))
                .property(Template.COPYRIGHT, "Mailjet")
                .property(Template.DESCRIPTION, "Used to send out promo codes.")
                .property(Template.EDITMODE, 1)
                .property(Template.ISSTARRED, false)
                .property(Template.ISTEXTPARTGENERATIONENABLED, true)
                //.property(Template.LOCALE, "en_US")
                .property(Template.NAME, "Promo Codes test template #" + UUID.randomUUID().toString())
                .property(Template.OWNERTYPE, "user")
                .property(Template.PRESETS, "string")
                .property(Template.PURPOSES, new JSONArray("[\"transactional\"]"));

        // act
        MailjetResponse mailjetResponse = mailjetClient.post(mailjetRequest);

        // assert
        Assert.assertEquals(201, mailjetResponse.getStatus());
        Assert.assertEquals(1, mailjetResponse.getCount());

        templateId = mailjetResponse.getData().getJSONObject(0).getLong("ID");
        Assert.assertTrue(templateId > 0);
    }

    @Test
    public void b_putTemplateContent() throws MailjetException {
        // arrange
        JSONObject templateHeaders = new JSONObject();
        templateHeaders.put("From", "test@mailjet.com");
        templateHeaders.put("Subject", "Test subject");
        templateHeaders.put("Reply-to", "test@mailjet.com");

        MailjetRequest mailjetRequest = new MailjetRequest(TemplateDetailcontent.resource, templateId)
                .property(TemplateDetailcontent.HEADERS, templateHeaders)
                .property(TemplateDetailcontent.HTMLPART, htmlContent)
                .property(TemplateDetailcontent.MJMLCONTENT, mjmlContent)
                .property(TemplateDetailcontent.TEXTPART, textContent);

        // act
        MailjetResponse mailjetResponse = mailjetClient.post(mailjetRequest);

        // assert
        Assert.assertEquals(201, mailjetResponse.getStatus());
        Assert.assertEquals(1, mailjetResponse.getCount());

        JSONObject templateData = mailjetResponse.getData().getJSONObject(0);
        Assert.assertEquals(htmlContent, templateData.getString(TemplateDetailcontent.HTMLPART));
        Assert.assertEquals(textContent, templateData.getString(TemplateDetailcontent.TEXTPART));
        Assert.assertEquals(mjmlContent, templateData.getString(TemplateDetailcontent.MJMLCONTENT));
    }

    @Test
    public void c_getTemplateContent() throws MailjetException {
        // arrange
        MailjetRequest mailjetRequest = new MailjetRequest(TemplateDetailcontent.resource, templateId);

        // act
        MailjetResponse mailjetResponse = mailjetClient.get(mailjetRequest);

        // assert
        Assert.assertEquals(200, mailjetResponse.getStatus());
        Assert.assertEquals(1, mailjetResponse.getCount());

        JSONObject templateData = mailjetResponse.getData().getJSONObject(0);
        Assert.assertEquals(htmlContent, templateData.getString(TemplateDetailcontent.HTMLPART));
        Assert.assertEquals(textContent, templateData.getString(TemplateDetailcontent.TEXTPART));
        Assert.assertEquals(mjmlContent, templateData.getString(TemplateDetailcontent.MJMLCONTENT));
    }

    @Test
    public void d_deleteTemplate() throws MailjetException {
        // arrange
        MailjetRequest mailjetRequest = new MailjetRequest(Template.resource, templateId);

        // act
        MailjetResponse mailjetResponse = mailjetClient.delete(mailjetRequest);

        // assert
        Assert.assertEquals(204, mailjetResponse.getStatus());
    }
}
