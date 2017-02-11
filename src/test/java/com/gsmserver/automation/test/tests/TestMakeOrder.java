package com.gsmserver.automation.test.tests;

import com.gsmserver.automation.test.pages.PageMakeOrder;
import com.gsmserver.automation.test.utils.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestMakeOrder extends TestBase {

    private PageMakeOrder pageMakeOrder;
    private final static String NAME_PURCHASE = "CS-Tool Dongle";
    private final static String ID = "Test12214564321145645112";
    private final static String ORGANIZATION = "Test MVD";

    @BeforeClass
    public void doOnceBeforeClass() {
        pageMakeOrder = new PageMakeOrder(driver);
    }

    @Test
    public void Test_001_openHomePageSite() throws Exception {
        pageMakeOrder.openSite();
        Assert.assertTrue(driver.getCurrentUrl()
                .startsWith("https://gsmserver"));
    }

    @Test
    public void Test_002_selectSectionChooseDongleCategory() throws Exception {
        pageMakeOrder.selectSectionFirmware();
        pageMakeOrder.selectCategoryDongle();
        Assert.assertTrue(driver.getCurrentUrl()
                .endsWith("/dongle/"));
    }

    @Test
    public void Test_003_addPurchaseToCard() throws Exception {
        pageMakeOrder.addToBasketPurchase();
        Assert.assertTrue(driver.getCurrentUrl()
                .endsWith("/cart/"));
        Assert.assertEquals(NAME_PURCHASE,
                pageMakeOrder.namePurchase());
    }

    @Test
    public void Test_004_orderPurchaseWithoutRegistration() {
        pageMakeOrder.clickCheckout();
        Assert.assertTrue(pageMakeOrder
                .loginPopOutIsDisplayed());
        pageMakeOrder.buyWithoutRegistration();
    }

    @Test
    public void Test_005_chooseTypeOfDelivery() {
        Assert.assertTrue(driver.getCurrentUrl()
                .endsWith("/checkout/"));
        pageMakeOrder.selectDeliveryMyself();
    }

    @Test
    public void Test_006_fillContactsInFormToMakeOrder() throws Exception {
        pageMakeOrder.fillContacts();
        Assert.assertTrue(driver.getCurrentUrl()
                .endsWith("/checkout/"));
        pageMakeOrder.goCheckout();
    }

    @Test
    public void Test_007_selectDelivery() throws Exception {
        Assert.assertEquals(ID,
                pageMakeOrder.getId(), "Verify that we have the same id which entered earlier");
        pageMakeOrder.selectDeliveryByCharkov();
        pageMakeOrder.goCheckout();
    }

    @Test
    public void Test_008_wireTransfer() throws Exception {
        pageMakeOrder.selectBeznalPayment();
        pageMakeOrder.goCheckout();
        Assert.assertEquals(ORGANIZATION,
                pageMakeOrder.getNameOrganisations());
    }
}
