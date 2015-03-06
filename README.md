[API v3] Mailjet Java API Wrapper
========================
Communication with our API in Java applications is done using a client library providing wrapper around the API which enables the developers to build requests, read responses and handle errors in a native for Java way. The client handles all the HTTP communication and JSON serialization thus no specific knowledge of the developers are required.


###Contents

1. Usage
2. Configuration
3. Obtaining a client
4. Calling the MailJet API  
  4.1. Creation of resource instance  
  4.2. Update of resource instance  
  4.3. Removal of resource instance  
  4.4. Retrival of resource instances using filters  
  4.5. Retrival of resource instance using it's id or unique key
5. Error handling
6. API Structure
7. Dependencies  
  7.1 Advanced configuration
8. Spring integration
9. Logging


---------------------------------

Chapter 1. Usage
-------
The client is designed to be used with the least effort possible. The typical steps required to make a call are:

1. Setup configuration.
2. Build client.
3. Make the call!

The wrapper is designed to be able to do the steps with three or less statement in Java:


```java
MailJetClientConfiguration config = new MailJetClientConfiguration()
    				.setBaseUrl("https://api.mailjet.com/v3/REST/")
				.setDefaultApiKey("your_api_key")
				.setDefaultSecretKey("your_secret_key");
		
MailJetApiClient client = config.buildClient();
 
ResultSet<Campaign> campaigns = client
				.createCall(Campaign.List)
				.execute();
```

The api_url for Mailjet's REST api is :https://api.mailjet.com/v3/REST/


All the classes and interfaces part of the wrapper are designed using the *fluent interface* technique which enables chaining of method invocations. As result the above code could be written in just one statement:
```java
ResultSet<Campaign> campaigns = new MailJetClientConfiguration()
        		.setBaseURL("api_url")
				.setDefaultApiKey("your_api_key")
				.setDefaultSecretKey("your_secret_key")
                .buildClient()
                .createCall(Campaign.List)
    			.execute();
```
Note: reusing client instances is recomanded for better performance.

Check out the next chapters to see details about the differents components of the wrapper.

---------------------------------

Chapter 2. Configuration
-------------
The minumum set of configuration properties required by the API wrapper library are:

- **baseUrl**  
  *URL of the MailJet API*
- **defaultApiKey**  
  *Api key the wrapper should use for the requests*
- **defaultSecretKey**  
  *Secret key the wrapper should use for the requests*

These properties could be setup in two ways: programatically or with dedicated configuration file. In our first example we already showed how to setup the configuration in a programatic way. The second option you can use to specify the configuration file as follows:
```java
MailJetClientConfiguration config = new MailJetClientConfiguration()
		.loadFromClassPath("my_mailjet.properties");
```
or load the data from the default location assumed by the wrapper library: **mailjet.properties**.
```java
MailJetClientConfiguration config = new MailJetClientConfiguration()
		.loadDefault();
```
In both cases the file path specified is relative to the root of your classpath.
Example of content of wrapper configuration file:
```
baseUrl=api_url
defaultApiKey=your_api_key
defaultSecretKey=your_secret_key
```

---------------------------------

Chapter 3. Obtaining a client
------------------
When all properties are parsed by the configuration, the aplication can obtain client instances. The produced client is thread-safe and it is intended to be used by all application threads. 
```java
MailJetApiClient client = config.buildClient();
```
MailJet API Wrapper allows you to instantiate more than one client from different configurations. This could be useful if you want to use the API with more than one Api key/Secret key pair.

---------------------------------

Chapter 4. Using the client
----------------
The ***com.mailjet.api.client.MailJetApiClient*** interface defines a single method and it is used to create a call based on the opration you want to invoke on the MailJet API. Five types of operations are supported:

- **Create**  
  *Executes a POST request to create an instance of a resource on the MailJet API*
- **Update**  
  *Executes a PUT request to update existing instance of a resource on the MailJet API*
- **Delete**  
  *Executes a DELETE request to remove existing instance of a resource on the MailJet API*
- **Retrieve**  
  *Executes a GET request to retrive list of instances of a resource from the MailJet API*
- **RetrieveById**  
  *Executes a GET request to retireve a single instance of a resource from the MailJet API*

You can use the created ***com.mailjet.api.client.MailJetApiCall*** instance to build your request to the API. For example for retrieving a *campaign* by id you have to do the following:
```java
    Campaign campaign = 
            client
    			.createCall(Campaign.Get)
				.identifiedBy(CampaignProperty.ID, 342135423452L)
				.execute();
```

