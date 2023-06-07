package com.cydeo.test.day13_configuration_reader;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.CRM_utilities;
import com.cydeo.test.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Config_practice extends TestBase {
    @Test
    public void login_crm_app(){
        driver.get(ConfigurationReader.getProperty("env"));
        CRM_utilities.login_crm(driver, ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password") );
        Assert.assertEquals( driver.getTitle(),"Portal", "Title Verification failed");

    }
}
