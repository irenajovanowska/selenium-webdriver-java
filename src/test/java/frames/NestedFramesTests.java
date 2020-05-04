package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NestedFramesTests extends BaseTests {

    @Test
    public void testFrameText() {
        var nestedFramesPage = homePage.clickFrames().clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Top left frame name incorrect.");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Bottom frame name incorrect.");
    }
}
