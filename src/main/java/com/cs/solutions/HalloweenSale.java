package com.cs.solutions;

public class HalloweenSale {

    public static int howManyGames(int p, int d, int m, int s) {
        int count = 0;
        int price = p;
        while (s >= price) {
            s -= price;
            count++;
            price = Math.max(price - d, m);
        }
        return count;
    }
}
