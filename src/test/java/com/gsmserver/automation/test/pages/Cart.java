package com.gsmserver.automation.test.pages;

import com.gsmserver.automation.test.utils.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Cart extends WaitFor {
    public Cart(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//div[@class='product-title shade'] // a[contains(text(),'CS-Tool Dongle')]")
    private WebElement namePurchase;
    @FindBy(id = "goto-checkout")
    private WebElement buttonMakeOrder;

    public String namePurchase() {
        return namePurchase.getText();
    }

    public void clickButtonMakeOrder() {
        buttonMakeOrder.click();
    }
}
