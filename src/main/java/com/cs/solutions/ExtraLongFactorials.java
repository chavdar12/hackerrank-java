package com.cs.solutions;

import java.math.BigInteger;

public class ExtraLongFactorials {

    public static BigInteger extraLongFactorials(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
