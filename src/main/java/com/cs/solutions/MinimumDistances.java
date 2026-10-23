package com.cs.solutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumDistances {

    public static int minimumDistances(List<Integer> a) {
        Map<Integer, Integer> last = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.size(); i++) {
            Integer prev = last.put(a.get(i), i);
            if (prev != null) {
                min = Math.min(min, i - prev);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
