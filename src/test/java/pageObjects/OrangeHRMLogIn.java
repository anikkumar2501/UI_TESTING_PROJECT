package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogIn {

    WebDriver driver;

    public OrangeHRMLogIn(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(), 'Swag Labs')]")
    public WebElement dashboard;

//    public void enterUserName(String user) {
//        userName.sendKeys(user);
//    }
//
//    public void enterPassoword(String pass) {
//        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement ele = webDriverWait.until(ExpectedConditions.visibilityOf(password));
//        ele.sendKeys(pass);
//    }
//
//    public void clickLoginButton() {
//        loginButton.click();
//
//    }


}
