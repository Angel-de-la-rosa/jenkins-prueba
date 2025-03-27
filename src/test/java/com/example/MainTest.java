package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MainTest {
    @Test
    public void testSuma(){
        int resultado = Main.suma(4, 6);
        assertEquals(10, resultado);
    }
    @Test
    public void mainTest(){
        System.out.println("hola que tal");
        int resultado = Main.suma(5, 3);
        System.out.println("la suma de 5 + 3 es: " + resultado);
    }
}
