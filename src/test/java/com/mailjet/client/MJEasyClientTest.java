package com.mailjet.client;

import com.mailjet.client.easy.MJEasyClient;
import com.mailjet.client.errors.MailjetException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;

public class MJEasyClientTest {

    class Person {
        final String email, name;

        Person(String email, String name) {
            this.email = email;
            this.name = name;
        }
    }

    @Test
    public void testEmailSend() throws MailjetException {

        List<Person> recipients = new ArrayList<Person>() {
            {
                add(new Person("gbadi@mailjet.com", "Guillaume"));
                add(new Person("abreton@mailjet.com", "Arnaud"));
                add(new Person("florent@mailjet.com", "Florent"));
            }
        };

        // We create a client
        MJEasyClient client = new MJEasyClient();
        client.setDebug(MJEasyClient.NOCALL_DEBUG);


        for (Person r : recipients) {
            // Create an email
            MailjetResponse response = client.email()
                    .from("florent@mailjet.com")
                    .to(r.email)
                    .subject("Simple proposal")
                    .text("Hi " + r.name + ",\n" +
                            "the idea is just for few very common operations to provide a higher level wrapper.\n" +
                            "\n-- \nFlorent")


                    .send(); // And send it

            System.out.println(response);
            Assert.assertTrue(true);
        }

        // This what we get:
        // Response: {"Status":200,"Sent":[{"Email":"gbadi@mailjet.com","MessageID":16888522541389720}]}
        // Response: {"Status":200,"Sent":[{"Email":"abreton@mailjet.com","MessageID":18014415886981635}]}
        // Response: {"Status":200,"Sent":[{"Email":"florent@mailjet.com","MessageID":18014415886982635}]}
    }
    
    @Test
    public void testSmsSend() throws MailjetException {

        // We create a client
        MJEasyClient client = new MJEasyClient("");
        client.setDebug(MJEasyClient.NOCALL_DEBUG);

        client.sms()
                .from("MJPilot")
                .to("+33000000")
                .text("Demo")
                .send(); // And send it
    }
}
