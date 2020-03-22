package org.automation.test.stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;
import org.automation.test.model.CardDetails;
import org.automation.test.page.object.HomePage;
import org.automation.test.page.object.PaymentPage;
import org.automation.test.page.object.ShoppingCartPage;
import org.automation.test.utils.BrowserUtility;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class StepDescriptor {
    private WebDriver driver;
    private ObjectMapper mapper = new ObjectMapper();

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
        InputStream inputStream = new FileInputStream("src/main/resources/asset/validCard.json");
        CardDetails cardDetails = mapper.readValue(inputStream, CardDetails.class);
        Assert.assertTrue(paymentPage.enterCardDetails(cardDetails));

    }

    @Then("^payment with invalid Credit Card$")
    public void verifyInvalidCardPayementStatus() throws Throwable {
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.creditPaymentMethod();
        InputStream inputStream = new FileInputStream("src/main/resources/asset/invalidCard.json");
        CardDetails cardDetails = mapper.readValue(inputStream, CardDetails.class);
        Assert.assertTrue(paymentPage.enterCardDetails(cardDetails));
    }
}
