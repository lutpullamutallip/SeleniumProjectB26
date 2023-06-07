package com.cydeo.test.day17_pom_synchronization;

import com.cydeo.pages.CydeoPracticePage;
import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_ActionsPractices {
    CydeoPracticePage cydeoPracticePage;
    Actions actions;

    @BeforeMethod
    public void setUpmethod(){
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
        cydeoPracticePage = new CydeoPracticePage();
        actions = new Actions(Driver.getDriver());
    }
    @Test
    public void drag_small_circle_text(){
        actions.clickAndHold(cydeoPracticePage.smallCircle).moveToElement(cydeoPracticePage.bigCircle).perform();
    }

    @Test
    public void drop_here_text(){
        actions.clickAndHold(cydeoPracticePage.smallCircle).moveByOffset(100,0).perform();
        Assert.assertEquals(cydeoPracticePage.bigCircle.getText(), "Drop here.", "Test failed");
    }

}
