package com.cs.solutions;

public class HappyLadybugs {

    public static String happyLadybugs(String b) {
        int n = b.length();
        int[] cnt = new int[26];
        boolean hasEmpty = false;
        for (char ch : b.toCharArray()) {
            if (ch == '_') hasEmpty = true;
            else cnt[ch - 'A']++;
        }
        for (int x : cnt) {
            if (x == 1) return "NO";
        }
        if (hasEmpty) return "YES";
        for (int i = 0; i < n; i++) {
            boolean left = i > 0 && b.charAt(i - 1) == b.charAt(i);
            boolean right = i < n - 1 && b.charAt(i + 1) == b.charAt(i);
            if (!left && !right) return "NO";
        }
        return "YES";
    }
}
