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
import com.mailjet.client.resource.Sender;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Guillaume Badi - Mailjet
 */
public class Main {

    public static void main(String[] args) throws MailjetException {
        MailjetClient client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"));
//        client.setDebug(MailjetClient.VERBOSE_DEBUG);
        
        MailjetRequest sender = new MailjetRequest(Sender.resource)
                        .filter(Sender.EMAIL, "gbadi@student.42.fr");
        
        MailjetResponse senders = client.get(sender);
        
        JSONObject firstSender = senders.getData().getJSONObject(0);
        
        MailjetRequest update = new MailjetRequest(Sender.resource, firstSender.getLong("ID"))
                    .setBody(firstSender.put(Sender.NAME, "GuillaumeBadi"));

        System.out.println(client.put(update));
    }
}
