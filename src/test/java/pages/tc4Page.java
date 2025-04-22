package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc4Page {

    WebDriver driver;
    WebDriverWait wait;

    public tc4Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void navigateToHomePage() {
        driver.get("http://url-de-la-pagina-inicial.com");
    }

    public void performAction4() {
        WebElement actionButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accion4Button")));
        actionButton.click();
    }

    public boolean isExpectedResult4Visible() {
        WebElement resultElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultadoEsperado4")));
        return resultElement.isDisplayed();
    }
}