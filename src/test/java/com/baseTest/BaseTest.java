package com.baseTest;

import com.base.BasePage;
import com.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

    public LoginPage loginPage;


    @BeforeMethod
    public void beforeTest() throws InterruptedException {

        loginPage = new LoginPage();
        loginPage.setDriver("edge","https://askomdch.com/");
        loginPage.launchBrowser();
        Thread.sleep(3000);

    }

   @AfterMethod
    public void closeBrowser(){
        loginPage.driverQuit();
    }
}
