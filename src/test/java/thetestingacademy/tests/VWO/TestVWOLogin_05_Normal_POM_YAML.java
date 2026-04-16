package thetestingacademy.tests.VWO;

import thetestingacademy.pages.pageObjectModel.VWO.normal_POM.DashboardPage;
import thetestingacademy.pages.pageObjectModel.VWO.normal_POM.LoginPage;
import thetestingacademy.utils.EnvUtil;
import thetestingacademy.utils.YamlReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestVWOLogin_05_Normal_POM_YAML {

    // D
    // L
    // V

    @Owner("PRAMOD")
    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() {

        YamlReader yamlReader = new YamlReader("config.yaml");

        // Driver Manager Code - 1 - D
        WebDriver driver = new ChromeDriver();
        driver.get(yamlReader.getString("project1.url"));
        // Page Class Code (POM Code) - 2 - L
        LoginPage loginPage = new LoginPage(driver);
        String error_msg = loginPage.loginToVWOInvalidCreds(yamlReader.getString("project1.invalid_username"),yamlReader.getString("project1.invalid_password"));
        // Assertions - 3 - V
        assertThat(error_msg).isNotNull().isNotBlank().isNotEmpty();
        Assert.assertEquals(error_msg,yamlReader.getString("project1.invalid_error_message"));
        driver.quit();



    }




}