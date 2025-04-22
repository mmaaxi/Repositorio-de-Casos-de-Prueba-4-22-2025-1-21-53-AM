package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC7Page {
    private WebDriver driver;
    
    @FindBy(id = "action7")
    private WebElement action7Button;
    
    @FindBy(id = "result7")
    private WebElement result7;

    public TC7Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction7() {
        action7Button.click();
    }

    public boolean isResult7Displayed() {
        return result7.isDisplayed();
    }
}