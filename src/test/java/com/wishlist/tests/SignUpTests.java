package com.wishlist.tests;

import com.wishlist.models.User;
import com.wishlist.pages.HomePage;
import com.wishlist.pages.SignUpPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class SignUpTests extends TestBase {
    @BeforeMethod
    public void precondition() {

        new HomePage(driver).clickOnSignUpLink();
    }

    @Test
    public void fillRegistratiónForm() {
        Random random = new Random();
        int i = random.nextInt(1000) + 1000;

        new SignUpPage(driver)
                .enterPersonalData("Lena", "Dudkina", "dudkina" + i + "@web.de", "Berlin2024!")
                .clickOnSignUpButtonRegistr()
                .verifySuccessButton("Log In");
    }

    @Test
    public void fillRegistrationFormtWithExistedEmailNegativeTest() {
        new SignUpPage(driver)
                .enterPersonalData("Lena", "Dudkina", "dudkina@web.de", "Berlin2024!")
                .clickOnSignUpButtonRegistr()
                .verifyErrorMessage("Error");
    }
//    @AfterMethod
//    public void postCondition(){
//        removeUser();
//    }

}
