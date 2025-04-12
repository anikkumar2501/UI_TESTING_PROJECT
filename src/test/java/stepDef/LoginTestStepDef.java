package stepDef;

import driver.driverManager.CreateDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.SaurceDemoLogIn;

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
    public void user_input_user_name_as(String userName) {
        saurceDemoLogIn.userName.sendKeys(userName);

    }

    @When("user input password as {string}")
    public void user_input_password_as(String password) {
        saurceDemoLogIn.password.sendKeys(password);

    }

    @And("click on login button")
    public void clickOnLoginButton() {
        saurceDemoLogIn.loginButton.click();

    }

    @Then("user should be navigated to homepage")
    public void user_should_be_navigated_to_homepage() {
//        Assert.assertEquals(true, false);
       if(driver.findElement(By.xpath("//div[text()='Swag Labs']")).isDisplayed()) {
           System.out.println(" user successfully navigated to Home page....");
       }else {
           System.err.println(" user has not been successfully navigated to Home page....");
       }
    }


}
