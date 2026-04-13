package thetestingacademy.pages.pageObjectModel.VWO.improved_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import thetestingacademy.base.CommonToAllPage;
import thetestingacademy.utils.WaitHelpers;

import static thetestingacademy.driver.DriverManager.getDriver;

public class LoginPage extends CommonToAllPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Steps -1  Page Locators
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_Messages = By.id("js-notification-box-msg");

    public String loginToVWOLoginInvalidCreds(String user,String pwd){
        openVWOUrl();
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(signButton);
        WaitHelpers.checkVisibility(getDriver(),error_Messages);
        return getText(error_Messages);
    }

    public void loginToVWOLoginValidCreds(String user,String pwd){
        openVWOUrl();
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(signButton);

//        Wait - Thread Sleep
        WaitHelpers.waitJVM(10000);
    }
}
