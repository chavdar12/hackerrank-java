package com.cs.solutions;

public class SherlockAndSquares {

    public static int squares(int a, int b) {
        return (int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a)) + 1;
    }
}
