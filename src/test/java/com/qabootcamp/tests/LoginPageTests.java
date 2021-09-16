package com.qabootcamp.tests;

import com.qabootcamp.Pages.HomePage;
import com.qabootcamp.Pages.LoginPage;
import com.qabootcamp.Pages.NewCustomerPage;
import com.qabootcamp.driver.Driver;
import com.qabootcamp.utils.ReadPropertyFile;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public final class  LoginPageTests extends BastTest{

    private String email;
    private String password;

    private LoginPageTests()
    {
        super();
    }

    @BeforeMethod
    public void setup() throws Exception {
        Thread.sleep(1000);
        new HomePage().skipBanner().navigateToLogin();
        email = getRandomEmail();
        password=ReadPropertyFile.getProperty("password");
        new NewCustomerPage().registerNewCustomer(email, password);
        Thread.sleep(1000);
    }

    @Test
    public void shouldBeAbleLoginWithValidCredentials() throws InterruptedException {
        new LoginPage().withValidCredentials(email,password);
        Thread.sleep(1000);
        Assert.assertEquals(new HomePage().isLoggedIn(),true);

    }

    private String getRandomEmail(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return "username" + randomInt + "@gmail.com";
    }
}
