package com.library.step_definitions;

import com.library.pages.LandingPage;
import com.library.pages.LoginPage;
import com.library.utils.ConfigurationReader;
import com.library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddBookStepDefinitions {
    LoginPage loginPage = new LoginPage();
    LandingPage landingPage = new LandingPage();

    @Given("log in as a Test Librarian")
    public void log_in_as_a_test_librarian() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
        loginPage.logIn();


    }


    @Then("Add Book header should be displayed.")
    public void add_book_header_should_be_displayed() {
        String expected = "Add Book";
        String actual = landingPage.getAddBookButtonText().trim();
        Assert.assertEquals("add book button is not displayed!",actual,expected);

    }


    @When("I click add book button")
    public void i_click_add_book_button() {
        landingPage.clickAddBookButton();

    }
    @When("I click on the close button on add book window")
    public void i_click_on_the_close_button_on_add_book_window() {

        landingPage.clickCloseButton();

    }
    @Then("I should be able to cancel or exit")
    public void i_should_be_able_to_cancel_or_exit() {
        landingPage.isCanceled();


    }


}
