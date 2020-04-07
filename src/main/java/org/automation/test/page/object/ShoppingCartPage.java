package org.automation.test.page.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppingCartPage {
    WebDriver driver;
    @FindBy(css = ".cart-checkout")
    WebElement cart_checkout_button;
    @FindBy(xpath = "//div[@id='app']//a[@href='#/select-payment']")
    WebElement order_continue_button;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void cartCheckout() throws Throwable {
        cart_checkout_button.click();
        Thread.sleep(3000);
        int size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        order_continue_button.click();
    }
}
