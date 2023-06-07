package com.cydeo.test.day3_Css_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        String expectedText = "Registration form";
        WebElement header = driver.findElement(By.tagName("h2"));
        String actualText = header.getText();

        if(expectedText.equals(actualText)){
            System.out.println("Header verification passed");
        }else{
            System.out.println("Header verification failed");
        }

        WebElement firstname= driver.findElement(By.name("firstname"));
        String expectedValue = "first name";
        String actualValue = firstname.getAttribute("placeholder");
        if(expectedValue.equals(actualValue)){
            System.out.println("Attribute value verification passed");
        }else{
            System.out.println("Attribute value verification failed");
        }
        driver.quit();
    }
}
