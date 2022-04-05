package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FileUploaderTest extends BaseTest{

    @Test (description = "Checking of successful uploading")
    public void fileUploaderTest(){
        fileUploaderPage.open();
        fileUploaderPage.uploadFile();
        String statusOfUpload = fileUploaderPage.checkUploadStatus();
        assertEquals(statusOfUpload,"IMG_2826.JPEG", "File is'nt uploaded");
    }
}
