package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc14Page {
    
    private WebDriver driver;
    private WebDriverWait wait;

    private By action14Button = By.id("action14Button");
    private By result14 = By.id("result14");

    public tc14Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToInitialPage() {
        driver.get("http://example.com/initialPage");
    }

    public void performAction14() {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(action14Button));
        button.click();
    }

    public boolean isResult14Displayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(result14)).isDisplayed();
    }
}