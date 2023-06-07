package com.cydeo.test.day16_actions_jsexecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Guru99_DragandDrop_Test {
    @Test
    public void guru99_dragAngDrop_test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("guru99.url"));
        Actions actions = new Actions(Driver.getDriver());
        WebElement bank = Driver.getDriver().findElement(By.xpath("//a[.=' BANK ']"));
        WebElement accountunderDebit = Driver.getDriver().findElement(By.xpath("//ol[@id='bank']"));
        actions.dragAndDrop(bank, accountunderDebit).perform();
        WebElement fivethousand = Driver.getDriver().findElement(By.xpath("//a[.=' 5000 ']"));
        WebElement amountunderDebit = Driver.getDriver().findElement(By.xpath("//ol[@id='amt7']"));
        actions.dragAndDrop(fivethousand, amountunderDebit).perform();
        WebElement sales = Driver.getDriver().findElement(By.xpath("//a[.=' SALES ']"));
        WebElement accountunderCredit = Driver.getDriver().findElement(By.xpath("//ol[@id='loan']"));
        actions.dragAndDrop(sales, accountunderCredit).perform();
        WebElement fivethousand2 = Driver.getDriver().findElement(By.xpath("//a[.=' 5000']"));
        WebElement amountunderCredit = Driver.getDriver().findElement(By.xpath("//ol[@id='amt8']"));
        actions.dragAndDrop(fivethousand2, amountunderCredit).perform();

        WebElement perfect = Driver.getDriver().findElement(By.xpath("//a[.='Perfect!']"));
        Assert.assertTrue(perfect.isDisplayed());


    }
}
