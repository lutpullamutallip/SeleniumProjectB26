package com.cydeo.test.day6_StaleElement_TestNG;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefException {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        WebElement addElement = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElement.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement deleteBTN = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("Before click deleteBTN.isDisplayed() = " + deleteBTN.isDisplayed());
       deleteBTN.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try{
            System.out.println("After click deleteBTN.isDisplayed() = " + deleteBTN.isDisplayed());
        }catch(StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException is thrown");
            System.out.println("This means the web element is completely deleted from the page and html");
        }




        driver.quit();
    }
}
