package com.app.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

    private String baseUrl = "http://localhost:8080/webapp/today";
    private String driverPath = "C:\\Users\\s_sal\\chromedriver\\chromedriver.exe";
    private WebDriver driver;

    /**
     * Launches browser before running the tests.
     */
    @BeforeTest
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void verifyHomepageTitle() {
        String expectedTitle = "VyVS";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    /**
     * Close browser after running the tests
     */
    @AfterTest
    public void terminateBrowser() {
        driver.close();
    }
}