package com.cs.solutions;

import java.util.List;

public class AngryProfessor {

    public static String angryProfessor(int k, List<Integer> a) {
        int onTime = 0;
        for (int time : a) {
            if (time <= 0) {
                onTime++;
            }
        }
        return onTime < k ? "YES" : "NO";
    }
}
