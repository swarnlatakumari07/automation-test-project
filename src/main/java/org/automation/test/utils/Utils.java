package org.automation.test.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class Utils {
    Wait<WebDriver> wait;
    WebDriver driver;

    public Utils(WebDriver driver) {
        this.driver = driver;
        this.wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50))
                .pollingEvery(Duration.ofMillis(1000))
                .withMessage("Fluent Wait - 30 second timeout / 1 second polling")
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
    }

    public WebElement waitUntilElementIsPresent(final WebElement locator) {

        return wait.until(ExpectedConditions.presenceOfElementLocated((By) locator));
    }

    public WebElement waitUntilWebElementIsVisible(final WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitUntilElementIsVisible(final By locator) {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
