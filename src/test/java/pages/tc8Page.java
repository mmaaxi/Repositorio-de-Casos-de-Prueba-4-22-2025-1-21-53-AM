import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc8Page {
    private WebDriver driver;

    @FindBy(id = "action8ElementId")
    private WebElement action8Element;

    @FindBy(id = "expectedResult8ElementId")
    private WebElement expectedResult8Element;

    public tc8Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction8() {
        action8Element.click();
        // Additional actions if needed
    }

    public boolean isExpectedResult8Displayed() {
        return expectedResult8Element.isDisplayed();
    }
}