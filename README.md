
[api_credential]: https://app.mailjet.com/account/api_keys

![alt text](http://cdn.appstorm.net/web.appstorm.net/files/2012/02/mailjet_logo_200x200.png "Mailjet")

# Mailjet Java Client


[![Build Status](https://travis-ci.org/GuillaumeBadi/Mailjet-Java.svg?branch=master)](https://travis-ci.org/GuillaumeBadi/Mailjet-Java)


This repo features the Brand new Java wrapper for the Mailjet API

## Getting Started

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

contacts = new MailjetRequest(Contact.resource, id)
            .filter(Contact.LIMIT, 2);

response = client.get(contacts);

```

## `POST` requests

### Post a new sender
``` java

MailjetRequest contacts;
MailjetResponse response;

sender = new MailjetRequest(Sender.resource)
            .property(Sender.EMAIL, "gbadi@mailjet.com");

response = client.post(sender);

```

### Send an Email
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
                    .property(Email.FROMEMAIL, "gbadi@student.42.fr")
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
