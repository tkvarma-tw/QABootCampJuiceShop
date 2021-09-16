package com.qabootcamp.Pages;

import com.qabootcamp.driver.Driver;
import org.openqa.selenium.By;

public class NewCustomerPage {
    public static By newCustomerLink = By.id("newCustomerLink");
    public static By email = By.id("emailControl");
    public static By password = By.id("passwordControl");
    public static By repeatPassword = By.id("repeatPasswordControl");
    public static By selectOption = By.xpath(".//*[contains(@class,'mat-option-text')]");
    public static By openDropDown = By.className("mat-select-arrow");
    public static By securityAnswer = By.id("securityAnswerControl");
    public static By registerButton = By.id("registerButton");

    public void registerNewCustomer(String email, String password) {
        Driver.driver.findElement(newCustomerLink).click();
        Driver.driver.findElement(this.email).sendKeys(email);
        Driver.driver.findElement(this.password).sendKeys(password);
        Driver.driver.findElement(repeatPassword).sendKeys(password);
        Driver.driver.findElement(openDropDown).click();
        Driver.driver.findElement(selectOption).click();
        Driver.driver.findElement(securityAnswer).sendKeys("Test");
        Driver.driver.findElement(registerButton).click();
    }
}
