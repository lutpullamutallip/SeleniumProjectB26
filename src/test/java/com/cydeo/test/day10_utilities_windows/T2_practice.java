package com.cydeo.test.day10_utilities_windows;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class T2_practice extends TestBase {
    @Test
    public void practice(){
        driver.get("https://practice.cydeo.com/windows");
        WebElement clickhere = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickhere.click();
        Set<String> allhandlers = driver.getWindowHandles();
        for (String each : allhandlers) {
            driver.switchTo().window(each);
            System.out.println("driver.getTitle() = " + driver.getTitle());
            if(driver.getTitle() == "New Window"){
                break;
            }else{
                continue;
            }
        }
    }
}
