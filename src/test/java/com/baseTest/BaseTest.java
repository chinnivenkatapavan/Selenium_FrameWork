package com.baseTest;

import com.base.BasePage;
import com.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseTest {

    public BasePage basePage;
    public LoginPage loginPage;


    @BeforeMethod
    public void beforeTest() throws InterruptedException {
        basePage = new BasePage();
        basePage.setDriver("chrome","https://askomdch.com/");
        basePage.launchBrowser();
        Thread.sleep(3000);

    }

    @AfterMethod
    public void closeBrowser(){
        basePage.driverQuit();
    }
}
