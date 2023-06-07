package com.cydeo.test.day7_testNG_dropDown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractice {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    @Test
    public void alerttest(){
        WebElement jsAlertbtn = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        jsAlertbtn.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement text= driver.findElement(By.xpath("//p[@id='result']"));
        String actualtext = text.getText();
        String expected = "You successfully clicked an alert";
        Assert.assertEquals(actualtext, expected, "failed");
    }
}
