package com.qabootcamp.tests;

import com.qabootcamp.driver.DriverFactory;
import com.qabootcamp.utils.ReadPropertyFile;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BastTest {

    protected BastTest()
    {}

    @BeforeMethod
    public void setUp() throws Exception {
        DriverFactory.getDriver(ReadPropertyFile.getProperty("browser")).get(ReadPropertyFile.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() throws Exception {
        DriverFactory.getDriver(ReadPropertyFile.getProperty("browser")).quit();
    }
}
