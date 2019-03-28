
[api_credential]: https://app.mailjet.com/account/api_keys
[doc]: http://dev.mailjet.com/guides/?java#
[smsDashboard]:https://app.mailjet.com/sms?_ga=2.81581655.1972348350.1522654521-1279766791.1506937572
[smsInfo]:https://app.mailjet.com/docs/transactional-sms?_ga=2.183303910.1972348350.1522654521-1279766791.1506937572#trans-sms-token

![alt text](https://www.mailjet.com/images/email/transac/logo_header.png "Mailjet")

# Official Mailjet Java Wrapper


[![Build Status](https://travis-ci.org/mailjet/mailjet-apiv3-java.svg?branch=master)](https://travis-ci.org/mailjet/mailjet-apiv3-java)


This repo features the Java wrapper for the Mailjet API. 

Check out all the resources and all the Java code examples on the [Offical Documentation][doc].

## Getting Started

### Installation (Maven)

Add the following in your `pom.xml`

``` xml
    <dependencies>
        <dependency>
            <groupId>com.mailjet</groupId>
            <artifactId>mailjet-client</artifactId>
            <version>4.2.0</version>
        </dependency>
    </dependencies>
```

Grab your API and Secret Keys [here][api_credential]. You need them for authentication when using the Email API:

``` java

MailjetClient client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"));

```

For the V4 namespace (SMS API) the authorization method is based on a Bearer token. To generate a new token, please go Mailjet's [SMS Dashboard][smsDashboard] and click on 'Generate a token'. Additional information can be found [here][smsInfo].

``` java

MailjetClient client = new MailjetClient(System.getenv("MJ_TOKEN"), new ClientOptions("v4"));

```

Requests are easy to understand:
``` java

MailjetRequest request = MailjetRequest(resource, id, actionId)

```

## API Versioning

The Mailjet API is spread among three distinct versions:

- `v3` - The Email API
- `v3.1` - Email Send API v3.1, which is the latest version of our Send API
- `v4` - SMS API

Since most Email API endpoints are located under `v3`, it is set as the default one and does not need to be specified when making your request. For the others you need to specify the version using `ClientOptions`. For example, if using Send API `v3.1`:

``` java

MailjetClient client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"), new ClientOptions("v3.1"));

```

For additional information refer to our [API Reference](https://dev.preprod.mailjet.com/reference/overview/versioning/).

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

### Send an Email
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

You can also use the previous version of Mailjet's Send API (v3). You can find the documentation explaining the overall differences and code samples [here](https://dev.mailjet.com/guides/?java#send-api-v3).

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
## Use HTTP proxy
The proxy can be set using the following system properties:

``` java
HTTP proxy
-Dhttp.proxyHost=
-Dhttp.proxyPort=

HTTPS proxy
-Dhttps.proxyHost=
-Dhttps.proxyPort=
```
If you communicate with other endpoints using java.net.HttpURLConnection and you don't need proxy for them:
``` java
-Dhttp.nonProxyHosts=<any host you don't want to be proxied>
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
