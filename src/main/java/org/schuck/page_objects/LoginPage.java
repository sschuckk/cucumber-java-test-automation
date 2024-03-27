package org.schuck.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    private WebDriver driver;

    // Locators
    private By usernameLocator = By.id("user-name");
    private By passwordLocator = By.id("password");
    private By loginBtnLocator = By.id("login-button");
    private By cartBtnLocator = By.xpath("//a[@data-test='shopping-cart-link']");
    private By inventoryItemLocator = By.className("inventory_item");
    private By errorMessageLocator = By.xpath("//h3[@data-test='error']");

    // Constructor
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
