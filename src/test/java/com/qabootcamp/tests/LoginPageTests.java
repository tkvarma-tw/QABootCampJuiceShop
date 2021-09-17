package com.qabootcamp.tests;

import com.qabootcamp.Pages.HomePage;
import com.qabootcamp.Pages.LoginPage;
import com.qabootcamp.Pages.NewCustomerPage;
import com.qabootcamp.utils.ReadPropertyFile;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
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
        new HomePage().skipBanner().navigateToLogin();
        email = getRandomEmail();
        password=ReadPropertyFile.getProperty("password");
        new NewCustomerPage().registerNewCustomer(email, password);
    }

    @Test
    public void shouldBeAbleLoginWithValidCredentials() throws Exception {
        new LoginPage().withValidCredentials(email,password);
        Assert.assertEquals(new HomePage().isLoggedIn(),true);

    }

    private String getRandomEmail(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000);
        return "username" + randomInt + "@gmail.com";
    }
}
