package com.cybertek.tests.Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.List;

public class Homework_wiki {
/*
Wiki assignment
Go to https://www.wikipedia.org./
Enter redsox
Wait until all the search suggestions load
Verify that there are more that 1 search suggestions
Verify that first search suggestion starts with text BostonRed Sox
Chrome freeze screen:
Open developer options Click F8
Use the locate element button to locate the element on the web page

 */

private WebDriver driver;
@BeforeMethod
    public void BeforeMethod() throws InterruptedException{
    driver= WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.get("https://www.wikipedia.com");
    WebElement element = driver.findElement(By.id("searchInput"));
    element.click();
    element.sendKeys("redsox");
    Thread.sleep(3000);
    WebDriverWait wait = new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.invisibilityOf(element));


}


@Test
    public void RedSox() throws InterruptedException{
    List<WebElement> searchOptions = driver.findElements(By.className("suggestion-title"));
    System.out.println("search option size " + searchOptions.size());
    int expected = 6;
    int actual = searchOptions.size();
    if(actual > 1){
        Assert.assertTrue (true);
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
    }
}

@Test
public void VerifyStartWith() throws InterruptedException {
    List<WebElement> searchOptions = driver.findElements(By.className("suggestion-title"));
    String firstOption = searchOptions.get(0).getText();
    System.out.println(firstOption.startsWith("Boston Red Sox"));

}}