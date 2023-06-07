package com.cydeo.test.day3_Css_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_getAttribute_Css {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        WebElement login = driver.findElement(By.cssSelector("input[class='login-btn']"));
        String expectedText = "Log In";
        String actualText = login.getAttribute("value");
        if(expectedText.equals(actualText)){
            System.out.println("verification passed");
        }else{
            System.out.println("verification failed");
        }
        driver.quit();
    }
}
