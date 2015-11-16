package com.mailjet.client;

import com.mailjet.client.easy.MJEasyClient;
import com.mailjet.client.errors.MailjetException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

            System.out.println("Response: " + response);
        }

        // This what we get:
        // Response: {"Status":200,"Sent":[{"Email":"gbadi@mailjet.com","MessageID":16888522541389720}]}
        // Response: {"Status":200,"Sent":[{"Email":"abreton@mailjet.com","MessageID":18014415886981635}]}
        // Response: {"Status":200,"Sent":[{"Email":"florent@mailjet.com","MessageID":18014415886982635}]}
    }
}
