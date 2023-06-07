package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cydeo_Verification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "cydeo";
        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification passed");
        }else{
            System.out.println("URL verification failed");
        }

        String actualTitle = driver.getTitle();
        String expectedTitile = "Practice";
        if(actualTitle.contains(expectedTitile)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }
        driver.quit();
    }
}
