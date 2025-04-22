package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc2Page;
import org.openqa.selenium.WebDriver;

public class tc2Steps {

    WebDriver driver;
    tc2Page page;

    @Given("el usuario está en la página inicial")
    public void usuarioEnPaginaInicial() {
        page = new tc2Page(driver);
        page.navigateToHomePage();
    }

    @When("realiza la acción 2")
    public void realizaAccion2() {
        page.performAction2();
    }

    @Then("se espera el resultado esperado 2")
    public void verificarResultadoEsperado2() {
        Assert.assertTrue(page.isExpectedResult2Displayed());
    }
}