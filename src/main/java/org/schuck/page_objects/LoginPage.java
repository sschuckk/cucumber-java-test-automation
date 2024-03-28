package org.schuck.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * This class represents the LoginPage of the application under test.
 * It provides methods to interact with the login page elements.
 */
public class LoginPage {
    private WebDriver driver;

    // WebElement Locators
    private final By usernameLocator = By.id("user-name");
    private final By passwordLocator = By.id("password");
    private final By loginBtnLocator = By.id("login-button");
    private final By cartBtnLocator = By.xpath("//a[@data-test='shopping-cart-link']");
    private final By inventoryItemLocator = By.className("inventory_item");
    private final By errorMessageLocator = By.xpath("//h3[@data-test='error']");

    /**
     * Constructor for LoginPage class.
     * @param driver The WebDriver instance to be used for browser interaction.
     */
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Page Methods/Actions
    public void enterUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginBtnLocator).click();
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public boolean getInventoryItem() {
        return driver.findElement(inventoryItemLocator).isDisplayed();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessageLocator).getText();
    }
}
