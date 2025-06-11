package com.mailjet.client.transactional;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class AttachmentTest {

    @Test
    public void builder_setsAllFields_andEqualsHashCode() {
        Attachment a1 = Attachment.builder()
                .filename("file.txt")
                .contentType("text/plain")
                .base64Content("Zm9vYmFy")   // "foobar" in Base64
                .contentID("cid123")
                .build();

        // getters
        Assert.assertEquals("file.txt",      a1.getFilename());
        Assert.assertEquals("text/plain",    a1.getContentType());
        Assert.assertEquals("Zm9vYmFy",      a1.getBase64Content());
        Assert.assertEquals("cid123",        a1.getContentID());

        // equals & hashCode
        Attachment a2 = Attachment.builder()
                .filename("file.txt")
                .contentType("text/plain")
                .base64Content("Zm9vYmFy")
                .contentID("cid123")
                .build();
        Assert.assertTrue(a1.equals(a2));
        Assert.assertEquals(a1.hashCode(), a2.hashCode());
    }

    @Test
    public void fromInputStream_encodesStreamCorrectly_andSetsFields() throws IOException {
        byte[] original = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream in = new ByteArrayInputStream(original);

        String filename    = "greeting.txt";
        String mimeType    = "text/plain";
        Attachment att     = Attachment.fromInputStream(in, filename, mimeType);

        // filename & content type as passed in
        Assert.assertEquals(filename,        att.getFilename());
        Assert.assertEquals(mimeType,        att.getContentType());

        // base64 content matches original bytes
        String expectedB64 = Base64.getEncoder().encodeToString(original);
        Assert.assertEquals(expectedB64,      att.getBase64Content());

        // contentID is never set by fromInputStream
        Assert.assertNull(att.getContentID());
    }

    @Test
    public void fromFile_readsFileAndDetectsMime_andEncodes() throws IOException {
        // create a temp .txt file
        Path temp = Files.createTempFile("attach-test-", ".txt");
        Files.write(temp, "Line1\nLine2".getBytes(StandardCharsets.UTF_8));

        Attachment att = Attachment.fromFile(temp.toString());

        // filename should be the file's name only
        Assert.assertEquals(temp.getFileName().toString(), att.getFilename());

        // contentType should match Files.probeContentType
        String expectedType = Files.probeContentType(temp);
        Assert.assertEquals(expectedType,     att.getContentType());

        // content should be Base64 of file bytes
        byte[] fileBytes    = Files.readAllBytes(temp);
        String expectedB64  = Base64.getEncoder().encodeToString(fileBytes);
        Assert.assertEquals(expectedB64,      att.getBase64Content());

        // contentID is not set by fromFile
        Assert.assertNull(att.getContentID());

        // cleanup
        Files.deleteIfExists(temp);
    }

    @Test(expected = IOException.class)
    public void fromFile_throws_whenFileNotFound() throws IOException {
        // attempt to read a non-existent file
        Attachment.fromFile("/path/does/not/exist.bin");
    }
}