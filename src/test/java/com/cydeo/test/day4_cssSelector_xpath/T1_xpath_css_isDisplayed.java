package com.cydeo.test.day4_cssSelector_xpath;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_css_isDisplayed {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        //WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        System.out.println(homeLink.isDisplayed());
        //WebElement header = driver.findElement(By.cssSelector("div.example>h2"));
        WebElement header = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        System.out.println(header.isDisplayed());
        //WebElement emailHeader = driver.findElement(By.cssSelector("label[for='email']"));
        WebElement emailHeader = driver.findElement(By.xpath("//div//label[.='E-mail']"));
        System.out.println(emailHeader.isDisplayed());
        //WebElement input= driver.findElement(By.cssSelector("input[type='text']"));
        WebElement input= driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println(input.isDisplayed());
        //WebElement retrieveBTN = driver.findElement(By.cssSelector("button#form_submit"));
        WebElement retrieveBTN = driver.findElement(By.xpath("//*[contains(text(),'Retrieve')]"));
        System.out.println(retrieveBTN.isDisplayed());
        //WebElement logo = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        WebElement logo = driver.findElement(By.xpath("//div//div[@style='text-align: center;']"));
        System.out.println(logo.isDisplayed());

        driver.quit();

    }
}
