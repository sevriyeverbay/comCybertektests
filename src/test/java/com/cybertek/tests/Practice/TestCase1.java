package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().clearPreferences();//google 'da gelen guncellemeleri otomatik
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[text()='Sign Up For Mailing List']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("full_name")).sendKeys("sevriyeverbay");
        driver.findElement(By.name("email")).sendKeys("sevrverbay@gmail.com");
        driver.findElement(By.name("wooden_spoon")).click();
        //Expected result:Following message shoul be displayed:
        //"Thank you for signing up.Click the button below to return to the home page."
        String message = driver.findElement(By.name("signup_message")).getText();
        System.out.println("Actual message: " + message);

        boolean b1 = message.equals("Thank you for signing up. Click the button below to return to the home page.");
        System.out.println("Message status: " + b1);

        WebElement homeButton = driver.findElement(By.id("wooden_spoon"));

        if (homeButton.isDisplayed()) {
            System.out.println("HomeButton is displayed");
            homeButton.click();
        } else {
            System.out.println("NoSuchElementException");
        }


        driver.close();


    }}



