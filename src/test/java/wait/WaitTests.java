package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden() {
        var ex1Page = homePage.clickDynamicLoading().clickPageExample1();
        ex1Page.clickStart();
        assertEquals(ex1Page.getLoadedText(), "Hello World!", "Loaded text incorrect.");
    }

    @Test
    public void testWaitUntilVisible() {
        var ex2Page = homePage.clickDynamicLoading().clickPageExample2();
        ex2Page.clickStart();
        assertEquals(ex2Page.getLoadedText(), "Hello World!", "Loaded text incorrect.");
    }
}
