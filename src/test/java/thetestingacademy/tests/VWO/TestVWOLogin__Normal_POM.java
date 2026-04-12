package thetestingacademy.tests.VWO;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import thetestingacademy.pages.pageObjectModel.VWO.LoginPage;

import static org.assertj.core.api.Assertions.assertThat;


public class TestVWOLogin__Normal_POM {


    @Owner("Sekhar")
    @Description("Verify that the invalid email and password and show only error messages")
    @Test
    public void test_negative_VWO_login(){

        // Driver Manager Code -1 D

        WebDriver driver = new ChromeDriver();

        // Page class code -(POM code) - 2 L

        LoginPage loginpage = new LoginPage(driver);
        String error_msg =loginpage.loginToVWOInvalidCreds("Sekhar@gmail.com","password");

        // Assertatoion -3 V

        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");


    }
}
