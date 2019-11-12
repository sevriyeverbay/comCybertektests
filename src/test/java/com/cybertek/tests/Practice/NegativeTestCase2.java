package com.cybertek.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NegativeTestCase2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
        System.out.println(driver.getTitle());
        driver.findElement(By.id("prependedInput")).sendKeys("SevriyeVerbay");
        Thread.sleep(1000);
        driver.findElement(By.id("prependedInput2")).sendKeys("Svry1702");
        driver.findElement(By.xpath("//*[@class='btn btn-uppercase btn-primary pull-right']")).click();
        Thread.sleep(1000);
        String expected = "Invalid user name or password.";
        String actual = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[1]/div")).getText();
        System.out.println(actual);
        System.out.println("actual result " + actual);
        if (expected.equals(actual)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        driver.quit();
    }
}
