import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {

    @Test
    public void inputsTest() {

        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).click();
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        String arrowUpCount = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(arrowUpCount, "1", "invalid value");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        String arrowDownCount = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(arrowDownCount, "0", "invalid value");
    }
}
