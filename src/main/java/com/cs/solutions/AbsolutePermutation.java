package com.cs.solutions;

import java.util.ArrayList;
import java.util.List;

public class AbsolutePermutation {

    public static List<Integer> absolutePermutation(int n, int k) {
        List<Integer> res = new ArrayList<>();
        if (k == 0) {
            for (int i = 1; i <= n; i++) res.add(i);
            return res;
        }
        if (n % (2 * k) != 0) return List.of(-1);
        for (int i = 1; i <= n; i++) {
            res.add(((i - 1) / k) % 2 == 0 ? i + k : i - k);
        }
        return res;
    }
}
