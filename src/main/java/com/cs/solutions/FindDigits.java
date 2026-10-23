package com.cs.solutions;

public class FindDigits {

    public static int findDigits(int n) {
        int count = 0;
        for (char ch : String.valueOf(n).toCharArray()) {
            int d = ch - '0';
            if (d != 0 && n % d == 0) count++;
        }
        return count;
    }
}
