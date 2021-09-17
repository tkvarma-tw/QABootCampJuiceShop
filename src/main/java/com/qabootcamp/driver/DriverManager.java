package com.qabootcamp.driver;

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
        String browser = ReadPropertyFile.getProperty("browser");
        switch (browser) {
            case "IE":
                WebDriverManager.iedriver().setup();
                driver= new InternetExplorerDriver();
            case "EDGE":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            case "REMOTE":
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("browserName", "chrome");

                try {
                    driver= new RemoteWebDriver(new URL(ReadPropertyFile.getProperty("huburl")),
                            capabilities);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            default:
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
        }
        return driver;
    }

    public void quitDriver() throws Exception {
        if(driver!=null) {
            driver.quit();
            driver=null;
        }
    }
}
