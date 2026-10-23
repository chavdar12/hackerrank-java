package com.cs.solutions;

import java.util.List;

public class MiniMaxSum {

    public static String miniMaxSum(List<Integer> arr) {
        long sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return (sum - max) + " " + (sum - min);
    }
}
