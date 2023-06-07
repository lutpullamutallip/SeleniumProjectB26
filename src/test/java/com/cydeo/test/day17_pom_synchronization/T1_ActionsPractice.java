package com.cydeo.test.day17_pom_synchronization;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T1_ActionsPractice {
    @Test
    public void cydeo_practice_drag_and_drop_test(){
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
        WebElement smallball = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigball = Driver.getDriver().findElement(By.id("droptarget"));
        Actions actions= new Actions(Driver.getDriver());
        //actions.dragAndDrop(smallball, bigball).perform();
        actions.moveToElement(smallball).clickAndHold().moveToElement(bigball).release().perform();

    }
}
