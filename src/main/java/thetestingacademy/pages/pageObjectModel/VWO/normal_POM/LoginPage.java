package thetestingacademy.pages.pageObjectModel.VWO.normal_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public String loginToVWOInvalidCreds(String usr, String pwd) {

        driver.findElement(userName).sendKeys(usr);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginButton).click();

        String error = driver.findElement(errorMessage).getText();

        return error;
    }

    public String loginToVWOvalidCreds(String usr, String pwd) {

        driver.findElement(userName).sendKeys(usr);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginButton).click();

        return usr;
    }

}
