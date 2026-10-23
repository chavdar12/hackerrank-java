package com.cs.solutions;

import java.util.StringJoiner;

public class Staircase {

    public static String staircase(int n) {
        StringJoiner rows = new StringJoiner("\n");
        for (int i = 1; i <= n; i++) {
            rows.add(" ".repeat(n - i) + "#".repeat(i));
        }
        return rows.toString();
    }
}
