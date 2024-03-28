package org.schuck.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.schuck.page_objects.LoginPage;
import org.testng.Assert;

/**
 * This class represents the steps for the LoginPage feature.
 * It includes setup and teardown methods, as well as step definitions for the login scenarios.
 */
public class LoginPageSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    /**
     * Setup method to initialize WebDriver before each scenario.
     */
    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    /**
     * Teardown method to quit WebDriver after each scenario.
     */
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("Given the user navigates to the login page")
    public void givenTheUserNavigatesToTheLoginPage() {
        driver.get("https://www.saucedemo.com/v1");
        loginPage = new LoginPage(driver);
    }

    @Given("A user entered a valid username as {string} and password as {string}")
    public void aUserEnteredAValidCredential(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("User click in the login button")
    public void userClickInTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("User should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
        Assert.assertTrue(loginPage.getCurrentURL().contains("inventory"));
    }

    @And("Have access to the products page")
    public void haveAccessToTheProductsPage() {
        Assert.assertTrue(loginPage.getInventoryItem());
    }

    @Given("The user entered a invalid {string} and {string}")
    public void theUserEnteredAInvalidAnd(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @Then("The user should see an error message indicating {string}")
    public void theUserShouldSeeAnErrorMessageIndicating(String error_message) {
        System.out.println(loginPage.getErrorMessage().contains(error_message));
        Assert.assertTrue(loginPage.getErrorMessage().contains(error_message));
    }

    @Given("A user entered a blocked username as {string} and password as {string}")
    public void aUserEnteredABlockedUsername(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @Given("The user entered a blank {string} or {string}")
    public void theUserEnteredABlankOr(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }
}
