package com.qabootcamp.driver;

import com.qabootcamp.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver driver;

    public static void initDriver()
    {
        // Creating only one instance across all tests
        if(driver==null) {
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
            driver = new ChromeDriver();
            driver.get("http://localhost:3000");
        }
    }

    public static void quitDriver()
    {
        if(driver!=null) {
            driver.quit();
            driver=null;
        }
    }
}
