package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc12Page {

    private WebDriver driver;
    private By action12Button = By.id("action12Button");
    private By expectedResult12 = By.id("expectedResult12");

    public tc12Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction12() {
        driver.findElement(action12Button).click();
    }

    public boolean isExpectedResult12Displayed() {
        return driver.findElement(expectedResult12).isDisplayed();
    }
}