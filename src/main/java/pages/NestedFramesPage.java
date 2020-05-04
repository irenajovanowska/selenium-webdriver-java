package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private String topFrame = "frame-top";
    private String bottomFrame = "frame-bottom";
    private String topLeftFrame = "frame-left";
    private By body = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLeftFrameText() {
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(topLeftFrame);
        String frameText = driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return frameText;
    }

    public String getBottomFrameText() {
        driver.switchTo().frame(bottomFrame);
        String frameText = driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        return frameText;
    }
}
