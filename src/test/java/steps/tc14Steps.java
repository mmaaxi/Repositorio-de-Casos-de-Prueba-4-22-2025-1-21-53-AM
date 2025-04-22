package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc14Page;

public class tc14Steps {

    tc14Page page = new tc14Page();

    @Given("the user is on the initial page")
    public void the_user_is_on_the_initial_page() {
        page.navigateToInitialPage();
    }
    
    @When("the user performs action 14")
    public void the_user_performs_action_14() {
        page.performAction14();
    }
    
    @Then("the user should see result 14 as expected")
    public void the_user_should_see_result_14_as_expected() {
        Assert.assertTrue(page.isResult14Displayed());
    }
}