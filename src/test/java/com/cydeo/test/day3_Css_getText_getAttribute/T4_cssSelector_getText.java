package com.cydeo.test.day3_Css_getText_getAttribute;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");


        WebElement resetPasswordBTM = driver.findElement(By.cssSelector("button.login-btn"));
        String actualText = resetPasswordBTM.getText();
        String expectedText = "Reset password";

        if(actualText.equals(expectedText)){
            System.out.println("Text verification passed");
        }else{
            System.out.println("Text verification failed");
        }


        driver.quit();
    }
}
