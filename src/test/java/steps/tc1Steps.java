package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc1Page;

public class tc1Steps {

    WebDriver driver;
    tc1Page page;

    public tc1Steps() {
        this.driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc1Page.class);
    }

    @When("I perform action 1")
    public void performAction1() {
        page.performAction1();
    }

    @Then("I should see result 1")
    public void verifyResult1() {
        Assert.assertTrue(page.isResult1Displayed());
    }
}