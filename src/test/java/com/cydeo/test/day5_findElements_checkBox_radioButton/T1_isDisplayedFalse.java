package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_isDisplayedFalse {
    public static void main(String[] args) {
      WebDriver driver = WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();

      driver.get("https://www.tesla.com");

        WebElement solarheader = driver.findElement(By.xpath("(//h1[contains(text(),'Solar Panels')])[1]"));
        System.out.println("solarheader.isDisplayed() = " + solarheader.isDisplayed());

        driver.quit();


    }
}
