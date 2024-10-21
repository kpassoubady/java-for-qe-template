package com.kavinschool.testng;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AssertExampleTests {

    @Test
    public void testHardAsserts() {
        Assertion hardAssert = new Assertion();
        hardAssert.assertEquals("Kangs", "Kangs", "Names are not equal");
        hardAssert.assertEquals(2, 2, "Numbers are not equal");
    }

    @Test
    public void testSoftAsserts() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Kangs", "Kangs", "Names are not equal");
        softAssert.assertEquals(2, 2,"Numbers are not equal");
        softAssert.assertAll("Completed All the checks");
    }
}
