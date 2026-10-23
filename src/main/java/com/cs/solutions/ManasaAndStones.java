package com.cs.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ManasaAndStones {

    public static List<Integer> stones(int n, int a, int b) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(i * b + (n - 1 - i) * a);
        }
        return new ArrayList<>(set);
    }
}
