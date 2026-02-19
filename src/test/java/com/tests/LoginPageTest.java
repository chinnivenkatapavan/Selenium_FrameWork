package com.tests;

import com.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @BeforeMethod
    public void loginSetup(){
        loginPage.loginCredentials();
    }

    @Test
    public void isLogoPresentTest(){
        Assert.assertTrue(loginPage.logoPresent(),"Logo is not displayed on the page");
    }

    @Test
    public void getPageTitleTest(){
        Assert.assertEquals(loginPage.getTitle(),"Account-AskOmDch","Error - Page title is not matching as expected" +loginPage.getTitle());
    }
}
