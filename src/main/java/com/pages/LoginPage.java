package com.pages;
import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public void loginCredentials(){
        navigatePage("Account");
    }

    public void signIn(String userName, String password){
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.name("login")).click();
    }

    public String isAlertDisplayed(){
        return driver.findElement(By.xpath("//ul[@role='alert']")).getText();
    }

}
