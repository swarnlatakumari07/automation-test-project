package org.automation.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.automation.test.runner.TestRunner.browser;


public class BrowserUtility {
    public static WebDriver driver  = null;

    public static WebDriver OpenBrowser() throws InterruptedException {
        if (browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/asset/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(5000);
            return driver;
        } else if (browser.equals("Firefox")) {
            System.setProperty("webdriver.ie.driver", "src/main/resources/asset/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            return driver;
        }
        return null;
    }

}
