package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedText = "PRODUCTS";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals("Unsuccessful Login", expectedText, actualText);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        int expectedItems = 6;
        int actualItems =loginPage.getItemQuantity();
        Assert.assertEquals("6 items Not displayed", expectedItems, actualItems);
    }
}
