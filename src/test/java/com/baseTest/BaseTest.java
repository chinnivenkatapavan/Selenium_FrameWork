package com.baseTest;

import com.base.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

    @Test
    public void beforeTest() throws InterruptedException {
        BasePage basePage = new BasePage("edge","https://askomdch.com/");
        basePage.launchBrowser();
        Assert.assertTrue(basePage.logoPresent(),"Logo is displayed on the page");
        basePage.navigatePage("Account");
    }
}
