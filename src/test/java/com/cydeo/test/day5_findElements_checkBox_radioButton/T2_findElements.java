package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T2_findElements {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/abtest");

        WebElement homeHeader= driver.findElement(By.xpath("//a[.='Home']"));
        WebElement noABtestHeader = driver.findElement(By.xpath("//div[@class='example']/h3"));
        WebElement paragraph = driver.findElement(By.xpath("//p"));
        WebElement cydeoLogo = driver.findElement(By.xpath("//div[contains(@style,'center')]"));

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());

        for (WebElement each: allLinks) {
            System.out.println("each.getText() = " + each.getText());
            System.out.println("each.getAttribute(\"href\") = " + each.getAttribute("href"));
        }


        driver.quit();

    }
}
