package org.automation.test.page.object;

import org.automation.test.model.CardDetails;
import org.automation.test.utils.Utils;
import org.openqa.selenium.By;
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
    @FindBy(xpath = "//a[@class='button-main-content' and contains(.,'Pay Now')]")
    WebElement pay_now_button;
    @FindBy(css = "input[type='password']")
    WebElement opt_textbox;
    @FindBy(name = "ok")
    WebElement comfirmation_button;
    @FindBy(xpath = "//div[contains(@class,'error')]")
    List<WebElement> card_details_error;
    @FindBy(xpath= "//div[@class='final-panel success']/div[contains(@class,'success text')]")
    WebElement success_msg;
    @FindBy(xpath = "//div[@class='text-button-main']/span[contains(text(),'Processing')]")
    WebElement Laod_page;
    @FindBy(xpath="//div[@class='input-row']//input[@type='checkbox' and @name='promo']")
    List<WebElement> promoCheckbox;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void creditPaymentMethod() throws Throwable {
        WebElement element = new Utils(driver).waitUntilWebElementIsVisible(payment_type_credit_card);
        element.click();
    }
    public void deselectPromo()throws Throwable {
        for(WebElement element:promoCheckbox){
            if(element.getCssValue("border-bottom-color").equals("rgba(16, 44, 66, 1)")){
                Thread.sleep(2000);
                element.click();
            }
        }

    }

    public boolean enterCardDetails(CardDetails cardDetails)throws Throwable {
        WebElement card_num_txtbox = new Utils(driver).waitUntilWebElementIsVisible(card_number_textbox);
        card_num_txtbox.click();
        card_num_txtbox.sendKeys(cardDetails.getCardNumber());
        card_expiry_date.click();
        card_expiry_date.sendKeys(cardDetails.getExpiryDate());
        card_cvv.click();
        card_cvv.sendKeys(cardDetails.getCvv());
        if (card_details_error.size() == 0) {
            deselectPromo();
            pay_now_button.click();
            int size = driver.findElements(By.tagName("iframe")).size();
            //new Utils(driver).waitUntilElementIsInvisible(Laod_page);
            Thread.sleep(7000);
            driver.switchTo().frame(0);
            new Utils(driver).waitUntilWebElementIsVisible(opt_textbox).click();
            opt_textbox.sendKeys(cardDetails.getOtp());
            comfirmation_button.click();
            Thread.sleep(5000);
            driver.findElements(By.tagName("iframe")).size();
            driver.switchTo().frame(0);
            return success_msg.getText().equalsIgnoreCase("Transaction successful");
        } else
            return card_details_error.size()>0;
    }

}
