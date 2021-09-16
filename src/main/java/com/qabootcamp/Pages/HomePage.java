package com.qabootcamp.Pages;

import com.qabootcamp.driver.Driver;
import org.openqa.selenium.By;

public class HomePage {

    public static By welcomeBanner = By.xpath("(//button[contains(@aria-label,'Close Welcome Banner')])[1]");
    public static By myAccount = By.id("navbarAccount");
    public static By login = By.id("navbarLoginButton");
    public static By logoutButton = By.id("navbarLogoutButton");


    public HomePage skipBanner() {
        Driver.driver.findElement(welcomeBanner).click();
        return this;
    }

    public void navigateToLogin() {
        Driver.driver.findElement(myAccount).click();
        Driver.driver.findElement(login).click();
    }
    public boolean isLoggedIn() {
        Driver.driver.findElement(this.myAccount).click();
        return Driver.driver.findElement(this.logoutButton).isDisplayed();
    }
}
