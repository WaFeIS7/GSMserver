package com.gsmserver.automation.test.pages.PopOut;

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
    @FindBy(css = ".tab:nth-of-type(2)")
    private  WebElement tabRegistration;

    public void makeOrderWithoutRegistration() {
        buyWitoutRegistration.click();
    }

    public void clickTabRegistration() {
        tabRegistration.click();
    }
}
