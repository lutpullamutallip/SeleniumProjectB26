package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");
        WebElement ABTesting = driver.findElement(By.linkText("A/B Testing"));
        ABTesting.click();

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed");
        }
        driver.navigate().back();
        String backExpectedTitle = "Practice";
        String backActualTitle = driver.getTitle();
        if(backActualTitle.equals(backExpectedTitle)){
            System.out.println("Back page Title verification passed");
        }else{
            System.out.println("Back page Title verification failed");
        }
        driver.quit();
    }
}
