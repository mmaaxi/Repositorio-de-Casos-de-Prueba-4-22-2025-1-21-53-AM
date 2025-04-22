package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc1Page {

    WebDriver driver;

    @FindBy(id = "actionButton")
    private WebElement actionButton;

    @FindBy(id = "resultText")
    private WebElement resultText;

    public tc1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction1() {
        actionButton.click();
    }

    public boolean isResult1Displayed() {
        return resultText.isDisplayed();
    }
}