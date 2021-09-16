package com.qabootcamp.Pages;

import com.qabootcamp.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.function.Predicate;

import static java.time.Duration.ofSeconds;
import static org.awaitility.Awaitility.await;

public class BasePage {


    Predicate<WebElement> isElementLocated = WebElement::isDisplayed;

    public WebElement findElement(By by) {
        await().atMost(ofSeconds(20))
                .pollInterval(ofSeconds(1))
                .ignoreExceptions()
                .until(() -> isElementLocated.test(Driver.driver.findElement(by)));
        return Driver.driver.findElement(by);
    }
}
