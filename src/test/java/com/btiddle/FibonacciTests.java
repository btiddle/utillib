package com.btiddle;

import static com.btiddle.btlib.fibonacci;
import java.util.Arrays;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FibonacciTests {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test01_throw_fib_neg_9999() throws Exception {
        assertEquals(0, fibonacci(-999));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test02_thow_fib_neg_1() throws Exception {
        assertEquals(0, fibonacci(-1));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test03_throw_fib_0() throws Exception {
        assertEquals(0, fibonacci(0).size());
    }


    @Test
    public void test04_fib_1() throws Exception {
        assertEquals(Arrays.asList(0), fibonacci(1));
    }

    @Test
    public void test05_fib_2() throws Exception {
        assertEquals(Arrays.asList(0, 1), fibonacci(2));
    }

    @Test
    public void test06_fib_3() throws Exception {
        assertEquals(Arrays.asList(0, 1, 1), fibonacci(3));
    }

    @Test
    public void test07_fib_4() throws Exception {
        assertEquals(Arrays.asList(0, 1, 1, 2), fibonacci(4));
    }

    @Test
    public void test08_fib_5() throws Exception {
        assertEquals(Arrays.asList(0, 1, 1, 2, 3), fibonacci(5));
    }

    @Test
    public void test09_fib_6() throws Exception {
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5), fibonacci(6));
    }

    @Test
    public void test10_fib_7() throws Exception {
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8), fibonacci(7));
    }

    @Test
    public void test11_fib_8() throws Exception {
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13), fibonacci(8));
    }

    @Test
    public void test12_fib_47() throws Exception {
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
            233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657,
            46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269,
            2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169,
            63245986, 102334155, 165580141, 267914296, 433494437, 701408733,
            1134903170, 1836311903), fibonacci(47));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test13_throw_fib_48() throws Exception {
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13), fibonacci(48));
    }

}
