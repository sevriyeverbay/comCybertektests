package com.cybertek.tests.d6_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {
    //this one will fail
    @Test
    public void test1() {
        System.out.println("first assertion");
        Assert.assertEquals("one", "one");

        System.out.println("second assertion");
        Assert.assertEquals(1, 1);
    }

    @Test
    public void test2() {
        Assert.assertNotEquals("one", "two");
    }

    @Test
    public void test3() {
        String expectedTitle = "Cbt";
        String actualTitleBeg = "c";
        Assert.assertTrue(expectedTitle.startsWith(actualTitleBeg));
        Assert.assertTrue("ma@cbt.com".contains("@"), "all emails must contains @ sing");
        Assert.assertTrue(1 > 0);
        //   System.out.println("a".equals(("a")));
    }

    @Test
    public void test4() {
        Assert.assertFalse(1 < 0);
    }

    @Test
    public void test5() {
        Assert.assertEquals("Cbt", "Ccbt", "Title did not match");
    }


    @AfterMethod
    public void teardownMethod() {
        System.out.println("close chrome");
    }
}