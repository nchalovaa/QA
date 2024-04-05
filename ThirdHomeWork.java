package com.ait.qa34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ThirdHomeWork {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void FindElementByXPath() {

        driver.findElement(By.xpath("//*[contains(.,'books')]"));
        driver.findElement(By.xpath("//*[contains(.,'Tricentis')]"));
        driver.findElement(By.xpath("//*[contains(.,'Register')]"));
        driver.findElement(By.xpath("//*[contains(.,'jewelry')]"));
        driver.findElement(By.xpath("//*[contains(.,'Shopping cart')]"));
        driver.findElement(By.xpath("//*[@class='ico-login']")); //*[@class='input-container']
        driver.findElement(By.xpath("//*[contains(.,'Sitemap')]"));
        driver.findElement(By.xpath("//*[contains(.,'Google+')]"));
        driver.findElement(By.xpath("//*[contains(.,'Customer')]"));
        driver.findElement(By.xpath("//*[contains(.,'Twitter')]"));

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
