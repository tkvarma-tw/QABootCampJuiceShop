package com.qabootcamp.driver;

import com.qabootcamp.constants.FrameworkConstants;
import com.qabootcamp.utils.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Driver {

    public static WebDriver driver;

    public static void initDriver() throws Exception {
        // Creating only one instance across all tests
        if(driver==null) {
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
            driver = new ChromeDriver();
            driver.get(ReadPropertyFile.getProperty("url"));
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
