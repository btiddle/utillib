package com.btiddle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class btlib {

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


