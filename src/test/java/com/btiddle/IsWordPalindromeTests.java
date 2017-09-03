package com.btiddle;

import static com.btiddle.utillib.isWordPalindrome;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class IsWordPalindromeTests {

    @Test
    public void test_a() throws Exception {
        assertEquals(true, isWordPalindrome("a"));
    }

    @Test
    public void test_aa() throws Exception {
        assertEquals(true, isWordPalindrome("aa"));
    }

    @Test
    public void test_ab() throws Exception {
        assertEquals(false, isWordPalindrome("ab"));
    }

    @Test
    public void test_ba() throws Exception {
        assertEquals(false, isWordPalindrome("ba"));
    }

    @Test
    public void test_aaa() throws Exception {
        assertEquals(true, isWordPalindrome("aaa"));
    }

    @Test
    public void test_aba() throws Exception {
        assertEquals(true, isWordPalindrome("aba"));
    }

    @Test
    public void test_aab() throws Exception {
        assertEquals(false, isWordPalindrome("aab"));
    }

    @Test
    public void test_abb() throws Exception {
        assertEquals(false, isWordPalindrome("abb"));
    }

    @Test
    public void test_madam() throws Exception {
        assertEquals(true, isWordPalindrome("madam"));
    }

    @Test
    public void test_space_madam() throws Exception {
        assertEquals(false, isWordPalindrome(" madam"));
    }

    @Test
    public void test_madam_space() throws Exception {
        assertEquals(false, isWordPalindrome("madam "));
    }

    @Test
    public void test_space_madam_space() throws Exception {
        assertEquals(true, isWordPalindrome(" madam "));
    }

    @Test
    public void test_Madam() throws Exception {
        assertEquals(false, isWordPalindrome("Madam"));
    }

    @Test
    public void test_nurses_run() throws Exception {
        assertEquals(false, isWordPalindrome("nurses run"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test_null() throws Exception {
        assertEquals(false, isWordPalindrome(null));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test_empty() throws Exception {
        assertEquals(false, isWordPalindrome(""));
    }
    @Test
    public void test_eye() throws Exception {
        assertEquals(true, isWordPalindrome("eye"));
    }

    @Test
    public void test_kayak() throws Exception {
        assertEquals(true, isWordPalindrome("kayak"));
    }

    @Test
    public void test_rotator() throws Exception {
        assertEquals(true, isWordPalindrome("rotator"));
    }
}
