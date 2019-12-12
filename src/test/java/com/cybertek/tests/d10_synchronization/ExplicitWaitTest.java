package com.cybertek.tests.d10_synchronization;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitTest {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
        /*
        When we wait something specific happens, we use explicit wait.
         */
    }
    @Test
    public void test1WaitFor() {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        //click on 'start'
        driver.findElement(By.tagName("button")).click();
        //finding element that is not visible
        WebElement username = driver.findElement(By.id("username"));
        //create explicit wit object: We create a class for explicit_wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(username));
        //click now that element that is visible
        username.sendKeys("Sevriye");
    }
    @Test
    public void Test2() {
        driver.get(("http://practice.cybertekschool.com/dynamic_controls"));
        driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();
        WebElement input = driver.findElement(By.cssSelector("input[type='text']"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(input));
        input.sendKeys("Murat");
    }








}
