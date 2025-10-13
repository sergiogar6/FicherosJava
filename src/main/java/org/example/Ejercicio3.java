package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Ejercicio3 {
    static ArrayList<Integer> listaNumeros = new ArrayList<>();
    public static Scanner entry = new Scanner(System.in);
    static Random random = new Random();

    public static void agregarNumeros() {
        for (int i = 0; i < 10; i++) {
            listaNumeros.add(random.nextInt(100)+1);
        }
    }
    public static void ordenarLista() {
        Collections.sort(listaNumeros);
    }

    public static void eliminarLimites() {
        int limiteInferior = entry.nextInt();
        int limiteSuperior = entry.nextInt();

        for (int i = 0; i < listaNumeros.size(); i++) {
            int n = listaNumeros.get(i);
            if (n <= limiteInferior || n >= limiteSuperior) {
                listaNumeros.remove(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        agregarNumeros();
        ordenarLista();
        System.out.println(listaNumeros);
        eliminarLimites();
        System.out.println(listaNumeros);
    }
}
