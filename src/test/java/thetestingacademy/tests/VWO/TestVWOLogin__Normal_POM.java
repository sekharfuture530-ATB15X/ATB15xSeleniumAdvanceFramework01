package thetestingacademy.tests.VWO;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import thetestingacademy.pages.pageObjectModel.VWO.DashboardPage;
import thetestingacademy.pages.pageObjectModel.VWO.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;

public class TestVWOLogin__Normal_POM {

    @Owner("Sekhar")
    @Description("Verify that invalid email and password shows error message")
    @Test
    public void test_negative_VWO_login() {

        // Driver setup
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        // Page Object
        LoginPage loginPage = new LoginPage(driver);

        // Action
        String error_msg = loginPage.loginToVWOInvalidCreds(
                "Sekhar@gmail.com",
                "password"
        );

        // Assertions
        assertThat(error_msg)
                .isNotNull()
                .isNotBlank()
                .isNotEmpty();

        Assert.assertEquals(
                error_msg,
                "Your email, password, IP address or location did not match"
        );

        // Cleanup
        driver.quit();
    }

    @Owner("Sekhar")
    @Description("Verify that valid email and password shows error message")
    @Test
    public void test_positive_VWO_login() {

        // Driver setup
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        // Page Object
        DashboardPage dashPage = new DashboardPage(driver);

        // Action
        dashPage.loggedInUserName();




        // Cleanup
        driver.quit();
    }
}