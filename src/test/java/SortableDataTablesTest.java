import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SortableDataTablesTest extends BaseTest {

    @Test
    public void sortableDataTablesTest() {
        driver.get("http://the-internet.herokuapp.com/tables");
        String string1_1 = driver.findElement(By.xpath("//table//tr[1]//td[1]")).getAttribute("value");
        String string2_1 = driver.findElement(By.xpath("//table//tr[2]//td[1]")).getAttribute("value");
        assertEquals(string1_1, string2_1, "value is invalid");
        String string1_2 = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getAttribute("value");
        String string2_2 = driver.findElement(By.xpath("//table//tr[2]//td[2]")).getAttribute("value");
        assertEquals(string1_2, string2_2, "value is invalid");
        String string1_3 = driver.findElement(By.xpath("//table//tr[1]//td[3]")).getAttribute("value");
        String string2_3 = driver.findElement(By.xpath("//table//tr[2]//td[3]")).getAttribute("value");
        assertEquals(string1_3, string2_3, "value is invalid");
        String string1_4 = driver.findElement(By.xpath("//table//tr[1]//td[4]")).getAttribute("value");
        String string2_4 = driver.findElement(By.xpath("//table//tr[2]//td[4]")).getAttribute("value");
        assertEquals(string1_4, string2_4, "value is invalid");
    }
}
