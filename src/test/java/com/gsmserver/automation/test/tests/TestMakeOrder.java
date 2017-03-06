package com.gsmserver.automation.test.tests;

import com.gsmserver.automation.test.pages.*;
import com.gsmserver.automation.test.pages.checkout.CheckoutConfirmation;
import com.gsmserver.automation.test.pages.checkout.CheckoutDelivery;
import com.gsmserver.automation.test.pages.checkout.CheckoutPayMent;
import com.gsmserver.automation.test.utils.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestMakeOrder extends TestBase {

    @Test
    public void Test_makePurchase() throws Exception {
        Home home = new Home(driver);
        home
                .openSite("https://gsmserver.com.ua/")
                .selectSectionFirmware()
                .selectCategoryDongle();
        Product product = new Product(driver);
        product
                .addPurchase()
                .clickOnButtonBasket();
        Cart cart = new Cart(driver);
        String namePurchase = cart.namePurchase();
        String NAME_PURCHASE = "CS-Tool Dongle";
        Assert.assertEquals(NAME_PURCHASE, namePurchase);
        cart
                .clickButtonMakeOrder();
        LoginPopOut loginPopOut = new LoginPopOut(driver);
        loginPopOut
                .makeOrderWithoutRegistration();
        CheckoutDelivery checkoutDelivery = new CheckoutDelivery(driver);
        checkoutDelivery
                .selectDeliveryMyself()
                .enterFirstName("Test BOB")
                .enterLastName("Test Borisov")
                .enterMiddleName("Test GREEN")
                .enterOrganizationName("Test MVD")
                .enterEmailAddress("test@gmail.com")
                .enterOrganizationId("Test 12214564321145645112")
                .enterPhoneNumber("232123123")
                .clickButtonNext();
        String idOrganization = checkoutDelivery.getId();
        String ORGANIZATION_ID = "Test 12214564321145645112";
        Assert.assertEquals(ORGANIZATION_ID, idOrganization);
        checkoutDelivery
                .selectDeliveryByCharkov()
                .clickButtonNext();
        CheckoutPayMent checkoutPayMent = new CheckoutPayMent(driver);
        checkoutPayMent
                .selectBeznalPayment()
                .clickButtonNext();
        CheckoutConfirmation checkoutConfirmation = new CheckoutConfirmation(driver);
        String nameOrganization = checkoutConfirmation.getNameOrganisation();
        String ORGANIZATION_NAME = "Test MVD";
        Assert.assertEquals(ORGANIZATION_NAME, nameOrganization);
    }
}
