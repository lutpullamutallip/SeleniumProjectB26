package com.cydeo.test.day11_Multiple_Windows;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_WebTablesPractice extends TestBase {
    @Test
    public void orderNameVerifyTest(){
        driver.get("https://practice.cydeo.com/web-tables");
       /* String expectedName ="Bob Martin";
        WebElement bob = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));
        Assert.assertTrue(bob.getText().equals(expectedName), "Name verification failed");
        WebElement date = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']//following-sibling::td[3]"));
        String expectedDate = "12/31/2021";
        Assert.assertTrue(date.getText().equals(expectedDate), "Date verification failed"); */

        WebTableUtils.returnOrderDate(driver,"Samuel Jackson");
    }

    @Test
    public void test2(){
        driver.get("https://practice.cydeo.com/web-tables");
        String customerorderDate1 = WebTableUtils.returnOrderDate(driver, "Alexandra Gray");
        System.out.println( "Customer's order date is "+ customerorderDate1);

       WebTableUtils.orderVerify(driver,"Alexandra Gray", "04/15/2021");
    }
}