To study the interface of the wrapper we'll look at the way you can manage *newsletter* resource instances using the client's API:

###4.1. Creation of resource instance

To create a new *newsletter* you have to build a`Create` call and specify the value of properties you want to set for the new *newsletter*. Every property comes with it's expected data type and prevents the client code to accidentially pass wrong type of data.
```java
        Newsletter newsletter = 
            client.createCall(Newsletter.Create)
    			.property(NewsletterProperty.SENDER, "Test")
				.property(NewsletterProperty.SENDEREMAIL, "test@example.com")
				.property(NewsletterProperty.LOCALE, "FR")
				.property(NewsletterProperty.FOOTER, Newsletter.Footer.NONE)
				.property(NewsletterProperty.SUBJECT, "subject")
                .execute();
```
Setting value for same property twice will result in ***com.mailjet.api.client.MailJetApiCallException*** as such operation is meaningless and indicates a programming error.

Note that for enumerated types such as *newsletter.footer* the wrapper library provides Java enum `NewsletterProperty.Footer` representing the values allowed. Checks for presense of values for required fields are not done by the wrapper. Such validations are done by the MailJet API and violations will be reported as *MailJetApiCallException*.

###4.2. Update of resource instance

To update existing *newsletter* you have to build an `Update` call and specify the value of properties you want to update for that *newsletter*. Same rules for properties apply as for creation. The main difference is that before specifying the properties the client code should identify the *newsletter* which should be updated:
```java
    Newsletter newsletter = 
            client.createCall(Newsletter.Update)
    			.identifiedBy(NewsletterProperty.ID, 1234L)
				.property(NewsletterProperty.SUBJECT, "subject2")
                .execute();
```
To prevent accidential misuse the client will verify at compile time that you are passing a property that will uniquely identify a *newsletter* instance and the value passed is of correct type. For example the following code won't compile because property *newsletter.campaignid* cannot identify uniquely a *newsletter* instance:
```java
    Newsletter newsletter = 
            client.createCall(Newsletter.Update)
    			.identifiedBy(NewsletterProperty.CAMPAIGNID, 1234L)
				.property(NewsletterProperty.SUBJECT, "subject").execute();
```
Even though the wrapper tries to enforce a correct usage at compile time some of the checks are done in the runtime, for example if the code tries to execute the call without specifying an unique key the call will result in a ***com.mailjet.api.client.MailJetApiCallException*** indicating that the client is not used correctly.

###4.3. Delete a resource instance

To remove existing *newsletter* you have to build a `Delete` call and identify the instance that have to be removed in the same manner as update:
```java
            client.createCall(Newsletter.Delete)
        		.identifiedBy(NewsletterProperty.ID, 1234L)
                .execute();
```
That's the only method apart from execute that can be called for delete. If the code tries to execute the call without specifying an unique key the call will result in a ***com.mailjet.api.client.MailJetApiCallException*** indicating that the client is not used correctly. The reurn of this call is of type `Void` as the MailJet API doesn't provide response for deletions.

###4.4. Retrieve resource data 

You can very easily retrieve resource instances by just creating a `Retrieve` call and executing it without any parametrization:
```java
    ResultSet<Newsletter> newsletters = 
        client
            .createCall(Newsletter.List)
    		.execute();
```
The above code with fetch the default number of instances that is provided by the MailJet API. If you want to fetch more records you can increase/decrease the limit with following lines:
```java
    ResultSet<Newsletter> newsletters = 
        client
            .createCall(Newsletter.List)
    		.limitBy(10)
			.execute();
```
If you don't want to fetch records from begining of the result set you can aditionally specify an offset to be applied:
```java
    ResultSet<Newsletter> newsletters = 
        client
            .createCall(Newsletter.List)
    		.limitBy(10)
			.offsetBy(20)
			.execute();
```
The above example will fetch at most *10* records which are located between index 20 and 30 in the result set. Specifying filter criteria which the returned isntances must match is just easy and straightforward as using *limit* and *offset* options. You just have to specify the filter you want to apply and the value to use:
```java
    ResultSet<Newsletter> newsletters = 
            client.createCall(Newsletter.List)
    			.filterBy(NewsletterFilter.EDITMODE, Newsletter.EditMode.HTML)
				.filterBy(NewsletterFilter.ISDELETED, false)
				.execute();
```
As with properties, the wrapper library provides Java *enum* representing the valid values for filters which have specific set of allowed values. The wrapper also verifies that the value set for for specific filter has a correct type. Multiple filters can be combined together however multiple values for one filter are not supported. Trying to set multiple values for one filter will result in ***com.mailjet.api.client.MailJetApiCallException*** indicating a programming error. For convinience empty/null values are allowed. The wrapper won't include filters having an empty/null value in the generated request. 


