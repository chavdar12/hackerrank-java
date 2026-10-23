package com.cs.solutions;

public class BeautifulDaysAtTheMovies {

    public static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int day = i; day <= j; day++) {
            if (Math.abs(day - reverse(day)) % k == 0) {
                count++;
            }
        }
        return count;
    }

    static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}
