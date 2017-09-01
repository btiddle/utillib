package com.btiddle;

import static com.btiddle.btlib.reverseString;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ReverseStringTests {

    @Test
    public void test01_length_1() throws Exception {
        assertEquals(reverseString("A"), "A");
    }

    @Test
    public void test02_length_2() throws Exception {
        assertEquals(reverseString("BA"), "AB");
    }
    @Test
    public void test03_length_3() throws Exception {
        assertEquals(reverseString("CBA"), "ABC");
    }

    @Test
    public void test04_length_4() throws Exception {
        assertEquals(reverseString("54321"), "12345");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test05_throw_null() throws Exception {
        assertEquals(reverseString(null), "12345");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test06_throw_empty() throws Exception {
        assertEquals(reverseString(""), "12345");
    }
}
