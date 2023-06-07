package com.cydeo.test.day14_driverUtil_javaFaker;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearch_DriverPractice {
    @Test
    public void googleSearch_driverPractice(){
        Driver.getDriver().get("https://www.google.com");
        System.out.println("((RemoteWebDriver)Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

        WebElement seachBox = Driver.getDriver().findElement(By.name("q"));
        seachBox.sendKeys("apple"+ Keys.ENTER);
        System.out.println("((RemoteWebDriver)Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("((RemoteWebDriver)Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());

        String expectedTitle = "apple - Google Search";
        Assert.assertEquals(actualTitle, expectedTitle);

    }
}
