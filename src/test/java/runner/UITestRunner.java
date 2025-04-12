package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/feature",               // Path to feature files
        glue =  {"stepDef", "hooks"},                                       // Path to step definitions
        dryRun = false,                                        // it is used to check mapping of step to glue code
        monochrome = true,                                     // Make console output readable
        plugin = {"pretty",                                    // For readable console output
                "html:target/cucumber-reports/cucumber.html",  // HTML report
                "json:target/cucumber-reports/cucumber.json"} // JSON report
                                                   // Specify scenarios to run

)
public class UITestRunner {


}
