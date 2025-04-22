package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc9Page {

    private WebDriver driver;

    public tc9Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "actionButton9")
    private WebElement actionButton9;

    @FindBy(id = "result9")
    private WebElement result9;

    public void performAction9() {
        actionButton9.click();
    }

    public boolean isResult9Visible() {
        return result9.isDisplayed();
    }
}