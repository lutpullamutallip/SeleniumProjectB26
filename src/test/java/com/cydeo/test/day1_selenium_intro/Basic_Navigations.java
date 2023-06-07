package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        //driver.navigate().to("https://www.etsy.com");

        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        System.out.println("Etsy driver.getTitle() = " + driver.getTitle());
        System.out.println("Etsy driver.getCurrentUrl() = " + driver.getCurrentUrl());
        driver.get("https://www.tesla.com");

        System.out.println("Tesla page driver.getTitle() = " + driver.getTitle());
        System.out.println("tesla driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.quit();
    }
}
