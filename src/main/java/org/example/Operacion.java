package org.example;

public class Operacion {

    final static String constante = "No cambia";
    public static int sumar(int a, int b) {
        return a+b;
    }

    public static int restar(int a, int b) {
        return a-b;
    }

    public static void main(String[] args) {

        int num1 = 19;
        int num2 = 7;

        System.out.println(sumar(num1, num2));
        System.out.println(restar(num1, num2));

    }
}
