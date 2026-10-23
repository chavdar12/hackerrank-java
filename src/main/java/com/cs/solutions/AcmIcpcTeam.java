package com.cs.solutions;

import java.util.List;

public class AcmIcpcTeam {

    public static List<Integer> acmTeam(List<String> topic) {
        int n = topic.size();
        int maxTopics = 0;
        int teamCount = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int combined = 0;
                for (int b = 0; b < topic.get(i).length(); b++) {
                    if (topic.get(i).charAt(b) == '1' || topic.get(j).charAt(b) == '1') {
                        combined++;
                    }
                }
                if (combined > maxTopics) {
                    maxTopics = combined;
                    teamCount = 1;
                } else if (combined == maxTopics) {
                    teamCount++;
                }
            }
        }
        return List.of(maxTopics, teamCount);
    }
}
