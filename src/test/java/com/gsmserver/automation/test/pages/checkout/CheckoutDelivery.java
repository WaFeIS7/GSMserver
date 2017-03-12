package com.gsmserver.automation.test.pages.checkout;

import com.gsmserver.automation.test.utils.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class CheckoutDelivery extends WaitFor {
    public CheckoutDelivery(WebDriver driver) {
        super(driver);
    }

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
    @FindBy(xpath = ".//input[@name='address[organization]']")
    private WebElement textFieldOrganization;
    @FindBy(xpath = ".//input[@name='address[taxId]']")
    private WebElement textFieldId;
    @FindBy(xpath = ".//div[@class='address-block']//p[3]")
    private WebElement id;
    @FindBy(xpath = ".//tr[@data-sm-target='checkout.delivery-service---1410334793'] //td[1]")
    private WebElement deliveryCharkov;
    @FindBy(xpath = ".//a[@class='styled-link-checkout']")
    private WebElement buttonNext;
    @FindBy(how = How.CSS, css = ".styled-phone-edit > input")
    private WebElement textFieldPhone;



    public CheckoutDelivery selectDeliveryMyself() {
        deliveryMyself.click();
        return this;
    }

    public CheckoutDelivery enterFirstName(String firstName) {
        textFieldFirstName.sendKeys(firstName);
        return this;
    }

    public CheckoutDelivery enterLastName(String lastName) {
     textFieldLirstName.sendKeys(lastName);
        return this;
    }

    public CheckoutDelivery enterMiddleName(String middleName) {
     textFieldMiddleName.sendKeys(middleName);
        return this;
    }

    public CheckoutDelivery enterOrganizationName( String organizationName) {
         textFieldOrganization.sendKeys(organizationName);
        return this;
    }

    public CheckoutDelivery enterEmailAddress(String email) {
        textFieldEmailName.sendKeys(email);
        return this;
    }

    public CheckoutDelivery enterOrganizationId(String organizationId) {
        textFieldId.sendKeys(organizationId);
        return this;
    }

    public CheckoutDelivery enterPhoneNumber( String phoneNumber) {
        textFieldPhone.sendKeys(phoneNumber);
        return this;
    }

    public CheckoutDelivery clickButtonNext() {
        buttonNext.click();
        return this;
    }

    public String getId() {
        return id.getText();
    }

    public CheckoutDelivery selectDeliveryByCharkov() {
        deliveryCharkov.click();
        return this;
    }
}
