package com.cybertek.tests.d7_types_of_elements;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DisabledElement {

    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement green = driver.findElement(By.id("green"));
        System.out.println("is element enabled:" + green.isEnabled());
        green.click();
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement input = driver.findElement(By.cssSelector("#input-example>input"));
        System.out.println("is element enabled:" + green.isEnabled());
        input.sendKeys("hfgjughisgi");
    }}








