package com.lionelyarboi.kickstarter.pageobjects;

import com.lionelyarboi.kickstarter.pageobjects.LoginSignUpPage;
import com.lionelyarboi.kickstarter.pageobjects.pagepart.TabBar;
import com.lionelyarboi.kickstarter.spring.PageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@PageObject
public class MagicTabPage extends TabBar {

    @AndroidFindBy(id = "login_tout_button")
    @iOSXCUITFindBy(id = "Sign up or Log in")
    public List <MobileElement> signUpOrLogIn;

    @Autowired
    private AppiumDriver driver;

    public void clickSignUpOrLoginButton() {
        signUpOrLogIn.get(0).click();
    }
}
