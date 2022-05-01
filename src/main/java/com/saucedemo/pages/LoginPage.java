package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userName1 = By.id("user-name");
    By password1 = By.name("password");
    By loginButton = By.id("login-button");
    By welcomeText = By.tagName("span");
    By itemQuantity=By.className("inventory_item");

    public void enterUserName(String userName){
        sendTextToElement(userName1,userName);
    }
    public void enterPassword(String password){
        sendTextToElement(password1,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public int getItemQuantity(){
        return sizeOfListWebElement(itemQuantity);
    }
}
