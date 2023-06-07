package com.cydeo.test.day7_testNG_dropDown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;


    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void googleTitle(){

        driver.get("https://www.google.com");

        String expectedtitle ="Google";
        String actualtitle = driver.getTitle();

        Assert.assertEquals(expectedtitle,actualtitle, "Titile verification failed");

    }

    @Test
    public void yahootitle(){
        driver.get("https://www.yahoo.com");
    }
    @Test
    public void etsyTitle(){
        driver.get("https://www.etsy.com");
    }
}
