package com.wishlist.tests;

import com.wishlist.pages.HomePage;
import com.wishlist.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.openqa.selenium.devtools.v122.debugger.Debugger.pause;

public class WishListTests extends TestBase {
  //  WebDriver driver; Убрать отсюда он в BASE

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).clickOnLogInLink();
        new LoginPage(driver)
                .enterPersonalData("dudkina@web.de", "Berlin2024!")
                .clickOnLogInButton();
    }

    @Test
    public void clickOnCreatWishListInAccount() throws InterruptedException {
        new LoginPage(driver)
                .clickOnCreateWishList()
                .inputNameWishlist("Birthday")
                .inputComment("Скоро у меня день рождения")
                .inputEventDate("08202024");
        Thread.sleep(1500);

        new LoginPage(driver)
                .clickOnSaveButton()
                .verifyElement("My WishList:");


    }


    @Test(enabled = false)
    public void clickOnCreateNewWishList() {
        new HomePage(driver)
                .clickOnButtonCreateNewWishList()
                .verifySaveButton("Save");
    }

    @Test(enabled = false)
    public void clickOnIwantWishListButton() {
        new HomePage(driver)
                .clickIwantWishListButton()
                .verifySaveButton("Save");

     }
}
