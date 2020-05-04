package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By box = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClickContextBox() {
        Actions action = new Actions(driver);
        WebElement rightClickElement = driver.findElement(box);
        action.contextClick(rightClickElement).perform();
    }

    public void acceptPopUp(){
        driver.switchTo().alert().accept();
    }

    public String getPopUpText(){
        return driver.switchTo().alert().getText();
    }
}
