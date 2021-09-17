package com.qabootcamp.driver;

import com.qabootcamp.constants.FrameworkConstants;
import com.qabootcamp.utils.ReadPropertyFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    private static WebDriver driver;
    private static DriverManager driverManager;

    private DriverManager() {

    }

    public static WebDriver getInstance() throws Exception {
        if(driverManager==null)
        {
            driverManager = new DriverManager();
            return driverManager.getDriver();
        }
        return driver;
    }

    private WebDriver getDriver() throws Exception {
        System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
        driver = new ChromeDriver();
        return driver;
    }

    public void quitDriver() throws Exception {
        if(driver!=null) {
            driver.quit();
            driver=null;
        }
    }
}
