package com.qabootcamp.tests;

import com.qabootcamp.constants.FrameworkConstants;
import com.qabootcamp.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public final class  LoginPageTests extends BastTest{

    private LoginPageTests()
    {

    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(1000);
        Driver.driver.findElement(By.xpath("//button//span[text()=\"Dismiss\"]")).click();
        Driver.driver.findElement(By.id("navbarAccount")).click();
        Driver.driver.findElement(By.id("navbarLoginButton")).click();
        Thread.sleep(1000);

    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(1000);
        Driver.driver.findElement(By.xpath("//button//span[text()=\"Dismiss\"]")).click();
        Driver.driver.findElement(By.id("navbarAccount")).click();
        Driver.driver.findElement(By.id("navbarLoginButton")).click();
        Thread.sleep(1000);

    }
}
