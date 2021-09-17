package com.qabootcamp.Pages;

import com.qabootcamp.models.CustomerFormModel;
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

    public void registerNewCustomer(CustomerFormModel customerFormModel) throws Exception {
         findElement(newCustomerLink).click();
         findElement(this.email).sendKeys(customerFormModel.getEmail());
         findElement(this.password).sendKeys(customerFormModel.getPassword());
         findElement(repeatPassword).sendKeys(customerFormModel.getPassword());
         findElement(openDropDown).click();
         findElement(selectOption).click();
         findElement(securityAnswer).sendKeys(customerFormModel.getAnswer());
         findElement(registerButton).click();
    }
}
