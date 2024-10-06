package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculoDniTest {

    @ParameterizedTest
    @ValueSource(ints = {12345678, 87654321, 23456789})
    void testDniCalculation(int dni) {
        // Add your test logic here
        CalculoDni calculoDni = new CalculoDni();
        String result = calculoDni.calculateLetter(dni);
        assertNotNull(result);
    }
}

