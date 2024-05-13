package com.wishlist.tests;

import com.wishlist.models.UserLogin;
import com.wishlist.pages.HomePage;
import com.wishlist.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
    public void loginWithoutEmailNegativeTest() {
         new LoginPage(driver)
                .enterPersonalData("", "Berlin2024!")
                .clickOnLogInButton()
                .verifyErrorMessage("Error");
    }
    @Test
    public void loginWithoutPasswordNegativeTest() {
        new LoginPage(driver)
                .enterPersonalData("dudkina@web.de", "")
                .clickOnLogInButton()
                .verifyErrorMessage("Error");
    }


    @Test(dataProvider="loginNewUserFromCsvFile", dataProviderClass  = DataProvider.class)
    public void fillLogInFormFromDataProviderWithCsvFile(UserLogin user) {
        new LoginPage(driver)
                .enterPersonalData(user.getEmail(), user.getPassword())
                .clickOnLogInButton()
                .verifySuccessLogInButton("Welcome!");
    }



//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}
