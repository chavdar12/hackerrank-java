package com.cs.solutions;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AngryProfessorTest {

    @Test
    void solvesSamples() {
        assertEquals("YES", AngryProfessor.angryProfessor(3, List.of(-1, -3, 4, 2)));
        assertEquals("NO", AngryProfessor.angryProfessor(2, List.of(0, -1, 2, 1)));
    }
}
