package com.cs.solutions;

public class AppendAndDelete {

    public static String appendAndDelete(String s, String t, int k) {
        int common = 0;
        while (common < s.length() && common < t.length() && s.charAt(common) == t.charAt(common)) {
            common++;
        }
        int steps = (s.length() - common) + (t.length() - common);
        if (k >= s.length() + t.length()) return "Yes";
        return (k >= steps && (k - steps) % 2 == 0) ? "Yes" : "No";
    }
}
