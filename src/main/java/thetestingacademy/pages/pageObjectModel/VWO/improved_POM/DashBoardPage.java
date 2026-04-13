package thetestingacademy.pages.pageObjectModel.VWO.improved_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import thetestingacademy.base.CommonToAllPage;
import thetestingacademy.utils.WaitHelpers;

public class DashBoardPage extends CommonToAllPage {

    WebDriver driver;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    private By userNameOnDashboard = By.xpath("//span[@data-qa='lufexuloga']");

//    Page Actions

    public String loggedInUserName(){
        WaitHelpers.visibilityOfElement(userNameOnDashboard);
        return getText(userNameOnDashboard);
    }
}
