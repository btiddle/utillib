package com.btiddle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class utillib {

    /*
    A palindrome is a word, phrase, or sequence that reads the same backward as
    forward, e.g., madam or nurses run.

    This method checks if a string is a palindrome using assumptions:
    • String is a single word with no spaces, i.e. "madam" is true,
      while "nurses run" is false.
    • Does not ignore capitalization, i.e. "Madam" is false.
    • Does not strip spaced at front or end of string, i.e. " madam" is false,
      "madam " is false, and " madam " is true.

    */
    static boolean isWordPalindrome (String str) {
        boolean palindrome = true;

        // Exception if string is null
        if (str == null) {
            throw new IllegalArgumentException(
                "Expected: String to be not null. " +
                "Actual: String is null.");
        }

        // Exception if string is empty
        if (str.isEmpty()) {
            throw new IllegalArgumentException(
                "Expected string to be not empty. " +
                "Actual string is emppty.");
        }

        // Traverse front to middle, back to middle, and check if characters
        // are equal.
        int back = str.length() - 1;
        for (int front = 0; front < str.length() / 2; front++) {
            if (str.charAt(front) != str.charAt(back - front)) {
                palindrome = false;
                break;
            }

        }

        return (palindrome);
    }

    static String reverseString(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null.");
        }

        if (str.isEmpty()) {
            throw new IllegalArgumentException("String cannot be empty.");
        }

        char[] s = str.toCharArray();
        int end = s.length - 1;

        for (int front = 0; front <= end / 2; front++) {
            char temp = s[front];
            s[front] = s[end - front];
            s[end - front] = temp;
        }
        return String.valueOf(s);
    }

    static List<Long> fibonacci(int num) {
        long number = num;
        List<Long> seq = new ArrayList<>();

        if (number < 1  || (number > 93 ) ) {
            throw new IllegalArgumentException(
                "Expected: Number in range 1 to 93" + ". " +
                "Actual: Number is " + number + ".");
        }

        if (number == 1) {
            return Arrays.asList(0L);
        }

        if (number == 2) {
            return Arrays.asList(0L, 1L);
        }

        seq.add(0L);
        number = number - 1;
        seq.add(1L);
        number = number - 1;

        while (number > 0) {
            seq.add(seq.get(seq.size() - 1) + seq.get(seq.size() - 2));
            number = number - 1;
        }
        return seq;
    }

}


