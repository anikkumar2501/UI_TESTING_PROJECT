package stepDef;

import driver.driverManager.CreateDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.SaurceDemoLogIn;

import java.time.Duration;

public class LoginTestStepDef {

    public WebDriver driver;

    SaurceDemoLogIn saurceDemoLogIn;

    @Given("user open url {string}")
    public void user_open_url(String string) {
        driver = CreateDriver.getInstance().getDriver();
        saurceDemoLogIn = new SaurceDemoLogIn(driver);
        driver.get(string);

    }

    @When("user input userName as {string}")
    public void user_input_user_name_as(String string) {
        saurceDemoLogIn.enterUserName(string);

    }

    @When("user input password as {string}")
    public void user_input_password_as(String string) {
        saurceDemoLogIn.enterPassoword(string);

    }

    @And("click on login button")
    public void clickOnLoginButton() {
        saurceDemoLogIn.clickLoginButton();

    }

    @Then("user should be navigated to homepage")
    public void user_should_be_navigated_to_homepage() {

    }


}