###4.5. Retrieve resource instance by identifier or unique key

You can retrieve resource instances by id by creating a `RetrieveById` call and executing it against the API. For example for retrieving a *newsletter* by id you have to do the following:
```java
    Newsletter newsletter = 
            client
                .createCall(Newsletter.Get)
        		.identifiedBy(NewsletterProperty.ID, 1234L)
                .execute();
```
As with delete that's the only method apart from execute that can be called this type of calls and it's mandatory. If the code tries to execute the call without specifying an unique key the call will result in a **MailJetApiCallException** with `error` set to `Error.ClientMisuse` and indicating that the client is not used correctly. If the MailJet API is unable to locate resource instance with the specified id the wrapper will signal this as **MailJetApiCallException**  with `error` set to `Error.NotFound`.

Alternatively you can fetch resource instance not by an identifier property but by it's unique key(if such exists). For example for *campaign* the property *CustomValue* is specified to be unique key thus the wrapper will allow the following call:
```java
    Campaign campaign = 
            client
        		.createCall(Campaign.Get)
				.identifiedBy(CampaignProperty.CUSTOMVALUE, "value1")
				.execute();
```

---------------------------------

Chapter 5. Error handling
------------------------
The MailJet Wrapper type system defines two kinds of errors:

- **com.mailjet.api.client.config.MailJetClientConfigurationException**  
  This exception is thrown to signal that a client could not be build due to some configuration problem, e.g. missing a required configuration property. After successfully building a MailJet API client this error is not used by the MailJet Wrapper library. For errors related to configuration but it was not be able to be detected until the first call, the wrapper library would throw a *MailJetApiCallException* with `Error.ClientMisconfugration` as a reason.
- **com.mailjet.api.client.MailJetApiCallException**  
  This exception is thrown to signal that a call fails and provides details of the reason of the failiure. Errors could vary in their nature ranging from technical errors like communication channel breakdown to MailJet API responses signaling an error. The reason for a specific exception could be obtained with follwoing code:

```java
        try {
    		client.createCall(Campaign.Get)
    			.identifiedBy(CampaignProperty.CUSTOMVALUE, "value1")
				.execute();
		} catch (MailJetApiCallException e) {
			System.out.println(e.getError());
		}
```
The `getError()` method returns one of the values defined in following enumeration:
```java
		ContentNotModified(304, "Nothing was modified."), 
		NotFound(404, "The method your are trying to reach don't exists."),
		ServerError(500, "Status returned when an unknow error occurs."),
		MethodNotAllowed(405, "You made a POST request instead of GET, or the reverse."),
		Unauthorized(401, "You have specified an incorrect ApiKey or username/password couple."),
		BadRequest(400, "One or more arguments are missing or maybe mispelling."),
		Unknown(-1, "Unexpected error. Check the cause in the stack trace."),
		ServerUnavailable(-2, "Technical error in comunication with MailJet API."),
		ClientMisconfugration(-3, "The supplied MailJet API Client configuration is incorrect."),
		ClientMisuse(-4, "The MailJet API Client is incorrectly used."),
		ClientInternalError(-5, "The MailJet API Client detects a programming error in it's internals.");
```
Each error defines a code where positive values are reserved for errors returned by MailJet API and corresponding to the HTTP status codes and negative values representing client side errors such as twice setting a value for resource property, etc.



---------------------------------

Chapter 6. API Structure
------------------------

MailJet Wrapper API is devided in two main parts:

- package **com.mailjet.api.client** and subpackages  
  *Wrapper classes ad interfaces related to preparation of request, http communication and response parsing*
- package **com.mailjet.api.model.v3** and subpackages  
  *POJO classes mpped to resources on the MailJet API and automatically generated from MailJet API metadata*

If we take again the *newsletter* resource as example we can find three classes that are being provided to simplify MailJet API interaction using the wrapper:

- **com.mailjet.api.model.v3.newsletter.NewsLetter**
  Java bean having a field for each property of the resource. This class is used to return response data from MailJet API. 
