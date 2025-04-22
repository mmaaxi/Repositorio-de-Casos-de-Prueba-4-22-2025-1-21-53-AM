import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc5Page;

public class tc5Steps {
    WebDriver driver;
    tc5Page page;

    @Given("I am on the Main Page")
    public void i_am_on_the_main_page() {
        // Initialize the page
        page = PageFactory.initElements(driver, tc5Page.class);
        // Navigate to the main page if necessary
        driver.get("http://example.com");
    }

    @When("I perform action 5")
    public void i_perform_action_5() {
        // Perform the corresponding action on the page
        page.performAction5();
    }

    @Then("I should see the expected result 5")
    public void i_should_see_the_expected_result_5() {
        // Verify the expected result
        page.verifyResult5();
    }
}