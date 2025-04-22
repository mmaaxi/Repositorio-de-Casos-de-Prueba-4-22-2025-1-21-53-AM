package steps;

import pages.tc10Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc10Steps {

    tc10Page page = new tc10Page();

    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page() {
        page.navigateToMainPage();
    }

    @When("the user performs action 10")
    public void the_user_performs_action_10() {
        page.performAction10();
    }

    @Then("the expected result should be {string}")
    public void the_expected_result_should_be(String expectedResult) {
        page.verifyExpectedResult(expectedResult);
    }
}