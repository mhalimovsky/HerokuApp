package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends BasePage {

    public static final By IFRAME_TEXT = By.tagName("p");

    public FramesPage(WebDriver driver) {
        super(driver);
    }
    @Step("Opening iframe")
    public void open(){
    driver.get("http://the-internet.herokuapp.com/iframe");
    }

    @Step ("Getting iframe text")
    public String getIframeText(){
        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr"))); //переход в Iframe
        String iframeText = driver.findElement(IFRAME_TEXT).getText(); //поиск элемента внутри Iframe
        driver.switchTo().defaultContent(); //выход из Iframe
        return iframeText;
    }
}
