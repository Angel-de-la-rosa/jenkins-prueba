package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {
    @Test
    public void testMultiplicacion(){
        int resultantMultiplication = Math.multiplicacion(4, 6);
        assertEquals(24, resultantMultiplication);
    }
}
