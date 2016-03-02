/*
 * Copyright (C) 2015 Mailjet Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mailjet.client;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Contact;
import com.mailjet.client.resource.Email;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Guillaume Badi - Mailjet
 */
public class Main {

    public static void main(String[] args) throws MailjetException {
        MailjetClient client = new MailjetClient("85480869a17b7d13ef8bd393283d40d9", "f961d94099350d269f661d92e3cc195f");

            MailjetRequest email;
            JSONArray recipients;
            MailjetResponse response;

            recipients = new JSONArray()
                    .put(new JSONObject().put(Contact.EMAIL, "gbadi@mailjet.com"));

            email = new MailjetRequest(Email.resource)
                        .property(Email.FROMNAME, "Teste")
                        .property(Email.FROMEMAIL, "gbadi@student.42.fr")
                        .property(Email.SUBJECT, "Testçndo")
                        .property(Email.HTMLPART, "<html> <body> <h1>Tesçte</h1> <p>Lorem ipsum..</p></body> </html>")
                        .property(Email.RECIPIENTS, recipients)
                        .property(Email.MJCUSTOMID, "JAVA-Email");

            response = client.post(email);
    
    }
}
