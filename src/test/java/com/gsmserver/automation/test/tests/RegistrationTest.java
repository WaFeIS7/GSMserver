package com.gsmserver.automation.test.tests;

import com.gsmserver.automation.test.pages.Home;
import com.gsmserver.automation.test.pages.PopOut.LoginPopOut;
import com.gsmserver.automation.test.pages.PopOut.RegistrationPopOut;
import com.gsmserver.automation.test.utils.TestBase;
import org.testng.annotations.Test;

//Test
public class RegistrationTest extends TestBase {


    @Test
    public void registerUser() throws Exception {
        Home home = new Home(driver);
        home    .openHomePage("https://gsmserver.com.ua/")
                .clickOnButtonEnter();
        LoginPopOut loginPopOut = new LoginPopOut(driver);
        loginPopOut
                .clickTabRegistration();
        RegistrationPopOut registrationPopOut = new RegistrationPopOut(driver);
        registrationPopOut.enterName("Test_BLACK")
                          .enterLogin("Test_RED")
                          .enterEmail("SeleniumTesNG1941@gmail.com")
                          .enterPhoneNumber("232123123");
    }
}

