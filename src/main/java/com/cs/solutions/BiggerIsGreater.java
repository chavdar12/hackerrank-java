package com.cs.solutions;

public class BiggerIsGreater {

    public static String biggerIsGreater(String w) {
        char[] a = w.toCharArray();
        int n = a.length;
        int i = n - 2;
        while (i >= 0 && a[i] >= a[i + 1]) i--;
        if (i < 0) return "no answer";
        int j = n - 1;
        while (a[j] <= a[i]) j--;
        char tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
        for (int left = i + 1, right = n - 1; left < right; left++, right--) {
            tmp = a[left];
            a[left] = a[right];
            a[right] = tmp;
        }
        return new String(a);
    }
}
