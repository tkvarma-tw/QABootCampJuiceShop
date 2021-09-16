package com.qabootcamp.tests;

import com.qabootcamp.constants.FrameworkConstants;
import com.qabootcamp.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public final class  LoginPageTests extends BastTest{

    private LoginPageTests()
    {

    }

    @Test
    public void shouldBeAbleLoginWithValidCredentials() throws InterruptedException {
        Thread.sleep(1000);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        String email_add = "username" + randomInt + "@gmail.com";
        String password_add = "Hello";
        By welcomeBanner = By.xpath("(//button[contains(@aria-label,'Close Welcome Banner')])[1]");
        Driver.driver.findElement(welcomeBanner).click();
        By myAccount = By.id("navbarAccount");
        By login = By.id("navbarLoginButton");
        Driver.driver.findElement(myAccount).click();
        Driver.driver.findElement(login).click();

        Driver.driver.findElement(myAccount).click();
        Driver.driver.findElement(login).click();
        By newCustomerLink = By.id("newCustomerLink");
        By email = By.id("emailControl");
        By password = By.id("passwordControl");
        By repeatPassword = By.id("repeatPasswordControl");
        By selectOption = By.xpath(".//*[contains(@class,'mat-option-text')]");
        By openDropDown = By.className("mat-select-arrow");
        By securityAnswer = By.id("securityAnswerControl");
        By registerButton = By.id("registerButton");

        Driver.driver.findElement(newCustomerLink).click();
        Driver.driver.findElement(email).sendKeys(email_add);
        Driver.driver.findElement(password).sendKeys(password_add);
        Driver.driver.findElement(repeatPassword).sendKeys(password_add);
        Driver.driver.findElement(openDropDown).click();
        Driver.driver.findElement(selectOption).click();
        Driver.driver.findElement(securityAnswer).sendKeys("Test");
        Driver.driver.findElement(registerButton).click();
       Thread.sleep(1000);
        By email1 = By.id("email");
        By pass = By.id("password");
        By loginButton = By.id("loginButton");
        By error = By.className("error");

        Driver.driver.findElement(email1).sendKeys(email_add);
        Driver.driver.findElement(pass).sendKeys(password_add);
        Driver.driver.findElement(loginButton).click();
    }
}
