package com.cs.solutions;

import java.util.Collections;
import java.util.List;

public class TheHurdleRace {

    public static int hurdleRace(int k, List<Integer> height) {
        return Math.max(0, Collections.max(height) - k);
    }
}
