package com.gsmserver.automation.test.pages.checkout;

import com.gsmserver.automation.test.utils.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckoutConfirmation extends WaitFor {
    public CheckoutConfirmation(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, css = ".information-delivery-wrapper tbody>tr:nth-child(3) td:nth-child(2)")
    private WebElement nameOfOrganization;

    public String getNameOrganisation() {
        return nameOfOrganization.getText();
    }
}
