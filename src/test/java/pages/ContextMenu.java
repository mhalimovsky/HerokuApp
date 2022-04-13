package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class ContextMenu extends BasePage {

    public static final By CONTEXT_MENU_CLICK = By.id("hot-spot");

    public ContextMenu(WebDriver driver) {
        super(driver);
    }

    @Step("Opening context menu page")
    public void open() {
        driver.get("http://the-internet.herokuapp.com/context_menu");
    }

    @Step("Click on context menu")
    public void click() {
        Actions actions = new Actions(driver);
        actions.
                moveToElement(driver.findElement(CONTEXT_MENU_CLICK)).
                contextClick().
                perform();
    }

    @Step("Getting alert from context menu page")
    public String getAlertText() {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        return alertText;
    }
}
