package com.cydeo.test.day8_dropdown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractices {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/javascript_alerts");

    }
    @AfterMethod
    public void tearup(){
        driver.quit();
    }

    @Test
    public void confirmAlertTest(){
        WebElement jsConfirmbtn = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        jsConfirmbtn.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
        String expectedResult = "You clicked: Ok";
        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(expectedResult, actualResult, "you failed your test yo");
    }
    @Test
    public void promptAlertTest(){
        WebElement prompt= driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        prompt.click();
        Alert promptalert =driver.switchTo().alert();
        promptalert.sendKeys("hello");
        promptalert.accept();
        String expected="You entered: hello";
        String actual=driver.findElement(By.id("result")).getText();
        Assert.assertEquals(expected, actual, "big mistake my man");

    }
}
