package com.qabootcamp.Pages;

import com.qabootcamp.driver.Driver;
import org.openqa.selenium.By;

public class LoginPage {
    public static By email = By.id("email");
    public static By pass = By.id("password");
    public static By loginButton = By.id("loginButton");
    public static By error = By.className("error");

    public void withValidCredentials(String emailId, String password) {
        loginWithEmailAndPassword(emailId, password);
    }


    public String withInvalidCredentials(String emailId, String password) {
        loginWithEmailAndPassword(emailId, password);
        return Driver.driver.findElement(error).getText();
    }

    private void loginWithEmailAndPassword(String emailId, String password) {
        Driver.driver.findElement(email).sendKeys(emailId);
        Driver.driver.findElement(pass).sendKeys(password);
        Driver.driver.findElement(loginButton).click();
    }
}

