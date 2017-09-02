package com.btiddle;

import static com.btiddle.utillib.fibonacci;
import java.util.Arrays;
import java.util.List;
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
        assertEquals(Arrays.asList(0L), fibonacci(1));
    }

    @Test
    public void test05_fib_2() throws Exception {
        assertEquals(Arrays.asList(0L, 1L), fibonacci(2));
    }

    @Test
    public void test06_fib_3() throws Exception {
        assertEquals(Arrays.asList(0L, 1L, 1L), fibonacci(3));
    }

    @Test
    public void test07_fib_4() throws Exception {
        assertEquals(Arrays.asList(0L, 1L, 1L, 2L), fibonacci(4));
    }

    @Test
    public void test08_fib_5() throws Exception {
        assertEquals(Arrays.asList(0L, 1L, 1L, 2L, 3L), fibonacci(5));
    }

    @Test
    public void test09_fib_6() throws Exception {
        assertEquals(Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L), fibonacci(6));
    }

    @Test
    public void test10_fib_7() throws Exception {
        assertEquals(Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L, 8L), fibonacci(7));
    }

    @Test
    public void test11_fib_47() throws Exception {
        assertEquals(Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L, 55L, 89L, 144L,
            233L, 377L, 610L, 987L, 1597L, 2584L, 4181L, 6765L, 10946L, 17711L, 28657L,
            46368L, 75025L, 121393L, 196418L, 317811L, 514229L, 832040L, 1346269L,
            2178309L, 3524578L, 5702887L, 9227465L, 14930352L, 24157817L, 39088169L,
            63245986L, 102334155L, 165580141L, 267914296L, 433494437L, 701408733L,
            1134903170L, 1836311903L), fibonacci(47));
    }

    @Test
    public void test12_fib_70() throws Exception {
        List<Long> seq = fibonacci(70);
        long value = seq.get(seq.size() - 1);
        assertEquals(117669030460994L, value);
    }

    @Test
    public void test13_fib_93() throws Exception {
        List<Long> seq = fibonacci(93);
        long value = seq.get(seq.size() - 1);
        assertEquals(7540113804746346429L, value);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void test14_throw_fib_94() throws Exception {
        List<Long> value = fibonacci(94);
    }

}
