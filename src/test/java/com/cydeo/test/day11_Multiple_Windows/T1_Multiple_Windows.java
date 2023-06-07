package com.cydeo.test.day11_Multiple_Windows;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

public class T1_Multiple_Windows extends TestBase {
    @Test
    public void multiplewindows(){
        driver.get("https://www.amazon.com");
        ((JavascriptExecutor)driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('http://facebook.com','_blank');");

       /* Set<String> allhandles = driver.getWindowHandles();
        for (String each : allhandles) {
            driver.switchTo().window(each);
            System.out.println("each = " + each);
            System.out.println("driver.getTitle() = " + driver.getTitle());
            if(driver.getTitle().contains("Etsy")){
                break;
            }
        } */
        BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy");

        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
}
