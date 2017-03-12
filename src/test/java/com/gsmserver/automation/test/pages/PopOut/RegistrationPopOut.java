package com.gsmserver.automation.test.pages.PopOut;

import com.gsmserver.automation.test.utils.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPopOut extends WaitFor {

    public RegistrationPopOut(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name='signup[firstName]']")
    private WebElement textFieldName;
    @FindBy(css = "input[name='signup[username]']")
    private WebElement textFieldLogin;
    @FindBy(css = "input[name='signup[email]']")
    private WebElement textFieldEmail;
    @FindBy(css = ".styled-phone-edit > input")
    private WebElement textFieldPhone;

    public RegistrationPopOut enterName(String name) {
         textFieldName.sendKeys(name);
         return this;
    }

    public RegistrationPopOut enterLogin(String login) {
        textFieldLogin.sendKeys(login);
        return this;
    }

    public RegistrationPopOut enterEmail(String email) {
        textFieldEmail.sendKeys(email);
        return this;
    }

    public RegistrationPopOut enterPhoneNumber(String number) {
        textFieldPhone.sendKeys(number);
        return this;
    }
}
