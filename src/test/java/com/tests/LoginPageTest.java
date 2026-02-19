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
        //basePage.navigatePage("Account");
        loginPage.signIn("b@gmail.com","1234567890");
        //loginPage.signIn("beginner_Framework@gmail.com","1234567890");
    }


    public void isLogoPresentTest(){
        Assert.assertTrue(loginPage.logoPresent(),"Logo not is displayed on the page");
    }

    @Test
    public void getPageTitleTest() throws InterruptedException {
        Assert.assertEquals(loginPage.getTitle(),"Account – AskOmDch","Error - Page title is not matching as expected" +loginPage.getTitle());
        isLogoPresentTest();
        verfyAlertMessage("Unknown email address. Check again or try your username.");


    }

    public void verfyAlertMessage(String message){
        Assert.assertEquals(loginPage.isAlertDisplayed(),message,"Error - Message is not matching as expected");

    }
}
