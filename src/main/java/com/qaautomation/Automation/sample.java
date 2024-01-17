package com.qaautomation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://test.socialduplicator.net/login");
        driver.manage().window().maximize();

        Thread.sleep(20000);

        // driver.findElement(By.className("ctp-checkbox-label")).click();
        // WebElement checkbox =
        // driver.findElement(By.className("ctp-checkbox-container"));
        // WebElement checkbox =
        // driver.findElement(By.xpath("//input[@type='checkbox']"));

        // WebDriverWait wait = new WebDriverWait(driver, 10);
        // WebElement element = wait
        // .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='myCheckbox']")));
        WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));

        checkbox.click();

    }
}
