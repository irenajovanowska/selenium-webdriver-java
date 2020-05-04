package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private String linkXPath_format = ".//a[contains(text(), '%s')]";
    private By example1Link = By.xpath(String.format(linkXPath_format, "Example 1"));
    private By example2Link = By.xpath(String.format(linkXPath_format, "Example 2"));

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicallyLoadedPageEx1 clickPageExample1() {
        driver.findElement(example1Link).click();
        return new DynamicallyLoadedPageEx1(driver);
    }

    public DynamicallyLoadedPageEx2 clickPageExample2() {
        driver.findElement(example2Link).click();
        return new DynamicallyLoadedPageEx2(driver);
    }

    public DynamicallyLoadedPageEx2 openEx2InNewTab() {
        driver.findElement(example2Link).sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));
        return new DynamicallyLoadedPageEx2(driver);
    }

}