package driver.browserManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeManager implements BrowserManager{

    @Override
    public WebDriver getDriver() {
        return new FirefoxDriver();
    }
}
