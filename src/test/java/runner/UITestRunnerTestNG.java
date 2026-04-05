package runner;


import com.aventstack.extentreports.service.ExtentService;
import failedTestCases.Retry;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import org.testng.ITestContext;
import org.testng.annotations.*;


@CucumberOptions(
        features = "src/main/java/feature",               // Path to feature files
//        tags = "@SMOKE",                             // Specify scenarios to run
        glue = {"stepDef", "hooks"},                                       // Path to step definitions
        dryRun = false,                                        // it is used to check mapping of step to glue code
        monochrome = true,                                     // Make console output readable
        plugin = {"pretty",                                    // For readable console output
                "html:target/cucumber-reports/cucumber.html",  // HTML report
                "json:target/cucumber-reports/cucumber.json"   // JSON report
                , "rerun:target/failed.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"     // extent report
        }

)
public class UITestRunnerTestNG extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @Test(
            groups = {"cucumber"},
            description = "Runs Cucumber Scenarios",
            dataProvider = "scenarios",
            retryAnalyzer = Retry.class
    )
    @Override
    public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        super.runScenario(pickleWrapper, featureWrapper);
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite of testNG...");
        ExtentService.getInstance().setSystemInfo("os","windows");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite of testNG...");
    }

    @BeforeClass
    public void beforeClass(ITestContext context) {

        // Read threadCount from Maven -DthreadCount parameter
        // ✅ No hardcoding - default comes from pom.xml <properties>

        int threadCount = Integer.parseInt(System.getProperty("threadCount"));
        context.getCurrentXmlTest().getSuite().setDataProviderThreadCount(threadCount);
        System.out.println("Running with thread count: " + threadCount);


    }

    @AfterClass
    public void afterClass() {
        System.out.println("after class of testNG...");
    }


}
