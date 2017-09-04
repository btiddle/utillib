package com.btiddle;

import static com.btiddle.utillib.isSentencePalindrome;
import static com.btiddle.utillib.isWordPalindrome;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class IsSentencePalindromeTests {

    @Test
    public void test_a() throws Exception {
        assertEquals(true, isSentencePalindrome("a"));
    }

    @Test
    public void test_aa() throws Exception {
        assertEquals(true, isSentencePalindrome("aa"));
    }

    @Test
    public void test_ab() throws Exception {
        assertEquals(false, isSentencePalindrome("ab"));
    }

    @Test
    public void test_ba() throws Exception {
        assertEquals(false, isSentencePalindrome("ba"));
    }

    @Test
    public void test_aaa() throws Exception {
        assertEquals(true, isSentencePalindrome("aaa"));
    }

    @Test
    public void test_aba() throws Exception {
        assertEquals(true, isSentencePalindrome("aba"));
    }

    @Test
    public void test_aab() throws Exception {
        assertEquals(false, isSentencePalindrome("aab"));
    }

    @Test
    public void test_abb() throws Exception {
        assertEquals(false, isSentencePalindrome("abb"));
    }

    @Test
    public void test_madam() throws Exception {
        assertEquals(true, isSentencePalindrome("madam"));
    }

    @Test
    public void test_space_madam() throws Exception {
        assertEquals(true, isSentencePalindrome(" madam"));
    }

    @Test
    public void test_madam_space() throws Exception {
        assertEquals(true, isSentencePalindrome("madam "));
    }

    @Test
    public void test_space_madam_space() throws Exception {
        assertEquals(true, isSentencePalindrome(" madam "));
    }

    @Test
    public void test_Madam() throws Exception {
        assertEquals(true, isSentencePalindrome("Madam"));
    }

    @Test
    public void test_nurses_run() throws Exception {
        assertEquals(true, isSentencePalindrome("nurses run"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test_null() throws Exception {
        assertEquals(false, isSentencePalindrome(null));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test_empty() throws Exception {
        assertEquals(false, isSentencePalindrome(""));
    }
    @Test
    public void test_eye() throws Exception {
        assertEquals(true, isSentencePalindrome("eye"));
    }

    @Test
    public void test_kayak() throws Exception {
        assertEquals(true, isSentencePalindrome("kayak"));
    }

    @Test
    public void test_rotator() throws Exception {
        assertEquals(true, isSentencePalindrome("rotator"));
    }

    @Test
    public void test_A_sp_man_camma_sp_a_sp_plan_comma_sp_a_sp_canal_cama_sp_Panama_exmark() throws Exception {
        assertEquals(true, isSentencePalindrome("A man, a plan, a canal, Panama!"));
    }

    @Test
    public void test_Was_sp_it_sp_a_sp_car_sp_or_sp_a_sp_cat_sp_I_sp_saw_qmark() throws Exception {
        assertEquals(true, isSentencePalindrome("Was it a car or a cat I saw?"));
    }

    @Test
    public void test_No_sp_quote_x_quote_sp_in_sp_Nixon() throws Exception {
        assertEquals(true, isSentencePalindrome("No 'x' in Nixon"));
    }
}
