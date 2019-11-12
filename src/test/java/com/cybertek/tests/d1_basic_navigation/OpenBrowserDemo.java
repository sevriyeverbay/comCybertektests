package com.cybertek.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserDemo {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //option+enter MAC
        //we have to enter this line every time we want to open chrome
        //without it we get exception
        //this part is selenium
        //this class represents browser
        //new chromeDriver()-->this line opens chrome
        WebDriver driver=new ChromeDriver();
    }
}
