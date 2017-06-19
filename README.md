
[api_credential]: https://app.mailjet.com/account/api_keys
[doc]: http://dev.mailjet.com/guides/?java#

![alt text](http://cdn.appstorm.net/web.appstorm.net/files/2012/02/mailjet_logo_200x200.png "Mailjet")

# Mailjet Java Client


[![Build Status](https://travis-ci.org/mailjet/mailjet-apiv3-java.svg?branch=master)](https://travis-ci.org/mailjet/mailjet-apiv3-java)


This repo features the Brand new Java wrapper for the Mailjet API. Check out the [Offical Documentation][doc]

## Getting Started

### Installation (Maven)

Add the following in your `pom.xml`

``` xml
    <dependencies>
        <dependency>
            <groupId>com.mailjet</groupId>
            <artifactId>mailjet-client</artifactId>
            <version>4.0.5</version>
        </dependency>
    </dependencies>
```

Grab your keys [here][api_credential]

``` java

MailjetClient client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"));

```

Requests are easy to understand
``` java

MailjetRequest request = MailjetRequest(resource, id, actionId)

```

## `GET` requests

### List all your contacts
``` java

MailjetRequest contacts;
MailjetResponse response;

contacts = new MailjetRequest(Contact.resource);
response = client.get(contacts);

```

### Filtering resources
``` java

MailjetRequest contacts;
MailjetResponse response;

contacts = new MailjetRequest(Contact.resource)
            .filter(Contact.LIMIT, 2);

response = client.get(contacts);

```

### View a single resource
``` java

MailjetRequest contacts;
MailjetResponse response;

contacts = new MailjetRequest(Contact.resource, id);

response = client.get(contacts);

```

## `POST` requests

### Post a new sender
``` java

MailjetRequest contacts;
MailjetResponse response;

sender = new MailjetRequest(Sender.resource)
            .property(Sender.EMAIL, "dummy@mailjet.com");

response = client.post(sender);

```

### Send an Email with Send API v3.1
``` java

MailjetClient client;
MailjetRequest email;
MailjetResponse response;

// Note how we set the version to v3.1 using ClientOptions
MailjetClient client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"), new ClientOptions("v3.1"));

email = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.FROM, new JSONObject()
                .put("Email", "passenger@mailjet.com")
                .put("Name", "Mailjet Pilot"))
                .property(Emailv31.SUBJECT, "Your email flight plan!")
                .property(Emailv31.TEXT_PART, "Dear passenger, welcome to Mailjet! May the delivery force be with you!")
                .property(Emailv31.HTML_PART, "&lt;h3&gt;Dear passenger, welcome to Mailjet!&lt;/h3&gt;&lt;br /&gt;May the delivery force be with you!")
                .property(Emailv31.TO, new JSONArray()
                .put(new JSONObject()
                .put("Email", "passenger@mailjet.com")));

response = client.post(email);

```

### Send an Email with Send API v3.0
``` java

MailjetRequest email;
JSONArray recipients;
MailjetResponse response;

recipients = new JSONArray()
                .put(new JSONObject().put(Contact.EMAIL, "roger@mailjet.com"))
                .put(new JSONObject().put(Contact.EMAIL, "stan@mailjet.com"))
                .put(new JSONObject().put(Contact.EMAIL, "francine@mailjet.com"));

email = new MailjetRequest(Email.resource)
                    .property(Email.FROMNAME, "Guillaume")
                    .property(Email.FROMEMAIL, "dummy@email.fr")
                    .property(Email.SUBJECT, "Subject")
                    .property(Email.TEXTPART, "Java is coming!...")
                    .property(Email.RECIPIENTS, recipients)
                    .property(Email.MJCUSTOMID, "JAVA-Email");

response = client.post(email);

```

## Get and update a Sender
``` java

MailjetRequest getSender = new MailjetRequest(Sender.resource)
                                .filter(Sender.EMAIL, "email adress");

MailjetResponse senders = client.get(getSender);

// Grab the first sender
JSONObject sender = senders.getData().getJSONObject(0);

// Change the name
MailjetRequest update = new MailjetRequest(Sender.resource, sender.getLong("ID"))
                    .setBody(sender.put(Sender.NAME, "new name"));

System.out.println(client.put(update));

```

## TODO:

 - head
