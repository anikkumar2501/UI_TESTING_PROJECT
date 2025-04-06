package hooks;

import driver.driverManager.CreateDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
//import static stepDef.LoginTestStepDef.driver;

public class Hooks {
    public WebDriver driver;

    @Before
    public void beforeHooks(){
        System.out.println("Before Hooks........");
    }

    @BeforeStep
    public void beforeStepsHooks(){
        System.out.println("Before Steps Hooks........");
    }

    @After
    public void afterHooks(){
        System.out.println("After Hooks........");
        System.out.println("Closing driver..............");
        driver.quit();
    }

    @AfterStep
    public void afterStepsHooks(){
        System.out.println("After Steps Hooks........");
    }
}
