package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(String text) {
        driver.findElement(inputField).sendKeys(text);
    }

    //>>> chromedriver is not working with OS-level key inputs (windows ex. Alt + 227)
//    public void enterPi() {
//        enterText(Keys.chord(Keys.ALT, Keys.NUMPAD2, Keys.NUMPAD2, Keys.NUMPAD7) + " = 3.14");
//    }

    public String getResult() {
        return driver.findElement(resultText).getText();
    }
}
