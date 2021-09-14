package com.qaBootcamp.tests;

import com.qabootcamp.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTests {

    @Test
    public void test1()
    {
        System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000");
        driver.quit();
    }

    @Test
    public void test2()
    {
        System.setProperty("webdriver.chrome.driver",FrameworkConstants.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000");
        driver.quit();
    }
}
