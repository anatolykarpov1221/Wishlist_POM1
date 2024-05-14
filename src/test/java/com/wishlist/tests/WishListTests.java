package com.wishlist.tests;

import com.wishlist.pages.HomePage;
import com.wishlist.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WishListTests extends TestBase {
    WebDriver driver;

    @Test
    public void precondition() {
        new HomePage(driver).clickOnLogInLink();
        new LoginPage(driver)
                .enterPersonalData("dudkina@web.de", "Berlin2024!")
                .clickOnLogInButton();
    }

    @Test
    public void clickOnCreatWishListInAccount() {
        new LoginPage(driver)
                .clickOnCreateWishList()
                .inputNameWishlist("Birthday")
                .inputComment("Скоро у меня день рождения")
                .inputEventDate("08202024")
                .clickOnSaveButton()
                .verifyElement("My WishList:");


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
