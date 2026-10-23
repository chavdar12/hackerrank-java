package com.cs.solutions;

import java.util.List;

public class CircularArrayRotation {

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        int n = a.size();
        int shift = k % n;
        return queries.stream()
                .map(q -> a.get((q - shift + n) % n))
                .toList();
    }
}
