package com.cydeo.test.day16_actions_jsexecutor;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_JSExecutor_Scroll {
   @Test
    public void etsy_scroll_test() throws InterruptedException {
       Driver.getDriver().get("https://www.etsy.com");
       JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
      // js.executeScript("window.scrollBy(0,5000)");
      Faker faker = new Faker();
      WebElement subscribtion = Driver.getDriver().findElement(By.id("email-list-signup-email-input"));
      js.executeScript("arguments[0].scrollIntoView(true)", subscribtion);

      subscribtion.sendKeys(faker.internet().emailAddress());
      WebElement btn = Driver.getDriver().findElement(By.xpath("//input[@id='email-list-signup-email-input']/following-sibling::button"));
      btn.click();
      Thread.sleep(10000);
      WebElement text = Driver.getDriver().findElement(By.xpath("//div[@class='wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01']"));
      Assert.assertTrue(text.isDisplayed());


   }
}
