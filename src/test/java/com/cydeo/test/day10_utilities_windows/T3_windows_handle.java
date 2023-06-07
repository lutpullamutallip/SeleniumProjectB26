package com.cydeo.test.day10_utilities_windows;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T3_windows_handle extends TestBase {
    @Test
    public void windowHandle(){
        driver.get("https://practice.cydeo.com/windows");
        Assert.assertEquals("Windows",driver.getTitle(), "title verification failed");
        WebElement clickHere = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHere.click();

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        Set<String> allwindowHandles = driver.getWindowHandles();
        for(String each: allwindowHandles){
            driver.switchTo().window(each);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
        Assert.assertEquals("New Window", driver.getTitle(),"title verification failed");
    }
}
