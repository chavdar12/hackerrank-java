package com.cs.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TheBombermanGame {

    public static List<String> bomberMan(int n, List<String> grid) {
        if (n == 1) return grid;
        if (n % 2 == 0) {
            return new ArrayList<>(Collections.nCopies(grid.size(), "O".repeat(grid.get(0).length())));
        }
        List<String> afterFirst = detonate(grid);
        return n % 4 == 3 ? afterFirst : detonate(afterFirst);
    }

    private static List<String> detonate(List<String> g) {
        int r = g.size();
        int c = g.get(0).length();
        char[][] out = new char[r][c];
        for (char[] row : out) Arrays.fill(row, 'O');
        int[] dx = {0, 1, -1, 0, 0};
        int[] dy = {0, 0, 0, 1, -1};
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (g.get(i).charAt(j) == 'O') {
                    for (int d = 0; d < 5; d++) {
                        int x = i + dx[d];
                        int y = j + dy[d];
                        if (x >= 0 && x < r && y >= 0 && y < c) out[x][y] = '.';
                    }
                }
            }
        }
        List<String> res = new ArrayList<>();
        for (char[] row : out) res.add(new String(row));
        return res;
    }
}
