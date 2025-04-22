import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc5Page {
    WebDriver driver;

    // Locate web elements
    @FindBy(id = "action5Button")
    private WebElement action5Button;
    
    @FindBy(id = "result5Text")
    private WebElement result5Text;

    public tc5Page(WebDriver driver) {
        this.driver = driver;
    }

    // Method to perform action 5
    public void performAction5() {
        action5Button.click();
    }

    // Method to verify the expected result 5
    public void verifyResult5() {
        // Implementation for verifying the result
        String expectedText = "Expected Result 5";
        String actualText = result5Text.getText();
        assert actualText.equals(expectedText) : "Expected " + expectedText + ", but found " + actualText;
    }
}