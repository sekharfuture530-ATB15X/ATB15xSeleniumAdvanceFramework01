package thetestingacademy.tests.VWO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

    public class TestVWOInvalidLogin_Without_POM {

        WebDriver driver;

        @BeforeClass
        public void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }

        @Test
        public void testInvalidLogin() {

            // Step 1: Navigate to VWO Login Page
            driver.get("https://app.vwo.com/#/login");

            // Step 2: Enter Invalid Email
            WebElement email = driver.findElement(By.id("login-username"));
            email.sendKeys("invalid@test.com");

            // Step 3: Enter Invalid Password
            WebElement password = driver.findElement(By.id("login-password"));
            password.sendKeys("wrongpassword");

            // Step 4: Click Login Button
            WebElement loginBtn = driver.findElement(By.id("js-login-btn"));
            loginBtn.click();

            // Step 5: Validate Error Message
            WebElement errorMsg = driver.findElement(By.className("notification-box-description"));

            String actualError = errorMsg.getText();
            String expectedError = "Your email, password, IP address or location did not match";

            // Assertion
            Assert.assertTrue(actualError.contains("did not match"),
                    "Error message validation failed!");

            System.out.println("Test Passed: Invalid login error displayed correctly");
        }

        @AfterClass
        public void tearDown() {
            driver.quit();
        }
    }

