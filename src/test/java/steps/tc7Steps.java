package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.TC7Page;
import static org.junit.Assert.*;

public class TC7Steps {
    private WebDriver driver;
    private TC7Page tc7Page;

    public TC7Steps() {
        this.driver = Hooks.driver;
        tc7Page = PageFactory.initElements(driver, TC7Page.class);
    }

    @Given("I am on the Test Case 7 Page")
    public void i_am_on_the_test_case_7_page() {
        driver.get("http://example.com/testcase7");
    }

    @When("I perform action 7")
    public void i_perform_action_7() {
        tc7Page.performAction7();
    }

    @Then("I should see the expected result 7")
    public void i_should_see_the_expected_result_7() {
        assertTrue(tc7Page.isResult7Displayed());
    }
}