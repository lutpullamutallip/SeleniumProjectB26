package com.cydeo.test.day14_driverUtil_javaFaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {
    @Test
    public void java_faker_test(){
        Faker faker = new Faker();
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));
        System.out.println("faker.letterify(\"??????????\") = " + faker.letterify("??????????"));

        System.out.println("faker.chuckNorris() = " + faker.chuckNorris());
    }
}
