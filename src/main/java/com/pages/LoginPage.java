package com.pages;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    WebDriver baseDriver;


    public void loginCredentials(){
        navigatePage("Account");

    }



}
