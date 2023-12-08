package com.qaautomation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class login extends open_browser  {


	    // public  WebDriver driver = new ChromeDriver();

    public static void web_login (){

    WebElement ele =   driver.findElement(By.className("loginmeet"));

//Creating object of an Actions class
		Actions action = new Actions(driver);

//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

      driver.findElement(By.className("asdfs")).click();

	     driver.findElement(By.id("exampleInputEmail1")).clear();
      driver.findElement(By.id("exampleInputEmail1")).sendKeys("admin@gmail.com");


      driver.findElement(By.id("exampleInputPassword1")).clear();
      driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
      driver.findElement(By.className("loginlinkpart")).click();

	 WebElement logout= driver.findElement(By.id("navbarDropdown"));

	 if (logout.isDisplayed()==true) {
		System.out.println("Login Successfully");
		
	 }
	 else{
		System.out.println("Please verify the creditinals");
	 }

    driver.findElement(By.className("fa-solid fa-store iconpass")).click();;
	driver.findElement(By.className("oneuserO")).click();;

	}
}
