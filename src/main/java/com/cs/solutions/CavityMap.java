package com.cs.solutions;

import java.util.ArrayList;
import java.util.List;

public class CavityMap {

    public static List<String> cavityMap(List<String> grid) {
        int n = grid.size();
        char[][] g = new char[n][];
        char[][] out = new char[n][];
        for (int i = 0; i < n; i++) {
            g[i] = grid.get(i).toCharArray();
            out[i] = g[i].clone();
        }
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                char c = g[i][j];
                if (c > g[i - 1][j] && c > g[i + 1][j] && c > g[i][j - 1] && c > g[i][j + 1]) {
                    out[i][j] = 'X';
                }
            }
        }
        List<String> res = new ArrayList<>();
        for (char[] row : out) res.add(new String(row));
        return res;
    }
}
