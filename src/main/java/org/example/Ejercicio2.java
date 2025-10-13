package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static Scanner entry = new Scanner(System.in);

    public static void dividir() {
        int numero = entry.nextInt();
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % numero == 0) {
                listaNumeros.add(i);
            }
        }
        System.out.printf(String.valueOf(listaNumeros));

    }

    public static void main(String[] args) {
        dividir();
    }
}
