package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;

    private By matrixPageLocator = By.id("matrixPage");
    private By generateButtonLocator = By.id("generateMatrix");
    private By resultLocator = By.id("resultMatrix");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToMatrizCreationPage() {
        driver.get("https://example.com/matriz-creation");
    }

    public void generateRequirementMatrix() {
        driver.findElement(generateButtonLocator).click();
    }

    public boolean isMatrixGeneratedCorrectly() {
        WebElement resultElement = driver.findElement(resultLocator);
        // A simple verification logic assuming the presence of a success message or attribute
        return resultElement.isDisplayed() && resultElement.getText().contains("successfully generated");
    }
}