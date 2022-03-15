import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class TyposTest extends BaseTest {

    @Test
    public void typosTest (){
        driver.get("http://the-internet.herokuapp.com/typos");
        String text1 = driver.findElement(By.tagName("p")).getText();
        assertEquals(text1,"This example demonstrates a typo being introduced. It does it randomly on each page load.");
        driver.navigate().refresh();
        String text2 = driver.findElement(By.tagName("p")).getText();
        assertEquals(text1, "Sometimes you'll see a typo, other times you won't.");
    }
}
