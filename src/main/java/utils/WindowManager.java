package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {

    private WebDriver driver;
    public WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack() {
        navigate.back();
    }

    public void goForward() {
        navigate.forward();
    }

    public void refreshPage() {
        navigate.refresh();
    }

    public void goToPage(String url) {
        navigate.to(url);
    }

    public void switchToTab(String tabTitle) {
        var windows = driver.getWindowHandles(); //get all unique window handles, returns Set<String>
//        System.out.println("Number of tabs: " + windows.size());
//        System.out.println("Window handles:");
//        windows.forEach(System.out::println); //print all the window handles

        for(String window : windows) {
//            System.out.println("Switching to window: " + window);
            driver.switchTo().window(window); //window() works for windows or tabs

//            System.out.println("Current window title: " + driver.getTitle());

            if(tabTitle.equals(driver.getTitle())) {
                break;
            }
        }

    }

    public void switchToNewTab() {
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }
}
