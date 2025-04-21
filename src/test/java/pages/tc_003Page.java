package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tc_003Page {

    WebDriver driver;
    By newRepoButton = By.xpath("//a[@href='/new']");
    By repositoryNameField = By.id("repository_name");
    By createRepositoryButton = By.xpath("//button[@type='submit']");
    By userMenu = By.xpath("//summary[@aria-label='Account']");

    public Tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void authenticateUser(String username, String password) {
        driver.get("https://github.com/login");
        driver.findElement(By.id("login_field")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.name("commit")).click();
    }

    public void createNewRepository(String repoName) {
        driver.findElement(newRepoButton).click();
        driver.findElement(repositoryNameField).sendKeys(repoName);
        driver.findElement(createRepositoryButton).click();
    }

    public boolean isRepositoryCreated(String repoName) {
        driver.get("https://github.com/your_username?tab=repositories");
        return driver.findElements(By.linkText(repoName)).size() > 0;
    }
}