package com.library.pages;


import com.library.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends BasePage {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);

    @FindBy(xpath = "//*[.=' Add Book']")
    private WebElement addBookButton;

    @FindBy(xpath = "//*[.='Close']")
    private WebElement closeButton;

    public String getAddBookButtonText() {

        return addBookButton.getText();
    }

    public void clickAddBookButton() {

        wait.until(ExpectedConditions.elementToBeClickable(addBookButton)).click();
    }
    public void clickCloseButton() {
        wait.until(ExpectedConditions.elementToBeClickable(closeButton)).click();
    }

    public void isCanceled(){
        wait.until(ExpectedConditions.invisibilityOf(closeButton));

        Assert.assertFalse(closeButton.isDisplayed());

    }


}