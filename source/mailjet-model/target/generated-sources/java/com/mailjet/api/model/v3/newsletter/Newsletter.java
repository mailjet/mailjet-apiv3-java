
package com.mailjet.api.model.v3.newsletter;

import java.math.BigDecimal;
import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.EnumValue;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Newsletter data.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "newsletter", description = "Newsletter data.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post
})
public final class Newsletter {

    @Component(name = "AXFraction", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal AXFraction;
    @Component(name = "AXFractionName", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String AXFractionName;
    @Component(name = "AXTestingID", type = "TAXTesting", defaultValue = "", required = false, description = "")
    private Long AXTestingID;
    @Component(name = "Callback", type = "AnsiString", defaultValue = "", required = false, description = "Callback URL.")
    private String Callback;
    @Component(name = "CampaignID", type = "TCampaign", defaultValue = "", required = false, description = "Reference to campaign created for this newsletter.")
    private Long CampaignID;
    @Component(name = "ContactsListID", type = "TContactsList", defaultValue = "", required = false, description = "Reference to contacts list to which newsletter will be sent.")
    private Long ContactsListID;
    @Component(name = "CreatedAt", type = "TRFC3339DateTime", defaultValue = "Current time", required = false, description = "Timestamp when object was created in database.")
    private Date CreatedAt;
    @Component(name = "DeliveredAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "When the newsletter was delivered.")
    private Date DeliveredAt;
    @Component(name = "EditMode", type = "AnsiString", defaultValue = "tool", required = false, description = "Edit mode for newsletter.")
    private Newsletter.EditMode EditMode;
    @Component(name = "EditType", type = "AnsiString", defaultValue = "full", required = false, description = "Edit type.")
    private Newsletter.EditType EditType;
    @Component(name = "Footer", type = "AnsiString", defaultValue = "default", required = false, description = "Footer type to generate.")
    private Newsletter.Footer Footer;
    @Component(name = "FooterAddress", type = "AnsiString", defaultValue = "", required = false, description = "Address to use in footer.")
    private String FooterAddress;
    @Component(name = "FooterWYSIWYGType", type = "SmallInt", defaultValue = "", required = false, description = "What kind of footer to generate.")
    private Short FooterWYSIWYGType;
    @Component(name = "HeaderFilename", type = "AnsiString", defaultValue = "", required = false, description = "Filename to use in header.")
    private String HeaderFilename;
    @Component(name = "HeaderLink", type = "AnsiString", defaultValue = "", required = false, description = "Link used in header.")
    private String HeaderLink;
    @Component(name = "HeaderText", type = "AnsiString", defaultValue = "", required = false, description = "Text of header.")
    private String HeaderText;
    @Component(name = "HeaderUrl", type = "AnsiString", defaultValue = "", required = false, description = "URL used in header.")
    private String HeaderUrl;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "Ip", type = "AnsiString", defaultValue = "", required = false, description = "IP address used to create newsletter.")
    private String Ip;
    @Component(name = "IsHandled", type = "Boolean", defaultValue = "false", required = false, description = "Has the newsletter been handled by Mailjet ?.")
    private Boolean IsHandled;
    @Component(name = "IsStarred", type = "Boolean", defaultValue = "false", required = false, description = "Is this a starred newsletter ?.")
    private Boolean IsStarred;
    @Component(name = "IsTextPartIncluded", type = "Boolean", defaultValue = "false", required = false, description = "Does the newsletter include a text version ?.")
    private Boolean IsTextPartIncluded;
    @Component(name = "Locale", type = "AnsiString", defaultValue = "", required = true, description = "Locale in which the information in this record is recorded.")
    private String Locale;
    @Component(name = "ModifiedAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp when newsletter content was last modified.")
    private Date ModifiedAt;
    @Component(name = "Permalink", type = "AnsiString", defaultValue = "default", required = false, description = "Type of permalink that should be added to the newsletter.")
    private Newsletter.Permalink Permalink;
    @Component(name = "PermalinkHost", type = "AnsiString", defaultValue = "", required = false, description = "Host for the permalink.")
    private String PermalinkHost;
    @Component(name = "PermalinkWYSIWYGType", type = "SmallInt", defaultValue = "", required = false, description = "?.")
    private Short PermalinkWYSIWYGType;
    @Component(name = "PolitenessMode", type = "SmallInt", defaultValue = "", required = false, description = "?.")
    private Short PolitenessMode;
    @Component(name = "ReplyEmail", type = "TEmail", defaultValue = "", required = false, description = "Reply-To address for the mail.")
    private String ReplyEmail;
    @Component(name = "SegmentationID", type = "TContactFilter", defaultValue = "", required = false, description = "")
    private Long SegmentationID;
    @Component(name = "Sender", type = "AnsiString", defaultValue = "", required = true, description = "Sender.")
    private String Sender;
    @Component(name = "SenderEmail", type = "TEmail", defaultValue = "", required = true, description = "Sender email address in headers.")
    private String SenderEmail;
    @Component(name = "SenderName", type = "AnsiString", defaultValue = "", required = false, description = "Name of the sender in Sender headers.")
    private String SenderName;
    @Component(name = "Status", type = "SmallInt", defaultValue = "1 if not yet delivered", required = false, description = "Status of the newsletter.")
    private Newsletter.Status Status;
    @Component(name = "Subject", type = "AnsiString", defaultValue = "", required = true, description = "Newsletter subject.")
    private String Subject;
    @Component(name = "TemplateID", type = "TNewsLetterTemplate", defaultValue = "", required = false, description = "Template from which this newsletter was generated, or as which it was last saved.")
    private Long TemplateID;
    @Component(name = "TestAddress", type = "AnsiString", defaultValue = "", required = false, description = "Address used for testing.")
    private String TestAddress;
    @Component(name = "Title", type = "AnsiString", defaultValue = "", required = false, description = "Newsletter title.")
    private String Title;
    @Component(name = "Url", type = "AnsiString", defaultValue = "", required = false, description = "URL where an online version of the newsletter can be found [?].")
    private String Url;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Newsletter>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Newsletter>>(Newsletter.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Newsletter>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Newsletter>>(Newsletter.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Newsletter>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Newsletter>>(Newsletter.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Newsletter>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Newsletter>>(Newsletter.class, ResourceOperationTypes.Post);

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getAXFraction() {
        return AXFraction;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setAXFraction(BigDecimal value) {
        AXFraction = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getAXFractionName() {
        return AXFractionName;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setAXFractionName(String value) {
        AXFractionName = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getAXTestingID() {
        return AXTestingID;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setAXTestingID(Long value) {
        AXTestingID = value;
        return this;
    }

    /**
     * Gets "Callback URL." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getCallback() {
        return Callback;
    }

    /**
     * Sets the specified value to "Callback URL." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setCallback(String value) {
        Callback = value;
        return this;
    }

    /**
     * Gets "Reference to campaign created for this newsletter." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getCampaignID() {
        return CampaignID;
    }

    /**
     * Sets the specified value to "Reference to campaign created for this newsletter." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setCampaignID(Long value) {
        CampaignID = value;
        return this;
    }

    /**
     * Gets "Reference to contacts list to which newsletter will be sent." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getContactsListID() {
        return ContactsListID;
    }

    /**
     * Sets the specified value to "Reference to contacts list to which newsletter will be sent." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setContactsListID(Long value) {
        ContactsListID = value;
        return this;
    }

    /**
     * Gets "Timestamp when object was created in database." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getCreatedAt() {
        return CreatedAt;
    }

    /**
     * Sets the specified value to "Timestamp when object was created in database." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setCreatedAt(Date value) {
        CreatedAt = value;
        return this;
    }

    /**
     * Gets "When the newsletter was delivered." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getDeliveredAt() {
        return DeliveredAt;
    }

    /**
     * Sets the specified value to "When the newsletter was delivered." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setDeliveredAt(Date value) {
        DeliveredAt = value;
        return this;
    }

    /**
     * Gets "Edit mode for newsletter." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Newsletter.EditMode getEditMode() {
        return EditMode;
    }

    /**
     * Sets the specified value to "Edit mode for newsletter." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setEditMode(Newsletter.EditMode value) {
        EditMode = value;
        return this;
    }

    /**
     * Gets "Edit type." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Newsletter.EditType getEditType() {
        return EditType;
    }

    /**
     * Sets the specified value to "Edit type." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setEditType(Newsletter.EditType value) {
        EditType = value;
        return this;
    }

    /**
     * Gets "Footer type to generate." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Newsletter.Footer getFooter() {
        return Footer;
    }

    /**
     * Sets the specified value to "Footer type to generate." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setFooter(Newsletter.Footer value) {
        Footer = value;
        return this;
    }

    /**
     * Gets "Address to use in footer." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getFooterAddress() {
        return FooterAddress;
    }

    /**
     * Sets the specified value to "Address to use in footer." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setFooterAddress(String value) {
        FooterAddress = value;
        return this;
    }

    /**
     * Gets "What kind of footer to generate." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Short getFooterWYSIWYGType() {
        return FooterWYSIWYGType;
    }

    /**
     * Sets the specified value to "What kind of footer to generate." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setFooterWYSIWYGType(Short value) {
        FooterWYSIWYGType = value;
        return this;
    }

    /**
     * Gets "Filename to use in header." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getHeaderFilename() {
        return HeaderFilename;
    }

    /**
     * Sets the specified value to "Filename to use in header." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setHeaderFilename(String value) {
        HeaderFilename = value;
        return this;
    }

    /**
     * Gets "Link used in header." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getHeaderLink() {
        return HeaderLink;
    }

    /**
     * Sets the specified value to "Link used in header." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setHeaderLink(String value) {
        HeaderLink = value;
        return this;
    }

    /**
     * Gets "Text of header." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getHeaderText() {
        return HeaderText;
    }

    /**
     * Sets the specified value to "Text of header." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setHeaderText(String value) {
        HeaderText = value;
        return this;
    }

    /**
     * Gets "URL used in header." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getHeaderUrl() {
        return HeaderUrl;
    }

    /**
     * Sets the specified value to "URL used in header." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setHeaderUrl(String value) {
        HeaderUrl = value;
        return this;
    }

    /**
     * Gets "Unique numerical ID for this object." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getID() {
        return ID;
    }

    /**
     * Sets the specified value to "Unique numerical ID for this object." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "IP address used to create newsletter." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getIp() {
        return Ip;
    }

    /**
     * Sets the specified value to "IP address used to create newsletter." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setIp(String value) {
        Ip = value;
        return this;
    }

    /**
     * Gets "Has the newsletter been handled by Mailjet ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsHandled() {
        return IsHandled;
    }

    /**
     * Sets the specified value to "Has the newsletter been handled by Mailjet ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setIsHandled(Boolean value) {
        IsHandled = value;
        return this;
    }

    /**
     * Gets "Is this a starred newsletter ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsStarred() {
        return IsStarred;
    }

    /**
     * Sets the specified value to "Is this a starred newsletter ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setIsStarred(Boolean value) {
        IsStarred = value;
        return this;
    }

    /**
     * Gets "Does the newsletter include a text version ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsTextPartIncluded() {
        return IsTextPartIncluded;
    }

    /**
     * Sets the specified value to "Does the newsletter include a text version ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setIsTextPartIncluded(Boolean value) {
        IsTextPartIncluded = value;
        return this;
    }

    /**
     * Gets "Locale in which the information in this record is recorded." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getLocale() {
        return Locale;
    }

    /**
     * Sets the specified value to "Locale in which the information in this record is recorded." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setLocale(String value) {
        Locale = value;
        return this;
    }

    /**
     * Gets "Timestamp when newsletter content was last modified." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getModifiedAt() {
        return ModifiedAt;
    }

    /**
     * Sets the specified value to "Timestamp when newsletter content was last modified." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setModifiedAt(Date value) {
        ModifiedAt = value;
        return this;
    }

    /**
     * Gets "Type of permalink that should be added to the newsletter." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Newsletter.Permalink getPermalink() {
        return Permalink;
    }

    /**
     * Sets the specified value to "Type of permalink that should be added to the newsletter." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setPermalink(Newsletter.Permalink value) {
        Permalink = value;
        return this;
    }

    /**
     * Gets "Host for the permalink." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getPermalinkHost() {
        return PermalinkHost;
    }

    /**
     * Sets the specified value to "Host for the permalink." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setPermalinkHost(String value) {
        PermalinkHost = value;
        return this;
    }

    /**
     * Gets "?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Short getPermalinkWYSIWYGType() {
        return PermalinkWYSIWYGType;
    }

    /**
     * Sets the specified value to "?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setPermalinkWYSIWYGType(Short value) {
        PermalinkWYSIWYGType = value;
        return this;
    }

    /**
     * Gets "?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Short getPolitenessMode() {
        return PolitenessMode;
    }

    /**
     * Sets the specified value to "?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setPolitenessMode(Short value) {
        PolitenessMode = value;
        return this;
    }

    /**
     * Gets "Reply-To address for the mail." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getReplyEmail() {
        return ReplyEmail;
    }

    /**
     * Sets the specified value to "Reply-To address for the mail." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setReplyEmail(String value) {
        ReplyEmail = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getSegmentationID() {
        return SegmentationID;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setSegmentationID(Long value) {
        SegmentationID = value;
        return this;
    }

    /**
     * Gets "Sender." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getSender() {
        return Sender;
    }

    /**
     * Sets the specified value to "Sender." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setSender(String value) {
        Sender = value;
        return this;
    }

    /**
     * Gets "Sender email address in headers." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getSenderEmail() {
        return SenderEmail;
    }

    /**
     * Sets the specified value to "Sender email address in headers." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setSenderEmail(String value) {
        SenderEmail = value;
        return this;
    }

    /**
     * Gets "Name of the sender in Sender headers." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getSenderName() {
        return SenderName;
    }

    /**
     * Sets the specified value to "Name of the sender in Sender headers." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setSenderName(String value) {
        SenderName = value;
        return this;
    }

    /**
     * Gets "Status of the newsletter." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Newsletter.Status getStatus() {
        return Status;
    }

    /**
     * Sets the specified value to "Status of the newsletter." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setStatus(Newsletter.Status value) {
        Status = value;
        return this;
    }

    /**
     * Gets "Newsletter subject." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getSubject() {
        return Subject;
    }

    /**
     * Sets the specified value to "Newsletter subject." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setSubject(String value) {
        Subject = value;
        return this;
    }

    /**
     * Gets "Template from which this newsletter was generated, or as which it was last saved." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getTemplateID() {
        return TemplateID;
    }

    /**
     * Sets the specified value to "Template from which this newsletter was generated, or as which it was last saved." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setTemplateID(Long value) {
        TemplateID = value;
        return this;
    }

    /**
     * Gets "Address used for testing." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getTestAddress() {
        return TestAddress;
    }

    /**
     * Sets the specified value to "Address used for testing." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setTestAddress(String value) {
        TestAddress = value;
        return this;
    }

    /**
     * Gets "Newsletter title." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getTitle() {
        return Title;
    }

    /**
     * Sets the specified value to "Newsletter title." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setTitle(String value) {
        Title = value;
        return this;
    }

    /**
     * Gets "URL where an online version of the newsletter can be found [?]." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getUrl() {
        return Url;
    }

    /**
     * Sets the specified value to "URL where an online version of the newsletter can be found [?]." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Newsletter setUrl(String value) {
        Url = value;
        return this;
    }

    public String toString() {
        return ((Newsletter.class.getSimpleName()+"#")+ this.getID());
    }


    /**
     * Enumeration defining allowed values for "EditMode"(Edit mode for newsletter.) MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
     * 
     */
    public static enum EditMode {


        /**
         * Value "tool".
         * 
         */
        @EnumValue("tool")
        TOOL,

        /**
         * Value "html".
         * 
         */
        @EnumValue("html")
        HTML;

    }


    /**
     * Enumeration defining allowed values for "EditType"(Edit type.) MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
     * 
     */
    public static enum EditType {


        /**
         * Value "full".
         * 
         */
        @EnumValue("full")
        FULL,

        /**
         * Value "light".
         * 
         */
        @EnumValue("light")
        LIGHT,

        /**
         * Value "ulight".
         * 
         */
        @EnumValue("ulight")
        ULIGHT;

    }


    /**
     * Enumeration defining allowed values for "Footer"(Footer type to generate.) MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
     * 
     */
    public static enum Footer {


        /**
         * Value "default".
         * 
         */
        @EnumValue("default")
        DEFAULT,

        /**
         * Value "none".
         * 
         */
        @EnumValue("none")
        NONE;

    }


    /**
     * Enumeration defining allowed values for "Permalink"(Type of permalink that should be added to the newsletter.) MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
     * 
     */
    public static enum Permalink {


        /**
         * Value "default".
         * 
         */
        @EnumValue("default")
        DEFAULT,

        /**
         * Value "none".
         * 
         */
        @EnumValue("none")
        NONE;

    }


    /**
     * Enumeration defining allowed values for "Status"(Status of the newsletter.) MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
     * 
     */
    public static enum Status {


        /**
         * Value "AXCanceled (-3)".
         * 
         */
        @EnumValue("AXCanceled (-3)")
        AXCANCELED___3_,

        /**
         * Value "Deleted (-2)".
         * 
         */
        @EnumValue("Deleted (-2)")
        DELETED___2_,

        /**
         * Value "Archived (-1)".
         * 
         */
        @EnumValue("Archived (-1)")
        ARCHIVED___1_,

        /**
         * Value "Draft (0)".
         * 
         */
        @EnumValue("Draft (0)")
        DRAFT__0_,

        /**
         * Value "Programmed (1)".
         * 
         */
        @EnumValue("Programmed (1)")
        PROGRAMMED__1_,

        /**
         * Value "AXSelected (4)".
         * 
         */
        @EnumValue("AXSelected (4)")
        AXSELECTED__4_;

    }

}
