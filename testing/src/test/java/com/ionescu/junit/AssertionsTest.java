package com.ionescu.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {
    @Test
    public void testAssertions(){
        String myString= null;
        String one= "Hello";
        String two= "Hello";
       assertEquals(64, 2*32);
       assertNotEquals("values are not equal", 1, 2);
       assertTrue(10>5);
       assertFalse(5>10);
       assertNull(myString);
       assertSame(one, two);
    }
}
