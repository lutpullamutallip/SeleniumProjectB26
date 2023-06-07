package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        Thread.sleep(3000);

        WebElement input = driver.findElement(By.name("q"));
        input.click();
        input.sendKeys("apple"+Keys.ENTER);

        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title Verification is passed");
        }else{
            System.out.println("Title Verification is failed");
        }
        driver.quit();
    }
}
