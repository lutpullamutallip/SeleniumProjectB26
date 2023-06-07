package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_utilities {
    public static void login_crm(WebDriver driver){
        WebElement loginInput = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginInput.sendKeys("hr1@cydeo.com");
        passwordInput.sendKeys("UserUser");
        loginbtn.click();
    }
    public static void login_crm(WebDriver driver, String username, String password){
        WebElement loginInput = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginbtn.click();
    }
}
