package com.cs.solutions;

import java.util.List;

public class AVeryBigSum {

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (long num : ar) {
            sum += num;
        }
        return sum;
    }
}
