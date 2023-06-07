package com.cydeo.test.day18_Practice;

import com.cydeo.pages.DynamicallyLoadedPage1;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T5_dynamicallyLoadedPage1 {
    @Test
    public void test1(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");
        DynamicallyLoadedPage1 dynamicallyLoadedPage1 = new DynamicallyLoadedPage1();
        dynamicallyLoadedPage1.startBtn.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicallyLoadedPage1.img));
        Assert.assertTrue(dynamicallyLoadedPage1.username.isDisplayed());
        dynamicallyLoadedPage1.username.sendKeys("tomsmith");
        dynamicallyLoadedPage1.password.sendKeys("incorrectpassword");
        dynamicallyLoadedPage1.submitBtn.click();
        Assert.assertTrue(dynamicallyLoadedPage1.flashError.isDisplayed());
        Driver.closeDriver();
    }
}
