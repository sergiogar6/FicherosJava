package org.example.Ficheros.AccesoAleatorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ModificarEntero {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce la posicion del entero a modificar: ");
        int posicion = sc.nextInt();
        System.out.println("Introduce el numero que quieres poner: ");
        int nuevoValor = sc.nextInt();
        sc.nextLine();


        sustituirInt(posicion, nuevoValor);

    }

    public static void sustituirInt(int posicion, int nuevoValor) {

    }


    public static void leerPosicion(int posicion) throws FileNotFoundException {
        try (RandomAccessFile raf = new RandomAccessFile("modificarEntero.dat", "rw")) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
