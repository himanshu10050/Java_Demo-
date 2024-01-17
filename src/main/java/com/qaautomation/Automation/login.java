package com.qaautomation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login extends open_browser {

	// public WebDriver driver = new ChromeDriver();

	public static void web_login() throws InterruptedException {
		Thread.sleep(10000);

		// driver.findElement(By.className("ctp-checkbox-label")).click();
		WebElement checkbox = driver.findElement(By.id("myCheckbox"));
		checkbox.click();
	}
}
