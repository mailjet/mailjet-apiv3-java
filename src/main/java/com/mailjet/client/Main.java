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
import org.json.JSONObject;

/**
 *
 * @author Guillaume Badi - Mailjet
 */
public class Main {

    public static void main(String[] args) throws MailjetException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        
        client = new MailjetClient("85480869a17b7d13ef8bd393283d40d9", "7ebd58e70a16291548a02d6fcfe9b4a1");
//        client.setDebug(MailjetClient.NOCALL_DEBUG);
        
        request = new MailjetRequest(Email.resource)
                        .property(Email.FROMNAME, "Guillaume Badi")
                        .property(Email.FROMEMAIL, "gbadi@student.42.fr")
                        .property(Email.SUBJECT, "Hello JAVA")
                        .property(Email.TEXTPART, "Hello Text!")
                        .property(Email.VARS, new JSONObject()
                            .put("Day", "monday"))
                        .append(Email.RECIPIENTS, new JSONObject()
                            .put(Contact.EMAIL, "gbadi@mailjet.com"))
                        .append(Email.ATTACHMENTS, new JSONObject()
                            .put("Filename", "test.txt")
                            .put("content-type", "text/plain")
                            .put("content", "VGhpcyBpcyB5b3VyIGF0dGFjaGVkIGZpbGUhISEK"));
        
        response = client.post(request);
        
        System.out.println(response);
    }
}
