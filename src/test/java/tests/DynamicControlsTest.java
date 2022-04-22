package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class DynamicControlsTest extends BaseTest {


    @Test(description = "Checking of correct checkBox")
    public void checkBoxTest() {
        dynamicControlsPage.open();
        dynamicControlsPage.checkboxClick();
        dynamicControlsPage.displayWaitForItMessage();
        assertEquals(dynamicControlsPage.getItsGoneMessage(), "It's gone!", "CheckBox is not correct");
    }

    @Test(description = "Checking of correct inputs")
    public void inputTest() {
        dynamicControlsPage.open();
        dynamicControlsPage.enableInput();
        dynamicControlsPage.sendKeys();
        dynamicControlsPage.disableInput();
        String disableMessage = dynamicControlsPage.getDisableMessage();
        assertEquals(disableMessage, "It's disabled!", "input isn't disabled");
    }
}