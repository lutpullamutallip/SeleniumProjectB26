package com.cydeo.pages;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicallyLoadedPage1 {
    public DynamicallyLoadedPage1(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startBtn;

    @FindBy (id = "username")
    public WebElement username;

    @FindBy (id = "pwd")
    public WebElement password;

    @FindBy (xpath = "//button[.='Submit']")
    public WebElement submitBtn;

    @FindBy(id = "flash")
    public WebElement flashError;

    @FindBy (tagName = "img")
    public WebElement img;
}
