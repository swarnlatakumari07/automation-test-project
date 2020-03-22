package org.automation.test.page.object;

import org.automation.test.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PaymentPage {
    WebDriver driver;

    @FindBy(xpath = "//a[@href='#/credit-card']")
    WebElement payment_type_credit_card;
    @FindBy(name = "cardnumber")
    WebElement card_number_textbox;

    @FindBy(xpath = "//input[@type='tel' and @placeholder='MM / YY']")
    WebElement card_expiry_date;
    @FindBy(xpath = "//input[@inputmode='numeric' and contains(@style,'cvv')]")
    WebElement card_cvv;
    @FindBy(xpath = "//a[@class='button-main-content' and contains(@href,'#/')]")
    WebElement pay_now_button;
    @FindBy(css = "input[type='password']")
    WebElement opt_textbox;
    @FindBy(name = "ok")
    WebElement comfirmation_button;
    @FindBy(xpath = "//div[contains(@class,'error')]")
    List<WebElement> card_details_error;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void creditPaymentMethod() throws Throwable {
        WebElement element = new Utils(driver).waitUntilWebElementIsVisible(payment_type_credit_card);
        element.click();
    }

    public boolean enterCardDetails()throws Throwable {
        WebElement card_num_txtbox = new Utils(driver).waitUntilWebElementIsVisible(card_number_textbox);
        card_num_txtbox.click();
        card_num_txtbox.sendKeys("4911111111111113");
        card_expiry_date.click();
        card_expiry_date.sendKeys("0320");
        card_cvv.click();
        card_cvv.sendKeys("123");
        if (card_details_error.size() == 0) {
            pay_now_button.click();
            Thread.sleep(2000);
            new Utils(driver).waitUntilWebElementIsVisible(opt_textbox).click();
            opt_textbox.sendKeys(" ");
            comfirmation_button.click();
            return true;
        } else
            return card_details_error.size()>0;
    }

}
