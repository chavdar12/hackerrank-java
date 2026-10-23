package com.cs.solutions;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = smallest;
        for (int i = 1; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            if (sub.compareTo(smallest) < 0) smallest = sub;
            else if (sub.compareTo(largest) > 0) largest = sub;
        }
        return smallest + "\n" + largest;
    }
}
