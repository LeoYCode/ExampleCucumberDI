package com.lionelyarboi.kickstarter.pageobjects;

import com.lionelyarboi.kickstarter.support.MobileDriverFactory;
//import com.lionelyarboi.kickstarter.support.MobileDrivers;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseWaitPage {

    @Autowired
    private WebDriverWait mobileDriverWait;

    protected void waitForElementToAppear(MobileElement locator) {
        mobileDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void waitForElementToDisappear(MobileElement locator) {
        mobileDriverWait.until(ExpectedConditions.invisibilityOf(locator));
    }
}
