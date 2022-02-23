package com.cucumber.pages;

import com.cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name = "USER_LOGIN")
   public WebElement loginBox;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordBox;

    @FindBy(className = "login-btn")
    public WebElement LogIn;


    public void login(String username, String password) {

        loginBox.sendKeys(username);
        passwordBox.sendKeys(password);
        LogIn.click();
    }
}