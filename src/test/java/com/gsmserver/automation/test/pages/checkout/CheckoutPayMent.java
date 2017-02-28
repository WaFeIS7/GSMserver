package com.gsmserver.automation.test.pages.checkout;

import com.gsmserver.automation.test.utils.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPayMent extends WaitFor {
    public CheckoutPayMent(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//tr[@data-sm-target='checkout.payment-service--801044059'] //td[1]")
    private WebElement beznal;
    @FindBy(xpath = ".//a[@class='styled-link-checkout']")
    private WebElement buttonNext;

    public CheckoutPayMent selectBeznalPayment() {
        beznal.click();
        return this;
    }

    public void clickButtonNext() {
        buttonNext.click();
    }
}
