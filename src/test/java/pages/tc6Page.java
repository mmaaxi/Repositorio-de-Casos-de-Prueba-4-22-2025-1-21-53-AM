package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc6Page {

    WebDriver driver;

    public tc6Page(WebDriver driver) {
        this.driver = driver;
    }

    // Navigate to Home Page
    public void navigateToHomePage() {
        driver.get("https://example.com");
    }

    // Perform action 6
    public void performAction6() {
        driver.findElement(By.id("action6Button")).click();
    }

    // Verify expected result 6
    public void verifyExpectedResult6() {
        String resultText = driver.findElement(By.id("result6")).getText();
        if (!resultText.equals("Resultado esperado 6")) {
            throw new AssertionError("Resultado no coincide: " + resultText);
        }
    }
}