package steps;

import pages.tc4Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class tc4Steps {

    tc4Page page = new tc4Page();

    @Given("que el usuario está en la página inicial")
    public void que_el_usuario_esta_en_la_pagina_inicial() {
        page.navigateToHomePage();
    }

    @When("el usuario realiza acción 4")
    public void el_usuario_realiza_accion_4() {
        page.performAction4();
    }

    @Then("el resultado esperado 4 debería ser visible")
    public void el_resultado_esperado_4_deberia_ser_visible() {
        Assert.assertTrue(page.isExpectedResult4Visible());
    }
}