package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T4_radioButton {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockyBtn = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockyBtn.click();
        System.out.println("hockyBtn.isSelected() = " + hockyBtn.isSelected());


        WebElement green = driver.findElement(By.xpath("//input[@id='green']"));
        System.out.println("green.isEnabled() = " + green.isEnabled());

        driver.quit();
    }
}
