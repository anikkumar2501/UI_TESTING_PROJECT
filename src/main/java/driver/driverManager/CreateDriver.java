package driver.driverManager;

import org.openqa.selenium.WebDriver;

public class CreateDriver {

    private WebDriver driver;
    private static CreateDriver INSTANCE;

    private CreateDriver(){

    }

    public static CreateDriver getInstance(){
        if(INSTANCE == null){
            INSTANCE = new CreateDriver();
        }
        return INSTANCE;
    }

    public void setDriver(String browser){
        driver = DriverManager.getBrowserManager(browser).getDriver();
    }

    public WebDriver getDriver(){
        return driver;
    }

}
