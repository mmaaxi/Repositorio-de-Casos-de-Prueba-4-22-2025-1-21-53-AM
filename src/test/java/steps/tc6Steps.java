package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.tc6Page;

public class tc6Steps {

    WebDriver driver;
    tc6Page page;

    @Given("estoy en la página principal")
    public void estoy_en_la_pagina_principal() {
        page = new tc6Page(driver);
        page.navigateToHomePage();
    }

    @When("realizo acción 6")
    public void realizo_accion_6() {
        page.performAction6();
    }

    @Then("debería ver el resultado esperado 6")
    public void deberia_ver_el_resultado_esperado_6() {
        page.verifyExpectedResult6();
    }
}