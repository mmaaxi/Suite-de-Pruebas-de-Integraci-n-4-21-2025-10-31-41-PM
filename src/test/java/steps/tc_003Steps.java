package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import pages.Tc_003Page;

public class Tc_003Steps {

    WebDriver driver = new ChromeDriver();
    Tc_003Page repoPage = new Tc_003Page(driver);

    @Given("el usuario está autenticado en GitHub")
    public void el_usuario_está_autenticado_en_GitHub() {
        repoPage.authenticateUser("your_username", "your_password");
    }

    @When("el usuario crea un nuevo repositorio con nombre {string}")
    public void el_usuario_crea_un_nuevo_repositorio_con_nombre(String repoName) {
        repoPage.createNewRepository(repoName);
    }

    @Then("el nuevo repositorio {string} se crea exitosamente")
    public void el_nuevo_repositorio_se_crea_exitosamente(String repoName) {
        boolean isRepoCreated = repoPage.isRepositoryCreated(repoName);
        Assert.assertTrue("El repositorio no se creó exitosamente", isRepoCreated);
        driver.quit();
    }
}