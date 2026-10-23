package com.cs.solutions;

public class TaumAndBday {

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long blackCost = Math.min(bc, (long) wc + z);
        long whiteCost = Math.min(wc, (long) bc + z);
        return b * blackCost + w * whiteCost;
    }
}
