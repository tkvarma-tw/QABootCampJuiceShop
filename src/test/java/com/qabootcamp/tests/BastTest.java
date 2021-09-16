package com.qabootcamp.tests;

import com.qabootcamp.constants.FrameworkConstants;
import com.qabootcamp.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class BastTest {

    protected BastTest()
    {}

    @BeforeMethod
    public void setUp() throws Exception {
        Driver.initDriver();
    }

    @AfterMethod
    public void tearDown()
    {
        Driver.quitDriver();
    }
}
