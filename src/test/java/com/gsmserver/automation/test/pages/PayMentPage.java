package com.gsmserver.automation.test.pages;

import com.gsmserver.automation.test.utils.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayMentPage extends WaitFor {
    public PayMentPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//tr[@data-sm-target='checkout.payment-service--801044059'] //td[1]")
    private WebElement beznal;
    @FindBy(xpath = ".//a[@class='styled-link-checkout']")
    private WebElement goCheckout;

    public PayMentPage selectBeznalPayment() {
        beznal.click();
        return this;
    }

    public void goCheckout() {
        goCheckout.click();
    }
}
