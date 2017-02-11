package com.gsmserver.automation.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitFor extends PageConstructors {

    public WaitFor(WebDriver driver) {
        super(driver);
    }

    private WebDriverWait getWait(int seconds) {
        return new WebDriverWait(driver, seconds);
    }

    public WebElement waitforElemenIsDisplayed(WebElement element) {
        return getWait(20).until(ExpectedConditions.visibilityOf(element));
    }
}
