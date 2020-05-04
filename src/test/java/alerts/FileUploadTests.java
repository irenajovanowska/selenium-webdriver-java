package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        var fileUploadPage = homePage.clickFileUpload();
        String filePath = "C:\\Users\\Remote\\Desktop\\root\\courses\\selenium_webdriver_java\\webdriver_java\\resources\\chromedriver.exe";
        fileUploadPage.uploadFile(filePath);
        fileUploadPage.clickUploadButton();
        assertEquals(fileUploadPage.getUploadedFiles(), "chromedriver.exe", "Uploaded file incorrect.");
    }
}
