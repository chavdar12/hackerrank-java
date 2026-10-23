package com.cs.solutions;

import java.util.List;

public class QueensAttackII {

    public static int queensAttack(int n, int rQ, int cQ, List<List<Integer>> obstacles) {
        int up = n - rQ;
        int down = rQ - 1;
        int right = n - cQ;
        int left = cQ - 1;
        int upRight = Math.min(up, right);
        int upLeft = Math.min(up, left);
        int downRight = Math.min(down, right);
        int downLeft = Math.min(down, left);
        for (List<Integer> obstacle : obstacles) {
            int dr = obstacle.get(0) - rQ;
            int dc = obstacle.get(1) - cQ;
            int dist = Math.max(Math.abs(dr), Math.abs(dc)) - 1;
            if (dc == 0) {
                if (dr > 0) up = Math.min(up, dist);
                else down = Math.min(down, dist);
            } else if (dr == 0) {
                if (dc > 0) right = Math.min(right, dist);
                else left = Math.min(left, dist);
            } else if (dr == dc) {
                if (dr > 0) upRight = Math.min(upRight, dist);
                else downLeft = Math.min(downLeft, dist);
            } else if (dr == -dc) {
                if (dr > 0) upLeft = Math.min(upLeft, dist);
                else downRight = Math.min(downRight, dist);
            }
        }
        return up + down + left + right + upRight + upLeft + downRight + downLeft;
    }
}
