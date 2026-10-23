package com.cs.solutions;

import java.util.ArrayList;
import java.util.List;

public class SequenceEquation {

    public static List<Integer> permutationEquation(List<Integer> p) {
        int n = p.size();
        int[] inv = new int[n + 1];
        for (int i = 0; i < n; i++) {
            inv[p.get(i)] = i + 1;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(inv[inv[i]]);
        }
        return result;
    }
}
