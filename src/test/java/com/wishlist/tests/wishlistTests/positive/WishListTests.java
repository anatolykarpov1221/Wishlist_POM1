package com.wishlist.tests.wishlistTests.positive;

import com.wishlist.pages.HomePage;
import com.wishlist.pages.LoginPage;
import com.wishlist.tests.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WishListTests extends TestBase {
    WebDriver driver;

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
