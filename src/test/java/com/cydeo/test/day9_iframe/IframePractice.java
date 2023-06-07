package com.cydeo.test.day9_iframe;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframePractice extends TestBase {
   @Test
    public void iframeTest(){
       driver.get("https://practice.cydeo.com/iframe");

       driver.switchTo().frame("mce_0_ifr");
       WebElement commentbody = driver.findElement(By.id("tinymce"));
       commentbody.clear();
       commentbody.sendKeys("dear mama");
       String expected = "dear mama";
       String actual= commentbody.getText();
       Assert.assertEquals(expected, actual, "you wrong my friend");
       driver.switchTo().parentFrame();
   }
}
