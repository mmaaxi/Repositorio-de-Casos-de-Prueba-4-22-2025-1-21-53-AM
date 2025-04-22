package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc12Page;

public class tc12Steps {

    WebDriver driver;
    tc12Page page;

    @Given("I am on the initial page")
    public void i_am_on_the_initial_page() {
        driver = new ChromeDriver();
        page = new tc12Page(driver);
        driver.get("http://example.com");
    }

    @When("I perform action 12")
    public void i_perform_action_12() {
        page.performAction12();
    }

    @Then("I should see the expected result 12")
    public void i_should_see_the_expected_result_12() {
        Assert.assertTrue(page.isExpectedResult12Displayed());
        driver.quit();
    }
}