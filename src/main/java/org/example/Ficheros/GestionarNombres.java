package org.example.Ficheros;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionarNombres {

    static Scanner sc = new Scanner(System.in);

    public static void escribirNombreAlFinal(String nombre) {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("./src/ficheros/nombres.txt", true)
        )) {
            writer.write(nombre);
            writer.newLine();
            System.out.println("Nombre añadido al final");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void escribirNombreAlPrincipio(String nombre) {

        List<String> lineas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(
                new FileReader("./src/ficheros/nombres.txt")
        )) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("./src/ficheros/nombres.txt")
        )) {
            writer.write(nombre);
            writer.newLine();

            for (String linea : lineas) {
                writer.write(linea);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarContenido() {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("./src/ficheros/nombres.txt")
        )) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void menu() {
        System.out.println("Elige una opcion:");
        System.out.println("1. Añadir nombre al final del archivo");
        System.out.println("2. Añadir nombre al principio del archivo");
        System.out.println("3. Mostrar contenido del archivo");
        System.out.println("0. SALIR");

        String opcion = sc.next();

        switch (opcion) {
            case "1":
                escribirNombreAlFinal("Paco");
                break;
            case "2":
                escribirNombreAlPrincipio("Pepe");
                break;
            case "3":
                mostrarContenido();
                break;
            case "0":

                break;
            default:
                System.out.println("Opcion no valida");
        }

    }

}
