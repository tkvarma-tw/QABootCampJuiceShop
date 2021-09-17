package com.qabootcamp.Pages;

import org.openqa.selenium.By;

public class NewCustomerPage extends BasePage {
    public static By newCustomerLink = By.id("newCustomerLink");
    public static By email = By.id("emailControl");
    public static By password = By.id("passwordControl");
    public static By repeatPassword = By.id("repeatPasswordControl");
    public static By selectOption = By.xpath(".//*[contains(@class,'mat-option-text')]");
    public static By openDropDown = By.className("mat-select-arrow");
    public static By securityAnswer = By.id("securityAnswerControl");
    public static By registerButton = By.id("registerButton");

    public NewCustomerPage() throws Exception {
        super();
    }

    public void registerNewCustomer(String email, String password) throws Exception {
         findElement(newCustomerLink).click();
         findElement(this.email).sendKeys(email);
         findElement(this.password).sendKeys(password);
         findElement(repeatPassword).sendKeys(password);
         findElement(openDropDown).click();
         findElement(selectOption).click();
         findElement(securityAnswer).sendKeys("Test");
         findElement(registerButton).click();
    }
}
