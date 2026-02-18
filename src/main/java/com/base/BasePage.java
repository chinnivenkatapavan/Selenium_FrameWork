package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
    private WebDriver driver;
    private String browser;
    private String baseURL;

   public BasePage(String browser, String baseURL) {

        this.browser = browser;
        this.baseURL = baseURL;
    }

    //Launching Browser
    public void launchBrowser(){

        switch (browser.toString().toLowerCase()) {

            case "chrome":
                driver = new ChromeDriver();
                driver.get(baseURL);
                driver.manage().window().maximize();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                driver.get(baseURL);
                driver.manage().window().maximize();
                break;

            case "edge":
                driver = new EdgeDriver();
                driver.get(baseURL);
                driver.manage().window().maximize();
                break;

            default:
                throw new InvalidArgumentException("Unrecognized Driver");
        }
    }



    //Killing the browser
    public void driverQuit(){
        driver.quit();
    }

    //Header
    public void navigatePage(String page){
       driver.findElement(By.xpath("(//a[@class='menu-link' and text()='"+page+"'])[1]")).click();

    }

    //Logo
    public boolean logoPresent(){
       return driver.findElement(By.xpath("(//a[@itemprop=\"url\"])[1]")).isDisplayed();


   }

    //verifying title

    //currentURL


}
