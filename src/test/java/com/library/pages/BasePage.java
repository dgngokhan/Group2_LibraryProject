package com.library.pages;


import com.library.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {



    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void navigateTo(String module) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        String moduleXpath = "//*[contains(text(),'"+module+"') and @class='title']";

        WebElement moduleElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(moduleXpath)));
        wait.until(ExpectedConditions.elementToBeClickable(moduleElement)).click();

    }

}