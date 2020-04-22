package com.lionelyarboi.kickstarter.support;

import io.cucumber.java.After;
import org.springframework.beans.factory.annotation.Autowired;

public class Hooks {

    @Autowired
    private AppiumServer server;

    @Autowired
    private MobileDriverFactory mobileDriverFactory;

    @After
    public void tearDown() {
        server.stopService();
    }
}
