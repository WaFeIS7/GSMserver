package com.gsmserver.automation.test.pages;


import com.gsmserver.automation.test.utils.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Product extends WaitFor {
    public Product(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//span[@class='in-cart']//a")
    private WebElement goToBasket;
    @FindBy(how = How.CSS, css = "ul > li:nth-child(1) > div > div[class='bottom'] > div > div> a")
    private WebElement buttotAddPurchase;

    public Product addPurchase() {
        buttotAddPurchase.click();
        return this;
    }

    public Product clickOnButtonBasket() {
        waitforElemenIsDisplayed(goToBasket).click();
        return this;
    }
}
