package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.AssertJUnit.assertEquals;

public class DynamicControlsPage extends BasePage {

    public final static By LOADING_MESSAGE = By.id("loading");
    public final static By CHECKBOX = By.id("checkbox");
    public final static By REMOVE_BUTTON = By.xpath("//*[@id='checkbox-example']/button");
    public final static By ITS_GONE_MESSAGE = By.id("message");
    public final static By ENABLE_BUTTON = By.xpath("//*[@id='input-example']/button");
    public final static By ENABLE_MESSAGE = By.id("message");
    public final static By INPUT_ICON = By.xpath("//*[@id='input-example']/input");
    public final static By DISABLE_MESSAGE = By.xpath("//*[@id='message']");
    public final static By DISABLE_BUTTON = By.xpath("//*[@id='input-example']/button");

    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening dynamic controls page ")
    public void open() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
    }

    @Step("Click on checkbox ")
    public void checkboxClick() {
        driver.findElement(CHECKBOX).click();
        driver.findElement(REMOVE_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOADING_MESSAGE));

    }

    @Step("Getting 'WaitForIt' message ")
    public void displayWaitForItMessage() {
        driver.findElement(LOADING_MESSAGE).isDisplayed();

    }

    @Step("Getting 'It's Gone!' message ")
    public String getItsGoneMessage() {
        String message = driver.findElement(ITS_GONE_MESSAGE).getText();
        assertEquals(message, "It's gone!");
        return message;

    }

    @Step("Enable input")
    public void enableInput() {
        driver.findElement(ENABLE_BUTTON).click();
        driver.findElement(ENABLE_MESSAGE).isDisplayed();
    }

    @Step("Send Keys into an input")
    public void sendKeys() {
        driver.findElement(INPUT_ICON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ENABLE_MESSAGE));
        driver.findElement(INPUT_ICON).sendKeys("12345");

    }

    @Step("Disable input")
    public void disableInput() {
        driver.findElement(DISABLE_BUTTON).click();
    }

    @Step("Getting disable message")
    public String getDisableMessage() {
        return driver.findElement(DISABLE_MESSAGE).getText();
    }

}
