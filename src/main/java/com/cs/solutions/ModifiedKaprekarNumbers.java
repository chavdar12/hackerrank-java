package com.cs.solutions;

import java.util.StringJoiner;

public class ModifiedKaprekarNumbers {

    public static String kaprekarNumbers(int p, int q) {
        StringJoiner result = new StringJoiner(" ");
        for (long n = p; n <= q; n++) {
            String s = Long.toString(n * n);
            int d = Long.toString(n).length();
            String left = s.substring(0, s.length() - d);
            long r = Long.parseLong(s.substring(s.length() - d));
            long l = left.isEmpty() ? 0 : Long.parseLong(left);
            if (l + r == n) {
                result.add(Long.toString(n));
            }
        }
        return result.length() == 0 ? "INVALID RANGE" : result.toString();
    }
}
