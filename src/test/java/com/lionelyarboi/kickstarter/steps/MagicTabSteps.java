package com.lionelyarboi.kickstarter.steps;

import com.lionelyarboi.kickstarter.pageobjects.LoginSignUpPage;
import com.lionelyarboi.kickstarter.pageobjects.MagicTabPage;
import io.cucumber.java8.En;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;

public class MagicTabSteps implements En {

    @Autowired
    private MagicTabPage magicTabPage;

    @Autowired
    private LoginSignUpPage loginSignUpPage;

    public MagicTabSteps() {
        Given("^I tap Sign up or Log In button$", () -> {
            magicTabPage.clickSignUpOrLoginButton();
        });

        Then("^I should see Login in Sign Up buttons$", () -> {
            assertTrue(loginSignUpPage.isLogInWithFacebookButtonDisplayed());
            assertTrue(loginSignUpPage.isSignUpButtonDisplayed());
            assertTrue(loginSignUpPage.isLogInButtonDisplayed());
        });
    }
}
