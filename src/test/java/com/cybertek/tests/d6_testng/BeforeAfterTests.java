package com.cybertek.tests.d6_testng;

import org.testng.annotations.*;

public class BeforeAfterTests {


@Test
public void test1(){
    System.out.println("This is test one");
}

@Test
public void test2(){
    System.out.println("This is test two");
}

@BeforeMethod
    public void setupMethod(){
    System.out.println("Before Method");
    System.out.println("Opening Chrome");

}
@AfterMethod
    public void teardownMethod(){
    System.out.println("After Method");
    System.out.println("Closing Chrome");
}

@BeforeClass
    public void setupClass(){
    System.out.println("Before Class: Running only one time");
}


    @Ignore
    @AfterClass
    public void teardownClass() {
        System.out.println("After Class: Running only one time");


    }


}
