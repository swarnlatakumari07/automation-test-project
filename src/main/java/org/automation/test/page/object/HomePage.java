package org.automation.test.page.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class='btn buy']")
    WebElement buy_now_button;

    public void clickBuyNow() throws Throwable {
        buy_now_button.click();
        Thread.sleep(1000);
    }
}
