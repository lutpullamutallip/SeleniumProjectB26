package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WebTableUtils {
    public static String returnOrderDate(WebDriver driver, String customerName){
    String locator = "//td[.='"+customerName+"']//following-sibling::td[3]";
        System.out.println(customerName+"'s order date: " + driver.findElement(By.xpath(locator)).getText());
        return driver.findElement(By.xpath(locator)).getText();
    }

    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){
        Assert.assertEquals(expectedOrderDate, driver.findElement(By.xpath("//td[.='"+customerName+"']//following-sibling::td[3]")).getText(), "Order date verification failed");
    }
}
