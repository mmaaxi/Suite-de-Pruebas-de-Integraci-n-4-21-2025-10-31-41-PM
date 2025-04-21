package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {
    tc_004Page jiraPage = new tc_004Page();

    @Given("Estoy en la configuración de integración")
    public void estoyEnConfiguracionDeIntegracion() {
        jiraPage.navigateToIntegrationSettings();
    }

    @When("Integro Jira con la solución")
    public void integroJiraConLaSolucion() {
        jiraPage.integrateJira();
    }

    @Then("La integración con Jira es exitosa")
    public void laIntegracionConJiraEsExitosa() {
        Assert.assertTrue(jiraPage.isIntegrationSuccessful());
    }
}