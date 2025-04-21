package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_002Page;
import static org.junit.Assert.assertTrue;

public class tc_002Steps {
    tc_002Page matrizPage = new tc_002Page();

    @Given("que el usuario está en la página de creación de matriz")
    public void que_el_usuario_esta_en_la_pagina_de_creacion_de_matriz() {
        matrizPage.navigateToMatrizCreationPage();
    }

    @When("el usuario genera la matriz de requerimientos")
    public void el_usuario_genera_la_matriz_de_requerimientos() {
        matrizPage.generateRequirementMatrix();
    }

    @Then("la matriz se genera de acuerdo a los requerimientos")
    public void la_matriz_se_genera_de_acuerdo_a_los_requerimientos() {
        assertTrue(matrizPage.isMatrixGeneratedCorrectly());
    }
}