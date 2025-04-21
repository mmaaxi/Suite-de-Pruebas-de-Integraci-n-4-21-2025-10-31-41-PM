package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_001Page {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locators
    private By botonEjecutarAnalisis = By.id("executeStrategyAnalysis");
    private By mensajeValidacionExitoso = By.id("validationSuccessMessage");

    // Constructor
    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navegarAPaginaDeAnalisis() {
        driver.get("http://url-de-la-pagina-de-analisis-de-estrategia");
    }

    public void ejecutarAnalisisDeEstrategia() {
        WebElement ejecutarBoton = wait.until(ExpectedConditions.elementToBeClickable(botonEjecutarAnalisis));
        ejecutarBoton.click();
    }

    public boolean esEstrategiaValida() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(mensajeValidacionExitoso)).isDisplayed();
    }
}