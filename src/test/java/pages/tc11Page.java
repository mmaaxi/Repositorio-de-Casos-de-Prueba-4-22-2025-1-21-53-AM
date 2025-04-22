package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc11Page {
    WebDriver driver;

    public tc11Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "action11Button")
    WebElement action11Button;

    @FindBy(id = "result11")
    WebElement result11;

    public void performAction11() {
        action11Button.click();
    }

    public boolean isResult11Displayed() {
        return result11.isDisplayed();
    }
}