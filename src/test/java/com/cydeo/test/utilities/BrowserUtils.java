package com.cydeo.test.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
    public static void  switchWindowAndVerify(WebDriver driver, String expectedURL, String expectedTitle){
        Set<String> allHandles = driver.getWindowHandles();
        for (String each : allHandles) {
            driver.switchTo().window(each);
            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
            System.out.println("driver.getTitle() = " + driver.getTitle());
            if(driver.getCurrentUrl().contains(expectedURL)){
                break;
            }
        }
        String actualtitle = driver.getTitle();
        Assert.assertTrue(actualtitle.contains(expectedTitle), "Title Verification failed");

    }

    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertTrue(driver.getTitle().contains(expectedTitle) , "title verification failed");
    }
}
