package com.cs.solutions;

import java.util.List;

public class SimpleArraySum {

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int x : ar) {
            sum += x;
        }
        return sum;
    }
}
