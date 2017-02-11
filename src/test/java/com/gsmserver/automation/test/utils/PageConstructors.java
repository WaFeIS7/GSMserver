package com.gsmserver.automation.test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class PageConstructors {

    protected WebDriver driver;

    PageConstructors(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}

