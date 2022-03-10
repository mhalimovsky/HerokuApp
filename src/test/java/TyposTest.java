import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest {

    @Test
    public void typosTest (){
        driver.get("http://the-internet.herokuapp.com/typos");
        String text1 = driver.findElement(By.tagName("p")).getText();
        driver.navigate().refresh();
        String text2 = driver.findElement(By.tagName("p")).getText();
        assertEquals(text1,text2);

    }
}
