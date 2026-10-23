package com.cs.solutions;

import java.util.ArrayList;
import java.util.List;

public class ClimbingTheLeaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> uniqueRanks = new ArrayList<>();
        uniqueRanks.add(ranked.get(0));
        for (int i = 1; i < ranked.size(); i++) {
            if (!ranked.get(i).equals(ranked.get(i - 1))) {
                uniqueRanks.add(ranked.get(i));
            }
        }
        List<Integer> result = new ArrayList<>();
        int index = uniqueRanks.size() - 1;
        for (int score : player) {
            while (index >= 0 && score >= uniqueRanks.get(index)) {
                index--;
            }
            result.add(index + 2);
        }
        return result;
    }
}