```java
public final class Newsletter {
    private String Callback;
    private Long CampaignID;
    private Long ContactsListID;
    private Date CreatedAt;
    private Date DeliveredAt;
    private Newsletter.EditMode EditMode;
...
```
The class also has one static field for each operation allowed for the resource:
```java
    public final static MailJetApiService<MailJetApiCall.Retrieve<Newsletter>> List = ...;
    public final static MailJetApiService<MailJetApiCall.RetrieveById<Newsletter>> Get = ...;
    public final static MailJetApiService<MailJetApiCall.Update<Newsletter>> Update = ...;
    public final static MailJetApiService<MailJetApiCall.Create<Newsletter>> Create = ...;
```
- **com.mailjet.api.model.v3.newsletter.NewsLetterProperty**  
  *Java class having a static field for each property of the resource. Each field defines the property name and data type. This class is used to setup Create/Update call to MailJet API.*
```java
public final class NewsletterProperty<DataType>
    extends MailJetResourceProperty<Newsletter, DataType>{
    /** Callback URL */
    public final static NewsletterProperty<String> CALLBACK = new NewsletterProperty<String>("Callback", String.class);
    /** Reference to campaign created for this newsletter. */
    public final static NewsletterProperty<Long> CAMPAIGNID = new NewsletterProperty<Long>("CampaignID", Long.class);
    /** Reference to contacts list to which newsletter will be sent. */
    public final static NewsletterProperty<Long> CONTACTSLISTID = new NewsletterProperty<Long>("ContactsListID", Long.class);
...
```
- **com.mailjet.api.model.v3.newsletter.NewsLetterFilter**  
  *Java class having a static field for each filter of the resource. Each field defines the filter name and data type. This class is used to setup Create/Update call to MailJet API.*
```java
public final class NewsletterFilter<DataType>
    extends MailJetResourceFilter<Newsletter, DataType>{
    /** Only retrieve Newsletter resources for which Campaign ID equals the specified value. */
    public final static NewsletterFilter<Long> CAMPAIGN = new NewsletterFilter<Long>("Campaign", Long.class);
    /** Only retrieve newsletter resources for which ContactsList ID equals the specified value. */
    public final static NewsletterFilter<Long> CONTACTSLIST = new NewsletterFilter<Long>("ContactsList", Long.class);
    /** Only retrieve newsletters delivered after this value */
    public final static NewsletterFilter<Date> DELIVEREDAT = new NewsletterFilter<Date>("DeliveredAt", Date.class);
...    
```

Using these three classes manipulation and retrieval operations upon a resource become an easy task as we've shown through Chapter 4. MailJet already provided you with such set of Java classes for every resource on Public part of the MailJet API. Each tuple could be found in a dedicated sub-package of *com.mailjet.api.model.v3* and named after the resource:

- com.mailjet.api.model.v3.apikey
- com.mailjet.api.model.v3.apikeyaccess
- com.mailjet.api.model.v3.apikeytotals
- com.mailjet.api.model.v3.apitoken
- com.mailjet.api.model.v3.batchjob
- com.mailjet.api.model.v3.bouncestatistics
- com.mailjet.api.model.v3.campaign
- ... and many more


---------------------------------

Chapter 7. Dependencies
------------------------

The wrapper achieves it's main goal of simplifying MailJet API access by handling the HTTP communication and JSON serialization/deserialization. These functionalities are not imlemented by the wrapper itself but are delegated to external libraries. By default following libraries are used:

- **Google GSON 2.2.4**  
  *Java library that is used to convert Java Objects into their JSON representation  and vice versa*
- **Apache HTTP Client 4.3**  
  *Java library that implement low level HTTP communication*

However if you need to integrate the MailJet API Wrapper in a restrictive environment which already has libraries providing the same functionality or they are conflicting with the libraries used by MailJet API Wrapper, you can resolve that issue by adding your own implementation of the interfaces **com.mailjet.api.client.connect.MailJetConnectionProvider** and **com.mailjet.api.client.transform.DataTransformer** and passing them to build process of the client:

- **connectionProviderImplementation**  
  *MailJetConnectionProvider* implementation to use to communicate with MailJet API
- **dataMapperImplementation**  
  *DataTransformer* implementation to use to map JSON data to Java objects

```java
        MailJetClientConfiguration config = new MailJetClientConfiguration()
        		.setBaseURL("api_url")
				.setDefaultApiKey("your_api_key")
				.setDefaultSecretKey("your_secret_key")
    			.setConnectionProviderImplementation("com.mycompany.HttpClient3ConnectionProviderImpl")
				.setDataMapperImplementation("com.mycompany.JacksonDataTransformerImpl");
```                

