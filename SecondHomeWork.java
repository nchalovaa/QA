package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondHomeWork {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

 @Test
    public void SearchElementsByCssSelector(){
        driver.findElement(By.cssSelector("[href*='books']"));
        driver.findElement(By.cssSelector("[href*='tricentis']"));
        driver.findElement(By.cssSelector("[href*='register']"));
        driver.findElement(By.cssSelector("[href*='jewelry']"));
        driver.findElement(By.cssSelector("[href='/cart']"));
        driver.findElement(By.cssSelector("[href='/login']"));
        driver.findElement(By.cssSelector("[href*='sitemap']"));
        driver.findElement(By.cssSelector("[href^='https://plus.google.com/+nopcommerce']"));
        driver.findElement(By.cssSelector("[href*='/customer']"));
        driver.findElement(By.cssSelector("[href$='/nopCommerce']"));



 }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
