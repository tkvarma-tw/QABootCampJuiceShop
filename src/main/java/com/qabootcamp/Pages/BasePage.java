package com.qabootcamp.Pages;

import com.qabootcamp.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.function.Predicate;

import static java.time.Duration.ofSeconds;
import static org.awaitility.Awaitility.await;

public class BasePage {

    public WebDriver driver;


    Predicate<WebElement> isElementLocated = WebElement::isDisplayed;

    public BasePage() throws Exception {
        this.driver = DriverManager.getInstance();
    }

    public WebElement findElement(By by) throws Exception {
        await().atMost(ofSeconds(20))
                .pollInterval(ofSeconds(1))
                .ignoreExceptions()
                .until(() -> isElementLocated.test(DriverManager.getInstance().findElement(by)));
        return DriverManager.getInstance().findElement(by);
    }
}
