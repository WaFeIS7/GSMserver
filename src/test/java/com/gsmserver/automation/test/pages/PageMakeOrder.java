package com.gsmserver.automation.test.pages;


import com.gsmserver.automation.test.utils.WaitFor;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class PageMakeOrder extends WaitFor {
    public PageMakeOrder(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='main-menu']//td[1]")
    private WebElement firstcatagory;
    @FindBy(xpath = "//a[contains(text(), 'Донглы')]")
    private WebElement categoryDongle;
    @FindBy(xpath = ".//*[@id='right-panel-content-wrapper']/ul/li[1]/div[2]/div[2]/div/div/a")
    private WebElement addToCart;
    @FindBy(xpath = ".//span[@class='in-cart']//a")
    private WebElement goToBasket;
    @FindBy(xpath = ".//div[@class='product-title shade'] // a[contains(text(),'CS-Tool Dongle')]")
    private WebElement namePurchase;
    @FindBy(xpath = ".//div[@class='ui-lightbox-container']")
    private WebElement loginPopOut;
    @FindBy(id = "goto-checkout")
    private WebElement buttomCheckout;
    @FindBy(xpath = ".//tfoot/tr[3]/td[1]/span/a")
    private WebElement buyWitoutRegistration;
    @FindBy(xpath = ".//label[contains(text(),'Самовывоз')] ")
    private WebElement deliveryMyself;
    @FindBy(xpath = ".//input[@name='address[firstName]']")
    private WebElement textFieldFirstName;
    @FindBy(xpath = ".//input[@name='address[lastName]']")
    private WebElement textFieldLirstName;
    @FindBy(xpath = ".//input[@name='address[middleName]']")
    private WebElement textFieldMiddleName;
    @FindBy(xpath = ".//input[@name='address[email]']")
    private WebElement textFieldEmailName;
    @FindBy(xpath = ".//*[@id='content-wrapper']/div/div/div[3]/div/div[1]/form/div[2]/div[2]/label/div/a")
    private WebElement buttonSelectCodeCountry;
    @FindBy(xpath = ".//*[@id='content-wrapper']/div/div/div[3]/div/div[1]/form/div[2]/div[2]/label/div/ul/li[222]")
    private WebElement ukraineCode;
    @FindBy(xpath = ".//*[@id='content-wrapper']/div/div/div[3]/div/div[1]/form/div[2]/div[2]/label/div/div/input")
    private WebElement textFieldPhone;
    @FindBy(xpath = ".//input[@name='address[organization]']")
    private WebElement textFieldOrganization;
    @FindBy(xpath = ".//input[@name='address[taxId]']")
    private WebElement textFieldId;
    @FindBy(xpath = ".//div[@class='address-block']//p[3]")
    private WebElement id;
    @FindBy(xpath = ".//tr[@data-sm-target='checkout.delivery-service---1410334793'] //td[1]")
    private WebElement deliveryCharkov;
    @FindBy(xpath = ".//tr[@data-sm-target='checkout.payment-service--801044059'] //td[1]")
    private WebElement beznal;
    @FindBy(xpath = ".//tbody // tr[3] // td[contains(text(),'Test MVD')]")
    private WebElement orginisationField;
    @FindBy(xpath = ".//a[@class='styled-link-checkout']")
    private WebElement goCheckout;

    public PageMakeOrder openSite() {
        driver.get("https://gsmserver.com.ua/");
        return this;
    }

    public void selectSectionFirmware() {
        firstcatagory.click();
    }

    public void selectCategoryDongle() {
        waitforElemenIsDisplayed(categoryDongle).click();
    }

    public void addToBasketPurchase() {
        waitforElemenIsDisplayed(addToCart).click();
        waitforElemenIsDisplayed(goToBasket).click();
    }

    public String namePurchase() {
        return namePurchase.getText();
    }

    public boolean loginPopOutIsDisplayed() {
        return loginPopOut.isDisplayed();
    }

    public void clickCheckout() {
        buttomCheckout.click();
    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");
    }

    public void buyWithoutRegistration() {
        buyWitoutRegistration.click();
    }

    public void selectDeliveryMyself() {
        deliveryMyself.click();
    }


    public void fillContacts() {
        textFieldFirstName.sendKeys("Test Bob");
        textFieldLirstName.sendKeys("Test Borisov");
        textFieldMiddleName.sendKeys("Test GREEN");
        textFieldEmailName.sendKeys("test@gmail.com");
        textFieldOrganization.sendKeys("Test MVD");
        textFieldId.sendKeys("Test12214564321145645112");
        enterPhone();
    }

    private void enterPhone() {
        buttonSelectCodeCountry.click();
        ukraineCode.click();
        String script1 = "arguments[0].setAttribute('value', '232123123');";
        ((JavascriptExecutor) driver).executeScript(script1, textFieldPhone);
    }

    public String getId() {
        return id.getText();
    }

    public void selectDeliveryByCharkov() {
        deliveryCharkov.click();
    }

    public void selectBeznalPayment() {
        beznal.click();
    }

    public void goCheckout() {
        goCheckout.click();
    }

    public String getNameOrganisations() {
        return orginisationField.getText();
    }
}

