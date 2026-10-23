package com.cs.solutions;

import java.util.ArrayList;
import java.util.List;

public class CutTheSticks {

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        int[] sticks = arr.stream().mapToInt(Integer::intValue).sorted().toArray();
        int i = 0;
        while (i < sticks.length) {
            result.add(sticks.length - i);
            int minLen = sticks[i];
            while (i < sticks.length && sticks[i] == minLen) i++;
        }
        return result;
    }
}
