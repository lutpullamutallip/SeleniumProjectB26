package com.cydeo.test.day18_Practice;

import com.cydeo.test.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JSExecuterScrollTest {
    @Test
    public void js_executer_scroll_test(){
        Driver.getDriver().get("https:/practice.cydeo.com/infinite_scroll");
        JavascriptExecutor js= (JavascriptExecutor)Driver.getDriver();
        //js.executeScript("arguments[0].scrollIntoView(true)", object);
        for(int i=0; i<10; i++){
            js.executeScript("window.scrollBy(0,750)");
        }
        for(int i=0; i<10; i++){
            js.executeScript("window.scrollBy(0,-750)");
        }
    }
}
