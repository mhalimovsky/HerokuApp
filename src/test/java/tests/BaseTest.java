package tests;

import org.testng.annotations.Listeners;
import pages.ContextMenu;
import pages.DynamicControlsPage;
import pages.FileUploaderPage;
import pages.FramesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class BaseTest {

    WebDriver driver;
    ContextMenu contextMenu;
    DynamicControlsPage dynamicControlsPage;
    FramesPage framesPage;
    FileUploaderPage fileUploaderPage;

    @BeforeMethod (description = "Opening Browser")
    public void setup (ITestContext testContext) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        testContext.setAttribute("driver", driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        contextMenu = new ContextMenu(driver);
        dynamicControlsPage = new DynamicControlsPage(driver);
        framesPage = new FramesPage(driver);
        fileUploaderPage = new FileUploaderPage(driver);

    }

    @AfterMethod(alwaysRun = true, description = "Closing Browser")
    public void close() {
        driver.quit();
    }
}

