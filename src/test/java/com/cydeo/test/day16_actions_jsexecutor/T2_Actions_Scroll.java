package com.cydeo.test.day16_actions_jsexecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T2_Actions_Scroll {
    @Test
    public void actions_scroll_test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("practice.cydeo.url"));
        Actions actions = new Actions(Driver.getDriver());
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        actions.moveToElement(cydeoLink).perform();
        WebElement homelink = Driver.getDriver().findElement(By.linkText("Home"));
        actions.moveToElement(homelink).perform();
       // actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();






    }
}
