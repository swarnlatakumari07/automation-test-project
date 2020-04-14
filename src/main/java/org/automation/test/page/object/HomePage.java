package org.automation.test.page.object;

import org.automation.test.utils.CONST;
import org.automation.test.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='btn buy']")
    WebElement buy_now_button;
    @FindBy(xpath = "//div[@class='nav-search-field ']/input[contains(@id,'searchtextbox')]")
    WebElement search_textbox;
    @FindBy(xpath ="//span[contains(@data-component-type,'search-results')]//span[contains(@class,'search-results')]")
    List<WebElement> search_results;
    @FindBy(xpath = "//div[@class='nav-right']/div[contains(@class,'search-submit')]")
    WebElement submit_search_icon;

    public void clickBuyNow() throws Throwable {
        buy_now_button.click();
        Thread.sleep(1000);
    }
    public void verifyTitle(){
        String homePageTitle=driver.getTitle();
        Assert.assertTrue(homePageTitle.contains("Amazon.com"));
    }
    public void searchItem(String searchTopic){
        new Utils(driver).waitUntilWebElementIsVisible(search_textbox);
        search_textbox.click();
        search_textbox.sendKeys(searchTopic);
        System.setProperty(CONST.HOME.search_topic,searchTopic);
        submit_search_icon.click();

    }

    public void verifySearchResults(){
        for (WebElement element: search_results){
            Assert.assertTrue(element.getText().contains(System.getProperty(CONST.HOME.search_topic)));
        }
    }
}
