package com.cs.solutions;

public class ChocolateFeast {

    public static int chocolateFeast(int n, int c, int m) {
        int bars = n / c;
        int wrappers = bars;
        while (wrappers >= m) {
            int extra = wrappers / m;
            bars += extra;
            wrappers = wrappers % m + extra;
        }
        return bars;
    }
}
