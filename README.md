
[api_credential]: https://app.mailjet.com/account/api_keys
[doc]: http://dev.mailjet.com/guides/?java#
[smsDashboard]:https://app.mailjet.com/sms?_ga=2.81581655.1972348350.1522654521-1279766791.1506937572
[smsInfo]:https://app.mailjet.com/docs/transactional-sms?_ga=2.183303910.1972348350.1522654521-1279766791.1506937572#trans-sms-token
[mailjet]: http://www.mailjet.com

![alt text](https://www.mailjet.com/images/email/transac/logo_header.png "Mailjet")

# Official Mailjet Java Wrapper


[![Build Status](https://travis-ci.org/mailjet/mailjet-apiv3-java.svg?branch=master)](https://travis-ci.org/mailjet/mailjet-apiv3-java)

## Overview

This repo features the official Java wrapper for the Mailjet API.

Check out all the resources and all the Java code examples in the [Offical Documentation][doc].

## Table of contents

- [Compatibility](#compatibility)
- [Installation (Maven)](#installation-maven)
- [Authentication](#authentication)
- [Make your first call](#make-your-first-call)
- [Client / Call configuration specifics](#client--call-configuration-specifics)
  - [Options](#options)
    - [API versioning](#api-versioning)
    - [Base URL](#base-url)
  - [Use HTTP proxy](#use-http-proxy)
- [List of resources](#list-of-resources)
- [Request examples](#request-examples)
  - [POST request](#post-request)
    - [Simple POST request](#simple-post-request)
    - [Using actions](#using-actions)
  - [GET request](#get-request)
    - [Retrieve all objects](#retrieve-all-objects)
    - [Use filtering](#use-filtering)
    - [Retrieve a single object](#retrieve-a-single-object)
  - [PUT request](#put-request)
  - [DELETE request](#delete-request)
- [SMS API](#sms-api)
  - [Token authentication](#token-authentication)
  - [Example Request](#example-request)
- [Contribute](#contribute)


## Compatibility

This library requires library requires Java version 1.8 or higher.

## Installation (Maven)

Add the following in your `pom.xml`

``` xml
    <dependencies>
        <dependency>
            <groupId>com.mailjet</groupId>
            <artifactId>mailjet-client</artifactId>
            <version>4.5.0</version>
        </dependency>
    </dependencies>
```

## Authentication

The Mailjet Email API uses your API and Secret keys for authentication. [Grab][api_credential] and save your Mailjet API credentials.

```bash
export MJ_APIKEY_PUBLIC='your API key'
export MJ_APIKEY_PRIVATE='your API secret'
```

> Note: For the SMS API the authorization is based on a Bearer token. See information about it in the [SMS API](#sms-api) section of the readme.

Initialize your [Mailjet][mailjet] Client:

```java
MailjetClient client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"));
```

## Make your first call

Here's an example on how to send an email:

```java
package com.my.project;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.ApiVersion;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;
public class MyClass {
    /**
     * Run:
     */
    public static void main(String[] args) throws MailjetException {
      MailjetClient client;
      MailjetRequest request;
      MailjetResponse response;
      client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"), new ClientOptions(ApiVersion.V3));
      request = new MailjetRequest(Emailv31.resource)
            .property(Emailv31.MESSAGES, new JSONArray()
                .put(new JSONObject()
                    .put(Emailv31.Message.FROM, new JSONObject()
                        .put("Email", "$SENDER_EMAIL")
                        .put("Name", "Me"))
                    .put(Emailv31.Message.TO, new JSONArray()
                        .put(new JSONObject()
                            .put("Email", "$RECIPIENT_EMAIL")
                            .put("Name", "You")))
                    .put(Emailv31.Message.SUBJECT, "My first Mailjet Email!")
                    .put(Emailv31.Message.TEXTPART, "Greetings from Mailjet!")
                    .put(Emailv31.Message.HTMLPART, "<h3>Dear passenger 1, welcome to <a href=\"https://www.mailjet.com/\">Mailjet</a>!</h3><br />May the delivery force be with you!")));
      response = client.post(request);
      System.out.println(response.getStatus());
      System.out.println(response.getData());
    }
}
```

## Client / Call configuration specifics

To instantiate the library you can use the following constructor:  

```java
MailjetClient client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"), new ClientOptions(ApiVersion.V3, "https://api.us.mailjet.com"));
```

 - `$MJ_APIKEY_PUBLIC` : public Mailjet API key
 - `$MJ_APIKEY_PRIVATE` : private Mailjet API key
 - `ClientOptions` : associative array describing the connection options (see Options bellow for full list)

### Options

#### API Versioning

The Mailjet API is spread among three distinct versions:

- `v3` - The Email API
- `v3.1` - Email Send API v3.1, which is the latest version of our Send API
- `v4` - SMS API

Since most Email API endpoints are located under `v3`, it is set as the default one and does not need to be specified when making your request. For the others you need to specify the version using `ClientOptions`. For example, if using Send API `v3.1`:

``` java

MailjetClient client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"), new ClientOptions(ApiVersion.V3_1));

```

For additional information refer to our [API Reference](https://dev.preprod.mailjet.com/reference/overview/versioning/).

#### Base URL

The default base domain name for the Mailjet API is api.mailjet.com. You can modify this base URL by adding a different URL in `ClientOptions`:

```java
MailjetClient client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"), new ClientOptions(ApiVersion.V3, "https://api.us.mailjet.com"));
```

If your account has been moved to Mailjet's **US architecture**, the URL you need to add is `https://api.us.mailjet.com`.

### Use HTTP proxy

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

## List of resources

You can find the list of all available resources for this library, as well as their configuration, in [src/main/java/com/mailjet/client/resource](https://github.com/mailjet/mailjet-apiv3-java/blob/master/src/main/java/com/mailjet/client/resource).

## Request examples

### POST Request

Use the `Post` method of the Mailjet CLient (i.e. `response = client.post(request);`).
`request` will be a `MailjetRequest` object.

#### Simple POST request

```java
package com.my.project;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.resource.Contact;

public class MyClass {
    /**
     * Create a contact
     */
    public static void main(String[] args) throws MailjetException {
      MailjetClient client;
      MailjetRequest request;
      MailjetResponse response;
      client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"));
      request = new MailjetRequest(Contact.resource)
            .property(Contact.EMAIL, "Mister@mailjet.com");
      response = client.post(request);
      System.out.println(response.getStatus());
      System.out.println(response.getData());
    }
}

```

#### Using actions

To access endpoints with action, you will be able to find Resources object definition. For example, the `/Contact/$ID/Managecontactslists` endpoint can be used with the object `ContactManagecontactslists` available in `com.mailjet.client.resource` 

```java
package com.my.project;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.resource.ContactManagecontactslists;
import org.json.JSONArray;
import org.json.JSONObject;
public class MyClass {
    /**
     * Create : Manage a contact subscription to a list
     */
    public static void main(String[] args) throws MailjetException {
      MailjetClient client;
      MailjetRequest request;
      MailjetResponse response;
      client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"));
      request = new MailjetRequest(ContactManagecontactslists.resource, ID)
            .property(ContactManagecontactslists.CONTACTSLISTS, new JSONArray()
                .put(new JSONObject()
                    .put("ListID", "$ListID_1")
                    .put("Action", "addnoforce"))
                .put(new JSONObject()
                    .put("ListID", "$ListID_2")
                    .put("Action", "addforce")));
      response = client.post(request);
      System.out.println(response.getStatus());
      System.out.println(response.getData());
    }
}
```

### GET Request

Use the `get` method of the Mailjet CLient (i.e. `response = client.get(request);`).
`request` will be a `MailjetRequest` object.

#### Retrieve all objects

```java
package com.my.project;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.resource.Contact;
import org.json.JSONArray;
import org.json.JSONObject;
public class MyClass {
    /**
     * Run :
     */
    public static void main(String[] args) throws MailjetException {
      MailjetClient client;
      MailjetRequest request;
      MailjetResponse response;
      client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"));
      request = new MailjetRequest(Contact.resource);
      response = client.get(request);
      System.out.println(response.getStatus());
      System.out.println(response.getData());
    }
}
```

#### Use filtering

You can add filter for your API call on the `MailjetRequest` by using the `filter` method. 
Example: `.filter(Contact.ISEXCLUDEDFROMCAMPAIGNS, "false");`

```java
package com.my.project;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.resource.Message;
import org.json.JSONArray;
import org.json.JSONObject;
public class MyClass {
    /**
     * Run :
     */
    public static void main(String[] args) throws MailjetException {
      MailjetClient client;
      MailjetRequest request;
      MailjetResponse response;
      client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"));
      request = new MailjetRequest(Contact.resource)
            .filter(Contact.ISEXCLUDEDFROMCAMPAIGNS, "false");
      response = client.get(request);
      System.out.println(response.getStatus());
      System.out.println(response.getData());
    }
}
```

#### Retrieve a single object

When instantiating the `MailjetRequest`, you can specify the Id of the resource you want to access.
(example: `request = new MailjetRequest(Contact.resource, ID);`).


```java
package com.my.project;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.resource.Contact;
import org.json.JSONArray;
import org.json.JSONObject;
public class MyClass {
    /**
     * Run :
     */
    public static void main(String[] args) throws MailjetException {
      MailjetClient client;
      MailjetRequest request;
      MailjetResponse response;
      client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"));
      request = new MailjetRequest(Contact.resource, ID);
      response = client.get(request);
      System.out.println(response.getStatus());
      System.out.println(response.getData());
    }
}
```

### PUT Request

A `PUT` request in the Mailjet API will work as a `PATCH` request - the update will affect only the specified properties. The other properties of an existing resource will neither be modified, nor deleted. It also means that all non-mandatory properties can be omitted from your payload.

Use the `put` method of the Mailjet CLient (i.e. `response = client.put(request);`).
`request` will be a `MailjetRequest` object.

```java
package com.my.project;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.resource.Contactdata;
import org.json.JSONArray;
import org.json.JSONObject;
public class MyClass {
    /**
     * Modify : Modify the static custom contact data
     */
    public static void main(String[] args) throws MailjetException {
      MailjetClient client;
      MailjetRequest request;
      MailjetResponse response;
      client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"));
      request = new MailjetRequest(Contactdata.resource, ID)
            .property(Contactdata.DATA, new JSONArray()
                .put(new JSONObject()
                    .put("Name", "Age")
                    .put("value", "30"))
                .put(new JSONObject()
                    .put("Name", "Country")
                    .put("value", "US")));
      response = client.put(request);
      System.out.println(response.getStatus());
      System.out.println(response.getData());
    }
}
```

### DELETE Request

Upon a successful `DELETE` request the response will not include a response body, but only a `204 No Content` response code.

Here's an example of a `DELETE` request:

```java
package com.my.project;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.resource.Template;
import org.json.JSONArray;
import org.json.JSONObject;
public class MyClass {
    /**
     * Delete a Template
     */
    public static void main(String[] args) throws MailjetException {
      MailjetClient client;
      MailjetRequest request;
      MailjetResponse response;
      client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"));
      request = new MailjetRequest(Template.resource, ID);
      response = client.delete(request);
      System.out.println(response.getStatus());
      System.out.println(response.getData());
    }
}
```

## SMS API

### Token Authentication

Authentication for the SMS API endpoints is done using a bearer token. The bearer token is generated in the [SMS section](https://app.mailjet.com/sms) of your Mailjet account.

```java
MailjetClient client = new MailjetClient(System.getenv("MJ_TOKEN"), new ClientOptions(ApiVersion.V4));
```

### Example request

Here's an example SMS API request:

``` java

MailjetClient client;
MailjetRequest request;
MailjetResponse response;

// Note how we set the version to v4 using ClientOptions and use an already generated token
MailjetClient client = new MailjetClient(System.getenv("MJ_TOKEN"), new ClientOptions(ApiVersion.V4));

request = new MailjetRequest(Send.resource)
			.property(Send.From, "MJPilot")
        	.property(Send.To, "+33600000000")
			.property(Send.Text, "Have a nice SMS flight with Mailjet!");

response = client.post(request);

package com.my.project;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.sms.SmsSend;
import org.json.JSONArray;
import org.json.JSONObject;
public class MyClass {
    /**
     * Run:
     */
    public static void main(String[] args) throws MailjetException {
      MailjetClient client;
      MailjetRequest request;
      MailjetResponse response;
      client = new MailjetClient(System.getenv("MJ_TOKEN"), new ClientOptions(ApiVersion.V4));
      request = new MailjetRequest(SmsSend.resource)
		.property(SmsSend.FROM, "MJPilot")
        	.property(SmsSend.TO, "+33600000000")
		.property(SmsSend.TEXT, "Have a nice SMS flight with Mailjet!")
      response = client.post(request);
      System.out.println(response.getStatus());
      System.out.println(response.getData());
    }
}


```

## Contribute

Mailjet loves developers. You can be part of this project!

This wrapper is a great introduction to the open source world, check out the code!

Feel free to ask anything, and contribute:

 - Fork the project.
 - Create a new branch.
 - Implement your feature or bug fix.
 - Add documentation for it.
 - Add specs for your feature or bug fix.
 - Commit and push your changes.
 - Submit a pull request.

 If you have suggestions on how to improve the guides, please submit an issue in our [Official API Documentation repo](https://github.com/mailjet/api-documentation).
