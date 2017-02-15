package com.gsmserver.automation.test.pages;

import com.gsmserver.automation.test.utils.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPopOutPage extends WaitFor {
    public LoginPopOutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//div[@class='ui-lightbox-container']")
    private WebElement loginPopOut;
    @FindBy(xpath = ".//tfoot/tr[3]/td[1]/span/a")
    private WebElement buyWitoutRegistration;

    public boolean loginPopOutIsAppeares() {
        return loginPopOut.isDisplayed();
    }

    public void makeOrdrWothoutRegistration() {
        buyWitoutRegistration.click();
    }
}
