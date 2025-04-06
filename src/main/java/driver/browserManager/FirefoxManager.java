package driver.browserManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxManager implements BrowserManager {
    @Override
    public WebDriver getDriver() {
        return new FirefoxDriver();

    }
}
