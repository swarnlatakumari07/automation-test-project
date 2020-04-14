package org.automation.test.stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;
import org.automation.test.page.object.HomePage;
import org.automation.test.utils.BrowserUtility;
import org.openqa.selenium.WebDriver;

public class StepDescriptor {
    private WebDriver driver;
    private ObjectMapper mapper = new ObjectMapper();

    private String baseUrl= "https://www.amazon.com/";
    @Given("^Open chrome browser and enter url$")
    public void open_chrome_browser_and_enter_url() throws Throwable {
        driver = BrowserUtility.OpenBrowser();
        driver.get(baseUrl);
    }
    @When("^Verify homePage title$")
    public void verifyTitle()throws Throwable {
        new HomePage(driver).verifyTitle();
    }

    @When("^Click on Buy now$")
    public void VerifyTitle() throws Throwable {
        new HomePage(driver).clickBuyNow();
    }
    @When("Enter {string} in for search")
    public void enter_item_in_for_search(String searchTopic) throws Throwable{
        new HomePage(driver).searchItem(searchTopic);
    }

    @Then("^Verify Search Results$")
    public void verify_Search_Results()throws Throwable {
        new HomePage(driver).verifySearchResults();
    }

    @When("^Click on Checkout button$")
    public void cartCheckout() throws Throwable {
       // new ShoppingCartPage(driver).cartCheckout();
    }

    @Then("^payment with Valid Credit Card$")
    public void processPayment() throws Throwable {


    }

    @Then("^payment with invalid Credit Card$")
    public void verifyInvalidCardPayementStatus() throws Throwable {

    }
    @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
        driver.quit();
    }

}
