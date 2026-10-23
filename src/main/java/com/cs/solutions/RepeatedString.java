package com.cs.solutions;

public class RepeatedString {

    public static long repeatedString(String s, long n) {
        long perCycle = s.chars().filter(c -> c == 'a').count();
        int remainder = (int) (n % s.length());
        long inRemainder = s.substring(0, remainder).chars().filter(c -> c == 'a').count();
        return (n / s.length()) * perCycle + inRemainder;
    }
}
