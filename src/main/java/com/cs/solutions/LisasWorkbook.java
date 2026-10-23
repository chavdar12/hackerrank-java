package com.cs.solutions;

import java.util.List;

public class LisasWorkbook {

    public static int workbook(int n, int k, List<Integer> arr) {
        int page = 1;
        int special = 0;
        for (int total : arr) {
            for (int start = 1; start <= total; start += k) {
                int end = Math.min(start + k - 1, total);
                if (page >= start && page <= end) {
                    special++;
                }
                page++;
            }
        }
        return special;
    }
}
