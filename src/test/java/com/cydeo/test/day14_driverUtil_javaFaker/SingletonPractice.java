package com.cydeo.test.day14_driverUtil_javaFaker;

import org.testng.annotations.Test;

public class SingletonPractice {
   @Test
    public void practice(){
       String word1 = Singleton.getWord();
       System.out.println(word1);

       String word2= Singleton.getWord();
       System.out.println(word2);
   }
}
