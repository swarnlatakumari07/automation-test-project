package org.automation.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

@Parameters("browser")
public class BrowserUtility {
    public static WebDriver OpenBrowser(WebDriver driver, String browser, String url) throws InterruptedException {
        if (browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
            Thread.sleep(5000);
            return driver;
        } else if (browser.equals("Firefox")) {
            System.setProperty("webdriver.ie.driver", "src/main/resources/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(url);
            return driver;
        }
        return null;
    }
}
