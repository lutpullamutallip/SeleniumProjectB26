package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class CydeoPracticePage {
    @FindBy(id="draggable")
    public WebElement smallCircle;

    @FindBy(id="droptarget")
    public WebElement bigCircle;

    //@FindBy(xpath =//div[@id='droptarget'])




    public CydeoPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
