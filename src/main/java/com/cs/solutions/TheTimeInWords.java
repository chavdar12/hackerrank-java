package com.cs.solutions;

public class TheTimeInWords {

    private static final String[] WORDS = {"", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four",
            "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"};

    public static String timeInWords(int h, int m) {
        if (m == 0) return WORDS[h] + " o' clock";
        if (m == 15) return "quarter past " + WORDS[h];
        if (m == 30) return "half past " + WORDS[h];
        if (m == 45) return "quarter to " + WORDS[h % 12 + 1];
        if (m < 30) return WORDS[m] + (m == 1 ? " minute" : " minutes") + " past " + WORDS[h];
        int r = 60 - m;
        return WORDS[r] + (r == 1 ? " minute" : " minutes") + " to " + WORDS[h % 12 + 1];
    }
}
