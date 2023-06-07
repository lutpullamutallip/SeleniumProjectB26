package com.cydeo.test.day15_upload_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Guru99_Upload_Test {
    @Test
    public void upload_file_test(){
        Driver.getDriver().get("http://demo.guru99.com/test/upload");
        WebElement uploadFile = Driver.getDriver().findElement(By.id("uploadfile_0"));
        uploadFile.sendKeys(ConfigurationReader.getProperty("filepath"));

        WebElement terms = Driver.getDriver().findElement(By.id("terms"));
        terms.click();
        WebElement submitbtn = Driver.getDriver().findElement(By.id("submitbutton"));
        submitbtn.click();

        WebElement text = Driver.getDriver().findElement(By.id("res"));
        String actual = text.getText();
        String expected = "1 file\nhas been successfully uploaded.";
        Assert.assertEquals(actual, expected, "result message verification failed");

        Driver.closeDriver();

    }
}
