package com.cs.solutions;

import java.util.List;

public class SurfaceArea3D {

    public static int surfaceArea(List<List<Integer>> a) {
        int rows = a.size();
        int cols = a.get(0).size();
        int total = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int h = a.get(i).get(j);
                if (h > 0) total += 2;
                int up = i > 0 ? a.get(i - 1).get(j) : 0;
                int down = i < rows - 1 ? a.get(i + 1).get(j) : 0;
                int left = j > 0 ? a.get(i).get(j - 1) : 0;
                int right = j < cols - 1 ? a.get(i).get(j + 1) : 0;
                total += Math.max(0, h - up) + Math.max(0, h - down)
                        + Math.max(0, h - left) + Math.max(0, h - right);
            }
        }
        return total;
    }
}
