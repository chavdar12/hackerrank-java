package com.cs.solutions;

public class StrangeCounter {

    public static long strangeCounter(long t) {
        long start = 1;
        long val = 3;
        while (t >= start + val) {
            start += val;
            val *= 2;
        }
        return val - (t - start);
    }
}
