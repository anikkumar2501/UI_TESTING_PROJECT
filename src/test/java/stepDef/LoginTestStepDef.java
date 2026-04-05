package stepDef;

import driver.driverManager.CreateDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.OrangeHRMLogIn;
import utility.MyException;

public class LoginTestStepDef {

    public WebDriver driver;

    OrangeHRMLogIn orangeHRMLogIn;

    @Given("user open url {string}")
    public void user_open_url(String string) {
        driver = CreateDriver.getInstance().getDriver();
        orangeHRMLogIn = new OrangeHRMLogIn(driver);
        driver.get(string);

    }

    @When("user input userName as {string}")
    public void user_input_user_name_as(String userName) {
        orangeHRMLogIn.userName.sendKeys(userName);

    }

    @When("user input password as {string}")
    public void user_input_password_as(String password) {
        orangeHRMLogIn.password.sendKeys(password);

    }

    @And("click on login button")
    public void clickOnLoginButton() {
        orangeHRMLogIn.loginButton.click();

    }

    @Then("user should be navigated to homepage")
    public void user_should_be_navigated_to_homepage() throws MyException {
        if (orangeHRMLogIn.dashboard.isDisplayed()) {
            System.out.println("User successfully navigated to Home page.");
        } else {
            throw new MyException("Dashboard not visible successful login failed.");
        }
    }


}
