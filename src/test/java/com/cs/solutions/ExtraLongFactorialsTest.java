package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class ExtraLongFactorialsTest {

    @Test
    void solvesSamples() {
        assertEquals(new BigInteger("15511210043330985984000000"), ExtraLongFactorials.extraLongFactorials(25));
        assertEquals(BigInteger.ONE, ExtraLongFactorials.extraLongFactorials(1));
    }
}
