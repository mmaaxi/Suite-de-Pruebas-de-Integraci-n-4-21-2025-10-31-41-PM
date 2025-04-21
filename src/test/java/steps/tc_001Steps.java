package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_001Page;

public class tc_001Steps {
    tc_001Page estrategiaPage = new tc_001Page();

    @Given("el usuario está en la página de análisis de estrategia")
    public void elUsuarioEstaEnLaPaginaDeAnalisisDeEstrategia() {
        estrategiaPage.navegarAPaginaDeAnalisis();
    }

    @When("ejecuta el análisis de estrategia")
    public void ejecutaElAnalisisDeEstrategia() {
        estrategiaPage.ejecutarAnalisisDeEstrategia();
    }

    @Then("la estrategia se valida correctamente")
    public void laEstrategiaSeValidaCorrectamente() {
        Assert.assertTrue(estrategiaPage.esEstrategiaValida());
    }
}