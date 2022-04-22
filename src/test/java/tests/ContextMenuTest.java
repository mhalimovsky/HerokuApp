package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {

    @Test(description = "Selecting context menu")
    public void contextMenuTest() {
        contextMenu.open();
        contextMenu.click();
        String alertText = contextMenu.getAlertText();
        assertEquals(alertText, "You selected a context menu", "Context menu is not selected");
    }
}
