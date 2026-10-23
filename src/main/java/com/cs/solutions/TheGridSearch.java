package com.cs.solutions;

import java.util.List;

public class TheGridSearch {

    public static String gridSearch(List<String> grid, List<String> pattern) {
        int rows = grid.size();
        int r = pattern.size();
        for (int i = 0; i <= rows - r; i++) {
            int from = 0;
            int j;
            while ((j = grid.get(i).indexOf(pattern.get(0), from)) != -1) {
                boolean ok = true;
                for (int k = 1; k < r; k++) {
                    if (!grid.get(i + k).startsWith(pattern.get(k), j)) {
                        ok = false;
                        break;
                    }
                }
                if (ok) return "YES";
                from = j + 1;
            }
        }
        return "NO";
    }
}
