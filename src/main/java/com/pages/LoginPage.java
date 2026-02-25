package com.pages;
import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    // Locators
    private final By userNameLocator = By.id("username");
    private final By passwordLocator = By.id("password");
    private final By loginButtonLocator = By.name("login");
    private final By alertMessageLocator = By.xpath("//ul[@role='alert']");
    private final By welcomeMessageLocator = By.xpath("(//strong)[1]");


    public void loginCredentials(String page){
        navigatePage(page);
    }

    public void signIn(String userName, String password){
        driver.findElement(userNameLocator).sendKeys(userName);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(loginButtonLocator).click();
    }

    public String isAlertDisplayed(){
        return driver.findElement(alertMessageLocator).getText();
    }

    public void clearText(){
        driver.findElement(userNameLocator).clear();
    }

    public String verifyWelcomeMessage(){
        return driver.findElement(welcomeMessageLocator).getText();
    }

}
