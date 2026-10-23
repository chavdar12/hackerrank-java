package com.cs.solutions;

public class Encryption {

    public static String encryption(String s) {
        String t = s.replace(" ", "");
        int len = t.length();
        int rows = (int) Math.floor(Math.sqrt(len));
        int cols = (int) Math.ceil(Math.sqrt(len));
        if (rows * cols < len) rows++;
        StringBuilder result = new StringBuilder();
        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows; r++) {
                int idx = r * cols + c;
                if (idx < len) result.append(t.charAt(idx));
            }
            if (c < cols - 1) result.append(' ');
        }
        return result.toString();
    }
}
