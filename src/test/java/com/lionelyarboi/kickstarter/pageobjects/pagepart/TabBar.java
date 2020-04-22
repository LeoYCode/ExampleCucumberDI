package com.lionelyarboi.kickstarter.pageobjects.pagepart;

import com.lionelyarboi.kickstarter.pageobjects.BaseWaitPage;
import com.lionelyarboi.kickstarter.pageobjects.LoginSignUpPage;
import com.lionelyarboi.kickstarter.spring.PageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

@PageObject
public abstract class TabBar extends BaseWaitPage {

    @iOSXCUITFindBy(id = "Log in")
    private MobileElement profile;

    public LoginSignUpPage clickProfileButton() {
        profile.click();
        return new LoginSignUpPage();
    }
}
