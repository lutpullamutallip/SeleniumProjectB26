package com.cydeo.test.day7_testNG_dropDown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_SimpleDropdowns {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @AfterMethod
    public void tearUp(){
        driver.quit();
    }

    @Test
    public void dropDown(){
        driver.get("https://practice.cydeo.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));
       String actual = select.getFirstSelectedOption().getText();
       String expected = "Please select an option";
        Assert.assertEquals(actual, expected, "verification failed");

        Select stateSelect = new Select(driver.findElement(By.id("state")));
        String actualValue = stateSelect.getFirstSelectedOption().getText();
        String expectedValue = "Select a State";
        Assert.assertEquals(actualValue, expectedValue, "state select verification failed");

    }


}
