package com.library.pages;


import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends  BasePage{



    @FindBy(id = "inputEmail")
    private WebElement usernameInput;

    @FindBy(id = "inputPassword")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[.='Sign in']")
    private WebElement signInButton;



    public void logIn(){
        usernameInput.sendKeys(ConfigurationReader.getProperty("lib22_user"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
        signInButton.click();


    }

}