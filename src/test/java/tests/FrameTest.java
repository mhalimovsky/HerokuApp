package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTest{

    @Test (description = "Checking of correct iframe work")
    public void frameTest(){
        framesPage.open();
        String iframeText = framesPage.getIframeText();
        assertEquals(iframeText,"Your content goes here.","different texts");
    }
}
