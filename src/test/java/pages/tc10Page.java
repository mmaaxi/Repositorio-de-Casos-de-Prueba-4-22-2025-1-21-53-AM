package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc10Page {

    WebDriver driver;
    
    // Constructor
    public tc10Page(WebDriver driver) {
        this.driver = driver;
    }
    
    // Method to navigate to the main page
    public void navigateToMainPage(){
        driver.get("http://example.com");
    }

    // Method to perform action 10
    public void performAction10() {
        WebElement actionElement = driver.findElement(By.id("action10"));
        actionElement.click();
    }
    
    // Method to verify expected result
    public void verifyExpectedResult(String expectedResult) {
        WebElement resultElement = driver.findElement(By.id("result10"));
        assert(resultElement.getText().equals(expectedResult));
    }
}