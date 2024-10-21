package com.kavinschool.junit4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OrderTest {

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("@BeforeClass - OrderTest.setUpBeforeClass()");
    }

    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("@AfterClass - OrderTest.tearDownAfterClass()");
    }

    @Before
    public void setUp(){
        System.out.println("@Before - OrderTest.setUp()");
    }

    @After
    public void tearDown(){
        System.out.println("@After - OrderTest.tearDown()");
    }

    @Test
    public void testApple() {
        System.out.println("@Test - OrderTest.testApple()");
        // The below will pass because the Strings are same.
        assertEquals("Comparing Apple to Apple", "Apple", "Apple");
        // The below will fail because the Strings are different.
        // assertEquals("Comparing Apple to Maple", "Apple", "Maple");
        // The below will fail if the integers are different values.
        assertEquals("Comparing 1 to 10", 10, 10);
    }

    @Test
    public void testBanana() {
        System.out.println("@Test - OrderTest.testBanana()");
        int expected = (int) (Math.random() * 10) + 1;
        assertTrue("Comparing 1 <= 11 - failed", expected <= 11);
    }
}
