package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {
    @Test
    public void testMultiplicacion(){
        int resultantMultiplication = Math.multiplicacion(4, 6);
        assertEquals(24, resultantMultiplication);
    }
    @Test
    public void mainTest(){
        System.out.println("hola que tal");
        int resultado = Main.suma(5, 3);
        System.out.println("la multiplicacion de 4 * 6 es: " + resultado);
    }
}
