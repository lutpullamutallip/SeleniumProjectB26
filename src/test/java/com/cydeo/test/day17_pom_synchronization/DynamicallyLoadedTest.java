package com.cydeo.test.day17_pom_synchronization;

import com.cydeo.pages.DynamicLoadedPage7;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicallyLoadedTest {
    @Test
    public void dynamically_Loaded_Test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("dynamic_loading.url"));
        DynamicLoadedPage7 dynamicLoadedPage7 = new DynamicLoadedPage7();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        Assert.assertEquals(dynamicLoadedPage7.done.getText(), "Done!", "Done Text verification failed");
        Assert.assertTrue(dynamicLoadedPage7.img.isDisplayed(), "Image doesnt display");

    }
}
