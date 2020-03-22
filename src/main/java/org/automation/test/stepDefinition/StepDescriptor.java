package org.automation.test.stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.automation.test.page.object.HomePage;
import org.automation.test.page.object.PaymentPage;
import org.automation.test.page.object.ShoppingCartPage;
import org.automation.test.utils.BrowserUtility;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;

public class StepDescriptor {
    private WebDriver driver;
    private String baseUrl= "https://demo.midtrans.com/";
    @Parameters(value= {"browser"})
    @Given("^Open chrome browser and enter url$")
    public void open_chrome_browser_and_enter_url() throws Throwable {
        driver = BrowserUtility.OpenBrowser(driver, "Chrome", baseUrl);
    }

    @When("^Click on Buy now$")
    public void clickBuyNow() throws Throwable {
        new HomePage(driver).clickBuyNow();
    }

    @When("^Click on Checkout button$")
    public void cartCheckout() throws Throwable {
        new ShoppingCartPage(driver).cartCheckout();
    }

    @Then("^payment with Valid Credit Card$")
    public void processPayment() throws Throwable {
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.creditPaymentMethod();
        Assert.assertTrue(paymentPage.enterCardDetails());

    }

    @Then("^payment with invalid Credit Card$")
    public void verifyInvalidCardPayementStatus() throws Throwable {
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.creditPaymentMethod();
        //paymentPage.enterCardDetails();
        Assert.assertFalse(paymentPage.enterCardDetails());
    }
}
