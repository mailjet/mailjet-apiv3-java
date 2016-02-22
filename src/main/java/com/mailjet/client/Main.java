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
import com.mailjet.client.resource.Email;
import org.json.JSONArray;
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
        client = new MailjetClient("_", "_");
        request = new MailjetRequest(Email.resource)
                          .property(Email.FROMEMAIL, "pilot@mailjet.com")
                          .property(Email.FROMNAME, "Mailjet Pilot")
                          .property(Email.SUBJECT, "Your email flight plan2!")
                          .property(Email.TEXTPART, "Dear passenger, welcome to Mailjet! May the delivery force be with you!")
                          .property(Email.HTMLPART, "<h3>Dear passenger, welcome to <img src=\"cid:logo.gif\">Mailjet!</h3><br />May the delivery force be with you!")
                          .property(Email.RECIPIENTS, new JSONArray()
                  .put(new JSONObject()
                      .put("Email", "passenger@mailjet.com")))
                          .property(Email.INLINEATTACHMENTS, new JSONArray()
                  .put(new JSONObject()
                      .put("Content-type", "image/gif")
                      .put("Filename", "logo.gif")
                      .put("content", "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")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
