package com.cs.solutions;

import java.util.Arrays;
import java.util.List;

public class OrganizingContainersOfBalls {

    public static String organizingContainers(List<List<Integer>> container) {
        int n = container.size();
        long[] capacity = new long[n];
        long[] typeCount = new long[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                capacity[i] += container.get(i).get(j);
                typeCount[j] += container.get(i).get(j);
            }
        }
        Arrays.sort(capacity);
        Arrays.sort(typeCount);
        return Arrays.equals(capacity, typeCount) ? "Possible" : "Impossible";
    }
}
