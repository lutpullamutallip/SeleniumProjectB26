package com.cydeo.test.day3_Css_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Locators_getText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");

        WebElement loginName = driver.findElement(By.name("USER_LOGIN"));
        loginName.sendKeys("incorrect");

        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");

        WebElement login= driver.findElement(By.className("login-btn"));
        login.click();

        String expectedText = "Incorrect login or password";
        WebElement erroMSG = driver.findElement(By.className("errortext"));

        String actualText = erroMSG.getText();

        if(actualText.equals(expectedText)){
            System.out.println("Error message verification passed");
        }else{
            System.out.println("Error message verification failed");
        }
        driver.quit();
    }
}
