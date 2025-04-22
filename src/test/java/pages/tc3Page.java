package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc3Page {

    WebDriver driver;
    
    By action3Button = By.id("action3");
    By result3Text = By.id("result3");

    public tc3Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction3() {
        driver.findElement(action3Button).click();
    }

    public String getResult3() {
        return driver.findElement(result3Text).getText();
    }
}