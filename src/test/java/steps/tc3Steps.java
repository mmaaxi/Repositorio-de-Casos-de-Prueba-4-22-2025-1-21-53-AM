package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc3Page;

public class tc3Steps {

    WebDriver driver;
    tc3Page page;

    @Given("the user is on the relevant page")
    public void the_user_is_on_the_relevant_page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://example.com");
        page = new tc3Page(driver);
    }

    @When("the user performs action 3")
    public void the_user_performs_action_3() {
        page.performAction3();
    }

    @Then("the result should be the expected result 3")
    public void the_result_should_be_the_expected_result_3() {
        String actualResult = page.getResult3();
        String expectedResult = "Resultado esperado 3";
        Assert.assertEquals(expectedResult, actualResult);
        driver.quit();
    }
}