package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {
    WebDriver driver;

    By integrationSettingsButton = By.id("integration-settings");
    By jiraIntegrationButton = By.id("jira-integration");
    By successMessage = By.id("success-message");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToIntegrationSettings() {
        driver.findElement(integrationSettingsButton).click();
    }

    public void integrateJira() {
        driver.findElement(jiraIntegrationButton).click();
        // Assume there's a method to handle Jira credentials and authorization
        authorizeJira();
    }

    private void authorizeJira() {
        // Logic to authorize Jira integration
    }

    public boolean isIntegrationSuccessful() {
        return driver.findElement(successMessage).isDisplayed();
    }
}