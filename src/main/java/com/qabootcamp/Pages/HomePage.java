package com.qabootcamp.Pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public static By welcomeBanner = By.xpath("(//button[contains(@aria-label,'Close Welcome Banner')])[1]");
    public static By myAccount = By.id("navbarAccount");
    public static By login = By.id("navbarLoginButton");
    public static By logoutButton = By.id("navbarLogoutButton");

    public HomePage() throws Exception {
        super();
    }


    public HomePage skipBanner() throws Exception {
         findElement(welcomeBanner).click();
        return this;
    }

    public void navigateToLogin() throws Exception {
        findElement(myAccount).click();
        findElement(login).click();
    }
    public boolean isLoggedIn() throws Exception {
        findElement(this.myAccount).click();
        return  findElement(this.logoutButton).isDisplayed();
    }
}
