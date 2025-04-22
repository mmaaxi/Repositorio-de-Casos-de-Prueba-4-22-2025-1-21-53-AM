package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc11Page;

public class tc11Steps {
    WebDriver driver;
    tc11Page tc11Page;

    public tc11Steps() {
        this.driver = Hooks.driver;
        tc11Page = PageFactory.initElements(driver, tc11Page.class);
    }

    @Given("^I am on the initial page$")
    public void iAmOnTheInitialPage() {
        driver.get("http://example.com");
    }

    @When("^I perform action 11$")
    public void iPerformAction11() {
        tc11Page.performAction11();
    }

    @Then("^I should see result 11$")
    public void iShouldSeeResult11() {
        Assert.assertTrue("Result 11 is not displayed", tc11Page.isResult11Displayed());
    }
}