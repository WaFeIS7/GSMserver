package com.gsmserver.automation.test.pages;

import com.gsmserver.automation.test.utils.WaitFor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DeliverPage extends WaitFor {
    public DeliverPage(WebDriver driver) {
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
    @FindBy(xpath = ".//a[@class='styled-link-checkout']")
    private WebElement goCheckout;

    public DeliverPage selectDeliveryMyself() {
        deliveryMyself.click();
        return this;
    }

    public DeliverPage fillContacts() {
        textFieldFirstName.sendKeys("Test Bob");
        textFieldLirstName.sendKeys("Test Borisov");
        textFieldMiddleName.sendKeys("Test GREEN");
        textFieldEmailName.sendKeys("test@gmail.com");
        textFieldOrganization.sendKeys("Test MVD");
        textFieldId.sendKeys("Test12214564321145645112");
        enterPhone();
        return this;
    }

    private void enterPhone() {
        buttonSelectCodeCountry.click();
        ukraineCode.click();
        String script1 = "arguments[0].setAttribute('value', '232123123');";
        ((JavascriptExecutor) driver).executeScript(script1, textFieldPhone);
    }

    public DeliverPage goCheckout() {
        goCheckout.click();
        return this;
    }

    public String getId() {
        return id.getText();
    }

    public DeliverPage selectDeliveryByCharkov() {
        deliveryCharkov.click();
        return this;
    }
}
