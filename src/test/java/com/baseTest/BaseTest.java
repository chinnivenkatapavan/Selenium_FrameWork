package com.baseTest;

import com.base.BasePage;
import com.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    public BasePage basePage;
    public LoginPage loginPage;


    @BeforeMethod
    public void beforeTest() throws InterruptedException {
        basePage = new BasePage();
        loginPage = new LoginPage();
        basePage.setDriver("edge","https://askomdch.com/");
        basePage.launchBrowser();
        Thread.sleep(3000);

    }

   @AfterMethod
    public void closeBrowser(){
        basePage.driverQuit();
    }
}
