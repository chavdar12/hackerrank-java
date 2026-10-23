package com.cs.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptionTest {

    @Test
    void solvesSamples() {
        assertEquals("hae and via ecy", Encryption.encryption("haveaniceday"));
        assertEquals("clu hlt io", Encryption.encryption("chillout"));
    }
}
