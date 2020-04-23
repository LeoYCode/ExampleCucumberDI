package com.lionelyarboi.kickstarter.support;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;

public class Hooks {

    @Autowired
    private AppiumServer server;

    @Autowired
    private MobileDriverFactory mobileDriverFactory;

    @After
    public void tearDown(Scenario scenario) {
        takeScreenShot(scenario);
        server.stopService();
    }

    private void takeScreenShot(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) mobileDriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png",scenario.getName());
        }
    }
}
