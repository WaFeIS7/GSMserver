package com.gsmserver.automation.test.pages;

import com.gsmserver.automation.test.utils.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPopOut extends WaitFor {
    public LoginPopOut(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, css = ".pretty-link.gray-link[href='/checkout']")
    private WebElement buyWitoutRegistration;

    public void makeOrderWithoutRegistration() {
        buyWitoutRegistration.click();
    }
}
