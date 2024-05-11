package com.wishlist.tests;

import com.wishlist.pages.HomePage;
import com.wishlist.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickOnLogInLink();
    }

    @Test
    public void fillLogInForm() {
        new LoginPage(driver)
                .enterPersonalData("dudkina@web.de", "Berlin2024!")
                .clickOnLogInButton()
                .verifySuccessLogInButton("Welcome!");
    }

    @Test
    public void loginNegativeTestWithoutEmail() {
         new LoginPage(driver)
                .enterPersonalData("", "Berlin2024!")
                .clickOnLogInButton()
                .verifyAlertPresent();

        //Assert.assertTrue(isWarningPresent, "Warning message is not present on the page");

    }
//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }


}
