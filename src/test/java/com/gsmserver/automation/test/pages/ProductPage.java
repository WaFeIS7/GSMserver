package com.gsmserver.automation.test.pages;


import com.gsmserver.automation.test.utils.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends WaitFor {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='right-panel-content-wrapper']/ul/li[1]/div[2]/div[2]/div/div/a")
    private WebElement addToCart;
    @FindBy(xpath = ".//span[@class='in-cart']//a")
    private WebElement goToBasket;


    public ProductPage addToBasketPurchase() {
        waitforElemenIsDisplayed(addToCart).click();
        waitforElemenIsDisplayed(goToBasket).click();
        return this;
    }
}
