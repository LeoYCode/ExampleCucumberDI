package com.lionelyarboi.kickstarter.pageobjects;

import com.lionelyarboi.kickstarter.pageobjects.pagepart.TabBar;
import com.lionelyarboi.kickstarter.spring.PageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;

import java.util.List;

@PageObject
public class MagicTabPage extends TabBar {

    @AndroidFindBy(id = "login_tout_button")
    @iOSXCUITFindBy(id = "Sign up or Log in")
    public List <MobileElement> signUpOrLogIn;

    public LoginSignUpPage clickSignUpOrLoginButton() {
        try{
            signUpOrLogIn.get(2).click();
        }catch (IndexOutOfBoundsException e ) {
            signUpOrLogIn.get(0).click();
        }
        return new LoginSignUpPage();
    }
}
