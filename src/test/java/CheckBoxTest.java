import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBoxTest(){
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.findElement(By.cssSelector("[type=checkbox]")).click();
        boolean isSelected = driver.findElement(By.cssSelector("[type=checkbox]")).isSelected();
        assertTrue(isSelected);
        driver.findElement(By.cssSelector("[type=checkbox]")).click();
        isSelected = driver.findElement(By.cssSelector("[type=checkbox]")).isSelected();
        assertFalse(isSelected);
    }

}
