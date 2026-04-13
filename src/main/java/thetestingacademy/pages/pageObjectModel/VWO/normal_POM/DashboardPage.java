package thetestingacademy.pages.pageObjectModel.VWO.normal_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import thetestingacademy.utils.WaitHelpers;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    private By userNameOnDashboard = By.xpath("");

    public String loggedInUserName() {
        WaitHelpers.waitJVM(10000);
        return driver.findElement(userNameOnDashboard).getText();
    }
}