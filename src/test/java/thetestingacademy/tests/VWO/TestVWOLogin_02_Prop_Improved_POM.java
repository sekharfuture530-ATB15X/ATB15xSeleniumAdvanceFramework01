package thetestingacademy.tests.VWO;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import thetestingacademy.pages.pageObjectModel.VWO.LoginPage;
import thetestingacademy.utils.PropertiesReader;

import static org.assertj.core.api.Assertions.assertThat;

public class TestVWOLogin_02_Prop_Improved_POM {


    @Owner("Sekhar")
    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login(){

        WebDriver driver = new ChromeDriver();
        driver.get(PropertiesReader.readKey("url"));
        LoginPage loginpage = new LoginPage(driver);
        String error_msg = loginpage.loginToVWOInvalidCreds(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));
        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg,PropertiesReader.readKey("error_message"));

    }
}
