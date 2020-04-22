package com.lionelyarboi.kickstarter.pageobjects;

import com.lionelyarboi.kickstarter.pageobjects.BaseWaitPage;
import com.lionelyarboi.kickstarter.spring.PageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

@PageObject
public class LoginSignUpPage extends BaseWaitPage {

    @AndroidFindBy(id = "facebook_login_button")
    @iOSXCUITFindBy(id = "Log in with Facebook")
    private MobileElement logInWithFacebookButton;

    @AndroidFindBy(id = "login_button")
    @iOSXCUITFindBy(id = "Log in")
    private MobileElement logInButton;

    @AndroidFindBy(id = "sign_up_button")
    @iOSXCUITFindBy(id = "Sign up")
    private MobileElement signUpButton;

    public boolean isLogInWithFacebookButtonDisplayed() {
        return logInWithFacebookButton.isDisplayed();
    }

    public boolean isSignUpButtonDisplayed() {
        return signUpButton.isDisplayed();
    }

    public boolean isLogInButtonDisplayed() {
        return logInButton.isDisplayed();
    }

}
