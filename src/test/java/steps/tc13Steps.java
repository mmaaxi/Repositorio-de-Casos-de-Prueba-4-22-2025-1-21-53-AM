package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc13Page;

public class tc13Steps {

    WebDriver driver;
    tc13Page page;

    public tc13Steps() {
        this.driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc13Page.class);
    }

    @When("^I perform action 13$")
    public void iPerformAction13() {
        page.performAction13();
    }

    @Then("^I expect resultado esperado 13$")
    public void iExpectResultadoEsperado13() {
        page.verifyResultadoEsperado13();
    }
}