package com.mailjet.client;

import com.mailjet.client.errors.MailjetClientRequestException;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Message;
import org.junit.Assert;
import org.junit.Test;

public class MessageEndpointFilteringIT {

    @Test
    public void getMessagesWithFiltering_WrongFilter_Returns500() throws MailjetException {
        // arrange
        MailjetClient mailjetClient = TestHelper.getClient();

        MailjetRequest mailjetRequest = new MailjetRequest(Message.resource)
                .filter("Sort", "id+DESC");

        // act
        MailjetClientRequestException exception = Assert.assertThrows(MailjetClientRequestException.class, () -> {
            MailjetResponse mailjetResponse = mailjetClient.get(mailjetRequest);
        });

        // assert
        Assert.assertEquals(400, exception.getStatusCode());
        Assert.assertTrue(exception.getMessage()
                .contains("Unexpected error during GET: Invalid sort specification: Cannot sort on field id+desc"));
    }

    @Test
    public void getMessagesWithFiltering_ReturnsCorrectData() throws MailjetException {
        // arrange
        MailjetClient mailjetClient = TestHelper.getClient();

        MailjetRequest mailjetRequestDesc = new MailjetRequest(Message.resource)
                .filter("Sort", "id DESC");

        MailjetRequest mailjetRequestAsc = new MailjetRequest(Message.resource)
                .filter("Sort", "id ASC");

        // act
        MailjetResponse responseWithDescSorting = mailjetClient.get(mailjetRequestDesc);
        MailjetResponse responseWithAscSorting = mailjetClient.get(mailjetRequestAsc);

        // assert
        Assert.assertEquals(200, responseWithDescSorting.getStatus());
        Assert.assertEquals(200, responseWithAscSorting.getStatus());

        Assert.assertEquals(10, responseWithAscSorting.getTotal());

        long firstIdAsc = responseWithAscSorting.getData().getJSONObject(0).getLong("ID");
        long firstIdDesc = responseWithDescSorting.getData().getJSONObject(0).getLong("ID");
        Assert.assertTrue(firstIdAsc < firstIdDesc);
    }
}
