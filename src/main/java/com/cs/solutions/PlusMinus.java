package com.cs.solutions;

import java.util.List;
import java.util.Locale;

public class PlusMinus {

    public static String plusMinus(List<Integer> arr) {
        int n = arr.size();
        long positive = arr.stream().filter(x -> x > 0).count();
        long negative = arr.stream().filter(x -> x < 0).count();
        long zero = n - positive - negative;
        return String.format(Locale.US, "%.6f\n%.6f\n%.6f",
                (double) positive / n, (double) negative / n, (double) zero / n);
    }
}
