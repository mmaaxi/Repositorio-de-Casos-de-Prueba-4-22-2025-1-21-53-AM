package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc9Page;
import utils.DriverFactory;

public class tc9Steps {

    private WebDriver driver = DriverFactory.getDriver();
    private tc9Page page = PageFactory.initElements(driver, tc9Page.class);

    @Given("I am on the desired page")
    public void iAmOnTheDesiredPage() {
        driver.get("URL_OF_THE_DESIRED_PAGE");
    }

    @When("I perform action 9")
    public void iPerformAction9() {
        page.performAction9();
    }

    @Then("I should see the result 9")
    public void iShouldSeeTheResult9() {
        Assert.assertTrue(page.isResult9Visible());
    }
}