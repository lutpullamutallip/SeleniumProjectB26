package com.cydeo.test.day10_utilities_windows;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.CRM_utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_iFrame_crm_appreciationTest extends TestBase {
    @Test
    public void sendingAppreciationMsg(){
        driver.get("https://login2.nextbasecrm.com");
       // CRM_utilities.login_crm(driver);
       /* WebElement loginInput = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginInput.sendKeys("hr1@cydeo.com");
        passwordInput.sendKeys("UserUser");
        loginbtn.click();
        */

        CRM_utilities.login_crm(driver, "hr1@cydeo.com", "UserUser");

        WebElement more = driver.findElement(By.id("feed-add-post-form-link-text"));
        more.click();
        WebElement appreciation = driver.findElement(By.xpath("(//span[.='Appreciation'])[2]"));
        appreciation.click();


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));

        WebElement typebody = driver.findElement(By.xpath("//body[@style='min-height: 184px;']"));
        typebody.sendKeys("Thank you bro");

        driver.switchTo().defaultContent();
        WebElement send = driver.findElement(By.id("blog-submit-button-save"));
        send.click();
        WebElement comment = driver.findElement(By.xpath("(//div[@class='feed-post-text-block-inner-inner'])[1]"));
        Assert.assertEquals(true, comment.isDisplayed(), "its not displayed ");

    }
}
