package com.cybertek.tests.d7_types_of_elements;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest {
@Test

public void test(){
    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/checkboxes");

    WebElement one = driver.findElement(By.xpath("//input[1]"));
    WebElement two = driver.findElement(By.xpath("//input[2]"));
    System.out.println("One is selected: "+ one.isSelected());
    System.out.println("Two is selected: "+ two.isSelected());

    //verify one is not selected
    Assert.assertFalse(one.isSelected());
    //verify two is selected
    Assert.assertTrue(two.isSelected());

    System.out.println("check the first one");
    one.click();

    //verify  one is not selected
    Assert.assertFalse(one.isSelected());
    //verify two is selected
    Assert.assertTrue(two.isSelected());


}

}
