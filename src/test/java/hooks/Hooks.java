package hooks;

import driver.driverManager.CreateDriver;
import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Hooks {
    public WebDriver driver;

    @Before
    public void beforeHooks(){
//        System.out.println("Before Hooks........");
        String browserName = "chrome";
        CreateDriver.getInstance().setDriver(browserName);
        driver = CreateDriver.getInstance().getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            File screenshotDir = new File("reports/ExtentReports/SparkReport/");

            // Delete entire folder and recreate it fresh
            if (screenshotDir.exists()) {
                FileUtils.cleanDirectory(screenshotDir); // deletes all contents
                System.out.println("✅ Screenshots folder cleaned successfully");
            } else {
                screenshotDir.mkdirs(); // create if doesn't exist
                System.out.println("✅ Screenshots folder created");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @BeforeStep
    public void beforeStepsHooks(){
//        System.out.println("Before Steps Hooks........");
    }

    @After
    public void afterHooks(Scenario scenario){

        if (scenario.isFailed()) {
            try {
                // 1. Generate a unique filename using timestamp
                String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
                String screenshotName = "screenshot_" + timestamp + ".png";

                // 2. Define the path — must match extent.properties output folder
                String screenshotPath = "test-output/SparkReport/" + screenshotName;

                // 3. Take screenshot and save to file
                File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                File destFile = new File(screenshotPath);
                FileUtils.copyFile(srcFile, destFile);

                // 4. Attach the saved file as bytes to scenario
                byte[] fileContent = FileUtils.readFileToByteArray(destFile);
                scenario.attach(fileContent, "image/png", screenshotName);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        driver.quit();
        System.out.println("All driver session closed.");


    }

    @AfterStep
    public void afterStepsHooks(){
//        System.out.println("After Steps Hooks........");
    }
}
