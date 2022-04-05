package pages;


import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FileUploaderPage extends BasePage{

    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening fileUploader")
    public void open (){
        driver.get("http://the-internet.herokuapp.com/upload");
    }

    @Step ("Upload file into a fileUploader")
    public void uploadFile (){
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/Users/Mbook/IdeaProjects/HerokuApp/src/test/resources/IMG_2826.JPEG");
        driver.findElement(By.cssSelector("input[id='file-submit']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Step ("Checking of upload status")
    public String checkUploadStatus(){
        return driver.findElement(By.id("uploaded-files")).getText();
    }
}
