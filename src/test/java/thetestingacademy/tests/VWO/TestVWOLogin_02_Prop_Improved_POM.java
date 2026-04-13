package thetestingacademy.tests.VWO;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import thetestingacademy.baseTest.CommonToAllTest;
import thetestingacademy.driver.DriverManager;
import thetestingacademy.pages.pageObjectModel.VWO.improved_POM.LoginPage;
import thetestingacademy.utils.PropertiesReader;

import static org.assertj.core.api.Assertions.assertThat;

public class TestVWOLogin_02_Prop_Improved_POM extends CommonToAllTest {


    @Owner("Sekhar")
    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login(){


        LoginPage loginpage = new LoginPage(DriverManager.getDriver());
        String error_msg = loginpage.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));
        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg,PropertiesReader.readKey("error_message"));

    }
}
