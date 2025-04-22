import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc8Page;

public class tc8Steps {
    private WebDriver driver;
    private tc8Page page;

    public tc8Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc8Page.class);
    }

    @Given("I am on the relevant page")
    public void i_am_on_the_relevant_page() {
        // Navigate to the relevant page
        driver.get("URL_of_the_relevant_page");
    }

    @When("I perform action 8")
    public void i_perform_action_8() {
        page.performAction8();
    }

    @Then("I should see the expected result 8")
    public void i_should_see_the_expected_result_8() {
        Assert.assertTrue(page.isExpectedResult8Displayed());
    }
}