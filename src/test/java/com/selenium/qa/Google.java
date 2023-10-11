package com.selenium.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new  ChromeDriver();
        driver.get("https://www.bestbuy.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.className("bottom-left-links ")).click();




    }
}












