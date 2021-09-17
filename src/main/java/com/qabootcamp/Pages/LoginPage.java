package com.qabootcamp.Pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    public static By email = By.id("email");
    public static By pass = By.id("password");
    public static By loginButton = By.id("loginButton");
    public static By error = By.className("error");

    public LoginPage() throws Exception {
        super();
    }

    public void withValidCredentials(String emailId, String password) throws Exception {
        loginWithEmailAndPassword(emailId, password);
    }


    public String withInvalidCredentials(String emailId, String password) throws Exception {
        loginWithEmailAndPassword(emailId, password);
        return  findElement(error).getText();
    }

    private void loginWithEmailAndPassword(String emailId, String password) throws Exception {
         findElement(email).sendKeys(emailId);
         findElement(pass).sendKeys(password);
         findElement(loginButton).click();
    }
}

