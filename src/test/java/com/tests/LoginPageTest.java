package com.tests;

import com.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @BeforeMethod
    public void loginSetup(){
        loginPage.loginCredentials("Account");

    }

    @Test
    public void verifyLoginCredentialsWrong() throws InterruptedException {
        getPageTitleTest();
        isLogoPresentTest();
        //WrongBothUsernameAndPassword
        loginPage.signIn("b@gmail.com","1234567890");
        verifyAlertMessage("Unknown email address. Check again or try your username.");
        loginPage.clearText();
        Thread.sleep(2000);

        //WrongUserName
        loginPage.signIn("beginner_Framework@gmail.com","12354658910");
        verifyAlertMessage("Error: The password you entered for the email address beginner_Framework@gmail.com is incorrect. Lost your password?");
        loginPage.clearText();
        Thread.sleep(2000);

        //CorrectCredentials
        loginPage.signIn("beginner_Framework@gmail.com","1234567890");
        Thread.sleep(2000);
        verifyWelcomeMessageTest();

    }

    public void isLogoPresentTest(){
        Assert.assertTrue(loginPage.logoPresent(),"Logo not is displayed on the page");
    }

    public void getPageTitleTest(){
        Assert.assertEquals(loginPage.getTitle(),"Account – AskOmDch","Error - Page title is not matching as expected" +loginPage.getTitle());
    }

    public void verifyAlertMessage(String message){
        Assert.assertEquals(loginPage.isAlertDisplayed(),message,"Error - Message is not matching as expected");
    }

    public void verifyWelcomeMessageTest(){
        Assert.assertEquals(loginPage.verifyWelcomeMessage(),"Beginner","Error - Page title is not matching as expected" +loginPage.verifyWelcomeMessage());
    }

}
