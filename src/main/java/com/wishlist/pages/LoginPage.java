package com.wishlist.pages;

import org.openqa.selenium.Keys;
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

    @FindBy(css = ".user-icon")
    WebElement userIcon;

    public LoginPage verifySuccessIcon() {
        Assert.assertTrue(isElementPresent(userIcon));
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

    @FindBy(css = ".create-wishlist-button")
    WebElement wishlistButton;

    public LoginPage clickOnCreateWishList() {
        click(wishlistButton);
        return this;
    }

    @FindBy(id = "wishlist-name")
    WebElement name;

    public LoginPage inputNameWishlist(String title) {
        type(name, title);
        return this;
    }

    @FindBy(id = "comment")
    WebElement comments;

    public LoginPage inputComment(String comment) {
        type(comments, comment);
        return this;
    }

    @FindBy(id = "event-date")
    WebElement eventdate;

    public LoginPage inputEventDate(String date) {
        click(eventdate);
        String os = System.getProperty("os.name");
        System.out.println("My OS is " + os);
        if (os.startsWith("Mac")) {
            eventdate.sendKeys(Keys.COMMAND, "a");
        } else {
            eventdate.sendKeys(Keys.CONTROL, "a");
        }

        eventdate.sendKeys(date);
        eventdate.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(css = ".save-button-custom")
    WebElement savebutton;

    public LoginPage clickOnSaveButton() {
        click(savebutton);
        return this;
    }

    @FindBy(xpath = "//span['my-wishlists']")
    WebElement mywishlists;

    public LoginPage verifyElement(String text) {
        Assert.assertTrue(mywishlists.getText().contains(text));
        return this;
    }
}
