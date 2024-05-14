package com.wishlist.tests;

import com.wishlist.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    @Test
    public void clickOnAboutUsLinkTest() {
        new HomePage(driver).clickOnAboutUsLink().verifyAboutUs("О нас");
    }

    @Test
    public void clickOnLogInLink() {
        new HomePage(driver).clickOnLogInLink()
                .verifyLogInButton("Log In");
    }

    @Test
    public void clickOnSignUpLink() {
        new HomePage(driver).clickOnSignUpLink()
                .verifySignUpButton("Sign Up");
    }

    @Test
    public void clickOnCreateNewWishList() {
        new HomePage(driver)
                .clickOnButtonCreateNewWishList()
                .verifyLogInButton("Log In");
    }

    @Test
    public void clickOnIwantWishListButton() {
        new HomePage(driver)
                .clickIwantWishListButton()
                .verifyLogInButton("Log In");
    }

    @Test
    public void cliclOnPrivacyPolicyTest() {
        new HomePage(driver).clickOnPrivacyPolicyLink()
                .verifyPrivacyPolicy("PrivacyPolicy");
    }


}
