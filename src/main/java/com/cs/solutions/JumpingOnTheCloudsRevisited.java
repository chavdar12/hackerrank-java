package com.cs.solutions;

public class JumpingOnTheCloudsRevisited {

    public static int jumpingOnClouds(int[] c, int k) {
        int n = c.length;
        int energy = 100;
        int pos = 0;
        do {
            pos = (pos + k) % n;
            energy--;
            if (c[pos] == 1) energy -= 2;
        } while (pos != 0);
        return energy;
    }
}
