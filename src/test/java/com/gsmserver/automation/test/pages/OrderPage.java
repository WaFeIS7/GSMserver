package com.gsmserver.automation.test.pages;

import com.gsmserver.automation.test.utils.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends WaitFor {
    public OrderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//tbody // tr[3] // td[contains(text(),'Test MVD')]")
    private WebElement orginisationField;

    public String getNameOrganisations() {
        return waitforElemenIsDisplayed(orginisationField).getText();
    }
}
