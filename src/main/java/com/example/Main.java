package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola jenkins que tal");

        int resultado = suma(5, 3);
        System.out.println("la suma de 5 + 3 es: " + resultado);
    }
    public static int suma(int a , int b){
        return a + b;

    }
}
