package com.wishlist.tests;

import com.wishlist.pages.HomePage;
import org.testng.annotations.Test;

public class AboutUsTests extends TestBase {

    @Test
    public void clickOnAboutUsLinkTest() {
        new HomePage(driver).clickOnAboutUsLink().verifyAboutUs("О нас");


    }
}