As with other configuration properties these can be set through file configuration as well. 

###7.1. Advanced configuration

I order to provide maximum flexability **MailJetClientConfiguration** supports building a client using a specific instances of **MailJetConnectionProvider* and *DataTransformer** using the `buildClient(MailJetConnectionProvider, DataTransformer)`. This option is useful if you want to pre-setup the instances if your environment rquires it. For example setting the client to work behind a proxy would be done with following code snipplet:
```java
        //setup HTTP Client library for proxy
        HttpHost proxy = new HttpHost("someproxy", 8080);
    	DefaultProxyRoutePlanner routePlanner = new DefaultProxyRoutePlanner(
				proxy);
		CloseableHttpClient httpclient = HttpClients.custom()
				.setRoutePlanner(routePlanner).build();
        //obtain MailJet client
		MailJetApiClient mailJetClient = new MailJetClientConfiguration()
				.loadDefault().buildClient(
						new HttpClientConnectionProviderImpl(httpclient),
						new GsonDataTransformerImpl());
        //use MailJet client                
```
For further information on HTTP Client options please refer to it's reference guide.

---------------------------------

Chapter 8. Spring integration
-----------------------------

MailJet API wrapper could be seamlessly integrated with Spring framework(or any other IoC container). A configuration and client could be registered in any Spring application context as follows:

```xml
    <bean id="mailJetConfiguration"
    	class="com.mailjet.api.client.config.MailJetClientConfiguration">
		<property name="baseUrl" value="<MailJet API URL>" />
		<property name="defaultApiKey" value="<api key>" />
		<property name="defaultSecretKey" value="<secret key>" />
	</bean>

	<bean id="mailJetClient" factory-bean="mailJetConfiguration" factory-method="buildClient"/>
```
a later injected in any Spring managed application bean:

```java
@Component
public class MailJetService{

    @Autowired
    private MailJetApiClient mailJetClient;
...
```

---------------------------------

Chapter 9. Logging
------------------

The MailJet API Warapper doesn't provide any logging on its own but if you want to obtain details about the HTTP communication you can setup a logger for HTTP Client. Just include a `log4j-xxx.jar` in your classpath entries and add logging configuration that serve your needs in a best way. For example the following `log4j.properties` configuration:
```
log4j.rootLogger=INFO, stdout

log4j.appender.stdout=org.apache.log4j.ConsoleAppender
log4j.appender.stdout.layout=org.apache.log4j.PatternLayout
log4j.appender.stdout.layout.ConversionPattern=%5p [%c] %m%n

log4j.logger.org.apache.http=DEBUG
log4j.logger.org.apache.http.wire=ERROR
```

would produce a console log as follows 

```
DEBUG [org.apache.http.headers] http-outgoing-0 >> GET /apitest/REST/apikey/9248?style=flat&format=json HTTP/1.1
DEBUG [org.apache.http.headers] http-outgoing-0 >> Authorization: Basic ZGRiNDBlMzQ1NWYzZTM1OGU2YjU0NmExMDU0MTc3MGE6MTI2MWI0ZTNhOWZjNzk5ZTg3Y2RmNjgxYTJjMWU5M2Q=
DEBUG [org.apache.http.headers] http-outgoing-0 >> Host: betapi.mailjet.com
DEBUG [org.apache.http.headers] http-outgoing-0 >> Connection: Keep-Alive
DEBUG [org.apache.http.headers] http-outgoing-0 >> User-Agent: Apache-HttpClient/4.3 (java 1.5)
DEBUG [org.apache.http.headers] http-outgoing-0 >> Accept-Encoding: gzip,deflate
DEBUG [org.apache.http.headers] http-outgoing-0 << HTTP/1.1 200 OK
DEBUG [org.apache.http.headers] http-outgoing-0 << Date: Tue, 19 Nov 2013 06:35:10 GMT
DEBUG [org.apache.http.headers] http-outgoing-0 << Server: Apache/2.2.16 (Debian)
DEBUG [org.apache.http.headers] http-outgoing-0 << Content-Length: 346
DEBUG [org.apache.http.headers] http-outgoing-0 << Keep-Alive: timeout=15, max=99
DEBUG [org.apache.http.headers] http-outgoing-0 << Connection: Keep-Alive
DEBUG [org.apache.http.headers] http-outgoing-0 << Content-Type: application/json
```
Please refer to the *Log4j* reference to find out the full configuration options available with the library.

-------------------------------------

Enjoy!
