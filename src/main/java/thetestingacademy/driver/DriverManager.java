package thetestingacademy.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }

    public static void init(){

    }
    public static void down(){

    }
}
