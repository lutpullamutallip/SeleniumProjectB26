package com.cydeo.test.day6_StaleElement_TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    /*
    @BeforeMethod
    public void setUpmethod(){
        System.out.println("beforeMethod is running");
    }

    @AfterMethod
    public void tearDownmethod(){
        System.out.println("afterMethod is running");
    }

    @BeforeClass
    public void setUp(){
        System.out.println("before class is running" );
    }

    @AfterClass
    public void teardown(){
        System.out.println("after class is running");
    }
   */
   @Test
    public void test1(){
        System.out.println("Test 1 is running...");
        String actual= "apple";
        String expected = "apple";
       Assert.assertEquals(actual, expected, "Test1 did not pass!");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 is running..");
        Assert.assertEquals("orange","orange","Test2 failed");
    }

}
