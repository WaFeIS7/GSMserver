package com.gsmserver.automation.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;


public class TestBase {

    public WebDriver driver;

    @BeforeClass
    public void setUp() {
//     System.setProperty("webdriver.chrome.driver", "/home/qa/chromeDriver/chromedriver"); For Linux
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Вадим\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}