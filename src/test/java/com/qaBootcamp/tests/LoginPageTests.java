package com.qaBootcamp.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTests {

    @Test
    public void test1()
    {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000");
        driver.quit();
    }
}
