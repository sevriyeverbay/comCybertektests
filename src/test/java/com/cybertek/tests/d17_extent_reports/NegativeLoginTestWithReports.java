package com.cybertek.tests.d17_extent_reports;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestWithReports extends TestBase {


    @Test

    public void wrongPasswordTest(){
        extentLogger =report.createTest("Wrong password test");//this line is so important we have to create a test
        LoginPage loginPage = new LoginPage();
        extentLogger.info("Enter username");
        loginPage.userName.sendKeys("salesmanager101");
        extentLogger.info("Enter password");
        loginPage.password.sendKeys("greatpassword");
        extentLogger.info("Click submit");
        loginPage.submit.click();
        extentLogger.info("Verify page url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
        extentLogger.pass("PASS: Wrong password test");
    }

    //this test will fail
    @Test
    public void test2() {
        //if we dont add extentLogger = report.createTest,this will not be in html report

        extentLogger = report.createTest("Wrong password test");


        LoginPage loginPage = new LoginPage();
        extentLogger.info("Enter username");
        loginPage.userName.sendKeys("salesmanager101");
        extentLogger.info("Enter Password :great password");
        loginPage.password.sendKeys("greatpassword");
        extentLogger.info("click submit");
        loginPage.submit.click();
        extentLogger.info("Verify page url");

        Assert.assertEquals(driver.getCurrentUrl(), "https://google.com");
        extentLogger.pass("PASS : WRONG PASSWORD TEST");
    }






    }
