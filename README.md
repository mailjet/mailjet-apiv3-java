
[api_credential]: https://app.mailjet.com/account/api_keys
[doc]: http://dev.mailjet.com/guides/?java#
[smsDashboard]:https://app.mailjet.com/sms?_ga=2.81581655.1972348350.1522654521-1279766791.1506937572
[smsInfo]:https://app.mailjet.com/docs/transactional-sms?_ga=2.183303910.1972348350.1522654521-1279766791.1506937572#sms-token

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
Alternatively for V4 namespace you will need a Bearer token. To generate a new token, please go Mailjet's [SMS Dashboard][smsDashboard] and click on 'Generate a token'. 
Any additional information can be found [here][smsInfo].

``` java

MailjetClient client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"));

```

For V4 namespace the authorization method is changed - now it is based on Bearer token. 

``` java

MailjetClient client = new MailjetClient(System.getenv("MJ_TOKEN"), new ClientOptions("v4"));

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

JSONObject message = new JSONObject();
message.put(Emailv31.Message.FROM, new JSONObject()
  .put(Emailv31.Message.EMAIL, "pilot@mailjet.com")
  .put(Emailv31.Message.NAME, "Mailjet Pilot")
)
.put(Emailv31.Message.SUBJECT, "Your email flight plan!")
.put(Emailv31.Message.TEXTPART, "Dear passenger, welcome to Mailjet! May the delivery force be with you!")
.put(Emailv31.Message.HTMLPART, "<h3>Dear passenger, welcome to Mailjet</h3><br/>May the delivery force be with you!")
.put(Emailv31.Message.TO, new JSONArray()
.put(new JSONObject()
.put(Emailv31.Message.EMAIL, "passenger@mailjet.com")));

email = new MailjetRequest(Emailv31.resource).property(Emailv31.MESSAGES, (new JSONArray()).put(message));

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

### Send an SMS with Send SMS API 
``` java

MailjetClient client;
MailjetRequest request;
MailjetResponse response;

// Note how we set the version to v4 using ClientOptions and use already generated token
MailjetClient client = new MailjetClient(System.getenv("MJ_TOKEN"), new ClientOptions("v4"));

request = new MailjetRequest(Send.resource)
			.property(Send.From, "MJPilot")
        	.property(Send.To, "+33600000000")
			.property(Send.Text, "Have a nice SMS flight with Mailjet!");
		
response = client.post(request);

```

## TODO:

 - head
