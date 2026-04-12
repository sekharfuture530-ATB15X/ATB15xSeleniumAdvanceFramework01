package thetestingacademy.pages.pageObjectModel.VWO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By userName = By.id("login-username");
    private By password = By.id("login-password");
    private By loginButton = By.id("js-login-btn");
    private By errorMessage = By.className("notification-box-description");

    // Actions

    public void loginToVWOInvalidCreds(String usr,String pwd) {

        driver.findElement(userName).sendKeys(usr);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginButton).click();
        driver.findElement(errorMessage).getText();

//        driver.get("https://app.vwo.com/#/login");
    }

//    public void enterEmail(String email) {
//        driver.findElement(emailInput).clear();
//        driver.findElement(emailInput).sendKeys(email);
//    }
//
//    public void enterPassword(String password) {
//        driver.findElement(passwordInput).clear();
//        driver.findElement(passwordInput).sendKeys(password);
//    }
//
//    public void clickLogin() {
//        driver.findElement(loginButton).click();
//    }
//
//    public String getErrorMessage() {
//        WebElement error = driver.findElement(errorMessage);
//        return error.getText();
//    }
}
