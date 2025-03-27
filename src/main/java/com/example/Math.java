package com.example;

public class Math {
    public static void mathMultiplication(String[] args) {
        System.out.println("hola jenkins que tal");

        int resultantMultiplication = multiplicacion(5, 3);
        System.out.println("la suma de 5 + 3 es: " + resultantMultiplication);
    }

    public static int multiplicacion(int a, int b){
        return a * b;
    }
}
