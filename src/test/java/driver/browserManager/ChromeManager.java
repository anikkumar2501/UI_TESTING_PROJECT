package driver.browserManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class ChromeManager implements BrowserManager{

    @Override
    public WebDriver getDriver() {
        ChromeOptions  options = new ChromeOptions();
        Map<String,Object> prefs = new HashMap<>();
        prefs.put("credential_enable_service", false);
        prefs.put("profile.password_manager_enabled",false);
        prefs.put("profile.password_manager_leak_detection", false);

        options.setExperimentalOption("prefs",prefs);

        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-features=PasswordLeakDetection");
        return new ChromeDriver(options);
    }
}
