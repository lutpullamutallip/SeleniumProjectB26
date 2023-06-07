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

public class T2_StateDropdown {
   WebDriver driver;
    @BeforeMethod
    public void setup(){
     driver = WebDriverFactory.getDriver("chrome")   ;
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("https://practice.cydeo.com/dropdown");
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

    @Test
    public void stateDropdown(){
     Select stateSelect = new Select(driver.findElement(By.id("state")));
     stateSelect.selectByValue("IL");
     stateSelect.selectByValue("VA");
     stateSelect.selectByValue("CA");
     String actual = stateSelect.getFirstSelectedOption().getText();
     String expected = "California";
     Assert.assertEquals(actual, expected, "verification failed");
    }

    @Test
   public void t3(){
     Select multi = new Select(driver.findElement(By.name("Languages")));

   /*  multi.selectByIndex(0);
     multi.selectByIndex(1);
     multi.selectByIndex(2);
     multi.selectByIndex(3);
     multi.selectByIndex(4);
     multi.selectByIndex(5);
*/
   for (int i=0; i<6; i++){
    multi.selectByIndex(i);
   }



     for(WebElement each : multi.getAllSelectedOptions()){
      System.out.println(each.getText());
     }

    multi.deselectAll();

    }



}
