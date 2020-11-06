package com.library.step_definitions;

import com.library.pages.BasePage;
import com.library.pages.LandingPage;
import io.cucumber.java.en.When;

public class CommonStepDefinitions {
    BasePage basePage = new LandingPage();

    @When("user navigates to {string} module")
    public void user_navigates_to_module(String string) {
       basePage.navigateTo(string);
    }

}
