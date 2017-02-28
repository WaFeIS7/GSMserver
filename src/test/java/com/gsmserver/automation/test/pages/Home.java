package com.gsmserver.automation.test.pages;

import com.gsmserver.automation.test.utils.WaitFor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends WaitFor {
    public Home(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@id='main-menu']//td[1]")
    private WebElement firstcatagory;
    @FindBy(xpath = "//a[contains(text(), 'Донглы')]")
    private WebElement categoryDongle;

    public Home openSite(String url) {
        driver.get(url);
        return this;
    }

    public Home selectSectionFirmware() {
        firstcatagory.click();
        return this;
    }

    public Home selectCategoryDongle() {
        waitforElemenIsDisplayed(categoryDongle).click();
        return this;
    }
}
