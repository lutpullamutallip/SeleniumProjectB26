package com.cydeo.test.day15_upload_actions;

import com.cydeo.test.utilities.ConfigurationReader;
import com.cydeo.test.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;

public class T1_JavaFaker_Registration_Form {
    @Test
    public void registration_form_test(){
        Faker faker = new Faker();
        Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
        WebElement firstname = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys(faker.name().firstName());
        WebElement lastname = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys(faker.name().lastName());
        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        username.sendKeys(faker.name().username().replace(".", ""));
        WebElement emailAddress = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        emailAddress.sendKeys(faker.internet().emailAddress());
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());
        WebElement phoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.phoneNumber().cellPhone());

        WebElement gender = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        gender.click();

        WebElement dateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        dateOfBirth.sendKeys(sdf.format(faker.date().birthday()));

        Select department = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        department.selectByIndex(3);

        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(3);

        WebElement programmingLanguage = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
        programmingLanguage.click();

        WebElement signupBtn=Driver.getDriver().findElement(By.id("wooden_spoon"));
        signupBtn.click();

        String expected = "You've successfully completed registration.";
        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//p")).getText(), expected);

    }
}
