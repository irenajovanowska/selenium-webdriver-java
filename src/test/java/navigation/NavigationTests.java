package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator() {
        homePage.clickDynamicLoading().clickPageExample1();
        getWindowsManager().goBack();
        getWindowsManager().refreshPage();
        getWindowsManager().goForward();
        getWindowsManager().goToPage("https://google.com");
    }

    @Test
    public void testSwitchTab() {
        homePage.clickMultipleWindows().clickHere();
        getWindowsManager().switchToTab("New Window");
    }

    @Test
    public void testNewOpenTab() {
        var ex2Page = homePage.clickDynamicLoading().openEx2InNewTab();
        getWindowsManager().switchToNewTab();
        assertTrue(ex2Page.isStartButtonDisplayed(), "Start button is not displayed.");
    }
}
