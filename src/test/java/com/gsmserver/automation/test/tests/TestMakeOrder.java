package com.gsmserver.automation.test.tests;

import com.gsmserver.automation.test.pages.*;
import com.gsmserver.automation.test.utils.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestMakeOrder extends TestBase {

    private final static String NAME_PURCHASE = "CS-Tool Dongle";
    private final static String ID = "Test12214564321145645112";
    private final static String ORGANIZATION = "Test MVD";


    @Test
    public void Test_makePurchase() throws Exception {
        HomePage homePage = new HomePage(driver);
        homePage
                .openSite("https://gsmserver.com.ua/")
                .selectSectionFirmware()
                .selectCategoryDongle();
        ProductPage productPage = new ProductPage(driver);
        productPage
                .addToBasketPurchase();
        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(NAME_PURCHASE, cartPage.namePurchase());
        cartPage
                .clickCheckout();
        LoginPopOutPage loginPopOutPage = new LoginPopOutPage(driver);
        Assert.assertTrue(loginPopOutPage.loginPopOutIsAppeares());
        loginPopOutPage
                .makeOrdrWothoutRegistration();
        DeliverPage deliverPage = new DeliverPage(driver);
        deliverPage
                .selectDeliveryMyself()
                .fillContacts()
                .goCheckout();
        Assert.assertEquals(ID, deliverPage.getId());
        deliverPage
                .selectDeliveryByCharkov()
                .goCheckout();
        PayMentPage payMentPage = new PayMentPage(driver);
        payMentPage
                .selectBeznalPayment()
                .goCheckout();
        OrderPage orderPage = new OrderPage(driver);
        Assert.assertEquals(ORGANIZATION, orderPage.getNameOrganisations());
    }
}
