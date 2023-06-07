package com.cydeo.test.day15_upload_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class T3_Actions_Hover_Practice {
    @Test
    public void google_actions_hover_test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("google"));
        WebElement googleSearch = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input"));
        WebElement feelingLuckybtn =Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(googleSearch).perform();
        actions.moveToElement(feelingLuckybtn).perform();
    }
}
