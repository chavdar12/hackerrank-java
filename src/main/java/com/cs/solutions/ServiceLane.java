package com.cs.solutions;

import java.util.ArrayList;
import java.util.List;

public class ServiceLane {

    public static List<Integer> serviceLane(List<Integer> width, List<List<Integer>> cases) {
        List<Integer> res = new ArrayList<>();
        for (List<Integer> c : cases) {
            int min = Integer.MAX_VALUE;
            for (int i = c.get(0); i <= c.get(1); i++) {
                min = Math.min(min, width.get(i));
            }
            res.add(min);
        }
        return res;
    }
}
