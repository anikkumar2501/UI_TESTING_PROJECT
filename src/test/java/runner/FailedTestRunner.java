package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.ITestContext;
import org.testng.annotations.*;

@CucumberOptions(
        features = "@target/failed.txt",               // Path to feature files
        glue = {"stepDef", "hooks"},                                       // Path to step definitions
        dryRun = false,                                        // it is used to check mapping of step to glue code
        monochrome = true,                                     // Make console output readable
        plugin = {"pretty",                                    // For readable console output
                "html:target/cucumber-reports/cucumber.html",  // HTML report
                "json:target/cucumber-reports/cucumber.json"}, // JSON report
        tags = "@Test1"// Specify scenarios to run
)
public class FailedTestRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite of testNG...");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite of testNG...");
    }

    @BeforeClass
    public void beforeClass(ITestContext context) {
        System.out.println("Before class of testNG...");
        context.getCurrentXmlTest().getSuite().setDataProviderThreadCount(6);

    }

    @AfterClass
    public void afterClass() {
        System.out.println("after class of testNG...");
    }


}
