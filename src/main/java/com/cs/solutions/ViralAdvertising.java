package com.cs.solutions;

public class ViralAdvertising {

    public static int viralAdvertising(int n) {
        int shared = 5;
        int cumulative = 0;
        for (int i = 1; i <= n; i++) {
            int liked = shared / 2;
            cumulative += liked;
            shared = liked * 3;
        }
        return cumulative;
    }
}
