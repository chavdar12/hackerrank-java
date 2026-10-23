package com.cs.solutions;

import java.util.List;

public class JumpingOnTheClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        int i = 0;
        int n = c.size();
        while (i < n - 1) {
            i += (i + 2 < n && c.get(i + 2) == 0) ? 2 : 1;
            jumps++;
        }
        return jumps;
    }
}
