package com.qaautomation.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_browser extends main_class {


    public static  WebDriver driver = new ChromeDriver();


    
    public void browser(){

        driver.get("https://strangedna.com/");
        driver.manage().window().maximize();

        
      }
}
