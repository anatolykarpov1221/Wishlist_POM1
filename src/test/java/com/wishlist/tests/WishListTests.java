package com.wishlist.tests;

import com.wishlist.pages.HomePage;
import com.wishlist.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WishListTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickOnLogInLink();
        new LoginPage(driver)
                .enterPersonalData("dudkina@web.de", "Berlin2024!")
                .clickOnLogInButton()
                .clickOnHomeLink();
    }

    @Test
    public void clickOnCreateNewWishList() {
        new HomePage(driver)
                .clickOnButtonCreateNewWishList()
                .verifySaveButton("Save");
    }

    @Test
    public void clickOnIwantWishListButton() {
        new HomePage(driver)
                .clickIwantWishListButton()
                .verifySaveButton("Save");

    }
}
