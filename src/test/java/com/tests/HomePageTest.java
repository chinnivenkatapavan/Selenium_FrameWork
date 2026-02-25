package com.tests;

import com.baseTest.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePage() throws InterruptedException {
        loginPage.navigatePage("Account");
        loginPage.signIn("beginner_Framework@gmail.com","1234567890");
        loginPage.navigatePage("Home");
        Thread.sleep(5000);
    }
}
