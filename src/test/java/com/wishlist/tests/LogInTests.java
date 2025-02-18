package com.wishlist.tests;

import com.wishlist.models.UserLogin;
import com.wishlist.pages.HomePage;
import com.wishlist.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.wishlist.fw.DataProviderClass;

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
                .verifySuccessIcon();
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


    @Test(dataProvider="loginNewUserFromCsvFile", dataProviderClass  = DataProviderClass.class)
    public void fillLogInFormFromDataProviderWithCsvFile(UserLogin user) {
        new LoginPage(driver)
                .enterPersonalData(user.getEmail(), user.getPassword())
                .clickOnLogInButton()
                .verifyErrorMessage("Error");
    }

    @Test(dataProvider="validLoginData", dataProviderClass  = DataProviderClass.class)
    public void fillLogInFormFromDataProviderWithCsvFileNEW(String validemail, String validPassword) {
        new LoginPage(driver)
                .enterPersonalData(validemail,validPassword)
                .clickOnLogInButton()
                .verifyErrorMessage("Error");
    }




//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}
