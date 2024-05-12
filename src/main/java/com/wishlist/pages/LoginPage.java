package com.wishlist.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    WebElement useremail;
    @FindBy(id = "password")
    WebElement userpassword;

    public LoginPage enterPersonalData(String email, String password) {
        type(useremail, email);
        type(userpassword, password);
        return this;
    }

    @FindBy(xpath = "//button[.='Log In']")
    WebElement logInButton;

    public LoginPage clickOnLogInButton() {
        click(logInButton);
        return this;
    }

    @FindBy(css = ".welcome-message")
    WebElement verifyButton;

    public LoginPage verifySuccessLogInButton(String text) {
        Assert.assertTrue(verifyButton.getText().contains(text));
        return this;
    }

    @FindBy(css = ".home-button")
    WebElement buttonHome;

    public LoginPage clickOnHomeLink() {
        click(buttonHome);
        return new LoginPage(driver);
    }
    @FindBy(css = ".error-message")
    WebElement error;
    public LoginPage verifyErrorMessage(String text) {
        Assert.assertTrue(error.getText().contains(text));
        return this;
    }
}
