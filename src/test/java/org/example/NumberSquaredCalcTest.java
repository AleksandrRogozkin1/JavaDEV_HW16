package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSquaredCalcTest {

    @Test
    void sum() {
        Assertions.assertEquals(9,new NumberSquaredCalc().squaredNumber(3));
    }
}