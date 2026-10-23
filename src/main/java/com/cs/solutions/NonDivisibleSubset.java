package com.cs.solutions;

import java.util.List;

public class NonDivisibleSubset {

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] rem = new int[k];
        for (int n : s) rem[n % k]++;
        int count = Math.min(1, rem[0]);
        for (int i = 1; i <= k / 2; i++) {
            if (i == k - i) {
                count += Math.min(1, rem[i]);
            } else {
                count += Math.max(rem[i], rem[k - i]);
            }
        }
        return count;
    }
}
