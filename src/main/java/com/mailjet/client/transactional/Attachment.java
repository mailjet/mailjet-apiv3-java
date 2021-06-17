package com.mailjet.client.transactional;

import lombok.Builder;
import lombok.Data;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

@Data
@Builder
public class Attachment {
    /**
     * The full name of the file (including the file extension).
     */
    private String filename;

    /**
     * Defines the type of content being sent out using a MIME type.
     * See the official MIME type list for additional information. https://www.iana.org/assignments/media-types/media-types.xhtml
     */
    private String contentType;

    /**
     * Base64 encoded content of the attached file
     */
    private String base64Content;

    /**
     *  Name of the cid to be inserted in the HTML content of the message.
     *  The value must be unique across all inline attachments in the message.
     *  The value valid ONLY for InlinedAttachment
     */
    private String contentID;

    /**
     * Creates an attachment from the file
     * @param pathToFile full path to the file
     * @return constructed Attachment object
     * @throws IOException if something wrong with reading file under the given path
     */
    public static Attachment fromFile(String pathToFile) throws IOException {
        File file = new File(pathToFile);
        Path path = file.toPath();

        String mimeType = Files.probeContentType(path);
        byte[] fileContent = Files.readAllBytes(path);
        String base64Content = Base64.getEncoder().encodeToString(fileContent);

        return new AttachmentBuilder()
                .base64Content(base64Content)
                .contentType(mimeType)
                .filename(path.getFileName().toString())
                .build();
    }

    /**
     * Creates an attachment from the input stream
     * @param inputStream input stream that will be read as byte array
     * @param attachmentFileName the name that will be given to the attachment in the email
     * @param contentType mime type of the attachment https://www.iana.org/assignments/media-types/media-types.xhtml
     * @return constructed Attachment object
     * @throws IOException if something wrong with reading from input stream
     */
    public static Attachment fromInputStream(InputStream inputStream, String attachmentFileName, String contentType) throws IOException {

        // replace this with .readAllBytes when migrating to Java 9
        final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[4000];

        while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }

        final String base64Content = Base64.getEncoder().encodeToString(buffer.toByteArray());

        return new AttachmentBuilder()
                .base64Content(base64Content)
                .contentType(contentType)
                .filename(attachmentFileName)
                .build();
    }
}
