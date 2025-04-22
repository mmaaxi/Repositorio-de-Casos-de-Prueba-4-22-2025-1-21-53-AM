package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class tc2Page {
    WebDriver driver;

    By action2Button = By.id("action2Button");
    By result2Element = By.id("result2Element");

    public tc2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHomePage() {
        driver.get("http://example.com");
    }

    public void performAction2() {
        WebElement button = driver.findElement(action2Button);
        button.click();
    }

    public boolean isExpectedResult2Displayed() {
        WebElement result = driver.findElement(result2Element);
        return result.isDisplayed();
    }
}